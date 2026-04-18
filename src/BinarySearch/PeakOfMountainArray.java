package BinarySearch;

public class PeakOfMountainArray {
    public static void main(String[] args) {
        int [] nums = {2,4,6,8,6,4,2,1};
        int n = nums.length;
        int low = 1, high = n-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                System.out.println("Peak Element in Mountain Array : " + nums[mid]);
                break;
            } else if (nums[mid] < nums[mid+1] && nums[mid] > nums[mid-1]) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
    }
}
