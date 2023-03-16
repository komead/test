package automobiles;

public abstract class Transport
{
    protected int maxSpeed;
    protected float weight;
    protected String color;

    public Transport() {}

    public void setInformation(int maxSpeed, float weight, String color)
    {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.color = color;
    }

    public void getInformation()
    {
        System.out.println(maxSpeed);
        System.out.println(weight);
        System.out.println(color);
    }

    class Engine
    {
        private boolean isReady;
        private int km;

        public Engine(boolean isReady, int km)
        {
            this.isReady = isReady;
            this.km = km;
        }

        public void info()
        {
            if(isReady)
                System.out.println("Двигатель исправен");
            else
                System.out.println("Двигатель не работает. Он проехал уже " + km + "км");
        }
    }
}
