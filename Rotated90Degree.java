package Array;

public class Rotated90Degree {
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
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        Print(arr);
        for (int i= 0; i < arr.length; i++) {
            int a=0,b=arr.length-1;
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }

        }
        Print(arr);
    }
}
