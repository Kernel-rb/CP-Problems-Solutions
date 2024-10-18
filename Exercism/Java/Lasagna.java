public class Lasagna {
    final static int OVENTIME = 40;
    final static int LAYERPREPARETIME = 2;

    // Method to return the expected minutes in the oven
    public static int expectedMinutesInOven() {
        return OVENTIME;
    }

    // Method to calculate the remaining minutes in the oven
    public int remainingMinutesInOven(int actualTime) {
        return OVENTIME - actualTime;
    }

    // Method to calculate the preparation time based on the number of layers
    public int preparationTimeInMinutes(int nb_layer) {
        return LAYERPREPARETIME * nb_layer;
    }

    // Method to calculate the total time (preparation + oven time)
    public int totalTimeInMinutes(int nb_layer, int timePass) {
        return timePass + preparationTimeInMinutes(nb_layer);
    }
}
