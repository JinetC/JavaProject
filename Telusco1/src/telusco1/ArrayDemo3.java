package telusco1;

public class ArrayDemo3 {

    public static void main(String[] args) {
        int a[] = {5, 6, 8, 9};
        int b[] = {74, 51, 49, 36};
        int c[] = {46, 82, 64, 95};

        int p[][] = {
            {5, 6, 8, 9},
            {74, 51, 49, 36},
            {46, 82, 64, 95}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
