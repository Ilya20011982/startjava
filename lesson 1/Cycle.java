public class Cycle {
    public static void main(String[] args) {
        // Cycle for
        for (int i = 0; i < 21; i++) {
            System.out.printf("%d\t", i);
        }
        System.out.println();

        // Cycle while
        int counter = 6;
        while (counter > -7) {
            System.out.printf("%d\t", counter);
            counter -= 2;
        }
        System.out.println();

        // Cycle do while
        int count = 10;
        int sumOdd = 0;
        do{
            if(count % 2 != 0) {sumOdd += count;}
            count++;
        } while (count <= 20);
        System.out.println(sumOdd);
    }
}