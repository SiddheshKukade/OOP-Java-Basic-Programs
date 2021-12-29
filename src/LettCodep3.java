import java.util.HashSet;
class Solution {
    public int  a , b ,max;
    // a for unique and b for repreating characters
    public HashSet<Character> hashSet  =new HashSet();
    int lengthOfLongestSubstring(String s) {
        while(b < s.length()){
            if(!hashSet.contains(s.charAt(b))) {
                    //if it don't contain same char then add it to the  list
                hashSet.add(s.charAt(b));
                b++;
                max = Math.max(hashSet.size(), max);
            }
            else{
                //if duplicate found remove previous instance and add new instannce and follow same process at last you'lll get longest substring without repeating characters.
                 hashSet.remove(s.charAt(a));
                 a++;
            }
    }
        return max;
    }
};
public class LettCodep3 {
    public static void main(String[] args) {
Solution sol = new Solution();
System.out.println(sol.lengthOfLongestSubstring("bbbb"));
    }
}