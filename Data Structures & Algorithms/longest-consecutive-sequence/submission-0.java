class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int length=1;
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
                count=Math.max(count,length);
            }
        }
    return count;
    }
}
