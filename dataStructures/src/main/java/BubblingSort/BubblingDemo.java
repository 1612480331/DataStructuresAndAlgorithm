package BubblingSort;

public class BubblingDemo {

    public static void main(String[] args) {
        int[] a={1,4,2,5,39,33,-1};
        BubblingSort(a);
        print(a);
    }
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(String.format("%d\t",a[i]));
        }
    }
    public static void BubblingSort(int a[]){
        int i=a.length;
        while(i>1){
            int k=1;
            for(int j=1;j<i;j++){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    k=j;
                }
            }
            i=k;
        }
    }
}
