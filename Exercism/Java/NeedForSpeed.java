class NeedForSpeed {
    private int distance = 0;
    private int Battery = 100; 
    private int speed;
    private int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return Battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            distance += speed;
            Battery -= batteryDrain;
        } 
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getBattery() {
        return Battery;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance; 
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if(car.getSpeed() == 0 ) return false;
        int d = (int) Math.ceil((double) distance / car.getSpeed());
        int b_d = d * car.getBatteryDrain();
        int yesOrNo = car.getBattery() - b_d;
        return yesOrNo >= 0;
    }
}

