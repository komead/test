package automobiles;

import automobiles.Transport;

import java.io.FileWriter;
import java.io.IOException;

public class Truck extends Transport implements iLights
{
    private float capacity;
    public Engine engine = new Engine(false, 5174855);

    private boolean isOn;

    public Truck() {}

    public void setInformation(int maxSpeed, float weight, String color, float capacity)
    {
        super.setInformation(maxSpeed, weight, color);
        this.capacity = capacity;
    }

    @Override
    public void getInformation()
    {
        super.getInformation();
        System.out.println(capacity);
    }

    public void getInFile() throws IOException {
        FileWriter fw = new FileWriter("infoAboutTruck.txt");

        fw.write("Информация о грузовике:\n");
        fw.write("Максимальная скорость: " + maxSpeed + "\n");
        fw.write("Вес грузовика: " + weight + "\n");
        fw.write("Цвет грузовика: " + color + "\n");
        fw.write("Вместительность груза: " + capacity + "\n");

        fw.close();
    }

    @Override
    public void setLights(boolean set) {

        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мигание фарами");
    }
}
