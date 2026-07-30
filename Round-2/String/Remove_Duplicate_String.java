import java.util.*;
public class Remove_Duplicate_String{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        

        for(int i=0; i<ch1.length; i++){

            boolean found = false;

            for(int j=0; j<ch2.length; j++){
                if(ch1[i] == ch2[j]){
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.print(ch1[i]);
            }
            
        }
    }
}