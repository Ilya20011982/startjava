public class Jaeger {
    private String modelName;
    private String mark;
    private String status;
    private String origin;
    private double height;
    private double weight;
    private double speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String status, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.status = status;
        this.origin = origin;
    }

    public void setJaegerSpecifications(double height, double weight, double speed, int strength, int armor) {
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;

    }

    public void getJaeger() {
        System.out.println("Model name - " + modelName);
        System.out.println("Mark - " + mark);
        System.out.println("Status - " + status);
        System.out.println("Origin - " + origin);
    }

    public void getJaegerSpecifications() {
        System.out.println("Height - " + height);
        System.out.println("Weight - " + weight);
        System.out.println("Speed - " + status);
        System.out.println("Strength - " + strength);
        System.out.println("Armor - " + armor);
    }

    public void drift() {
        System.out.println("drifting");
    }

    public void move() {
        System.out.println("moving");
    }

    public void scanKaiju() {
        System.out.println("scanning");
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }
}
