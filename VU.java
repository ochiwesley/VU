/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ochie
 */
public class VU {
 
    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < 40000) {
            System.out.println("Error: Base pay cannot be less than UGX40,000 an hour.");
            return;
        }
        
        if (hoursWorked > 60) {
            System.out.println("Error: Employee cannot work more than 60 hours in a week.");
            return;
        }
        
        double totalPay = 0;
        
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            totalPay = 40 * basePay + (hoursWorked - 40) * basePay * 1.5;
        }
        
        System.out.println("Total pay: UGX" + totalPay);
    }
    
    public static void main(String[] args) {
        calculatePay(28000, 35); // Employee A
        calculatePay(35000, 45); // Employee B
        calculatePay(38000, 75); // Employee C
    }
}
