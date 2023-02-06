package com.epam.learn.solution.fundamentals;

/**
 * Hello world!
 *
 */
public class App {
    static int[] numbersArray = new int[10];
    public static void main( String[] args ) {
        UserInteraction userInteraction = new UserInteraction();
        NumberInteraction numberInteraction = new NumberInteraction();
        OptionalMetods optionalMetods = new OptionalMetods();

//        userInteraction.getUserName();
//        userInteraction.getArgumentsInReversOrder();
//        numberInteraction.getRandomNumbers();
//        numberInteraction.getSumEnteredNumbers();
//        numberInteraction.getMonthFromGivenNumber();

        optionalMetods.fillArrayWithNumbers(numbersArray);
        optionalMetods.findMinimalNumber(numbersArray);
        optionalMetods.findMaximalNumber(numbersArray);
        optionalMetods.returnArrayAscendingOrder(numbersArray);
        optionalMetods.returnArrayDescendingOrder(numbersArray);
        optionalMetods.getAverageLengthArray(numbersArray);
        optionalMetods.getNumberMoreThanAverageLength(numbersArray);
        optionalMetods.getNumberLessThanAverageLength(numbersArray);
        optionalMetods.getNumberWithRepeatingNumbers(numbersArray);
        optionalMetods.getNumberWithoutRepeatingNumbers(numbersArray);

    }
}
