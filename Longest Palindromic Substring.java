public class Solution {
    int start=0, end=0;
    public String longestPalindrome(String A) {
        for(int i=0;i<A.length();i++){
            helper(A,i,i);
            helper(A,i,i+1);
        }
        return A.substring(start, end+1);
    }
    
    private void helper(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        left+=1;
        right-=1;
        if(end-start+1 < right-left+1){
            start=left;
            end=right;
        }
    }
}
