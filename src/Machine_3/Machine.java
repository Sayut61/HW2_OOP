package Machine_3;

public class Machine {
    private int year;
    private double speed;
    private int weight;
    private String colour;

    public Machine(){

    }
    public Machine(int year){
        this.year = year;
    }
    public Machine(int year, double speed){
        this(year);
        this.speed = speed;
    }
    public  Machine(int year, double speed, int weight){
        this(year, speed);
        this.weight = weight;
    }
    public Machine(int year, double speed, int weight, String colour){
        this(year, speed, weight);
        this.colour = colour;
    }
}
