public class WolfTest {
    public static void main(String[] args) {

        Wolf fisrtWolf = new Wolf();

        fisrtWolf.setNickname("Akela");
        System.out.println("Nickname - " + fisrtWolf.getNickname());

        fisrtWolf.setAge(9);
        fisrtWolf.setAge(-1);
        fisrtWolf.setAge(5);
        System.out.println("Age - " + fisrtWolf.getAge());

        fisrtWolf.setColor("white");
        System.out.println("Color - " + fisrtWolf.getColor());

        fisrtWolf.setGender("male");
        System.out.println("Gender - " + fisrtWolf.getGender());

        fisrtWolf.setWeight(50.5);
        System.out.println("Weight - " + fisrtWolf.getWeight());

        fisrtWolf.walk();
        fisrtWolf.sitDown();
        fisrtWolf.run();
        fisrtWolf.howl();
        fisrtWolf.hunt();
    }
}
