// Quation sort the array 0's and 1's
package Array;
public class sort0and1 {
    public static void main(String[] args) {
        int []a={0,0,0,1,1,1};
        int i=0,j=a.length-1;
        while (i<j){
            if(a[i]==0) {
                i++;
            }
            if(a[j]==1){
                j--;
            }
            if(i>j) break;
            if(a[i]==1 && a[j]==0){
                a[i]=0;
                a[j]=1;
                i++;
                j--;
            }
        }
        for (int ele : a){
        System.out.print(ele+" ");
    }
    }

}
