public class MaxSumContigiousArray {
    public int checkArray(int[] nums){
        int max_value=(nums[0]<0)? nums[0]:0;
        int max_cur=0;
        if(max_value!=0){
            for(int i=1;i< nums.length;i++){
                if(nums[i]<0){
                    max_cur=nums[i];
                    if (!(max_value>max_cur)){
                        //System.out.println(i);
                        max_value=max_cur;
                    }
                }else{
                    max_value=0;
                }
            }
        }
        return max_value;
    }
    public int maxSubArray(int[] nums) {
        int max_value=0;
        int max_cur=0;
        if (new MaxSumContigiousArray().checkArray(nums)==0){
            for(int i=0;i<nums.length;i++){
                max_cur=max_cur+nums[i];
                if (max_value<max_cur){
                    //System.out.println(i);
                    max_value=max_cur;
                }
                if (max_cur<0 ){
                    //System.out.println(":"+i);
                    max_cur=0;
                }
            }
        }else{
            max_value=new MaxSumContigiousArray().checkArray(nums);
        }

        return max_value;
    }
    public static void main(String[] args){
        int a[]={-2,-1,-3};
        System.out.println(new MaxSumContigiousArray().checkArray(a));
        System.out.println(new MaxSumContigiousArray().maxSubArray(a));
    }

}
