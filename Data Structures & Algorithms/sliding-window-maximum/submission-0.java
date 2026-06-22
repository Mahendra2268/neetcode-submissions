class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int left = 0; left <= nums.length - k; left++) {

            int max = nums[left];

            for(int i = left; i < left + k; i++) {
                max = Math.max(max, nums[i]);
            }

            list.add(max);
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}