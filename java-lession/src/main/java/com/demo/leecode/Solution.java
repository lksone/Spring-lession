package com.demo.leecode;

/**
 * @author lks
 * @date 2020-09-20 23:08
 * @email 1056224715@qq.com
 * @Description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    /**
     * 暴力破解 ？？
     *
     * @param sources
     * @param target
     * @return
     */
    public Integer[] sumToTarget(Integer[] sources, Integer target) {

        Integer[] result = new Integer[2];
        Integer tem = null;

        Integer[] sourcesTemp = sources;
        for (int i = 0; i <= sources.length; i++) {
            tem = target - sources[i];
            for (int j = 1; j < sources.length; j++) {
                if (tem.equals(sources[j])) {
                    result[0] = sources[j];
                    result[1] = sources[i];
                    return result;
                }
            }
        }

        return null;
    }


    private Integer[] sumToTarget2(Integer[] sources, Integer target) {
        return null;
    }

    public static void main(String[] args) {

    }
}
