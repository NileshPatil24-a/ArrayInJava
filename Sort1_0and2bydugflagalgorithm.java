package Array;

public class Sort1_0and2bydugflagalgorithm {
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 2, 2,1, 0, 0, 1, 0};
        int nof0=0,nof1=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0) nof0++;
            if(a[i]==1) nof1++;
        }
        for(int i=0; i<a.length; i++){
            if(i<nof0) a[i]=0;
            else if (i<nof0+nof1) a[i]=1;
            else a[i]=2;
        }
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}
