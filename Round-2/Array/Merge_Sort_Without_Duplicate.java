import java.util.*;

public class Merge_Sort_Without_Duplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        

        int[] nums1 = new int[n1];
        for(int i=0; i<n1; i++){
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n2];
        for(int i=0; i<n2; i++){
            nums2[i] = sc.nextInt();
        }

        int[] ans = new int[n1+n2];
        int left = 0;
        int right = 0;
        int mid = 0;

        while(left < n1 && right < n2){

            if( nums1[left] < nums2[right]){
                if(mid == 0 || ans[mid - 1]  != nums1[left]){
                    ans[mid++] = nums1[left];
                }
                left++;
            }
            else if(nums1[left] > nums2[right]){
                if(mid == 0 || ans[mid-1] != nums2[right]){
                    ans[mid++] = nums2[right];
                }
                right++;
            }
            else{
                if(mid == 0 || ans[mid - 1] != nums1[left]){
                    ans[mid++] = nums1[left];
                }
                left++;
                right++;
            }
        }

        while( left < n1){
            if(mid == 0 || ans[mid - 1]  != nums1[left]){
                    ans[mid++] = nums1[left];
                }
                left++;
        }

        while( right < n2){
            if(mid == 0 || ans[mid-1] != nums2[right]){
                    ans[mid++] = nums2[right];
                }
                right++;
        }

        for(int i=0; i<mid; i++){
            System.out.print(ans[i] + " ");
        }
    }
}