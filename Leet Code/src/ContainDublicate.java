/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/

public class ContainDublicate {
    public boolean containsDuplicate(int[] nums) {
        boolean bool = false;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j=i+1; j < nums.length; j++) {
                if(j< nums.length){
                    if (temp == nums[j]) {
                        bool = true;
                    }
                }else{
                    return bool;
                }
            }
        }
        return bool;
    }
    public static void main(String[] args){
        ContainDublicate containDublicate=new ContainDublicate();
        int a[]={1,2,3,4,5,6,7};
        System.out.println(containDublicate.containsDuplicate(a));
        int b[]={2,3,4,6,5,3,1};
        System.out.println(containDublicate.containsDuplicate(b));
    }
}
//Google Code
/*public boolean containsDuplicate(int[] nums) {
    if(nums==null || nums.length==0)
        return false;

    HashSet<Integer> set = new HashSet<Integer>();
    for(int i: nums){
        if(!set.add(i)){
            return true;
        }
    }

    return false;
}*/
