public class CarsAssemble {
    private final int carPerHour = 221; 
    private final double[] successRates = {0.0, 1.00, 1.00, 1.00, 1.00, 0.90, 0.90, 0.90, 0.90, 0.80, 0.77}; 

    public double productionRatePerHour(int speed) {
        if (speed < 1 || speed > 10) return 0; 
        return speed * successRates[speed] * carPerHour; 
    }
    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60); 
    }
}

