class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] nums3=new int[n+m];
        double median=0;
        for(int i=0;i<n;i++){
            nums3[i]=nums1[i];
        }
        for(int j=0;j<m;j++){
            nums3[j+n]=nums2[j];
        }
        Arrays.sort(nums3);
        int len=nums3.length;
        if(len%2!=0){
            median=nums3[len / 2];
        }
        else{
            median=(nums3[len/2 - 1] + nums3[len/2]) / 2.0;
        }
    return median;   
    }
}
