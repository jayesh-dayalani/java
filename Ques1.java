// Linear search in an array
// Search for given x in an array

import java.util.*;

public class Ques1 {
    public static void main(String[] args){
        int arry[] = {1,2,3,4,5,6,7,8,9,10};
        int e = 0;

        System.out.println("Enter x :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 0; i < arry.length; i ++){
            if(x == arry[i]){
                System.out.println("Element fount at :"+(i+1));
                e ++;
            } 
        }
        if(e == 0){
            System.out.println("Element not found!");
        }

    }
    
}
