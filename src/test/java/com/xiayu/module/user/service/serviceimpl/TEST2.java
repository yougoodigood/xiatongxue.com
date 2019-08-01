package com.xiayu.module.user.service.serviceimpl;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/7/22.
 */
public class TEST2 {

    public static void main(String args[]) {
       /* ConcurrentMap nap= new ConcurrentHashMap();
        HashMap map1 = new HashMap();
        ArrayList list = new ArrayList();

        LinkedList list1 =new LinkedList();
        Map map2 = new LinkedHashMap<>();




        String str = "America";
        String str1 = "push";
        String str2="America"+"push";
        String str5="Americapush";
        String str3 = str+str1;
        String str4 = str3.intern();
        System.out.println(str2==str3);
        System.out.println(str2==str4);
        System.out.println(str3==str4);
        System.out.println(str2==str5);

        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");
        System.out.println(map); // {5=val, 4=val, 3=val, 2=val, 1=val}*/
        byte[] allocation1, allocation2;
        allocation1 = new byte[30900 * 1024];
        //allocation2 = new byte[900*1024];


        int[] ki = {9, 36, 51, 22, 6, 73, 89};
        int[] ki1 = {6, 9, 51, 22, 36};
        System.out.println(Arrays.toString(ki));
//        selectSort(ki,0,ki.length);
//        selectMor(ki,0,ki.length-1);
//        quickSort(ki,0,ki.length);
//        insertSort(ki,0,ki.length);
//        shellSort(ki,0,ki.length);
//        bucketSort(ki);
        radixSort(ki);
//        mergeSort(ki, new int[ki.length], 0, ki.length - 1);
//        heapSort(ki, 0, ki.length );

//        System.out.println(Arrays.toString(mergeSort1(ki,0,ki.length-1)));
        System.out.println(Arrays.toString(ki) + ki.length);


    }


    //冒泡排序
    public static void selectMor(int[] arr, int bgn, int end) {
        for (int i = bgn; i < end; i++) {
            for (int j = 0; j < end - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    mySwap(arr, j, j + 1);
                }
            }
        }
    }


    //选择排序
    public static void selectSort(int[] arr, int bgn, int end) {
        for (int i = bgn; i < end; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < end; ++j) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if (minIndex != i)
                mySwap(arr, i, minIndex);
        }
    }

    static void mySwap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /*快排*/
    static void quickSort(int[] arr, int bgn, int end)  //arr must be the reference of real param
    {
        //数组arr空or仅有一个元素则退出
        if (bgn >= end - 1)
            return;

        int lindex = bgn;
        int rindex = end - 1;
        int std = arr[lindex];
        while (lindex < rindex) {
            while (lindex < rindex) {
                if (arr[rindex] < std) {
                    arr[lindex++] = arr[rindex];
                    break;
                }
                --rindex;
            }

            while (lindex < rindex) {
                if (arr[lindex] >= std) {
                    arr[rindex--] = arr[lindex];
                    break;
                }
                ++lindex;
            }
        }

        arr[lindex] = std;
        quickSort(arr, bgn, lindex);
        quickSort(arr, rindex + 1, end);
    }


    /*插入排序*/
    static void insertSort(int[] arr, int bgn, int end) {
        for (int i = bgn + 1; i < end; ++i) {
            /*
             * 分为1,2两部分处理，可以囊括j = beg - 1时的情况
             * 即需要将arr[i]插入到首元素前的位置，若使用一个for
             * 包括这两部分，则会在发生这种情况时退出
             */
            /*1*/
            int j = i - 1;
            for (; j >= bgn; --j)
                if (arr[j] <= arr[i])
                    break;
            /*2*/
            if (j != i - 1) {
                int temp = arr[i];
                for (int k = i; k > j + 1; --k) {
                    arr[k] = arr[k - 1];
                }
                arr[j + 1] = temp;
            }
        }
    }

    /*希尔排序*/
    static void shellSort(int[] arr, int bgn, int end) {
        for (int step = (end - bgn) / 2; step > 0; step /= 2) {
            for (int i = bgn; i < step; ++i) {
                /*
                 * 以下，insertSort的变异
                 */
                for (int j = i + step; j < end; j += step) {
                    int k = j - step;
                    for (; k >= i; k -= step)
                        if (arr[k] <= arr[j])
                            break;
                    if (k != j - step) {
                        int tmp = arr[j];
                        for (int m = j; m > k + step; m -= step)
                            arr[m] = arr[m - step];
                        arr[k + step] = tmp;
                    }
                }
            }
        }
    }


    /*桶排序*/
    static void bucketSort(int[] arr) {
        int max = getMaxValue(arr);
        int[] pBuf = new int[max + 1];

        for (int i : arr)
            ++pBuf[i];

        for (int i = 0, j = 0; i <= max; ++i) {
            while (pBuf[i]-- > 0)
                arr[j++] = i;
        }
    }


    /*基数排序*/
