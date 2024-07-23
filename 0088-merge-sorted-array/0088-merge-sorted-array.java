class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int len = m+n;
        int ans [] = new int [len];
        int index =0;
        int i =0;
        int j =0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                ans[index] = nums1[i];
                i++;
                index++;
            }
            else if(nums1[i]==nums2[j]){
                ans[index] = nums1[i];
                index++;
                ans[index] = nums2[j];
                i++;
                j++;
                index++;
            }
            else{
                ans[index] = nums2[j];
                j++;
                index++;
            }
        }

        while(i<n){
            ans[index] = nums1[i];
            index++;
            i++;
        }

        while(j<m){
            ans[index] = nums2[j];
            index++;
            j++;
        }

        for(int k=0;k<ans.length;k++){
            nums1[k] = ans[k];
        }




    }
}