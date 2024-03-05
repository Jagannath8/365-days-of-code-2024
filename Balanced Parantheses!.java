public class Solution {
    public int solve(String A) {
        Stack<Character>sk=new Stack();
        if(A.length()==1)
            return 0;
        for(char st:A.toCharArray()){
            if(st=='(')
               sk.push(st);  
            else if(st==')' && !sk.isEmpty())
                sk.pop();
            else if(st==')' && sk.isEmpty())
            return 0;
        }
        
        if(sk.isEmpty())
            return 1;
        else
            return 0; 
    }
}
