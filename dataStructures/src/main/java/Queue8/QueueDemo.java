package Queue8;

public class QueueDemo {
    int max = 8;
    int[] arrays = new int[max];

    int count=0;
    public static void main(String[] args) {
        QueueDemo queue=new QueueDemo();
        queue.check(0);
        System.out.println(queue.count);
    }

    public void check(int n){
        if(n==max){
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            arrays[n]=i;
            if(judge(n)){
                check(n+1);
            }
        }
    }

    /*
     * 判断第n个皇后是否与前面的皇后冲突
     * */
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if(arrays[i]==arrays[n]||Math.abs(n-i)==Math.abs(arrays[n]-arrays[i])){
                return false;
            }
        }
        return true;
    }

    private void print() {
        count++;
        for (int i = 0; i < max; i++) {
            System.out.print(String.format("%d ", arrays[i]));
        }
        System.out.println();
    }
}
