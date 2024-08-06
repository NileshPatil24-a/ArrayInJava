package Array;

public class QSet0rsmatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int m = a.length, n = a[0].length;
        boolean row[] = new boolean[m];
        boolean colon[] = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]==0){
                    row[i]=true;
                    colon[j]=true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j=0; j<n; j++){
                if(row[i] || colon[j]){
                    a[i][j]=0;
                }
            }
        }
    }
}
