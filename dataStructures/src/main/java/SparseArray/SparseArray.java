package SparseArray;

import sun.awt.geom.AreaOp;

public class SparseArray {
    public static void main(String[] args) {

        int[][] array=new int[10][10];
        /*
        * 1表示黑子，2表示蓝子，0表示没有子
        * */
        array[1][2]=1;
        array[2][3]=2;
        System.out.println("原数组为：");
        printArray(array);
       // System.out.println(array.length);
        //二维数组转稀疏数组
        //1.算出二维数组中值的个数
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]!=0) sum++;
            }
        }
        System.out.println("sum="+sum);
        //2.创建对应的稀疏数组
        int[][] sparseArray=new int[sum+1][3];
        sparseArray[0][0]=array.length;
        sparseArray[0][1]=array[0].length;
        sparseArray[0][2]=sum;
        //3.遍历原数组，将非0值写入稀疏数组
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]!=0){
                    count++;
                    sparseArray[count][0]=i;
                    sparseArray[count][1]=j;
                    sparseArray[count][2]=array[i][j];
                }
            }
        }
        System.out.println("对应的稀疏数组为：");
        printArray(sparseArray);
        /*for(int[] row:sparseArray){
                System.out.print(String.format("%d\t%d\t%d\n",row[0],row[1],row[2]));
        }*/
        //将稀疏数组恢复到原始的二维数组
        //1.先读取稀疏数组的第一行，获取行列值,创建二维数组
        int row=sparseArray[0][0];
        int column=sparseArray[0][1];
        int[][] newArray=new int[row][column];
        //读取后几行，复制给二维数组
        for(int i=1;i<sparseArray.length;i++){
            newArray[sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
        }
        System.out.println("还原后的数组为：");
        printArray(newArray);
    }
    public static void printArray(int[][] array) {
        for (int[] array1 : array) {
            for (int array2 : array1) {
                System.out.print(String.format("%d\t", array2));
            }
            System.out.println();
        }
    }
}
