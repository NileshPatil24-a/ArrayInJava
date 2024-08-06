package Array;

public class M2sort0and1and2 {
    public static void main(String[] args) {
        int [] arr={1,2,0,1,0,2,2,0,1,0};
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
