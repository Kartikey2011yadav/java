package NAD;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.util.Scanner;
public class centralDiff {
    Expression equation;
    String var;
    Double dx ,x;
    public void ExpInput(){
        System.out.print("Enter Equation: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ExpressionBuilder eb = new ExpressionBuilder(s);
        System.out.print("Enter Token Variable: ");
        var = sc.next();
        eb.variables(var) ;
        equation = eb.build();
        System.out.print("Enter dx Value: ");
        dx = sc.nextDouble();
        System.out.print("Enter x Value: ");
        x = sc.nextDouble();
    }
    private double func(double n){
        equation.setVariable(var,n);
        double result = equation.evaluate();
        return result;
    }

    public void DiffCal(){
        Double dx1 = dx;
        Double dx2 = dx*2;
        Double dx3 = dx*3;

        Double m1 = (func(x + dx1) - func(x - dx1)) / 2;
        Double m2 = (func(x + dx2) - func(x - dx2)) / 4;
        Double m3 = (func(x + dx3) - func(x - dx3)) / 6;

        m1 *= 15;
        m2 *= 6;
        Double Ans = ((m1 - m2) + m3) / (10 * dx1);
        System.out.println("Answer: " + Ans );
    }

    public static void main(String[] args) {
        centralDiff diff = new centralDiff();
        diff.ExpInput();
        diff.DiffCal();
    }

}
