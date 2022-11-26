package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task3();
    }

    private static void Task1() {
        IntegerListImpl integerArrayList = new IntegerListImpl();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(8);
        integerArrayList.add(9);
        integerArrayList.add(10);
        integerArrayList.add(0, 0);
        integerArrayList.set(1, 111);

        System.out.println(integerArrayList);
        System.out.println("Size: " + integerArrayList.size());

        integerArrayList.clear();

        System.out.println(integerArrayList);
        System.out.println("Size: " + integerArrayList.size());
    }

    private static void Task2() {
        IntegerListImpl integerArrayList = new IntegerListImpl();

        Integer[] arr = integerArrayList.generateRandomArray(100_000);
        Integer[] arr1 = Arrays.copyOf(arr, arr.length);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr3 = Arrays.copyOf(arr, arr.length);

        long start;

        //for (int i = 0; i < arr1.length; i++) {
        //    System.out.print(arr1[i] + " ");
        //}
        start = System.currentTimeMillis();
        integerArrayList.sortInsertion(arr1);
        System.out.println("sortInsertion time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        integerArrayList.sortBubble(arr2);
        System.out.println("sortBubble time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        integerArrayList.sortSelection(arr3);
        System.out.println("sortSelection time: " + (System.currentTimeMillis() - start));
    }

    private static void Task3() {
        IntegerListImpl integerArrayList = new IntegerListImpl();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        System.out.println(integerArrayList.contains(1));
        System.out.println(integerArrayList.contains(11));
    }
}