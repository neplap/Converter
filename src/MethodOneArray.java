public class MethodOneArray {
    public static void main(String[] args) {


        int[][] arrayOne = {{1, 2, 3}, {2, 3, 1}, {3, 2, 1}};
        int[][] arrayTwo = {{4, 5, 6}, {5, 6, 4}, {6, 5, 4}};
        int[][] arrayResult = new int[arrayOne.length][arrayTwo[0].length];
        //надо пояснить для тупых, с инета нашел решение вертекс академия, мучался несколько часов
        //почему только нулевое значение второго массива берется? а не весь массив...
        //я опять туплю
        //решил что надо просто запомнить, может потом дойдет...
        //в очередной раз

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo[0].length; j++) {
                for (int h = 0; h < arrayTwo.length; h++) {
                    arrayResult[i][j] = arrayResult[i][j] + (arrayOne[i][h] * arrayTwo[h][j]);
                    //тут тоже тупил долго
                }
            }
        }

        for (int[] ints : arrayResult) {
            for (int j = 0; j < arrayResult.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}

