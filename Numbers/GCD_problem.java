import java.util.*;
public class GCD_problem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = sc.nextInt();

        for(int i=1; i<n; i++){
            int num = sc.nextInt();
            ans = gcd(num , ans);
        }
        System.out.println(ans);
    }
    public static int gcd(int a,  int b){
        while(b != 0){
            int sum = a % b;
            a = b;
            b = sum;
        }
        return a;
    }
}