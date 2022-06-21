package by.itstep.Korotkevich.javalessons.lesson18.controller;

import by.itstep.Korotkevich.javalessons.lesson18.model.logic.ArraySearcher;
import by.itstep.Korotkevich.javalessons.lesson18.model.logic.ArraySorter;
import by.itstep.Korotkevich.javalessons.lesson18.model.logic.ArrayWorker;
import by.itstep.Korotkevich.javalessons.lesson18.util.ArrayInitializer;
import by.itstep.Korotkevich.javalessons.lesson18.util.Convertor;
import by.itstep.Korotkevich.javalessons.lesson18.view.Printer;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            Printer.print("Input size of array: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] array = new int[size];

//        int[] array = {5, 6,4,2,3,1, 0};

        ArrayInitializer.randomInit(array);

        Printer.print("Array before sort: " + Convertor.toString(array));

        ArraySorter.bubbleSortAcs(array);

        Printer.print("\nArray after sort: " + Convertor.toString(array));

        ArrayWorker.revers(array);

        Printer.print("\nArray after revers: " + Convertor.toString(array));
    }
}

