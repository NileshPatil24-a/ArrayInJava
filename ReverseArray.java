package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int i=0,j=a.length-1;
        for(int h=0; h<a.length; h++){
            if(i>j){
                break;
            }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
