package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Out of the array print the pth smallest element when array[i]%x==z
intput:array,p,x,z
output:index of the pth smallest element

 */

public class Main1 {
    public  static void main(String args[]){
        int arr[]={10,33,15,13,28};
        int p=2;
        int x=5;
        int z=3;

        List<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%x==z){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        Integer temp[]=new Integer[list.size()];
        temp=list.toArray(temp);

        int key= temp[temp.length-p];
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
                break;
            }
        }
    }
}
