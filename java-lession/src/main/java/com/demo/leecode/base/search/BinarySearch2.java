package com.demo.leecode.base.search;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/20 21:06
 */
public class BinarySearch2 {


    /**
     * 二分法最优解法，可以通过抽象的方法去找到数据
     *
     *  例如找 >3的数据
     *        >=3的数据
     *        <3的数据
     *        <=3的数据
     *
     * @param arr       排好序的数组
     * @param target    需要查询的目标
     */
    public static int search(int[] arr,int target){
        if(arr == null || arr.length ==0){
            return -1;
        }
        int l = -1;
        int r = arr.length;
        //这是一个判断数据信息
        while (l+1!=r){
            int mid = (l+r) / 2;
            //当中间数据大于5的時候是數據的值
            if(isBlue(arr,mid,target)){
                l = mid;
            }else{
                r = mid;
            }
        }
        return r;
    }

    /**
     * 可以控制返回的數據
     *
     * <=target   返回l       返回true
     * < target   返回l       返回true
     * >=target   返回r       返回false
     * > target   返回r       返回false
     *
     * @param arr
     * @param mid
     * @param target
     * @return
     */
    public static boolean isBlue(int[] arr,int mid,int target){
        if(arr[mid] > target){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,3,4,5};
        int a = search(arr,3);
        System.out.println(a);
    }
}
