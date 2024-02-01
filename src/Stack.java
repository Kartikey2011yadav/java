import java.util.LinkedList;
import java.util.List;
public class Stack {
    char size;
    boolean stackIsEmpty=true;
    private List<Character> stack = new LinkedList<>();

    private void push (char ele){
        stack.add(ele);
        checkStackIsEmpty();
    }
    private void checkStackIsEmpty(){
        stackIsEmpty = stack.isEmpty();
    }
    private char pop (){
        if(!stackIsEmpty){
            char temp;
            temp = stack.remove(stack.size()-1);
            checkStackIsEmpty();
            return temp;

        }
        return 0;
    }
}
