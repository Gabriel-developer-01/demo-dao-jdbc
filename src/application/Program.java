package application;

import java.util.Scanner;

import model.services.DepartmentService;
import model.services.SellerService;

public class Program {
/*ATEN��O: ESSA CLASSE FOI CRIADA COMO DESAFIO PARA ME PRATICAR,FIZ UM MENU PARA JUNTAR O PROGRAM1 E O PROGRAM2*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//chamada do meu menu para escolher Department ou Seller
		ShowView.showGetInfoFromMenu();
		System.out.println("choose an option: ");
		int menu = sc.nextInt();

		switch (menu) {

		case 1:
			//caso seja Department eu chamo o m�todo que tr�s o menu com as op��es
			DepartmentService.Department();
			break;

		case 2:
			//caso seja Seller eu chamo o m�todo que tr�s o menu com as op��es
			SellerService.Seller();
			break;
		}

		sc.close();
	}
}