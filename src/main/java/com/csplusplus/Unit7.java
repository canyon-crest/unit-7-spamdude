package com.csplusplus;

import java.util.ArrayList;

public class Unit7 {

    // 1. Method that returns the sum of all elements in the ArrayList
    // Instructions: Traverse the ArrayList and calculate the sum of all integers in the list.
    // DO NOT use the Collections class or any additional methods beyond size(), add(), get(), set(), and remove().
    public static int sumOfElements(ArrayList<Integer> list) {
        // TODO: Implement this method
        int sum = 0;
        for (int value: list) {
            sum += value;
        }
        return sum;  // Placeholder return value
    }

    // 2. Method that removes all instances of a specific element from the ArrayList
    // Instructions: Use a loop to remove all instances of the specified element.
    // DO NOT use removeIf(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void removeAllInstances(ArrayList<Integer> list, int elementToRemove) {
        // TODO: Implement this method
        for (int $ = 0; $ < list.size(); $++) {
            if (list.get($) == elementToRemove) {
                list.remove($);
                $--;
            }
        }
    }

    // 3. Method that doubles each element in the ArrayList
    // Instructions: Multiply each element by 2 and update the list in place.
    // DO NOT use Collections or other methods beyond size(), add(), get(), set(), and remove().
    public static void doubleAllElements(ArrayList<Integer> list) {
        // TODO: Implement this method
        for (int $ = 0; $ < list.size(); $++) {
            list.set($, list.get($) * 2);
        }
    }

    // 4. Method that adds a new element to the list only if it is not already present
    // Instructions: Check manually if the element is already present before adding.
    // DO NOT use contains(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void addIfNotPresent(ArrayList<Integer> list, int newElement) {
        // TODO: Implement this method
        for (int value: list) {
            if (value == newElement) {
                return;
            }
        }
        list.add(newElement);
    }

    // 5. Method that returns a new ArrayList containing only the even elements from the input list
    // Instructions: Create a new list and manually collect the even elements.
    // DO NOT use streams, Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static ArrayList<Integer> getEvenElements(ArrayList<Integer> list) {
        // TODO: Implement this method
        ArrayList<Integer> result = new ArrayList<>();
        for (int value: list) {
            if (value % 2 == 0) {
                result.add(value);
            }
        }
        return result;  // Placeholder return value
    }

    // 6. Method that removes elements divisible by 5
    // Instructions: Use a loop to remove all elements divisible by 5.
    // DO NOT use removeIf(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void removeElementsDivisibleBy5(ArrayList<Integer> list) {
        // TODO: Implement this method
        for (int $ = 0; $ < list.size(); $++) {
            if (list.get($) % 5 == 0) {
                list.remove($);
                $--;
            }
        }
    }

    // 7. Method that reverses the list without using the Collections class
    // Instructions: Reverse the order of the elements by swapping them manually.
    // DO NOT use Collections or other methods beyond size(), add(), get(), set(), and remove().
    public static void reverseList(ArrayList<Integer> list) {
        // TODO: Implement this method
        int tmp;
        int size = list.size();
        for (int $ = 0; $ < size/2; $++) {
            tmp = list.get($);
            list.set($, list.get(size-1-$));
            list.set(size-1-$, tmp);
        }
    }

    // 8. Method that shuffles the elements of the list
    // Instructions: Shuffle the elements randomly by swapping them manually.
    // DO NOT use the Collections.shuffle() or other methods beyond size(), add(), get(), set(), and remove().
    public static void shuffleList(ArrayList<Integer> list) {
        // TODO: Implement this method
        int size = list.size();
        int tmp, add;
        for (int $ = 0; $ < size - 1; $++) {
            add = (int) (Math.random() * (size - $));
            tmp = list.get($);
            list.set($, list.get($ + add));
            list.set($ + add, tmp);
        }
    }
}
