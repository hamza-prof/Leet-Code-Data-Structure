/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int[] indices=new int[2];
        int a=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i!=j) {
                    if (nums[i] + nums[j] == target) {
                        a=nums[i] + nums[j];
                        //System.out.println(i+","+j);
                        indices[0]=i;
                        indices[1]=j;
                        break;
                    }
                }
            }
            if(a==target){
                break;
            }
        }
        //System.out.println(a);
        return indices;
    }
}
