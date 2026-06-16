class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int m=set.size();
        if(n==m){
            return false;
        }
        else {
            return true;
        }
    }
}