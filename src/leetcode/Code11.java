package leetcode;

/*
* 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。

找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

返回容器可以储存的最大水量。

说明：你不能倾斜容器。

示例 1：
输入：[1,8,6,2,5,4,8,3,7]
输出：49
解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
示例 2：
输入：height = [1,1]
输出：1

*
*
* */
/**
 * @BelongsProject: leetCode
 * @BelongsPackage: leetcode
 * @Author: JinLong Xing
 * @CreateTime: 2023-12-14  13:37
 * @Description: TODO
 * @Version: 1.0
 */
public class Code11 {

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};


        System.out.println(maxArea(height));;
    }

    public static int maxArea(int[] height){

        // 定义两个指针
        int left = 0;
        int right = height.length - 1;
        // 定义一个属性用来存放最大容量
        int asTotal = 0;

        // 循环计算容量
        while (left < right){
            // 计算容量
            int tempTotal = Math.min(height[left],height[right]) * (right - left);
            // 获取最大值
            asTotal = Math.max(asTotal,tempTotal);
            // 判断那个最小
            if(height[left] <= height[right]){
                // 左边加一
                left++;
            } else {
                // 右边减一
                right--;
            }
        }

        return asTotal;





//        int l = 0, r = height.length - 1;
//        int ans = 0;
//        while (l < r) {
//            int area = Math.min(height[l], height[r]) * (r - l);
//            ans = Math.max(ans, area);
//            if (height[l] <= height[r]) {
//                ++l;
//            }
//            else {
//                --r;
//            }
//        }
//        return ans;

    }
}
