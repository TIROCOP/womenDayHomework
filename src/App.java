import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] mass = {1, 0, 35, 22, 64, -6};
        long startTime = System.nanoTime();
        bubbleGum(mass);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
        System.out.println("////// START MARATHONER");
        int[] newMass;
        for (int i = 2; i < 5; i++) {
            newMass = makeNewRandomMass((int) Math.pow(10, i));
//            System.out.println(Arrays.toString(newMass));
            startTime = System.nanoTime();
            bubbleGum(newMass);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
//            System.out.println(Arrays.toString(newMass));
            System.out.println(duration);
        }

    }


    private static int[] makeNewRandomMass(int i) {
        Random random = new Random();
        int[] mass = new int[i];
        for (int j = 0; j < i; j++) {
            mass[j] = random.nextInt(100);
        }
        return mass;
    }

    private static void bubbleGum(int[] mass) {
        boolean stop = true;
        int k = 0;
        int newInt;
        do {
            stop = false;
            k += 1;
            for (int i = 1; i <= mass.length - k; i++) {
                if (mass[i - 1] > mass[i]) {
                    newInt = mass[i];
                    mass[i] = mass[i - 1];
                    mass[i - 1] = newInt;
                    stop = true;
                }
            }
        } while (stop);
    }

}
