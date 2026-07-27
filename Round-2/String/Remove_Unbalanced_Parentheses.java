import java.util.*;
public class Remove_Unbalanced_Parentheses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[str.length()];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                stack.push(i);
            }
            else if(ch == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    remove[i] = true;
                }
            }
        }
        while(!stack.isEmpty()){
            remove[stack.pop()] = true;
        }
        for(int i=0; i<str.length(); i++){
            if(!remove[i]){
                System.out.print(str.charAt(i));
            }
        }
    }
}
