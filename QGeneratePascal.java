package Array;

import java.util.ArrayList;
import java.util.List;

public class QGeneratePascal {
    public static void main(String[] args) {
        int n=10;
        List<List<Integer>> ans=new ArrayList<>(n);
        for(int i=0; i<n; i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0; j<n; j++){
                l.add(1);
            }
            ans.add(l);
        }
        for(int i=2; i<n; i++){
            for(int j=1; j<=i; j++){
                ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
        }
    }
}
