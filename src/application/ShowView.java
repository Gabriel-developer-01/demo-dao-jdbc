package application;

import java.util.Scanner;

public class ShowView {
	
	static Scanner sc = new Scanner(System.in);
	//menu principal
	public static void showGetInfoFromMenu() {
		System.out.println("-----GET INFO FROM-----");
		System.out.println("1. Department");
		System.out.println("2. Sellers");
		System.out.println("3. Exit");
	}
	//menu do Seller
	public static void showSellerCrudOption() {
		System.out.println("-----Choice -----");
		System.out.println("1. findById");
		System.out.println("2. findByDepartment");
		System.out.println("3. findAll");
		System.out.println("4. Insert");
		System.out.println("5. update");
		System.out.println("6. delete");
		System.out.println("7. exit");
	}
	//menu do Department
	public static void showDepartmentCrudOption() {
		System.out.println("-----Choice-----");
		System.out.println("1. Find Department by id ");
		System.out.println("2. Find all");
		System.out.println("3. insert Department");
		System.out.println("4. update Department");
		System.out.println("5. Department delete");
		System.out.println("6. Exit");
	}
}