package DSA;
/*question:
Split a string on the basis of a input interval
Input 1.string="abcdefghij"
      2. interval=3
output: abc
        def
        ghi
        j
 */


public class Main {
    public static void main(String[] args) {
        String s="abcdefghij";
        int interval=3;
        int temp=interval;
        for(int i=0;i<s.length();i+=interval){
            if(i==s.length()-1){
                System.out.println(s.substring(i));
                break;
            }
            System.out.println(s.substring(i,temp));
            temp+=interval;
        }
    }
}
