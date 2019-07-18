package ArrayStack;

public class NumberStackDemo {
    public static void main(String[] args) {
        String str="1+200*3-1";
        NumberStack numberStack=new NumberStack(10);
        OperateStack operateStack=new OperateStack(10);
       /* System.out.println(operateStack.priority('*'));
        System.out.println(operateStack.priority('-'));
        operateStack.seek();
        System.out.println(operateStack.isOperate('+'));*/


        int num1;
        int num2;
        int res;
        int ope;
        char c=' ';
        String temp="";
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            if(operateStack.isOperate(c)){
                if(operateStack.isEmpty()){
                    operateStack.push(c);
                }else{
                    if(operateStack.priority(c)<operateStack.priority(operateStack.seek())){
                        num1=numberStack.pop();
                        num2=numberStack.pop();
                        ope=operateStack.pop();
                        res=operateStack.calculate(num1,num2,ope);
                        numberStack.push(res);
                        operateStack.push(c);
                    }else{
                        operateStack.push(c);
                    }
                }
            }else{
                temp+=c;
                if(i<str.length()-1) {
                    if (operateStack.isOperate(str.charAt(i + 1))) {
                        numberStack.push(Integer.parseInt(temp));
                        temp = "";
                    }
                }else{
                    numberStack.push(Integer.parseInt(temp));
                }
            }
        }
        while(!operateStack.isEmpty()){
            num1=numberStack.pop();
            num2=numberStack.pop();
            ope=operateStack.pop();
            res=operateStack.calculate(num1,num2,ope);
            numberStack.push(res);
        }
        int res2=numberStack.pop();
        System.out.println(String.format("表达式%s=%d",str,res2));


    }
}
