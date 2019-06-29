package SingleLinkedList;

public class SingleMain {
    public static void main(String[] args) {
        Hero hero1=new Hero(1,"林冲","豹子头");
        Hero hero2=new Hero(2,"林冲","豹子头");
        Hero hero3=new Hero(3,"林冲","豹子头");
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.reversePrint();
        /*System.out.println(String.format("链表长度为：%d",singleLinkedList.length()));
        singleLinkedList.list();
        singleLinkedList.update(new Hero(1,"宋江","及时雨"));
        singleLinkedList.list();
        singleLinkedList.update(new Hero(4,"",""));
        singleLinkedList.list();
        singleLinkedList.delete(1);
        singleLinkedList.list();
        singleLinkedList.delete(4);
        System.out.println(String.format("链表长度为：%d",singleLinkedList.length()));
        Hero hero=singleLinkedList.findLastIndex(3);
        singleLinkedList.reverse();
        singleLinkedList.list();
        singleLinkedList.reverse();
        singleLinkedList.list();*/
        //System.out.println("res:"+hero);
        /*System.out.println("倒数n个："+singleLinkedList.findLastIndex(1).toString());
        System.out.println("倒数n个："+singleLinkedList.findLastIndex(2).toString());
        System.out.println("倒数n个："+singleLinkedList.findLastIndex(3).toString());*/
    }
}
