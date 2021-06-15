/*****************************************************
 * Module 3
 * Assignment 1
 * By: Karolina Szulczyk
 * 
 * This is my variable name checker program
 *****************************************************/

package Assignments;

import java.util.Scanner;

public class VariableNameChecker 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.println("This program checks the properness of a proposed Java variable name. ");
		System.out.print("Enter a variable name (q to quit): ");
		String variableName = stdIn.nextLine();
		
		while (!variableName.equals("q"))
		{
			for (int i = 0; i < variableName.length(); i++)
			{
				if (!Character.isDigit(variableName.charAt(i)) && !Character.isLetter(variableName.charAt(i)))
				{
					System.out.println("Legal, but uses poor style." +"\n");
					break;
				}
				else if (Character.isWhitespace(variableName.charAt(6)) || Character.isDigit(variableName.charAt(0)))
				{
					System.out.println("Illegal" +"\n");
					break;
				}
				else if (variableName.charAt(0) == (variableName.toUpperCase().charAt(0)))
				{
					System.out.println("Legal, but uses poor style." +"\n");
					break;
				}
				else if (i == variableName.length() - 1)
				{
					System.out.println("Good!" +"\n");
				}
			}
			System.out.println("Enter a variable name (q to quit): ");
			variableName = stdIn.nextLine();
		}
	}
}