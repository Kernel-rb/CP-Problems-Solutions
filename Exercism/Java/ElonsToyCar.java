public class ElonsToyCar {
    
    private int METERS = 0;
    private int PERCENTAGE = 100;
    public static ElonsToyCar buy() {
        return  new ElonsToyCar();
    }
    public String distanceDisplay() {
        return String.format("Driven %d meters" ,METERS);
    }
    public String batteryDisplay() {
        if(METERS >= 2000 ||PERCENTAGE <= 0 ) return String.format("Battery empty");
        return String.format("Battery at %d%%" ,PERCENTAGE);
    }
    public void drive() {
        if(METERS < 2000) METERS  += 20;
        PERCENTAGE--;
    }
}

