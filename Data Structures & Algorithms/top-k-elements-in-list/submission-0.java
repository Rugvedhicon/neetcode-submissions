class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        Integer arr[]=new Integer [hash.size()];
        int i=0;
        for(Integer key:hash.keySet()){
            arr[i]=key;
            i++;
        }
        Arrays.sort(arr,(a,b)->hash.get(b)-hash.get(a));
        int gun [] =new int[k];
        for(i=0;i<k;i++){
            gun[i]=arr[i];
        }

        return gun;
    }
}
