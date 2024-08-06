package Array;

import java.util.ArrayList;

public class QpiralMatrix {
    public static void Print(int arr [][]){
        int m= arr.length;
        int n=arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        int a[][]={{1,2},{4,5,6},{7,8,9}};
        int top=0,bottom=a.length-1;
        int left=0,right=a[0].length-1;
        Print(a);
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                System.out.print(a[top][i]+" ");
            }top++;
            for(int i=top; i<=bottom; i++){
                System.out.print(a[i][right]+" ");
            }right--;
            if(!(top<=bottom && left<=right)) break;
            for(int i=right; i>=left; i--){
                System.out.print(a[bottom][i]+" ");
            }bottom--;
            for(int i=bottom; i>=top; i--){
                System.out.print(a[i][left]+" ");
            }left++;
        }
    }
}
