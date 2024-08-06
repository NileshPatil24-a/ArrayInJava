package Array;

public class merge {
    public static void main(String[] args) {
        int []a={1,2,3};
        int []b={5,6,7};
        int []c= new int[a.length+b.length];
        int k=c.length-1,i=a.length-1,j=b.length-1;
        while(i>0 && j>0){
            if(a[i]>b[j]){
                c[k]=a[i];
                i--; k--;
            }else {
                c[k]=b[j];
                j--; k--;
            }
            if(i==0){
                while (j>=0){
                    c[k]=b[j];
                    j--;k--;
                }
            }
            if(j==0){
                while (i>=0){
                    c[k]=a[i];
                    i--;k--;
                }
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
