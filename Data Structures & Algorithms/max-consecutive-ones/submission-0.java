class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int max = 0;

        for (int integers : nums) {
            if (integers == 1) {
                i++;
            }
            if (i > max) {
                max = i;
            }
            if (integers == 0) {
                i = 0;
            }
        }

        return max;
    }
}