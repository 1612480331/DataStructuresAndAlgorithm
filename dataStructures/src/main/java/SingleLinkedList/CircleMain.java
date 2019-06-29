package SingleLinkedList;

import java.sql.SQLOutput;
import java.util.Queue;

public class CircleMain {
    public static void main(String[] args) {
        CircleList circleList=new CircleList();
        circleList.add(6);
        circleList.show();
        Queue<Integer> queue=circleList.countBoy(2,3,6);
        System.out.println("size:"+queue.size());
        while(queue.size()>0){
            System.out.print(queue.poll()+"\t");
        }
    }
}
