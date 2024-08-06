package Array;

public class MergeArray {
    public static void main(String[] args) {
        int []a={1,5,88,90};
        int b[]={5,3,2,10};
        int []c={};
        int n=a.length+b.length;
        int i=0;
        int j=0;
        int k=0;
        while ((i+j)<=n){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                j++;
            }
            else {
                c[k]=b[j];
                k++;
                j++;
            }

        }
        for (int ele: c){
            System.out.print(ele+" ");
        }
    }
}
