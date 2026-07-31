import java.util.*;
public class Max_Consecutive_Ones_III {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();

        int left = 0;
        int z = 0;
        int max = 0;
        int count = 0;

        for(int right=0; right<n; right++){

            if(str.charAt(right) == '0'){
                z++;

                while(z > k){
                    if(str.charAt(left) == '0'){
                        z--;
                    }
                    left++;
                }
            }
            int len = right - left +1;

            if(len > max){
                max = len;
                count = 1;
            }
            else if(len == max){
                count++;
            }
        }
        System.out.println(count);

    }
}
