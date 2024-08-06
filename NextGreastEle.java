package Array;

public class NextGreastEle {
    public static void main(String[] args) {
        int a[]={12,8,41,37,2,49,16,28,21};
        int b[]=new int[a.length];
//        methode 1 = brute force

        b[a.length-1]=-1;
//        for (int i=0; i<a.length-1; i++){
//            int max=Integer.MIN_VALUE;
//            for (int j=i+1; j<a.length; j++){
//                max=Math.max(max,a[j]);
//            }
//            b[i]=max;
//        }

//        methode 2 = optimized

    int nge=a[a.length-1];
    for(int i=a.length-2; i>=0; i--){
        b[i]=nge;
        nge=Math.max(nge,a[i]);
    }
        for (int ele:b){
            System.out.print(ele+" ");
        }
    }
}
