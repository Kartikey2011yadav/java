package Experiment;

public class stringTest {
    public static void main(String[] args) {
        String s = "Hola Amigos";
        System.out.println(s.length());
        int[] arr = new int [6];
        System.out.println(arr.length);
        int temp = ( 12>5 && 13 >5) ? 12: 5;
        System.out.println(temp);
        switch ("hi") {
            case "he" -> System.out.println("hola");
            case "hi" -> System.out.println("hi");
            default -> System.out.println("default");
        }
        char char_arr[] = {'G', 'e', 'e', 'k', 's'};
        String d = new String(char_arr); //Geeks
        System.out.println(d);
        String s1 = "feeksforfeeks";
        String s2 = "feeksfor0fe134eks".replaceAll("[0-9]", "A"); // returns “geeksgorgeeks”
        System.out.println(s1);
        System.out.println(s2);
    }
}
