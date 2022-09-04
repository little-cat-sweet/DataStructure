package HongYun.Recursion.MazeRecursion;

public class MazeRecursion {
    public static void main(String[] args) {
        //make the maze's root .
        int [][] map=new int [8][7];
        //show the first maze.
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
        //a separator
        System.out.println();
        //decorate the maze ,make the a circle bind it.
        //decorate the rows.
        for(int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        //decorate the lines.
        for(int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }
        map[3][1]=1;
        map[3][2]=1;
        //show the decorated maze.
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
        setWay(map,1,1);
        System.out.println();
        //Show the final method way of maze.
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
    }
    //i is the start's row.
    //j is the start's line.
    public static boolean setWay(int [][] map,int i,int j){
        //Set the final location.
        if(map[6][5]==2){
            return true;
        }else {
            //The below line says the location hasn't been arrived.
            if(map[i][j]==0){
                //The below line says the location is could take,but it may not.
                map[i][j]=2;
                //Take a down way.
                if(setWay(map,i+1,j)){
                    return true;
                }else if(setWay(map,i,j+1)){//Take a right way.
                    return true;
                }else if(setWay(map,i-1,j)){//Take a up way.
                    return true;
                }else if(setWay(map,i,j-1)){//Take a left way.
                    return true ;
                }else {
                    map[i][j]=3;//The way is not a method way.
                    return false;
                }
            }else {
                //the location is not equals zero.
                return false;
            }
        }
    }
}
