public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int atoi(final String A) {
        if(A==null || A.length()==0)
            return 0;
        
        int ans=0;
        int sign=1;
        int i=0;
        while(i<A.length() && Character.isWhitespace(A.charAt(i)))
            i++;
        
        if(i<A.length() && (A.charAt(i)=='+' || A.charAt(i)=='-')){
            if(A.charAt(i)=='+')
                sign=1;
            else
                sign=-1;
            i++;
        }
        
        while(i<A.length() && Character.isDigit(A.charAt(i))){
            int digit=A.charAt(i)-'0';
            if(ans>(Integer.MAX_VALUE-digit)/10){
                if(sign==1)
                    return Integer.MAX_VALUE;
                else    
                    return Integer.MIN_VALUE;
            }
            ans=ans*10+digit;
            i++;
        }
        return ans*sign;
    }
}
