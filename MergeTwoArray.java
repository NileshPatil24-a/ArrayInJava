package Array;

public class MergeTwoArray {
    public static void main(String[] args) {
        int a[]={20,40,500};
        int b[]={20,30,80,90,10};
        int c[]=new int[a.length + b.length];
        int i=0,k=0,j=0;
       while (i<a.length && j<b.length){
           if(a[i]<b[j]){
               c[k]=a[i];
               i++;
           }
           else{
               c[k]=b[j];
               j++;
           }
           k++;
           if(i==a.length){   // print the elment into b array
               while (j<b.length){
                   c[k]=b[j];
                   j++; k++;
               }
           }
           if(j==b.length){
               while (i<a.length){
                   c[k]=a[i];
                   i++; k++;
               }
           }
       }
       for(int ele:c){
           System.out.print(ele+" ");
       }
    }
}
