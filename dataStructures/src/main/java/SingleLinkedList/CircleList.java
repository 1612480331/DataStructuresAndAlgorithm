package SingleLinkedList;

import java.sql.SQLOutput;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class CircleList {
    private Boy first=null;
    private Boy last=null;
    public void add(int num){
        if(num<1){
            System.out.println("num的值不正确");
            return;
        }
        for(int i=1;i<=num;i++){
            Boy boy=new Boy(i);
            if(i==1){
                first=boy;
                boy.setNext(first);
                last=boy;
            }else{
                last.setNext(boy);
                boy.setNext(first);
                last=boy;
            }
        }
    }
    public void show(){
        if(first==null){
            System.out.println("链表为空。。。");
            return;
        }
        Boy temp=first;
        while(true){
            System.out.print(String.format("%d\t",temp.getNum()));
            if(temp.getNext()==first){
                break;
            }
            temp=temp.getNext();
        }
        System.out.println();
    }
    public Queue<Integer> countBoy(int start,int count,int num){
        Queue queue=new ArrayBlockingQueue<Integer>(10);
        if(start<=0||start>num){
            System.out.println("输入值错误。。。");
            return queue;
        }
        for(int i=0;i<start-1;i++){
            first=first.getNext();
            last=last.getNext();
        }
        while(true){
            if(first==last){
                break;
            }
            for(int i=0;i<count-1;i++){
                first=first.getNext();
                last=last.getNext();
            }
            queue.add(first.getNum());
            first=first.getNext();
            last.setNext(first);
        }
        queue.add(first.getNum());
        return queue;

    }
}
