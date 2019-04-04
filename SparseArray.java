import java.util.*;
class SparseArray{
    public static void main(String[] rags){
        Scanner sc=new Scanner(System.in);
        int sizeA=sc.nextInt();
        String[] array=new String[sizeA];
        for(int i=0;i<sizeA;i++)
            array[i]=sc.next();
        int sizeQ=sc.nextInt();
        String[] queries=new String[sizeQ];
        for(int i=0;i<sizeQ;i++)    
            queries[i]=sc.next();
        Solution s=new Solution();
        s.counter(array,queries);
        
    }
}
class Solution{
    public void counter(String array[],String queries[]){
         int count[]=new int[queries.length];
         for(int i=0;i<queries.length;i++){
            for(int j=0;j<array.length;j++){
                if(queries[i].equals(array[j])){
                    count[i]++;
                }
            }
         }
         for(int i=0;i<count.length;i++)
            System.out.println(count[i]);
    }
}