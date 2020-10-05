package com.udemy.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingWithLamdaExpression
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
		Collections.sort(integers, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println("After Sorting : " + integers);
	}
}
