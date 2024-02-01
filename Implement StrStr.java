public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        int start=0, end=0;
        while(end<A.length()){
            if(end-start+1<B.length())
                end++;
            else if(end-start+1==B.length()){
                String temp=A.substring(start,end+1);
                if(temp.equals(B)){
                    return start;
                }
                start++;
                end++;
            }
        }
        return -1;
    }
}
