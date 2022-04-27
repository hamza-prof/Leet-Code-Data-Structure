import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> result=new ArrayList<>(),list=new ArrayList<>();

        //String str=null;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            list.add(i,list1[i]);
        }
        for(int i=0;i<list2.length;i++){
            if(list.contains(list2[i])){
                if(min>list.indexOf(list2[i])+i){
                    min=list.indexOf(list2[i])+i;
                    result.clear();
                    result.add(list2[i]);
                }else if(min==list.indexOf(list2[i])+i){
                    result.add(list2[i]);
                }
            }
        }

        //String[] str1={str};
        return result.toArray(new String[result.size()]);
    }
}
