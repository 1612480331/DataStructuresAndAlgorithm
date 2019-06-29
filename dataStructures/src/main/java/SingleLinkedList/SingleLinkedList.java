package SingleLinkedList;

import java.util.Stack;

public class SingleLinkedList {
    //定义一个头节点，头节点不要移动
    private Hero head=new Hero();
    public void reversePrint(){
        if(head.next==null){
            System.out.println("空链表~~");
            return;
        }
        Stack<Hero> stack=new Stack<Hero>();
        Hero temp=head.next;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }

    public void reverse(){
        if(head.next==null || head.next.next==null){
            return;
        }
        Hero current=head.next;
        Hero newHead=new Hero();
        Hero next=null;
        while(current!=null){
            next=current.next;
            current.next=newHead.next;
            newHead.next=current;
            current=next;
        }
        head.next=newHead.next;
    }

    public int length(){
        Hero temp=head.next;
        int length=0;
        if(temp==null){
            return 0;
        }
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
    public Hero findLastIndex(int index){
        Hero temp=head.next;
        if(temp==null){
            return null;
        }
        int total=this.length();
        if(index<=0||total-index<0){
            return null;
        }else{
            for(int i=0;i<total-index;i++){
                temp=temp.next;
            }
        }
        return temp;
    }

    public void addByOrder(Hero heroNode){
        //定义一个指针用于循环列表
        Hero temp=head;
        boolean flag=false;//默认不存在
        while(true){
            if(temp.next==null){
                break;
            }
            if(temp.next.no>heroNode.no){ //位置找到
                break;
            } else if(temp.next.no==heroNode.no){//已存在
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag==true){
            System.out.println("已存在");
        }else{
            heroNode.next=temp.next;
            temp.next=heroNode;
        }
    }
    public void update(Hero newHero){
        Hero temp=head.next;
        boolean flag=true;
        if(temp==null){
            System.out.println("空链表");
            return;
        }
        while(true){
            if(temp.no==newHero.no){
                flag=true;
                break;
            }
            if(temp.next==null){
                flag=false;
                break;
            }
            temp=temp.next;
        }
        if(flag==true){
            temp.name=newHero.name;
            temp.nickName=newHero.nickName;
        }else{
            System.out.println(String.format("不存在no为%d的物体",newHero.no));
        }
    }
    public void delete(int no){
        Hero temp=head;
        if(temp.next==null){
            System.out.println("空列表");
            return;
        }
        boolean flag=true;
        while(true){
            if(temp.next==null){
                flag=false;
                break;
            }
            if(temp.next.no==no){
                break;
            }
            temp=temp.next;
        }
        if(flag){
            temp.next=temp.next.next;
        }else{
            System.out.println("找不到要删除的链表");
        }
    }
    public void list(){
        Hero temp=head.next;
        if(temp==null){
            System.out.println("空链表");
            return;
        }
        while(true){
            if(temp==null){
                break;
            }
            System.out.println(temp.toString());
            temp=temp.next;
        }
    }
}
