class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int j = 0;
        int [] vocab = new int[128];
        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            j = Math.max(vocab[ch], j);
            res = Math.max(res, i - j + 1);
            vocab[ch] = i + 1;
        }
        return res;
    }
}
