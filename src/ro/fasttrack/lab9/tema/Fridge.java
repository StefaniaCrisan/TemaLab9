package ro.fasttrack.lab9.tema;

public class Fridge extends Electronics {
    private int temperature;

    public Fridge(int price, String name, String description, int quantity, String type, int length, int width, int height, int weight, int temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
