class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] nums1=new int[n+n];
        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[i];
            nums1[i+n]=nums[i];
        }
    return nums1;
    }
}