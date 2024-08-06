package Array;

public class QElementFind2 {
   public static <ele> boolean Return(int a[][], int ele){
       for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a.length; j++) {
               if(a[i][j]==ele){
                   return true;
               }
           }
       }
       return false;
   }
    public static void main(String[] args) {
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int trg=58;
    boolean man=Return(a,trg);
        System.out.println(man);
    }
}
