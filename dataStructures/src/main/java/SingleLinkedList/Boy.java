package SingleLinkedList;

import lombok.Data;

@Data
public class Boy {
   private int num;
   private Boy next;
   public Boy(){}
   public Boy(int num){
      this.num=num;
   }
   public String toString(){
      return String.format("%d\t",this.num);
   }
}
