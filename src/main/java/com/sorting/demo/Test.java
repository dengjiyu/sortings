package com.sorting.demo;

public class Test {
    /**
     * 选择排序
     * 时间复杂度O(n²),空间复杂度0(1)
     * 不稳定
     */
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int k = i;
            // 找出最小值的下标
            for (int j = i + 1; j < array.length; j++) {
                //int x = array[j];
                //int y = array[k];
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            // 将最小值放到未排序记录的第一个位置
            if (k > i) {
                int tmp = array[i];
                array[i] = array[k];
                array[k] = tmp;
            }
        }
    }


    /**
     * 插入排序
     * 时间复杂度O(n²),空间复杂度0(1)
     * 稳定
     */
    public static void insertSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            int temp;
            //find min
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            //swap the min with the ith element
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }


    /**
     * 冒泡排序
     * 时间复杂度O(n²),空间复杂度0(1)
     * 稳定
     */
    public static void BubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            //int a = arr.length - 1;
            for (int j = 0; j < arr.length - i - 1; j++) {
                //int b = arr.length - i - 1;
                if (arr[j] > arr[j + 1]) {//如果想改为降序排序这里改为<即可
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    /**
     * 快速排序
     * 时间复杂度O(nlog2n),空间复杂度0(nlog2n)
     * 不稳定
     */
    public static int[] sortQuick(int[] in, int left, int right) {
        //{17,3,2,45,65,33,12};
        int key = in[left]; //选定数组第一个数字作为key
        int start = left;
        int end = right;
        while (start < end) {
            //从右向左遍历,找到小于key的,放入下标strat中。
            while (start < end && key <= in[end]) {
                end--;
            }
            in[start] = in[end];

            //从左向右遍历,找到大于key的,放入下标end中。
            while (start < end && key > in[start]) {
                start++;
            }
            in[end] = in[start];
        }
        //此时start==end,这就是所谓的轴，把key放入轴中，轴左边的都<key,轴右边的都>key
        in[start] = key;
        //此时大家想象一下，轴在数组中间，说明把数组分成两部分，此时要对这两部分分别进行快排。{12,3,2,17,65,33,45};
        if (start > left) sortQuick(in, left, start - 1);
        if (end < right) sortQuick(in, end + 1, right);
        return in;
    }


    /**
     * 希尔排序（选择类排序的改进）
     * 时间复杂度最差：O(n²),最好：O(n)，空间复杂度0(1)
     * 不稳定
     */
    public static void shellSort(int[] arrays) {
        //增量每次都/2
        for (int step = arrays.length / 2; step > 0; step /= 2) {
            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {
                int j = i;
                int temp = arrays[j];
                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arrays[j - step] > temp) {
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
            }
        }

    }
}
