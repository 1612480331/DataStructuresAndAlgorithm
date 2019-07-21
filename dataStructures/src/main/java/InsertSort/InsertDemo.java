package InsertSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertDemo {
    public static void main(String[] args) {
        int[] arr=new int[80000];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*arr.length);
        }
        System.out.println("排序前：");
        Date date1=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d1=simpleDateFormat.format(date1);
        System.out.println(d1);
        InsertSort(arr);
        Date date2=new Date();
        String d2=simpleDateFormat.format(date2);
        System.out.println(d2);
        //System.out.println(Arrays.toString(arr));
    }
    public static void InsertSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int insertValue=arr[i];
            int index=i-1;
            while(index>=0&&insertValue<arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=insertValue;
        }
    }
}
