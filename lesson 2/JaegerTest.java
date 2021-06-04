import javax.sound.midi.Soundbank;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger firstJaeger = new Jaeger("Striker Eureka", "Mark-5", "Destroyed", "Australia");
        firstJaeger.setJaegerSpecifications(76.2, 1850, 10, 10, 9);

        firstJaeger.getJaeger();
        firstJaeger.getJaegerSpecifications();
        firstJaeger.drift();
        firstJaeger.move();
        firstJaeger.scanKaiju();
        firstJaeger.useVortexCannon();

        System.out.println();

        Jaeger secondJaeger = new Jaeger("Crimson Typhoon", "Mark-4", "Destroyed", "China");
        secondJaeger.setJaegerSpecifications(76.2, 1722, 9, 8, 6);

        secondJaeger.getJaeger();
        secondJaeger.getJaegerSpecifications();
        secondJaeger.drift();
        secondJaeger.move();
        secondJaeger.scanKaiju();
        secondJaeger.useVortexCannon();
    }
}
