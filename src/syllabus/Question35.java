package syllabus;

import java.util.Scanner;

public class Question35 {
    int strFrontPos(String str, String subStr){
        for(int i = 0; i < str.length() - subStr.length() +1; i++){
            if(str.startsWith(subStr,i)){
                return i;
            }
        }
        return -1;
    }

    int strEndPos(String str, String subStr){
        for(int i =str.length() -1;i >= 0 ; i--){
            if(str.endsWith(subStr)){
                return i - subStr.length()+1;
            }
            else{
                str = str.substring(0, i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Question35 q = new Question35();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String in which you want to search: ");
        String s = sc.nextLine();
        System.out.print("Enter the Search Sub String: ");
        String subStr = sc.nextLine();

        System.out.println("Position Found with startsWith method: "+q.strFrontPos(s, subStr));
        System.out.println("Position Found with endsWith method: "+q.strEndPos(s, subStr));
    }
}
