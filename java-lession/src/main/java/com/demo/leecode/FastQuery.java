package com.demo.leecode;

/**
 *  原文链接：https://blog.csdn.net/nrsc272420199/article/details/82587933
 */
public class FastQuery {

    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        long startTime = System.currentTimeMillis();
        System.out.println("startTime="+startTime);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println("");
        System.out.println("userTime="+(System.currentTimeMillis()-startTime));
    }

    /**
     * 快速排序
     *
     * @param arr       集合list
     * @param low       低位
     * @param high      高位
     */
    private static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            // 找寻基准数据的正确索引
            int index = getIndex(arr, low, high);
            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            //quickSort(arr, 0, index - 1); 之前的版本，这种姿势有很大的性能问题，谢谢大家的建议
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    /**
     * 找寻基准数据的正确位置
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private static int getIndex(int[] arr, int low, int high) {
        // 基准数据
        int tmp = arr[low];
        //循环比较
        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && arr[high] >= tmp) {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            arr[low] = arr[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && arr[low] <= tmp) {
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            arr[high] = arr[low];

        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        arr[low] = tmp;
        return low; // 返回tmp的正确位置
    }

    /**
     * 項目数据
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private static int getIndex2(int[] arr,int low,int high){
        int tmp = arr[low];
        //循环比较
        while(low<high){
            //队尾比
            while (low<high && arr[high]>=tmp){
                high--;
            }
            //高位和低位调换
            arr[low]=arr[high];
            while (low<high && arr[low]<=tmp){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=tmp;
        return low; //返回正確的位置
    }
}
