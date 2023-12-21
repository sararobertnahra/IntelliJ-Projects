public class whileLoop {
    public static void main(String[] args){

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        int z = 1;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(z);
            z++;
        }

        int w = 1;
        boolean isReady = false;
        do {
            if (w > 5) {
                break;
            }
            System.out.println(w);
            w++;
            isReady = (w > 0);
        } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
