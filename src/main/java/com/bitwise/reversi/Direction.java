package main.java.com.bitwise.reversi;

/**
 * Created by saurabhr on 7/25/2016.
 */
public class Direction {

    String move ="left";
    String[][] dotes = new String[10][];


    public Direction(String[][] linesToDotes){
        this.dotes = linesToDotes;
    }

    public boolean isFriendInDirection(int x,int y){

        if(this.move.equals("right")){
            int k=y;
            int h=x;
            while(k<8){
                k++;
                return (dotes[x][k].equals("."))
                        ||(dotes[x][k].equals("B"));


            }
        }

        if(this.move.equals("left")){
            int k=y;
            int h=x;
            while(k>0){
                k--;
                return(dotes[x][k].equals("."))
                        ||(dotes[x][k].equals("B"));


            }
        }

        else if(this.move.equals("up")){
            int k=y;
            int h=x;
            while(h>0){
                h--;
                if(dotes[h][y].equals("."))
                    return false;
                else if(dotes[h][y].equals("B"))
                    return true;

            }
        }

        else if(this.move.equals("down")){
            int k=y;
            int h=x;
            while(h<8){
                h++;
                if(dotes[h][y].equals("."))
                    return false;
                else if(dotes[h][y].equals("B"))
                    return true;

            }
        }

        else if(this.move.equals("antislash_up")){
            int k=y;
            int h=x;
            while(h>0 || k>0){
                k--;
                h--;
                if(dotes[h][k].equals("."))
                    return false;
                else if(dotes[h][k].equals("B"))
                    return true;

            }
        }

        else if(this.move.equals("antislash_down")){
            int k=y;
            int h=x;
            while(h<8 || k<8){
                k++;
                h++;
                if(dotes[h][k].equals("."))
                    return false;
                else if(dotes[h][k].equals("B"))
                    return true;

            }
        }

        else if(this.move.equals("slash_down")){
            int k=y;
            int h=x;
            while(h<8 || k>0){
                k--;
                h++;
                if(dotes[h][k].equals("."))
                    return false;
                else if(dotes[h][k].equals("B"))
                    return true;

            }
        }

        else if(this.move.equals("slash_up")){
            int k=y;
            int h=x;
            while(h>0 || k<8){
                k++;
                h--;
                if(dotes[h][k].equals("."))
                    return false;
                else if(dotes[h][k].equals("B"))
                    return true;

            }
        }

        return false;
    }

    public void getDirection(int i,int j,int x, int y){
        if(i==x && y==j-1)
            this.move ="left";
        else if(i==x && y==j+1)
            this.move ="right";
        else if(x==i-1 && y==j)
            this.move ="up";
        else if(x==i+1 && y==j)
            this.move ="down";
        else if(x==i-1 && y==j-1)
            this.move ="antislash_up";
        else if(x==i+1 && y==j+1)
            this.move ="antislash_down";
        else if(x==i-1 && y==j+1)
            this.move ="slash_up";
        else if(x==i+1 && y==j-1)
            this.move ="slash_down";

    }
}