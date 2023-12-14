package leetcode;


/*
 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

请注意 ，必须在不复制数组的情况下原地对数组进行操作。

示例 1:

输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]
示例 2:

输入: nums = [0]
输出: [0]

* */

/**
 * @BelongsProject: leetCode
 * @BelongsPackage: leetcode
 * @Author: JinLong Xing
 * @CreateTime: 2023-12-14  11:29
 * @Description: TODO
 * @Version: 1.0
 */
public class code283 {

    public static void main(String[] args){
        int[] nums = {4,2,4,0,0,3,0,5,1,0};

        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums){
        int left = 0;
        int right = 0;

        while (right < nums.length){
            if(nums[right] != 0){
                if(left != right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }

                left++;
            }
            right++;

        }

    }
}
