public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<ArrayList<String>> all = new ArrayList<>();
       
        helper(s,al,all);
        return all;
    }
   
    private  void helper(String s,ArrayList<String> al,ArrayList<ArrayList<String>> all){
         if(s.length() == 0)
        {
            all.add(new ArrayList<String>(al));
        }
       
       for(int i = 0 ; i < s.length() ; i++){
           String str = s.substring(0,i+1);
           
           boolean res = isPalindromic(str);
           
           if(res){
               al.add(str);
               helper(s.substring(i+1),al,all);
               al.remove(al.size()-1);
           }
       }
    }
   
    private  boolean isPalindromic(String str){
        int left = 0;
        int right = str.length()-1;
       
        while(left <= right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
           
            left++;
            right--;
        }
       
        return true;
    }
}
