package ArrayStack;

public class NumberStack {
    public int maxSize;
    public int[] stack;
    public int top=-1;
    public NumberStack(int size){
        this.maxSize=size;
        stack=new int[size];
    }
    public boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }
    public boolean isFull(){
        if(top==maxSize-1) return true;
        return false;
    }
    public void push(int item){
        if(isFull()){
            System.out.println("栈满，不能入栈。。");
            return;
        }
        top++;
        stack[top]=item;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("栈空。。");
            return 0;
        }
        int value=stack[top];
        top--;
        return value;
    }
    public void list(){
        if(isEmpty()){
            System.out.println();
            System.out.println("栈空。。");
            return;
        }
        int temp=top;
        while(temp!=-1){
            System.out.print(String.format("%d\t",stack[temp]));
            temp--;
        }
    }
}
