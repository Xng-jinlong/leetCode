package leetcode;

import java.util.Arrays;

/**
 * @BelongsProject: leetCode
 * @BelongsPackage: leetcode
 * @Author: JinLong Xing
 * @CreateTime: 2023-12-08  17:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Code128 {

    public static void main(String[] args){
        int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};

        int i = longestConsecutive(nums);

        System.out.println("i = " + i);

    }

    public static int longestConsecutive(int[] nums){
        // 进行排序
        Arrays.sort(nums);

        int count = 0;

        if(nums.length == 0){
            return count;
        }

        int temp = 0;

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(start + 1 == nums[i]){
                temp++;
                start = nums[i];
            } else if (start == nums[i]){
                continue;
            } else {
                if(temp > count){
                    count = temp;
                }
                start = nums[i];
                temp = 0;

            }
        }

        if(temp > count){
            count = temp;
        }
        return ++count;
    }

}
