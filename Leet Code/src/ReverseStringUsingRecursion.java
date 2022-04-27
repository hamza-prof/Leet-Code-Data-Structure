public class ReverseStringUsingRecursion {
    private static void reverseString(int index,char[] str){
        if(str==null || index>= str.length){
            return;
        }
        reverseString(index+1,str);
        System.out.println(str[index]);
    }
    static int i=0;
    private static void reverseString(char[] str){
        if(str==null || i>=str.length){
            return;
        }

    }
    public static void main(String[] args){
        //char [] ch={'h','a','m','z','a'};
        reverseString(new char[]{'h','a','m','z','a'});
    }
}
