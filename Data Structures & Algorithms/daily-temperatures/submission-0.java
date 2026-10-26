class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int [] ans=new int[n];

        Deque<Integer> Stack=new ArrayDeque<>();
        for (int i=0;i<n;i++){
            while(! Stack.isEmpty() && temperatures[i]>temperatures[Stack.peek()]){
                int prev= Stack.pop();
                ans[prev]=i-prev;
            }
            Stack.push(i);
        }
    return ans;    
        
    }
}
