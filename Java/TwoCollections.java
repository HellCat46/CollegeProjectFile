import java.util.*;

public class TwoCollections {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        Hashtable<Character, Character> brackets = new Hashtable<>(3);
        brackets.put('[', ']');
        brackets.put('(', ')');
        brackets.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(brackets.get(ch) != null){
                stack.push(ch);
            }else if(brackets.containsValue(ch)){
                if(ch != brackets.get(stack.pop())){
                    System.out.println("Invalid.");
                    return;
                }
            }
        }
        if(!stack.empty()){
            System.out.println("Invalid");
        }else {
            System.out.println("Valid");
        }
    }
}
