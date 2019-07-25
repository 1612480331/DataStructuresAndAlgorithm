package QuickSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickDemo {
    public static void main(String[] args) {
        //比希尔更快
        int[] arr = new int[8000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        System.out.println("排序前：");
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d1 = simpleDateFormat.format(date1);
        System.out.println(d1);
        QuickSort(arr, 0, arr.length - 1);
        Date date2 = new Date();
        String d2 = simpleDateFormat.format(date2);
        System.out.println(d2);
        //System.out.println(Arrays.toString(arr));
    }
    private static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 找寻基准数据的正确索引
            int index = getIndex(arr, low, high);

            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            QuickSort(arr, low, index - 1);
            QuickSort(arr, index + 1, high);
        }
    }
    private static int getIndex(int[] arr, int low, int high) {
        // 基准数据
        int tmp = arr[low];
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
}
