package Array;

public class Sortand1 {
    public static void main(String[] args) {
        int a[]={1,0,0,1,1,0,2,2,0,0,1,1,2};
        int mid=0,low=0,high=a.length-1;
        while(mid<=high){
            if(a[mid]==0){
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }else if(a[mid]==1){
                mid++;
            }else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
        for (int ele: a){
            System.out.print(ele+" ");
        }
    }
}
