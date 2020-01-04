package homework;

/**
 * @author g
 * @Date 2020/1/4 11:38
 */
public class HomeworkFourth {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i =0;i<n;++i){
            nums1[m+i] = nums2[i];
        }
        // for(int i = 1;i< nums1.length;++i){
        //     int j = i -1;
        //     int value = nums1[i];
        //     for(;j > -1;--j){
        //         if(nums1[j] > value){
        //             nums1[j+1] = nums1[j];
        //         }else{
        //             break;
        //         }

        //     }
        //     nums1[j+1] = value;
        // }
        quickSort(nums1,0,nums1.length - 1);
    }

    public void quickSort(int[] nums,int start,int end){
        if(start >= end){
            return;
        }
        int index = partition(nums,start,end);
        quickSort(nums,start,index-1);
        quickSort(nums,index+1,end);

    }
    public int partition(int[] nums,int start, int end){
        int pivot  = nums[end];
        int i = start;
        int swap = 0;
        for(int j = start;j < end;++j){
            if(nums[j] < pivot){
                swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
                ++i;
            }
        }

        swap = nums[i];
        nums[i] = nums[end];
        nums[end] = swap;

        return i;
    }
}
