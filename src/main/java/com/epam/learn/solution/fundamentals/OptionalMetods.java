package com.epam.learn.solution.fundamentals;

public class OptionalMetods {
    double averageLength;
    public String getLengthNumber(int number){
        return String.valueOf(String.valueOf(number).length());
    }
    public void fillArrayWithNumbers(int [] array){
        System.out.println("Optional task. Work with massive: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 1000 - 10);
            System.out.print(array[i] + " ");
        }
    }
    public void findMinimalNumber(int [] array){
        int minimalNumberLength = array[0];
        for (int massive : array) {
            if (massive < minimalNumberLength){
                minimalNumberLength = massive;
            }
        }
        String  length = getLengthNumber(minimalNumberLength);
        System.out.println("\nMinimal number length: " + minimalNumberLength + " length: " + length);
    }

    public void findMaximalNumber(int [] array){
        int maximalNumberLength = array[0];
        for (int massive : array) {
            if (massive > maximalNumberLength){
                maximalNumberLength = massive;
            }
        }
        String length = getLengthNumber(maximalNumberLength);
        System.out.println("Maximal number length: " + maximalNumberLength + " length: " + length);
    }
    public void returnArrayAscendingOrder(int [] array){
        System.out.println("Array in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp;
                if (array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
    public void returnArrayDescendingOrder(int [] array){
        System.out.println("\nArray in descending order: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp;
                if (array[j] > array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
    public void getAverageLengthArray(int [] array){
        int lengthArray = 0;
        int count = 0;
        int temp;
        for (int massive : array) {
            temp = massive;
            while (temp > 0){
                temp /= 10;
                count++;
            }
            lengthArray += count;
            count = 0;
        }
        averageLength = (double) lengthArray/array.length;
        System.out.println("\nAverage array length: " + averageLength);
    }
    public void getNumberMoreThanAverageLength(int [] array){
        String [] arrayString = new String [array.length];
        for (int i = 0; i < array.length; i++) {
            arrayString[i] = String.valueOf(array[i]);
        }
        System.out.println("The numbers more than average length: ");
        for (String s : arrayString) {
            if (s.length() > averageLength) System.out.println(s + " length: " + s.length());
        }
    }
    public void getNumberLessThanAverageLength(int [] array){
        String [] arrayString = new String [array.length];
        for (int i = 0; i < array.length; i++) {
            arrayString[i] = String.valueOf(array[i]);
        }
        System.out.println("The numbers less than average length: ");
        for (String s : arrayString) {
            if (s.length() < averageLength) System.out.println(s + " length: " + s.length());
        }
    }
    public void getNumberWithRepeatingNumbers(int [] array){
        for (int elementArray : array) {
            char [] charArray = String.valueOf(elementArray)
                    .toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                for (int j = i + 1; j < charArray.length ; j++) {
                    if (charArray[j] == charArray[i]) {
                        System.out.println("Number with repeating numbers: " + elementArray);
                        return;
                    }
                }
            }
        }
    }
    public void getNumberWithoutRepeatingNumbers(int [] array){
        for (int elementArray : array) {
            char [] charArray = String.valueOf(elementArray).toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                for (int j = i + 1; j < charArray.length ; j++) {
                    if (charArray[j] != charArray[i] && charArray[j] != charArray[i+1]) {
                        System.out.println("Number without repeating numbers: " + elementArray);
                        return;
                    }
                }
            }
        }
    }
}