//1. 计数排序，按整形数值单位进行排序
    static void countSort(int[] arr, int exp) {
        int[] bucket = new int[10];
        int arrSize = arr.length;
        int[] pTemp = new int[arrSize];

        //统计单位exp各数值计数值
        for (int val : arr)
            ++bucket[(val / exp) % 10];

        //计数分层
        for (int i = 1; i < 10; ++i)
            bucket[i] += bucket[i - 1];

        //按exp位大小用数组arr元素填充pTemp
        for (int i = arrSize - 1; i >= 0; --i)
            pTemp[--bucket[(arr[i] / exp) % 10]] = arr[i];
        /*bugs*/

/*        //bug1: bucket各层次的计数值没遍历一次相应自减1
        for ( int val : arr)
        pTemp[bucket[(val / exp) % 10] - 1] = val;
        //bug2: arr数组元素每次排序时，下标应从大到小遍历，否则无法实现排序
        for ( int val : arr)
        pTemp[ --bucket[(val / exp) % 10] ] = val;*/


        //pTemp -> arr
        for (int i = 0; i < arrSize; ++i)
            arr[i] = pTemp[i];
    }

    //2. 合并各单位计数排序结果
    static void radixSort(int[] arr) {
        int max = getMaxValue(arr);
        for (int exp = 1; max / exp != 0; exp *= 10)
            countSort(arr, exp);
    }


    /**
     * 归并排序算法
     *
     * @param list     待排序的列表
     * @param tempList 临时列表
     * @param head     列表开始位置
     * @param rear     列表结束位置
     */
    public static void mergeSort(int[] list, int[] tempList, int head, int rear) {
        if (head < rear) {
            // 取分割位置
            int middle = (head + rear) / 2;
            // 递归划分列表的左序列
            mergeSort(list, tempList, head, middle);
            // 递归划分列表的右序列
            mergeSort(list, tempList, middle + 1, rear);
            // 列表的合并操作
            merge(list, tempList, head, middle + 1, rear);
        }
    }

    /**
     * 合并操作(列表的两两合并)
     *
     * @param list
     * @param tempList
     * @param head
     * @param middle
     * @param rear
     */
    public static void merge(int[] list, int[] tempList, int head, int middle, int rear) {
        // 左指针尾
        int headEnd = middle - 1;
        // 右指针头
        int rearStart = middle;
        // 临时列表的下标
        int tempIndex = head;
        // 列表合并后的长度
        int tempLength = rear - head + 1;

        // 先循环两个区间段都没有结束的情况
        while ((headEnd >= head) && (rearStart <= rear)) {
            // 如果发现右序列大，则将此数放入临时列表
            if (list[head] < list[rearStart]) {
                tempList[tempIndex++] = list[head++];
            } else {
                tempList[tempIndex++] = list[rearStart++];
            }
        }

        // 判断左序列是否结束
        while (head <= headEnd) {
            tempList[tempIndex++] = list[head++];
        }

        // 判断右序列是否结束
        while (rearStart <= rear) {
            tempList[tempIndex++] = list[rearStart++];
        }

        // 交换数据
        for (int i = 0; i < tempLength; i++) {
            list[rear] = tempList[rear];
            rear--;
        }
    }


    public static int[] mergeSort1(int[] nums, int l, int h) {
        if (l == h)
            return new int[]{nums[l]};

        int mid = l + (h - l) / 2;
        int[] leftArr = mergeSort1(nums, l, mid); //左有序数组
        int[] rightArr = mergeSort1(nums, mid + 1, h); //右有序数组
        int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length)
            newNum[m++] = leftArr[i++];
        while (j < rightArr.length)
            newNum[m++] = rightArr[j++];
        return newNum;
    }

    static void downToMaxHeap(int[] arr, int bgn, int end) {
        int child;
        int parent = bgn;

        /*假根节点向下移动至合适的位置 --整个堆排序的核心代码块*/
        while ((child = parent * 2 + 1) < end) {
            if ((child < end - 1) && (arr[child] < arr[child + 1]))
                ++child;    //右孩子节点
            if (arr[child] > arr[parent])
                mySwap(arr, child, parent);
            else
                break;
            parent = child;
        }
    }

    //将数组构造为最大堆
    static void buildMaxHeap(int[] arr, int bgn, int end) {
        if (bgn >= end - 1)
            return;

        int parent = end / 2 - 1;
        while (parent >= 0) {
            downToMaxHeap(arr, parent, end);
            --parent;
        }
    }

    //堆排序
    static void heapSort(int[] arr, int bgn, int end) {
        //构造最大堆
        buildMaxHeap(arr, bgn, end);

        while (end > 1) {
            mySwap(arr, 0, --end);
            downToMaxHeap(arr, 0, end);
        }
    }

    //获取整形数组的最大值
//NOTE: 默认arr非空
    static int getMaxValue(int[] arr) {
        int max = 0;
        for (int val : arr) {
            if (val > max)
                max = val;
        }
        return max;
    }


}
