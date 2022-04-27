/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

*/

import java.util.Arrays;
import java.util.Iterator;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Google Code
        /*for(int i = 0 ; i < n ; i++)
            nums1[i + m] = nums2[i];
        Arrays.sort(nums1);*/
        int k=0;
        for(int i: nums1){
            nums1[k++]=i;
        }
        for(int i: nums2){
            nums1[k++]=i;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args){
        MergeSortedArray mergeSortedArray=new MergeSortedArray();
        int[] num1={-50,-48,-47,-47,-46,-44,-43,-43,-41,-39,-38,-37,-37,-37,-33,-33,-32,-31,-29,-29,-27,-26,-26,-26,-25,-25,-24,-24,-23,-22,-22,-22,-18,-17,-17,-14,-14,-11,-11,-11,-6,-5,-5,-5,-5,-4,-1,0,2,2,2,2,5,6,7,7,9,10,13,13,14,14,18,21,21,21,22,24,24,24,25,26,26,29,29,29,30,30,31,31,32,33,34,34,34,35,38,40,41,42,43,44,44,46,46,47,47,48,49,49};
        int[] num2={};
        mergeSortedArray.merge(num1,100,num2,0);

    }
}


/* Iterator<Integer> it1=new Iterator<Integer>() {
            int i=0;
            @Override
            public boolean hasNext() {
                return nums1.length>i;
            }

            @Override
            public Integer next() {
                return Integer.valueOf(nums1[i++]);
            }
        };
        Iterator<Integer> it2=new Iterator<Integer>() {
            int j=0;
            @Override
            public boolean hasNext() {
                return nums2.length>j;
            }

            @Override
            public Integer next() {
                return Integer.valueOf(nums2[j++]);
            }
        };
        int i=0;
        while (it1.hasNext()){
            int min= it1.next();
            while (it2.hasNext()){
                if(min< it2.next() && min!=0){
                    nums1[i]=min;
                }else if(min> it2.next() && min!=0){
                    nums1[i]= it2.next();
                }else if(min==it2.next() && min!=0){
                    nums1[++i]=min;
                }else{
                    if(nums1[i]< it2.next()){
                        nums1[++i]= it2.next();
                    }else if(nums1[i]> it2.next()){
                        int x=nums1[i];
                        nums1[i]= it2.next();
                        nums1[++i]=m;
                    }
                }
            }
        }
int count=0;
        int[] nums3=new int[nums1.length+nums2.length];
        for(int i=0;i< nums1.length+nums2.length;i++){
            if(i<nums1.length){
                nums3[i++]=nums1[i];
            }
            if(i<nums2.length){
                nums3[i++]=nums2[i];
            }
        }
        int max=0;
        Iterator<Integer> it= new Iterator<Integer>() {
            int i=0;
            @Override
            public boolean hasNext() {
                return nums3.length>i;
            }

            @Override
            public Integer next() {
                return Integer.valueOf(nums3[i++]);
            }
        };
        for(int i=0;i<m+n;i++){
            for(int j=i+1;j<m+n;j++){
                if(nums3[j]>nums3[i]){
                    nums1[i]=nums3[i];
                }else if(nums3[j]<nums3[i]){
                    nums1[i]=nums3[j];
                }else{
                    nums1[++i]=nums3[i];
                }
            }
            if(!it.hasNext()){
                nums1[i]=0;
            }
        }*/