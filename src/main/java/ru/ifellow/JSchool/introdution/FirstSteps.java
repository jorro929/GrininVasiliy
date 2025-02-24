package ru.ifellow.JSchool.introdution;
import java.util.Arrays;

public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }
    //+
    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }
    ///
    /// Дальше будет я решил показать несколько вариантов решения
    ///

    //    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
//        if(x >= xLeft && x <= xRight){
//            if(y >= yTop && y <= yBottom){
//                return true;
//            }
//        }
//        return false;
//    }
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);
    } // Этот вариант более компактый, но мне кажется первый более читаемый, поэтому я решил показать оба

    ///**********************************************************************************************************************************

    //    public int sum(int[] array) {
//        int sum = 0;
//        for(int i: array){
//            sum += i;
//        }
//        return sum;
//    }
    public int sum(int[] array) {
        return Arrays.stream(array).sum();
    } // два решения:
//       1) более привычное
//       2) более красивое)

    ///**********************************************************************************************************************************

    //    public int mul(int[] array) {
//        if (array.length == 0){
//            return 0;
//        }
//        int mul = 1;
//        for(int i: array){
//            mul *= i;
//        }
//        return mul;
//    }
    public int mul(int[] array) {
        if (array.length == 0){
            return 0;
        }

        return Arrays.stream(array).reduce((a, e) -> a * e).getAsInt();
    } // такая же ситуация как и с прошлым примером)

    ///**********************************************************************************************************************************

//    public int min(int[] array) {
//
//        if (array.length == 0){
//            return Integer.MAX_VALUE;
//        }
//        int min = array[0];
//
//        for(int i : array){
//            if(min > i){
//                min = i;
//            }
//        }
//
//        return min;
//    }

    public int min(int[] array) {
        if (array.length == 0){
            return Integer.MAX_VALUE;
        }
        return Arrays.stream(array).min().getAsInt();
    }

    ///**********************************************************************************************************************************

    public int max(int[] array) {
        if (array.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = array[0];

        for(int i : array){
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    //    public int max(int[] array) {
//        if (array.length == 0){
//            return Integer.MIN_VALUE;
//        }
//        return Arrays.stream(array).max().getAsInt();
//    }




    ///**********************************************************************************************************************************

    public double average(int[] array) {
        if (array.length == 0){
            return 0.0;
        }
        return (double)( sum(array)) / array.length;
    }

//    public double average(int[] array) {
//        if (array.length == 0){
//            return 0;
//        }
//        return Arrays.stream(array).average().getAsDouble();
//    }

    ///**********************************************************************************************************************************

    public boolean isSortedDescendant(int[] array) {
        if (array.length == 0){
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] <= array[i + 1]){
                return false;
            }
        }
        return true;
    }

    ///**********************************************************************************************************************************


//    public void cube(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) Math.pow(array[i], 3.0);
//        }
//    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    ///**********************************************************************************************************************************


//    public boolean find(int[] array, int value) {
//        Arrays.sort(array);
//        return Arrays.binarySearch(array, value) != -1;
//    }

    public boolean find(int[] array, int value) {
        for(int i: array){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    ///**********************************************************************************************************************************


    public void reverse(int[] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            if(i >= array.length - 1 - i){
                break;
            }
            buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
        }

    }

    ///**********************************************************************************************************************************

    public boolean isPalindrome(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1 - i){
                break;
            }
            if(array[i] != array[array.length - 1 - i]){
                return false;
            }
        }
        return true;
    }

    ///**********************************************************************************************************************************

    public int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += sum(matrix[i]);
        }
        return sum;
    }

    ///**********************************************************************************************************************************

    public int max(int[][] matrix) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if(max < max(matrix[i])){
                max = max(matrix[i]);
            }
        }
        return max;
    }

    ///**********************************************************************************************************************************

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if(max < matrix[i][i]){
                max = matrix[i][i];
            }
        }


        return max;
    }

    ///**********************************************************************************************************************************

    public boolean isSortedDescendant(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if(!isSortedDescendant(matrix[i])){
                return false;
            }
        }
        return true;
    }

}
