package otus.daniyel.java.kz;

import java.util.Arrays;
public class HomeWork2 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {-1, 2, 3},
                    {4, -5, 6},
                    {0, 7, -8}
            };
            System.out.println("1. Сумма положительных элементов: " + sumOfPositiveElements(matrix));
            System.out.println("\n2. Квадрат со стороной 4:");
            printSquare(4);
            System.out.println("\n3. Зануление диагоналей:");
            zeroDiagonals(matrix);
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
            int[][] arrayForMax = {
                    {3, 15, 2},
                    {8, 1, 99},
                    {-4, 7, 12}
            };
            System.out.println("\n4. Максимальный элемент: " + findMax(arrayForMax));
            System.out.println("\n5. Сумма элементов второй строки: " + sumOfSecondRow(arrayForMax));
            int[][] singleRowArray = {{1, 2, 3}};
            System.out.println("   Если второй строки нет: " + sumOfSecondRow(singleRowArray));
        }
        public static int sumOfPositiveElements(int[][] array) {
            int sum = 0;
            for (int[] row : array) {
                for (int val : row) {
                    if (val > 0) {
                        sum += val;
                    }
                }
            }
            return sum;
        }
        public static void printSquare(int size) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        public static void zeroDiagonals(int[][] array) {
            int rows = array.length;
            for (int i = 0; i < rows; i++) {
                array[i][i] = 0;
                array[i][array[i].length - 1 - i] = 0;
            }
        }

        public static int findMax(int[][] array) {
            int max = array[0][0];
            for (int[] row : array) {
                for (int val : row) {
                    if (val > max) {
                        max = val;
                    }
                }
            }
            return max;
        }

        public static int sumOfSecondRow(int[][] array) {
            if (array.length < 2) {
                return -1;
            }
            int sum = 0;
            for (int val : array[1]) {
                sum += val;
            }
            return sum;
        }
    }
