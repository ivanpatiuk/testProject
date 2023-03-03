package org.example;

public class LoopStatements {
    static int sumOddDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        int currentDigit;
        while (n != 0) {
            currentDigit = n % 10;
            if (currentDigit % 2 != 0) {
                sum += currentDigit;
            }
            n /= 10;
        }
        return sum;
    }

    static int task2(int n) {
        n = Math.abs(n);
        int[] arr = new int[3];
        for (int i = 0; i < 3; ++i) {
            arr[i] = n % 10;
            n /= 10;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[2] * 100 + arr[1] * 10 + arr[0];
    }

    static int sumOfBinary(int n) {
        n = Math.abs(n);
        int bitCount = 0;
        if (n == 0) {
            return 0;
        }
        String binary = "";
        while (n > 0) {
            int bit = n % 2;
            if (bit == 1) {
                bitCount++;
            }
            binary = bit + binary;
            n /= 2;
        }
        return bitCount;
    }

    static int sumOfFibonacciNumbers(int n) {
        if (n < 2) {
            return 0;
        }
        int fib1 = 0;
        int fib2 = 1;
        int sum = fib1 + fib2;

        for (int i = 3; i <= n; i++) {
            int fib = fib1 + fib2;
            sum += fib;
            fib1 = fib2;
            fib2 = fib;
        }
        return sum;
    }

    static int task1(int n) {
        if (n > 0) {
            return n * n;
        } else if (n < 0) {
            return Math.abs(n);
        } else {
            return 0;
        }
    }

    static int multiArithmeticElements(int a1, int t, int n) {
        if (n < 1) {
            return 0;
        }
        int product = 1;
        for (int i = 0; i < n; ++i) {
            product *= a1;
            a1 += t;
        }
        return product;
    }

    static int maximumDistance(int[] array) {
        if(array.length == 0){
            return 0;
        }
        int firstMaxIndex = 0;
        int lastMaxIndex = 0;
        int max = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
                firstMaxIndex = i;
                lastMaxIndex = i;
            } else if (array[i] == max) {
                lastMaxIndex = i;
            }
        }
        return lastMaxIndex - firstMaxIndex;
    }

    static void transformMatrix(int[][] matrix){
        for(int row = 0; row < matrix.length; ++row){
            for(int col = 0; col < matrix[row].length; ++col){
                if(col > row){
                    matrix[row][col] = 1;
                } else if (col < row) {
                    matrix[row][col] = 0;
                }
            }
        }
    }

    enum SortOrder{ ASC, DESC }

    static int transform(int[] array, SortOrder sortOrder){
        if(array.length < 1){
            return 1;
        }
        if(isSorted(array, sortOrder) == 1){
            for(int i = 0; i < array.length; ++i){
                array[i] = array[i]+i;
            }
            return 1;
        }
        return 0;
    }

    static int isSorted(int[] array, SortOrder sortOrder){
        // ASC A->Z
        // DESC Z->A
        for (int i = 0; i < array.length-1; ++i) {
            if(sortOrder == SortOrder.ASC){
                if(array[i] > array[i+1]){
                    return 0;
                }
            } else {
                if(array[i] < array[i+1]){
                    return 0;
                }
            }
        }
        return 1;
    }
}
