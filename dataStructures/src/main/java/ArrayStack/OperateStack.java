package ArrayStack;

public class OperateStack {
    public int maxSize;
    public int[] stack;
    public int top=-1;
    public OperateStack(int size){
        this.maxSize=size;
        stack=new int[size];
    }
    public int seek(){
        return stack[top];
    }
    public boolean isOperate(char item){
        return item=='+'||item=='-'||item=='*'||item=='/';
    }
    public int calculate(int num1,int num2,int operate){
        int response=0;
        switch (operate){
            case '+':response=num1+num2;break;
            case '-':response=num2-num1;break;
            case '*':response=num1*num2;break;
            case '/':response=num2/num1;break;
            default:break;
        }
        return response;
    }
    public int priority(int item){
        if(item=='*'||item=='/'){
            return 1;
        }else if(item=='+'||item=='-'){
            return 0;
        }else{
            return -1;
        }
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
