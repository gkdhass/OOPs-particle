import java.util.*;

public class Remove_Palindrome_Words_from_a_Sentence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String removed = "";

        for(int i=0; i<=str.length(); i++){

            if(i == str.length() || str.charAt(i) == ' '){

                char[] ch = removed.toCharArray();

                int left = 0;
                int right = ch.length-1;
                boolean palindrome = true;

                if(removed.length() == 1){
                    palindrome = false;
                }
                else{

                    while(left < right){
                        if(ch[left] != ch[right]){
                            palindrome = false;
                            break;
                        }
                        left++;
                        right--;
                    }
                }
            
                if(!palindrome){
                    System.out.print(removed + " ");
                }
                removed = "";
            }

            else{
            removed += str.charAt(i);
            }
        }
    }
}