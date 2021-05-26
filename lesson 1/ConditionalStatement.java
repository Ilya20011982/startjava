public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 29;
        if (age > 20) System.out.println("Возраст больше 20 лет - " + age + " лет");

        boolean gender = false;
        if (gender) System.out.println("Sex is male");
        if (!gender) System.out.println("Sex is female");

        float height = 2.2f;
        if (height < 1.8) {
            System.out.println("your height is less than 1.8");
        } else {
            System.out.println("your height is more than 1.8");
        }

        char firstLetterName = 'I';
        if (firstLetterName == 'M') {
            System.out.println("Your name starts with a letter - 'M'");
        } else if (firstLetterName == 'I') {
            System.out.println("Your name starts with a letter - 'I'");
        } else {
            System.out.println("Your name starts with a different letter");
        }
    }
}
