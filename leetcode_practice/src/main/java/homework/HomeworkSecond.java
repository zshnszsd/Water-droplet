package homework;

/**
 * @author g
 * @Date 2020/1/2 10:01
 */
class HomeworkSecond {

    public void rotate(int[] nums, int k) {
        if(nums.length == 1  || k == 0){
            return;
        }

        k = k % nums.length;
        convert(nums,0,nums.length-1);
        convert(nums,0,k-1);
        convert(nums,k, nums.length-1);
    }

    public void convert(int[] nums,int index,int k){

        int temp = 0;
        while (index < k){
            temp = nums[index];
            nums[index] = nums[k];
            nums[k] = temp;
            ++index;
            --k;
        }

    }

}

