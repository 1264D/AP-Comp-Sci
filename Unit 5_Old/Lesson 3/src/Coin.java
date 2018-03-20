/**
 * Created by s8189324 on 3/13/2017.
 */
public class Coin {
    private int side;

    public Coin (){
        flip();
    }

    public String toString (){
        if (side == 1){
            return "heads";
        }
        return "tails";
    }

    public int getValue(){
        return side;
    }

    public void setValue(int in){
        if (in == 0 || in == 1) {
            side = in;
        }

    }

    public void flip (){
        side = (int)(Math.random()*2);

    }
}
