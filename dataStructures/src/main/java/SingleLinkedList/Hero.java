package SingleLinkedList;

public class Hero {
    public int no;
    public String name;
    public String nickName;
    public Hero next;
    public Hero(){}
    public  Hero(int no,String name,String nickName){
        this.no=no;
        this.name=name;
        this.nickName=nickName;
    }
    @Override
    public String toString(){
        return String.format("no:%d\tname:%s\tnickName:%s",this.no,this.name,this.nickName);
    }
}
