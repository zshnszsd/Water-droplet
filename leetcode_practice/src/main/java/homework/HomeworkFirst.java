package homework;

/**
 * @author g
 * @Date 2020/1/1 14:56
 */
class HomeworkFirst {

        public int removeDuplicates(int[] nums) {

            if(nums.length < 2){
                return nums.length;
            }

            int count = 0;
            int arr = nums[0];

            for(int i = 1; i < nums.length;++i){
                if(arr == nums[i]){
                    continue;
                }else{
                    count += 1;
                    arr = nums[i];
                    nums[count] = arr;
                }
            }
            return count + 1;

        }

    }

