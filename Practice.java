package Array;

public class Practice {
    
    public static void main(String[] args) {
        System.out.println("welcome to java programing language ");
        int []a={0,0,0,1,1,1};
        int i=0,j=a.length-1;
        while (i<j){
            if(a[i]==0) i++;
            if(a[j]==0) j++;
            if(i>j) break;
            if(a[i]==1 && a[j]==0){
                int temp=0;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        for (int ele:a){
            System.out.print(ele+" ");
        }
    }
}
