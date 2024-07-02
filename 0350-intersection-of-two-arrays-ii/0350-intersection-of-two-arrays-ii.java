class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;

        while(i<n && j<m){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        int finalAns[] = new int [ans.size()];
        for(int index=0;index<ans.size();index++){
            finalAns[index]   = ans.get(index);
        }
        return finalAns;
    }
}