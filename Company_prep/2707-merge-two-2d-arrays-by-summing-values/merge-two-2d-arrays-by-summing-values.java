class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++) {
            int id = nums1[i][0];
            int val = nums1[i][1];
            map.put(id,val);
        }
        for(int i=0;i<nums2.length;i++) {
            int id = nums2[i][0];
            int val = nums2[i][1];
            map.put(id,map.getOrDefault(id,0)+val);
        }
        int[][] res = new int[map.size()][2];
        int index = 0;
        for(int id: new TreeSet<>(map.keySet())) {
             res[index][0] = id;
             res[index][1] = map.get(id);
             index++; 
        }
        return res;
    }
}