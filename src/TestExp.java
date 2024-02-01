import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.HashMap;
import java.util.Map;

public class TestExp {
    public static void main(String[] args) {
        String s= "x^2-sin(x)*y+cos(x/y)" ;
        Map<String, Double> vars = new HashMap<String, Double>();
        vars.put("x", 1.2);
        vars.put("y", 3.0) ;
        ExpressionBuilder eb = new ExpressionBuilder(s);
        eb.variables("x", "y") ;

        Expression ex = eb.build() ;
        ex.setVariables(vars);
        double result = ex.evaluate();
        System.out.println(result);




    }
}
