package HeapSort;

import java.util.Arrays;
import java.util.Date;

public class HeapDemo {
    public static void main(String[] args) {
        //升序 大顶堆   降序 小顶堆
        /**
         * 将待排序数组构造成一个大顶堆
         * 此时，整个序列的最大值就是堆顶的根节点
         * 将最大值与最后一个元素进行交换，此时末尾就是最大值
         * 然后将剩余的n-1个元素重新构造成一个堆，重复上面步骤
         */
        int[] arr=new int[80000000];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)Math.random()*arr.length;
        }
        System.out.println(new Date());
        HeapSort(arr);
        System.out.println(new Date());
        //System.out.println(Arrays.toString(arr));
    }
    public static void HeapSort(int arr[]){
        System.out.println("堆排序！！！");

        //第一次调整
        for (int i=arr.length/2-1;i>=0;i--){
            AdjustHeap(arr,i,arr.length);
        }
        //之后调整之前都先交换首末元素
        for(int j=arr.length-1;j>0;j--){
            int temp=arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
            AdjustHeap(arr,0,j);
        }
    }

    /**
     *
     * @param arr
     * @param i 非叶子节点在数组中索引
     * @param length 对多少个元素进行调整
     */
    public static void AdjustHeap(int arr[],int i,int length){
        int temp=arr[i];
        //k表示叶子节点的左子节点
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length &&arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k]>temp){
                arr[i]=arr[k];
                i=k;//继续循环比较
            }else{
                break;
            }
        }
        arr[i]=temp;
    }
}
