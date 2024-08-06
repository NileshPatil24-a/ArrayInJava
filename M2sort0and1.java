package Array;

public class M2sort0and1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2};
        int nofz = 0, no1 = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i]==0) nofz++;
            if (a[i]==1) no1++;
        }
        for (int i=0; i<a.length; i++){
            if(nofz==0) nofz=0;
            if(nofz+no1==1) no1=1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
