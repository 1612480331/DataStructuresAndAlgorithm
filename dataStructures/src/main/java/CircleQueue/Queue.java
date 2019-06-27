package CircleQueue;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        CircleQueue circleQueue=new CircleQueue(3);
        while(true){
            char key=s.next().charAt(0);
            switch (key){
                case 'a':
                    try {
                        int item=s.nextInt();
                        circleQueue.addQueue(item);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println(circleQueue.count()+"------");
                    circleQueue.showQueue();
                    break;
                case 'g':
                    try{
                        circleQueue.getQueue();
                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println(circleQueue.count()+"------");
                    circleQueue.showQueue();
                    break;
            }
        }
    }
}
