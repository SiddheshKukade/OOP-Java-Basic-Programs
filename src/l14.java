class Solution1 {
      int smallest (String strs[]) {
          int smallest =0 ;
      for(int i = 0; i<strs.length; i++){
          if(strs[i].length() <strs[i+1].length()){
              smallest = i;
          }
      }
          return smallest ;
    }// smallest
    public String longestCommonPrefix(String[] strs) {
        String [][] chars = new String [200][200];
        String ans ="";
        boolean toggle = false;
        int steps =0 ;
        if(strs.length == 1 ) return strs[0];
        for(int i =0 ; i<strs.length ; i++){
            chars[i] =  strs[i].split("");
        }
        for(int j =0 ; j<chars[0].length ; j++){
            for(int i =0 ; i<strs.length-2 ; i++){
                if( chars[i][j] == chars[i+1][j]){
                    toggle = true;
                    steps++;
                }
            }
            ans += chars[steps][j];
            steps=0;
        }
        return ans;
    }}

public class l14 {
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight","ddddd"};
        Solution1 sol = new Solution1();
//System.out.println( sol.longestCommonPrefix(strs));
System.out.println(sol.smallest(strs));
    }
}
