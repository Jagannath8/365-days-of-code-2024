public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
        Set<Integer> ans = new HashSet<>(a.size());
        a.removeIf(p -> !ans.add(p));
        return a.size();
	}
}
