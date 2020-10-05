package com.udemy.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2)
	{
		return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
	}
}

public class SortingWithoutLambdaExpression
{
	public static void main(String[] args)
	{
		List<Integer> integers = new ArrayList<>();
		integers.add(0);
		integers.add(29);
		integers.add(55);
		integers.add(201);
		integers.add(7);
		System.out.println("Before Sorting : " + integers);
		Collections.sort(integers, new MyComparator());
		System.out.println("After Sorting : " + integers);

	}
}
