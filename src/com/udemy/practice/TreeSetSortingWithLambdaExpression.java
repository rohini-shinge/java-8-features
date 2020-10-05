package com.udemy.practice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortingWithLambdaExpression
{
	public static void main(String[] args)
	{
		Set<Integer> integers = new TreeSet<>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		integers.add(0);
		integers.add(29);
		integers.add(55);
		integers.add(201);
		integers.add(7);
		System.out.println("Sorting : " + integers);
	}
}
