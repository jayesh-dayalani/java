// Linear search in 2D array
// Find x in the given matrix


import java.util.*;

public class Ques2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the no of rows: ");
        int col = sc.nextInt();
        int[][] arry2d = new int[row][col];

        for(int i = 0; i < row; i ++){
            System.out.println("Enter the elements at row : "+i);
            for(int j = 0; j < col; j ++){
                arry2d[i][j] = sc.nextInt();
            }    
        }

        System.out.println("Enter an element to search : ");
        int x = sc.nextInt();

        int f = 0;
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                if(arry2d[i][j] == x){
                    System.out.println("Element found at : "+i+","+j);
                    f ++;
                }
            }
        }
        
        if(f ==0){
            System.out.println("Element not found !");  
        }
    }

}
