package CircleQueue;

public class CircleQueue {
    private int front;
    private int rear;
    private int maxSize;
    private int[] arr;
    public CircleQueue(int size){
        maxSize=size;
        arr=new int[size];
    }

    public boolean isFull(){
        return (rear+1)%maxSize==front;
    }
    public boolean isEmpty(){
        return front==rear;
    }
    public void addQueue(int item){
        if(isFull()){
            throw new RuntimeException("队列满了");
        }
        arr[rear]=item;
        rear=(rear+1)%maxSize;
    }
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int i=arr[front];
        arr[front]=0;
        front=(front+1)%maxSize;
        return i;
    }
    public void showQueue(){
        for(int i:arr){
            System.out.println(String.format("%d\t",i));
        }
    }
    public int count(){
        return (rear+maxSize-front)%maxSize;
    }
}
