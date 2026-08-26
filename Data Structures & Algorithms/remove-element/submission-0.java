class Solution {
    public int removeElement(int[] nums, int val) {
        int length = 0;

        for (int integers : nums) {
            if (integers != val) {
                nums[length] = integers;
                length++;
            }
        }

        return length;
    }
}