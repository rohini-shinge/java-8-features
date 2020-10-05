package com.udemy.practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortingWithLambdaExpression
{
	public static void main(String[] args)
	{
		Map<Integer, String> integers = new TreeMap<>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		integers.put(0, "Rohini");
		integers.put(29, "Gautam");
		integers.put(55, "Dhaval");
		integers.put(201, "Omi");
		integers.put(7, "Niki");
		System.out.println("Sorting : " + integers);
	}
}
