package Experiment;

public class StringBuff {
    String s;
    int num;

    public String Sget() {
        return s;
    }

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb.toString() instanceof String);
        System.out.println(sb);
        String message = sb.toString();
        System.out.println(message);
    }
}
