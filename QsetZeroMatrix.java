package Array;

public class QsetZeroMatrix {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{1,0,1},{1,1,1}};
        int helper[][]=new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                helper[i][j]=a[i][j];
            }
        }
        for (int i = 0; i < helper.length; i++) {
            for (int j = 0; j < helper[0].length; j++) {
                if(a[i][j]==0){
                    for (int k = 0; k < a[0].length; k++) {
                        helper[i][k]=0;
                    }
                }else{
                    for (int m = 0; m < helper.length; m++) {
                         helper [m][j]=0;
                    }
                }
            }

        }
    }
}
