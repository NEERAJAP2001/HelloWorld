/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNumber;

import java.util.Scanner;

/**
 *
 * @author Master Irfak
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number Input : ");
        int number = input.nextInt();
        int prima = 2;
        int i,j;
        for (i = 1; i <= number; prima++) {
            for (j = 2; j <= (prima - 1); j++) {
                if (prima % j == 0) {
                    break;
                }
            }
            if (prima == j) {
                System.out.print(prima + " ");
                i++;
            }
        }
    }
}
