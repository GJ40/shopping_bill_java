package com.shopping;

public class Main {
	
	public static double calculateElectronicsGST(double a, double b){
		return (a + (a * 0.18)) + (b + (b * 0.18));
	}
	
	public static double calculateFashionGST(double c, double d){
		return (c + (c * 0.13)) + (d + (d * 0.13));
	}
	
	public static double calculateFoodGST(double e){
		return (e + (e * 0.07));
	}
	
	public static double totalBill(double a, double b, double c, double d, double e){
		return calculateElectronicsGST(a, b) + calculateFashionGST(c, d) + calculateFoodGST(e);
	}
	
	public static double calculateDiscountedBill(double a, double b, double c, double d, double e){
		double bill = totalBill(a, b, c, d, e);
		return (bill - (bill * 0.2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 100;
		double b = 100;
		double c = 100;
		double d = 100;
		double e = 100;
		
		System.out.println("Final Payable Amount: "+ calculateDiscountedBill(a, b, c, d, e));

	}

}
