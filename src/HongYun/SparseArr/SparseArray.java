package HongYun.SparseArr;

public class SparseArray {
    public static void main(String[] args) {
        //创建初始数组
        //1代表黑色，2代表蓝色
        int chessarr1[][]=new int[11][11];
        chessarr1[1][3]=1;
        chessarr1[2][4]=2;
        chessarr1[3][5]=2;

        //将初始数组表现出来。
        System.out.println("原始的二元数组：");
        for(int[] row:chessarr1){
            for(int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println("\n");
        }

        //遍历二维数组
        //得到一共有多少元素
        int sum=0;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessarr1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("一共有："+sum+"个元素");

        System.out.println("初始的稀释数组");

        int sparsearr[][]=new int[sum+1][3];
        //初始的稀释数组
        for(int[] row:sparsearr){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println("\n");
        }

        sparsearr[0][0]=11;
        sparsearr[0][1]=11;
        sparsearr[0][2]=sum;

        //将chessarr1的数组中的值赋值到sparsearr中。
        int count=0;//计数,数组中第几个数值

        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessarr1[i][j]!=0){
                    count++;
                    sparsearr[count][0]=i;
                    sparsearr[count][1]=j;
                    sparsearr[count][2]=chessarr1[i][j];
                }
            }
        }
        for(int[] row:sparsearr){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将稀疏数组转化为二维数组。
        //先读取第一行来得到最初的二维数组。

        int[][] chessarr2=new int[sparsearr[0][0]][sparsearr[0][1]];
        for(int i=1;i<sparsearr.length;i++){
            for(int j=0;j<sparsearr.length;j++){
                chessarr2[sparsearr[i][0]][sparsearr[i][1]]=sparsearr[i][2];
            }
        }
        for(int [] row:chessarr2){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
