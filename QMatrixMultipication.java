package Array;

public class QMatrixMultipication {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{6,7,8},{7,8,9},{34,56,78}};
        if(a[0].length!=b.length){
            System.out.println("Mutilplication does not ocure..");
        }else {
            int c[][]=new int[a.length][b[0].length];
            for(int i=0; i<c.length; i++){
                for (int j=0; j<c[0].length; j++){
                    for(int k=0; k<b.length; k++){
                        c[i][j]+=a[i][k]+b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
