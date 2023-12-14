package leetcode;

/*
* 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
示例 1:
输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
示例 2:
输入: strs = [""]
输出: [[""]]
示例 3:
输入: strs = ["a"]
输出: [["a"]]
* */

import java.util.*;

/**
 * @BelongsProject: leetCode
 * @BelongsPackage: leetcode
 * @Author: JinLong Xing
 * @CreateTime: 2023-12-14  09:40
 * @Description: TODO
 * @Version: 1.0
 */
public class Code49 {

    public static void main(String[] args){
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(str);
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        // 循环处理数据
        for (String str : strs) {
            // 转换成数组
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(map.get(key) != null){
                map.get(key).add(str);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(key,temp);
            }
        }
        return new ArrayList<List<String>>(map.values());


    }
}
