public class JaegerTest {
    public static void main(String[] args) {
        Jaeger firstJaeger = new Jaeger();

        firstJaeger.setModelName("Striker Eureka");
        firstJaeger.setMark("Mark-5");
        firstJaeger.setStatus("Destroyed");
        firstJaeger.setOrigin("Australia");
        firstJaeger.setHeight(76.2);
        firstJaeger.setWeight(1850);
        firstJaeger.setSpeed(10);
        firstJaeger.setStrength(10);
        firstJaeger.setArmor(9);

        System.out.println(firstJaeger);

        firstJaeger.drift();
        firstJaeger.move();
        firstJaeger.scanKaiju();
        firstJaeger.useVortexCannon();

        System.out.println();

        Jaeger secondJaeger = new Jaeger("Gipsy Danger", "Mark-3", "Destroyed", "USA");
        secondJaeger.setWeight(1980);
        secondJaeger.setHeight(79.25);
        secondJaeger.setStrength(8);
        secondJaeger.setSpeed(7);
        secondJaeger.setArmor(6);

        System.out.println(secondJaeger);

        secondJaeger.drift();
        secondJaeger.move();
        secondJaeger.scanKaiju();
        secondJaeger.useVortexCannon();
    }
}
