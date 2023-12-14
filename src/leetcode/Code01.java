package leetcode;

/*
* 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
* 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。
*
*
* */

import java.util.*;

/**
 * @BelongsProject: leetCode
 * @BelongsPackage: leetcode
 * @Author: JinLong Xing
 * @CreateTime: 2023-12-14  09:04
 * @Description: TODO
 * @Version: 1.0
 */
public class Code01 {

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        
        twoSum1(nums,9);
    }

    public static int[] twoSum(int[] nums, int target){

//        Arrays.stream(nums).boxed().toArray(Integer[]::new)
        // 将int 数据转为arrayList
        List num = Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new));

        int[] resInt = new int[2];
        // 循环获取数据
        for (int i = 0; i < num.size(); i++) {
            Integer bad = target - Integer.parseInt(num.get(i)+"");
            // 判断当前是否存在
            if(num.lastIndexOf(bad) != -1 && num.lastIndexOf(bad) != i){
                resInt[0] = i;
                resInt[1] = num.lastIndexOf(bad);
                break;
            }
        }

        return resInt;
    }


    public static int[] twoSum1(int[] nums, int target){

        int[] resInt = new int[2];

        // 定义一个map集合
        Map<Integer,Integer> dataMap = new HashMap<>();

        // 循环计算数据
        for (int i = 0; i < nums.length; i++) {
            if(dataMap.get(target - nums[i]) != null){
                resInt[0] = dataMap.get(target - nums[i]);
                resInt[1] = i;
                break;
            } else {
                dataMap.put(nums[i], i);
            }
        }

        return resInt;
    }
}
