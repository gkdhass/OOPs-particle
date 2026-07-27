import java.util.*;

public class Multi_Digit_String_Expansion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = 0;

        while(n < str.length()){
            char ch = str.charAt(n);
            n++;

            int count = 0;

            while(n < str.length() && str.charAt(n) >= '0' && str.charAt(n) <= '9'){
                count = count * 10 + (str.charAt(n) - '0');
                n++;
            } 

            while(count > 0){
                System.out.print(ch);
                count--;
            }
        }
    }
}