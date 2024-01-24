public class Solution {
    public int romanToInt(String A) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int ans=0;
        for(int i=0;i<A.length();i++){
            if(i<A.length()-1 && mp.get(A.charAt(i))<mp.get(A.charAt(i+1)))
                ans-=mp.get(A.charAt(i));
            else
                ans+=mp.get(A.charAt(i));
        }
        return ans;
    }
}
