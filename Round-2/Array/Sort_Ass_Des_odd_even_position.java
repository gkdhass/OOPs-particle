import java.util.*;

public class Sort_Ass_Des_odd_even_position {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int evensize = (n+1)/2;
        int oddsize  = n/2;

        int[] even = new int[evensize];
        int[] odd = new int[oddsize];

        int e = 0;
        int o = 0;

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                even[e++] = nums[i];
            }
            else{
                odd[o++] = nums[i];
            }
        }

        //Des
        for(int i=0; i<evensize-1; i++){
            for(int j=0; j<evensize-1-i; j++){
                if(even[j] < even[j+1]){
                    int temp = even[j];
                    even[j] = even[j+1];
                    even[j+1] = temp;
                }
            }
        }

        //Asc
        for(int i=0; i<oddsize-1; i++){
            for(int j=0; j<oddsize-1-i; j++){
                if(odd[j] > odd[j+1]){
                    int temp = odd[j];
                    odd[j] = odd[j+1];
                    odd[j+1] = temp;
                }
            }
        }

        e = 0;
        o = 0;

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                nums[i] = even[e++];
            }
            else{
                nums[i] = odd[o++];
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
