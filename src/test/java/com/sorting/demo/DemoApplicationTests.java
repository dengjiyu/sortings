package com.sorting.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.sorting.demo.Test.shellSort;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {

        int[] array = {5, 8, 5, 2, 9, 5, 8, 5, 2, 9};
        int[] arr = {17, 3, 2, 45, 65, 33, 12};
        //选择排序
        //selectionSort(array);
        //冒泡排序
        //BubbleSort(array);
        //插入排序
        //insertSort(array);
        //快速排序
        //sortQuick(arr,0,arr.length-1);//起始元素和末尾元素
        //希尔排序
        shellSort(array);

        for (int i : array)
            System.out.print(i + " ");//1 9 17 21 34
    }

}
