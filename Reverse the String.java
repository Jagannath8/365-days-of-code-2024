public class Solution {
    public String solve(String A) {
        String words[] = A.split("\\s+");
        for(int i=0;i<words.length/2;i++){
            String temp = words[i];
            words[i]=words[words.length-i-1];
            words[words.length-i-1]=temp;
        }
        String revWords = "";
        for(String w:words){
            StringBuffer sb = new StringBuffer(w);
            revWords += sb.toString()+" ";
        }
        return revWords.trim();
    }
}
