class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>st = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            st.add(nums1[i]);
        }
        Set<Integer>s = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(st.contains(nums2[i])){
                s.add(nums2[i]);
            }
        }
        int []interSection = new int[s.size()];
        int index = 0;
        for(int num : s){
            interSection[index++] = num;
        } 
        return interSection;
    }
}