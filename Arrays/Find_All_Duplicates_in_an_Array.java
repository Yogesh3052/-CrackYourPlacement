class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     int n=nums.length;
     HashMap<Integer,Integer> maps=new HashMap<>();   
     List<Integer> list=new ArrayList<>();
     for(int i=0;i<n;i++){
        if(maps.containsKey(nums[i])){
            maps.put(nums[i],maps.get(nums[i])+1);
        }
        else{
            maps.put(nums[i],1);
        }
     }
     for(int dups:maps.keySet()){
        if(maps.get(dups)>1){
            list.add(dups);
        }
     }
     return list;
    }
}