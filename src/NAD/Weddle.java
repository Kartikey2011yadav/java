package NAD;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static NAD.ThreadColor._BLUE;

public class Weddle {
//    Map<String, Double> vars = new HashMap<String, Double>();
    Expression equation;
    String var;
    public void ExpInput(){
        System.out.print("Enter Equation: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ExpressionBuilder eb = new ExpressionBuilder(s);
        System.out.print("Enter Token Variable: ");
        var = sc.next();
        eb.variables(var) ;
        equation = eb.build();
    }
    private double func(double n){
        equation.setVariable(var,n);
        double result = equation.evaluate();
        return result;
    }
    public void cal(){
        double sum,h,a,b,n,Integral;
        List<Double> Y = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lower Range: ");
        a = sc.nextDouble();
        System.out.print("Enter Upper Range: ");
        b = sc.nextDouble();
        System.out.print("Enter Accuracy Rate [1...50]: ");
        int acc = sc.nextInt();
        if(acc<500000 && acc>0){
            n = 6 * acc;
        }
        else{
            System.err.println("Wrong Accuracy Rate: "+ acc);
            n= 0.0;
        }
        h = (b - a) / n;
        for (int i = 0; i<=n; i++){
            Y.add(func(a+ i*h));
        }
        sum = Y.get(0) + Y.get(Y.size()-1);
        for (int i = 1; i < Y.size()-1; i++) {
            if(i % 2 == 0 && i % 3 != 0){
                sum += Y.get(i);
            }
            if(i % 2 != 0 && i % 3 != 0){
                sum += 5 * Y.get(i);
            }
            else if (i % 6 == 0) {
                sum += 2 * Y.get(i);
            }
            else if(i % 3 == 0 && i % 2 != 0){
                sum += 6 * Y.get(i);
            }

        }
        Integral = (double) 0.3 *h *(sum);
        System.out.println("Answer: "+Integral + _BLUE);
    }

    public static void main(String[] args) {
        Weddle c = new Weddle();
        c.ExpInput();
        c.cal();
    }
}
