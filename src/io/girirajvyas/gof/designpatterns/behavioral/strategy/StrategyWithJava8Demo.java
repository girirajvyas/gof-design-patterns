package io.girirajvyas.gof.designpatterns.behavioral.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StrategyWithJava8Demo {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    // repetitive way
    System.out.println("Repetitive code");
    System.out.println(totalValue(numbers));
    System.out.println(totalEvenValue(numbers));
    System.out.println(totalOddValue(numbers));

    // with lambda strategy
    System.out.println("With Java 8 Lambda");
    System.out.println(totalValue(numbers, p -> true));
    System.out.println(totalValue(numbers, p -> p % 2 == 0));
    System.out.println(totalValue(numbers, p -> p % 2 != 0));
    
   // with streams
   //System.out.println(totalValueWithStreams(numbers, p -> true));
  }

  private static int totalValue(List<Integer> numbers) {
    int total = 0;

    for (Integer value : numbers) {
      total += value;
    }

    return total;
  }

  private static int totalEvenValue(List<Integer> numbers) {
    int total = 0;

    for (Integer value : numbers) {
      if (value % 2 == 0)
        total += value;
    }

    return total;
  }

  private static int totalOddValue(List<Integer> numbers) {
    int total = 0;

    for (Integer value : numbers) {
      if (value % 2 != 0)
        total += value;
    }

    return total;
  }

  private static int totalValue(List<Integer> numbers, Predicate<Integer> condition) {
    int total = 0;

    for (Integer value : numbers) {
      if (condition.test(value))
        total += value;
    }

    return total;
  }
  
  private static int totalValueWithStreams(List<Integer> numbers, Predicate<Integer> condition) {
    return numbers.stream().filter(condition).mapToInt(e -> e).sum();
  }

}
