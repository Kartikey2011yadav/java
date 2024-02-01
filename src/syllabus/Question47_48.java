package syllabus;
import java.lang.Math;
import java.util.Scanner;

public class Question47_48 {
    double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }
    double circlePerimeter(double r){
        return 2*Math.PI*r;
    }

    public static void main(String[] args) {
        Question47_48 circle = new Question47_48();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: "+circle.circleArea(radius));
        System.out.println("Perimeter of Circle: "+circle.circlePerimeter(radius));
    }
}
