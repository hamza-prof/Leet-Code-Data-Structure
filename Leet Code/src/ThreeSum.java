import java.util.*;
import java.util.LinkedList;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                for(int k=j+1;k< nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet=new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        list.add(triplet);
                    }
                }
            }
        }
        list=new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(list));
        return list;
    }
    /*
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0) return new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i< n-2;i++){
            if(i==0 || i>0 && nums[i]!= nums[i-1]){
                int low = i+1; int high = n-1; int sum = 0-nums[i];

                while(low<high){
                    if(nums[low]+nums[high] == sum){
                        res.add(Arrays.asList(nums[i],nums[low],nums[high]));

                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high--;

                        low++;high--;
                    }
                    else if(nums[low]+nums[high] < sum) {
                        low++;
                    }
                    else{
                         high--;
                    }
                }
            }
        }
        return res;
    }*/

    public static void main(String[] args) {
        System.out.println("Enter size of an array");
        int arr[]=new int[new Scanner(System.in).nextInt()];
        for(int i=0;i< arr.length;i++){
            arr[i]=new Scanner(System.in).nextInt();
        }

    }
}
