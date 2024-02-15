public class Solution {
    public String intToRoman(int A) {  
        LinkedHashMap<String,Integer>hm=new LinkedHashMap<>();
        hm.put("M", 1000);
        hm.put("CM", 900);
        hm.put("D", 500);
        hm.put("CD", 400);
        hm.put("C", 100);
        hm.put("XC", 90);
        hm.put("L", 50);
        hm.put("XL", 40);
        hm.put("X", 10);
        hm.put("IX", 9);
        hm.put("V", 5);
        hm.put("IV", 4);
        hm.put("I", 1);
        
        String ans ="";
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            int match = A/entry.getValue();
            ans += repeat(entry.getKey(), match);
            A= A%entry.getValue();
        }
        return ans;   
    }
    
    public static String repeat(String s, int n){
        if(s==null) return null;
        final StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++){
            sb.append(s);
        }
        return sb.toString();
    }
}
