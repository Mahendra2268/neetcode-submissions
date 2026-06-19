class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] a=strs[i].toCharArray();
            Arrays.sort(a);
            String key= new String(a);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);

        }
        for(List<String> s:map.values()){
            res.add(s);
            }
    return res;    
    }
}
