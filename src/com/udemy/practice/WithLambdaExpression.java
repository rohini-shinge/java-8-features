package com.udemy.practice;

public class WithLambdaExpression
{
	public static void main(String[] args)
	{
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Child Thread");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
