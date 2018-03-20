/**
 * Created by Seth May on 3/13/2017.
 */
public class Vehicle {
    private int location;

    public Vehicle(){
        location = 0;
    }

    public Vehicle(int loc){
        if (loc >= -20 && loc <= 20){
            location = loc;
        } else {
            location = 0;
        }
    }

    public void forward(){
        if (location + 1  <= 20){
            location++;
        }
    }

    public void backward() {
        if (location - 1 >= -20){
            location--;
        }
    }

    public int getLocation(){
        return location;
    }

    public String toString(){
        String out = "";
        for(int i = -20; i < location; i++){
            out += ' ';
        }
        return out + '@';
    }
}


public static int sum (int a, int b){
    return a + b;
}
public static int sum (int a, int b, int c){
    return a + b + c;
}
public static double sum (int a, int b){
    return a + b;
}