package arrays;

public class StringOpertaion {
    public static void main(String args[]){
        String s="21462675756";

        /*List<Character> str2=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            str2.add(s.charAt(i));
        }
        int i=0;int j=1;
        System.out.println(str2.size());
        while(i<str2.size()-1){
            System.out.println(str2.get(i)+" "+str2.get(j));
            if(str2.get(i)%2==0 && str2.get(j)%2==0){
                str2.add(j,'*');
            }
            if(str2.get(i)%2!=0 && str2.get(j)%2!=0){
                str2.add(j,'-');
            }
            i++;
            j++;
            if(str2.get(i)=='*' || str2.get(i)=='-'){
                i++;
                j++;
            }


        }
        StringBuilder sb=new StringBuilder();

        /*for(int k=0;k<str2.size();k++){
            sb.append(str2.get(k));
        }
        for(Character ch: str2){
            sb.append(ch);
        }

        System.out.println(sb.toString());*/
        StringBuffer str2=new StringBuffer(s);
        int i=0;int j=1;

        while(i<str2.length()-1){
            //System.out.println("i: "+i+ " j: "+j);
            if(str2.charAt(i)%2==0 && str2.charAt(j)%2==0){
                //System.out.println("Inside if j: "+j);
                str2.insert(j,"*");
            }else if(str2.charAt(i)%2!=0 && str2.charAt(j)%2!=0){
                str2.insert(j,"-");
            }
                i++;
            j++;
            if(str2.charAt(i)=='*' || str2.charAt(i)=='-'){
                i++;
                j++;
            }

        }


        System.out.println("New String: "+str2.toString());

    }
}
