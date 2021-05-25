public class Calculator {
    public static void main(String[] args) {
        double number1 = 10;    // numbers - которые пользователь вводил бы с клавиатуры
        double number2 = 4;

        char plus = '+';        // operators - которые пользователь вводил бы с клавиатуры
        char minus = '-';
        char multiply = '*';
        char divide = '/';
        char exponentiation = '^';
        char mod = '%';

        if (plus == '+') System.out.println(number1 + number2);
        if (minus == '-') System.out.println(number1 - number2);
        if (multiply == '*') System.out.println(number1 * number2);
        if (divide == '/') System.out.println(number1 / number2);
        if (mod == '%') System.out.println(number1 % number2);
        if (exponentiation == '^') {
            double result = 1;
            for (int i = 1; i <= number2; i++) {
                result *= number1;
            }
            System.out.println(result);
        }
    }
}
