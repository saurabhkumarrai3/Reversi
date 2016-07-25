package main.java.com.bitwise.reversi;

/**
 * Created by saurabhr on 7/22/2016.
 */
public class Reversi {
    String[] inputLines;
    String[][] dots = new String[10][];
    Integer[][] atXY =new Integer[8][2];
    String direction="";
    int count =0;
    Direction inDirection;


    public void inputToMatrix(String input){
        String[] inputLines= input.split("\n");
        for(int i=0;i<9;i++){
            dots[i]=inputLines[i].split(" ");
        }
        inDirection= new Direction(dots);
    }
    public  String printLegalMoves(String input) {
        this.inputToMatrix(input);
        for(int i=1;i<7;i++){
            for(int j=1;j<7;j++){
                if(dots[i][j].equals(".")){
                    this.scan(i, j);
                }
            }
        }
        return newOutput();
    }
    public void scan(int i, int j){
        if(isEnemy("B",i,j)){
            this.addMoves(i, j);
            this.count =0;
        }
    }
    public void addMoves(int i, int j){
        for(int m = 0; m<this.count; m++){
            inDirection.getDirection(i,j,this.atXY[m][0],this.atXY[m][1]);
            if(inDirection.isFriendInDirection(this.atXY[m][0],this.atXY[m][1])){
                this.dots[i][j]="0";
            }
        }
    }
    public String newOutput(){
        String output="";
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                output=output+ dots[i][j]+" ";
            }
            output=output+"\n";
        }
        output=output+"B";
        return output;
    }

    public boolean isEnemy(String Word, int line, int column){
        count(line,column);
        if(this.count >0)
            return true;
        return false;
    }

    public void count(int line, int column){
        for(int i=-1;i<2;i++){
            for(int j=-1;j<2;j++){
                if(dots[line+i][column+j].equals("W")){
                    this.atXY[this.count][0]=line+i;
                    this.atXY[this.count][1]=column+j;
                    this.count++;
                }
            }
        }
    }

}
