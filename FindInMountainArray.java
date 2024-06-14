// Title: Find in Mountain Array
// Difficulty: Hard
// Tags: Array , Binary Search , Interactive
// URL: https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {

//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = peak(mountainArr);
//        int pos1 = oabs(mountainArr,target,0,peak);
//        int pos2 = oabs(mountainArr,target,peak+1,mountainArr.length()-1);
//        if(pos1 == -1) {
//            return pos2;
//        }
//        else {
//            return pos1;
//        }
//    }
//    private int peak(MountainArray arr){
//        int start = 0;
//        int end = arr.length()-1;
//        while(start<end) {
//            int mid = start + (end-start)/2;
//            if(arr.get(mid)>arr.get(mid+1)) {
//                end = mid;
//            }
//            else {
//                start = mid+1;
//            }
//        }
//        return start;
//    }
//    private int oabs(MountainArray arr, int target, int start, int end) {
//        boolean isAsc = arr.get(start) < arr.get(end);
//        while(start<=end) {
//            int mid = start + (end - start )/2;
//            if(arr.get(mid) == target ) {
//                return mid;
//            }
//            if(isAsc) {
//                if(target>arr.get(mid)) {
//                    start = mid+1;
//                }
//                else {
//                    end = mid-1;
//                }
//            }
//            else {
//                if(target > arr.get(mid)) {
//                    end = mid-1;
//                }
//                else {
//                    start = mid+1;
//                }
//            }
//        }
//        return -1;
//    }
}
