import java.util.*;

public class Sort_Array_According_to_Weight_of_Numbers {

    static class Pair{
        int num = 0;
        int weight = 0;

        Pair(int num , int weight){
            this.num = num;
            this.weight = weight;
        }
    }

    public static boolean prefect(int num){
        for(int i=1; i*i <= num; i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        Pair[] ans = new Pair[n];

        for(int i=0; i<n; i++){
            int weight = 0;
            if(prefect(nums[i])){
                weight += 5;
            }
            if(nums[i] % 4 == 0  && nums[i] % 6 == 0){
                weight += 4;
            }
            else if(nums[i] % 2 == 0){
                weight += 3;
            }

            ans[i] = new Pair(nums[i] , weight);
        }

        //sort

        for(int i=0; i<ans.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(ans[i].weight > ans[j].weight){
                    Pair temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }

        //print
        for(Pair p : ans){
            System.out.print("(" + p.num + "," + p.weight + ") ");
        }
    }

}
