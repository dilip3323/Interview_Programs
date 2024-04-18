package com.qa.java.programs;

import java.util.Scanner;

public class PrintingPyramids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = 10;
		
		/*
		 * for(int i=n; i<=0; i--) { for(int j=i; j<=0; j--){ System.out.print(""); }
		 * System.out.println(); }
		 */
		
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n-i-1; j++){
			System.out.print(" ");
		}
			
			for(int k=0; k<=i; k++){
				System.out.print("*");
			}
		
			System.out.println();
		}
		
	}

	/*
	for (int i = noOfRows; i > 0; i--)
    {
        //Printing i spaces at the beginning of each row

        for (int j = 1; j <= i; j++)
        {
            System.out.print(" ");
        }

        //Printing 'rowCount' value 'rowCount' times at the end of each row

        for (int j = 1; j <= rowCount; j++)
        {
            System.out.print(rowCount+" ");
        }

        System.out.println();

        //Incrementing the rowCount

        rowCount++;
    }*/
}

