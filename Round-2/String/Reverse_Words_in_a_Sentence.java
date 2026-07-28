import java.util.*;
public class Reverse_Words_in_a_Sentence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        
        // for(int i=str.length()-1; i>=0; i--){
        //     res += str.charAt(i);
        // }
        // System.out.print(res);

        int i =0;
        int j = ch.length -1;

        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(ch));
    }
    
}