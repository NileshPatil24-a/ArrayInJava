package Array;

public class TransfoseOfMatrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
//        for (int i=0; i<a.length;i++){
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("matrix");
//
//        for (int j=0; j<a[0].length;j++){
//            for (int i = 0; i< a.length; i++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
        //storing in new matrix
        int b[][]=new int[a.length][a.length];
        for (int i=0;  i<a.length; i++){
            for (int j= 0; j< a.length; j++) {
               b[i][j]=a[i][j];
            }
        }
        System.out.println();
        for (int j=0; j<b[0].length;j++){
            for (int i = 0; i< b.length; i++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
