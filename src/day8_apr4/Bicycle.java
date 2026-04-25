package day8_apr4;

public class Bicycle {
    private final String color;
    private double location;
    private double speed;

    public Bicycle(String hue) {
        this.color = hue;
        this.location = 0;
        this.speed = 0;
    }


    public void setSpeed(double newSpeed){
       if (newSpeed >= 0){
           speed = newSpeed;
       } else {
           speed = 0;
       }

        // what is speed here
    }


    public void increaseSpeed (double deltaSpeed) {
        speed += deltaSpeed;
        if (speed < 0) speed = 0;

    }
    public double travel(double hours) {
        double distanceTraveled = speed * hours;
        location += distanceTraveled;
        return distanceTraveled;
    }

    public String getColor() {
        return color;
    }

    public double getLocation() {
        return location;
    }

    public double getSpeed() {
        return speed;
    }
}
