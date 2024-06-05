/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class gemini {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.print("Input pertama: ");
        double a = s.nextDouble();
        System.out.print("Pilih operasi (+, -, *, /): ");
        char op = s.next().charAt(0);
        System.out.print("Input kedua: ");
        double b = s.nextDouble();
    
        double r = 0;
        boolean error = false;
    
        try {
            if (op == '+') {
                r = a + b;
            } else if (op == '-') {
                r = a - b;
            } else if (op == '*') {
                r = a * b;
            } else if (op == '/') {
                if (b != 0) {
                    r = a / b;
                } else {
                    System.out.println("Pembagi 0!");
                    error = true;
                }
            } else {
                System.out.println("Operasi salah!");
                error = true;
            }
    
            if (!error) {
                System.out.println("Hasil: " + r);
            }
        } catch (Exception e) {
            System.out.println("Error terjadi!");
        }
    }

    }
}
