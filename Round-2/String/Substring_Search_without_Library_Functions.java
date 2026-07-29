import java.util.*;

public class Substring_Search_without_Library_Functions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int ind = -1;

        for(int i=0; i<ch1.length - ch2.length; i++){
            int j;
            for( j=0; j<ch2.length; j++){
                if(ch1[i + j] != ch2[j]){
                    break;
                }
            }
            if(j == ch2.length){
                ind = i+1;
                break;
            }
        }
        System.out.println("index : " + ind);
    }
}