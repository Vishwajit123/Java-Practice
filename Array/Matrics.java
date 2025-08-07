package Array;

import java.util.Scanner;

public class Matrics {
    public static int search(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("found at the(" + i + ", "+ j + ")");
                    return 1;
                }
            }
        }
        return 0;
        
    }

    public static void maxmin(int matrix[][]){
        if(matrix.length==0 || matrix[0].length==0){
            System.out.println("the array is empty");
        }
        int min=matrix[0][0];
        int max=matrix[0][0];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
            
            
        }
        System.out.println("The largest element is:" +max);
            
            System.out.println("The smallest element is:" +min);
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3]; 
        Scanner sc=new Scanner(System.in);
        int n=matrix.length, m=matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                 matrix[i][j]=sc.nextInt();
            }
        }

         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                 System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        search(matrix, 5);
        maxmin(matrix);
    }
    

}
