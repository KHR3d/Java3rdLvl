package ru.hw.num1part2;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Box<Apple> first = new Box<>();

		Apple apple1 = new Apple("Zelentskie");
		Apple apple2 = new Apple("Zelentskie");
		Apple apple3 = new Apple("Zelentskie");
		Apple apple4 = new Apple("Zelentskie");
		Apple apple5 = new Apple("Zelentskie");

		Apple[] part1 = new Apple[5];

		part1[0] = apple1;
		part1[1] = apple2;
		part1[2] = apple3;
		part1[3] = apple4;
		part1[4] = apple5;

		first.addFruit(part1[0]);
		first.addFruit(part1[1]);
		first.addFruit(part1[2]);
		first.addFruit(part1[3]);
		first.addFruit(part1[4]);



	}


}
