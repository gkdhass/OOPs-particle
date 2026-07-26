
import java.util.*;

public class Max_Min_Arrangement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
       int left = 0;
       int right = n-1;

       for(int i=0; i<n-1; i++){
        for(int  j =0; j<n-1-i; j++){
            if(nums[j] >nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
       }

       while(left <= right){
            if(left != right){
                System.out.print(nums[right] + " ");
                System.out.print(nums[left] + " ");
            }
            else{
                System.out.print(nums[left] + " ");
            }
            left++;
            right--;
       } 
    }
}