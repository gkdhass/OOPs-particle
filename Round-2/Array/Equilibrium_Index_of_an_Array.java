import java.util.*;

public class Equilibrium_Index_of_an_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n ; i++){
            nums[i] = sc.nextInt();
        }

        int total = 0;
        for(int i=0; i<n; i++){
            total += nums[i];
        }

        int left = 0;
        for(int i=0; i<n; i++){
            
            total = total - nums[i];
            if(left == total){
                System.out.println("Equilibrium index " + i);
                return ;
            }
            left += nums[i];
        }
        System.out.println("No Equilibrium index.");

    }
}
