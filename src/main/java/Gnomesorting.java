import java.util.Random;

public class Gnomesorting {

    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[20];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }

        gnomeSort(ints);

        for (int value : ints) {
            System.out.println(value);
        }
    }

    public static void gnomeSort(int[] array) {
        int index = 0;

        while (index < array.length) {
            if (index == 0 || array[index - 1] <= array[index]) {
                index++;
            } else {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }
}
