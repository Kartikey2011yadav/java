package NAD;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class GaussLegendreConc {

    static Expression equation;
    static String var;
    static Double a,b;
    private static final List<Double> R = new ArrayList<>();
    private static final List<Double> x = new ArrayList<>();

    public static void in(){
        R.add(0.17132449);
        R.add(0.36076157);
        R.add(0.46791394);
        R.add(R.get(2));
        R.add(R.get(1));
        R.add(R.get(0));
        x.add(-0.93246951);
        x.add(-0.66120939);
        x.add(-0.23861919);
        x.add(-x.get(2));
        x.add(-x.get(1));
        x.add(-x.get(0));
    }
    public static List<Double> getX() {
        return x;
    }
    public static List<Double> getR() {
        return R;
    }

    public static void ExpInput(){
        System.out.print("Enter Equation: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ExpressionBuilder eb = new ExpressionBuilder(s);
        System.out.print("Enter Token Variable: ");
        var = sc.next();
        eb.variables(var) ;
        equation = eb.build();
        System.out.print("Enter Lower Range: ");
        a = sc.nextDouble();
        System.out.print("Enter Upper Range: ");
        b = sc.nextDouble();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        int cores = Runtime.getRuntime().availableProcessors();
        int numWorkers = 6;
        System.out.println("Available processor cores is "+cores);
        in();
        System.out.println(R);
        System.out.println(x);
        ExpInput();

        Instant now = Instant.now();

        ExecutorService threadPool = Executors.newWorkStealingPool();

        List<Future<Double>> futures = new ArrayList<Future<Double>>();

        Double p = (a+b) / 2;
        Double q = (b-a) / 2;

        for(int i=0;i<numWorkers ;i++) {
            futures.add(i,threadPool.submit(new GaussL(i,equation,var,p,q)));
        }
        Double sum = 0.0;
        for(int i=0;i<numWorkers;i++) {
            sum += (futures.get(i).get())*R.get(i);

        }
        Double Integral = (double) q * (sum);
        System.out.println("Answer: "+Integral);

        Duration d = Duration.between(now, Instant.now());
        System.out.println("Time Taken multi-core:  "+d);

    }
    public static Expression getEquation() {
        return equation;
    }
    public static String getVar() {
        return var;
    }
}

class GaussL implements Callable<Double> {
    Expression equation;
    String var;
    Double p,q;
    Integer workerId;
    List<Double> workList;
    public GaussL(int i,Expression e,String v,Double p,Double q) {
        this.workerId = i;
        this.equation = e;
        this.var = v;
        this.p = p;
        this.q = q;
        workList = new ArrayList<>();
        ArrayList<Double> x = (ArrayList<Double>) GaussLegendreConc.getX();
        Double val =p + q * x.get(i);
        workList.add(0, val);

    }

    @Override
    public Double call() throws Exception {
        Double t = 0.0;
        WorkerTaskGL collect = workList.stream().collect(WorkerTaskGL::new, WorkerTaskGL::func, WorkerTaskGL::combine);

        t = collect.getTotal();
        workList.clear();
        System.out.println("Sum:"+t+"of:"+(workerId+1));
        return t;
    }
}

class WorkerTaskGL {
    Double total = 0.0;
    Expression e;
    String v;
    WorkerTaskGL(){
        this.e = GaussLegendreConc.getEquation();
        this.v = GaussLegendreConc.getVar();
    }

    public Double getTotal() {return total;}
    public void func(double n){
        e.setVariable(v,n);
        total = e.evaluate();
    }
    public void combine(WorkerTaskGL other) {
        total += other.total;
    }
}
