import java.util.ArrayList;
import java.util.Scanner;

public class DistinctInteger {
    public int countDistinctInteger(int n) {
        ArrayList<Integer> set=new ArrayList<>();
        set.add(n);
        for (int i = 0; i < set.size(); i++) {
            for(int j=1;j<=set.get(i);j++){
                if(set.get(i) % j == 1){
                    if(!set.contains(set.get(i)-j)){
                        set.add(set.get(i)-j);
                    }
                }
            }
        }
        return set.size();
    }
    public static void main(String [] args){
        DistinctInteger k=new DistinctInteger();
        System.out.println(k.countDistinctInteger(new Scanner(System.in).nextInt()));
    }
}
//HashSet
/* public int countDistinctInteger(int n) {
        HashSet<Integer> set=new HashSet<>();
        set.add(n);
        for(int i:set){
            for(int j=1;j<=i;j++){
                if(i % j == 1){
                    set.add(i-j);
                }
            }
        }
        return set.size();
    }*/