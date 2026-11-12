class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int res=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)>n/2){
                res=num;
            }
        }
    return res;
    }
}