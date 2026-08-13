class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
     {
        //we have taken the length of two array and making it one
        int []arr= new int[nums1.length+nums2.length];
        //all three we have intilize to zero
        int i=0;
        int j=0;
        int k=0;
        //first we have check the length
        while(i<nums1.length && j<nums2.length)
        {
            //then adding to new arr
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        //when i less than the length of nums1 then move to the new arr
        while(i<nums1.length)
        {
            arr[k]=nums1[i];
            i++;
            k++;
        }
         //when j less than the length of nums1 then move to the new arr
        while(j<nums2.length)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }
        //the new array taken the length and median
        int n=arr.length;
        if(n%2!=0)
        {
             return arr[n/2];
        }
        //return the valur of median of arr
        return (arr[n/2-1]+arr[n/2])/2.0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna