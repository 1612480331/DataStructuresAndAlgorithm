package ShellSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ShellDemo {
    public static void main(String[] args) {

        //很快 1秒
        //移位排序  不是交换
        int[] arr = new int[800000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        System.out.println("排序前：");
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d1 = simpleDateFormat.format(date1);
        System.out.println(d1);
        ShellSort(arr);
        Date date2 = new Date();
        String d2 = simpleDateFormat.format(date2);
        System.out.println(d2);
        //System.out.println(Arrays.toString(arr));
    }

    public static void ShellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }
}
