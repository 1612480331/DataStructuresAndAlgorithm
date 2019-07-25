package BinarySearch;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;

public class BinaryDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 4, 5};
        List<Integer> list = BinarySort(arr, 0, arr.length-1, 3);
        System.out.println(list.toString());

    }

    public static List<Integer> BinarySort(int[] arr, int start, int end, int value) {
        int mid = (start + end) / 2;
        int midValue = arr[mid];
        if (start > end) {
            return new ArrayList<Integer>();
        }
        if (value > midValue) {
            return BinarySort(arr, mid + 1, end, value);
        } else if (value < midValue) {
            return BinarySort(arr, start, mid - 1, value);
        } else {
            List<Integer> list = new ArrayList<Integer>();
            int temp = mid - 1;
            while (true) {
                if (temp < 0 || arr[temp] != value) {
                    break;
                }
                list.add(temp);
                temp--;
            }

            list.add(mid);
            temp = mid + 1;
            while (temp <= arr.length-1 && arr[temp] == value) {
                list.add(temp);
                temp++;
            }
            return list;
        }
    }
}
