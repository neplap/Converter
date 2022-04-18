public class MethodTwoArray {
    public static void main(String[] args) {

        int n = 3;
        int[][] arrayFirst = new int[n][n];
        for (int i = 0; i < arrayFirst.length; i++) {
            for (int j = 0; j < arrayFirst.length; j++) {
                arrayFirst[i][j] = j + i * n;
                //туго очень, был вопрос, почему умножаем на 3? затестил разные цифры, работает
                //считал в голове, не работает...
                //решил что длину якобы будем запрашивать
            }
        }
        System.out.println("Полученная матрица");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayFirst[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arrayFirst.length; i++) {
            for (int j = i + 1; j < arrayFirst.length; j++) {
                int temporaryVariable = arrayFirst[i][j];
                arrayFirst[i][j] = arrayFirst[j][i];
                arrayFirst[j][i] = temporaryVariable;
            }
        }

        System.out.println();
        System.out.println("Транспонированная матрица");
        //не уверен, но помахав листочком с цифрами, вроде так...
        System.out.println();
        for (int[] ints : arrayFirst) {
            for (int j = 0; j < arrayFirst.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}
