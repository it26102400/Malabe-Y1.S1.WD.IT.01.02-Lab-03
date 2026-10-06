import java.util.Scanner;

public class IT26102400Lab3Q1B {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();
        
        double discount = totalBill * 0.10;
        
        double finalAmount = totalBill - discount;
        
        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Amount to pay: " + finalAmount);
        
        scanner.close();
    }
}