import java.util.Random;

public class GuessNumber {
    private final int randomNumber;
    private String nameWinner;

    public GuessNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(101);
    }

    public void setNameWinner(String nameWinner) {
        this.nameWinner = nameWinner;
    }

    public String getNameWinner() {
        return nameWinner;
    }

    public boolean isNumber(int number) {
        if (randomNumber < number) {
            System.out.println("Ваше число БОЛЬШЕ, введите число - ");
            return false;
        }
        if (randomNumber > number) {
            System.out.println("Ваше число МЕНЬШЕ, введите число - ");
            return false;
        }
        System.out.println("Вы угадали число - " + number);
            return true;
    }
}
