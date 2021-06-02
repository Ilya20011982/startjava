public class WolfTest {

    public static void main(String[] args) {

        Wolf fisrtWolf = new Wolf();

        fisrtWolf.nickname = "Akela";
        System.out.println("Nickname - " + fisrtWolf.nickname);

        fisrtWolf.age = 5;
        System.out.println("Age - " + fisrtWolf.age);

        fisrtWolf.color = "white";
        System.out.println("Color - " + fisrtWolf.color);

        fisrtWolf.gender = "male";
        System.out.println("Gender - " + fisrtWolf.gender);

        fisrtWolf.weight = 50.5;
        System.out.println("Weight - " + fisrtWolf.weight);

        fisrtWolf.walk();
        System.out.println(fisrtWolf.sitDown());
        System.out.println(fisrtWolf.run());
        fisrtWolf.howl();
        fisrtWolf.hunt();
    }
}
