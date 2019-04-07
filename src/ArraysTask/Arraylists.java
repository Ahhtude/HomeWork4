package ArraysTask;

import java.util.Random;

public class Arraylists {
        static int heigh=10;

        static int width=20;

        public static void main(String[] args) {

            int array1[][] = new int[heigh][width];
            int array2[][] = new int[heigh][width];
            int arrayFinal[][]= new int[heigh][width];

            InitialsArrays(array1,100,1);
            InitialsArrays(array2,100,1);

            ShowResults(array1);
            ShowResults(array2);

            for (int i=0;i<heigh;i++){
                for (int j=0; j<width;j++){
                    arrayFinal[i][j]=array1[i][j]*array2[i][j];
                }
            }
            ShowResults(arrayFinal);

        }
        public static void InitialsArrays(int[][] array, int maxValueRandom, int minValueRandom){
            Random random = new Random();
            for (int i=0;i<heigh;i++){
                for (int j=0;j<width;j++)
                {
                    array[i][j]=random.nextInt(maxValueRandom-minValueRandom)+minValueRandom;
                }
            }
        }
        public static void ShowResults(int [][] array){
            System.out.println();

            System.out.println("Results of array:");

            for (int i = 0; i < heigh; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(array[i][j]+" ");

                }
                System.out.println();

            }

        }
    }

