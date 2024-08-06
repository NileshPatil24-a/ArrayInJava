package Array;

public class TransfoseBySwap {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=a.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <=i; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
