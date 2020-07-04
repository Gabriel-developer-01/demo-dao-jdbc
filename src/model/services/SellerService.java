package model.services;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import application.ShowView;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerService {

	static Scanner sc = new Scanner(System.in);

	public static void Seller() {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		int menuSeller;

		do {
			ShowView.showSellerCrudOption();
			System.out.print("choose an option: ");
			menuSeller = sc.nextInt();
			sc.nextLine();

			switch (menuSeller) {
			case 1:
				System.out.println("=== TESTE 1: seller findById ====");
				Seller seller = sellerDao.findById(3);
				System.out.println(seller);
				ContinueSeller();
				break;
			case 2:
				System.out.println("\n==== TESTE 2: seller findByDepartment ====");
				Department department = new Department(2, null);
				List<Seller> list = sellerDao.findByDepartment(department);
				for (Seller obj : list) {
					System.out.println(obj);
				}
				ContinueSeller();
				break;
			case 3:
				System.out.println("\n==== TESTE 3: seller findAll ====");
				list = sellerDao.findAll();
				for (Seller obj : list) {
					System.out.println(obj);
				}
				ContinueSeller();
				break;
			case 4:
				System.out.println("\n==== TESTE 4: seller Insert ====");
				department = new Department(2, null);
				Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
				sellerDao.insert(newSeller);
				System.out.println("Inserted! New id = " + newSeller.getId());
				break;
			case 5:
				System.out.println("\n==== TESTE 5: seller update ====");
				seller = sellerDao.findById(1);
				seller.setName("Martha Waine");
				sellerDao.update(seller);
				System.out.println("Update completed");
				ContinueSeller();
				break;
			case 6:
				System.out.println("\n==== TESTE 6: seller delete ====");
				System.out.print("Enter id for delete test: ");
				int id = sc.nextInt();
				sellerDao.deleteById(id);
				System.out.println("Delete completed");
				ContinueSeller();
				break;

			default:
				System.out.println("Exit.Thanks for your preference, check back often!");
				break;
			}
		} while (menuSeller >= 1 && menuSeller <= 6);

	}

	// método para continuar no programa Seller
	public static void ContinueSeller() {
		System.out.println("Deseja continuar? (Y/n)");
		char esc = sc.next().charAt(0);
		if (esc == 'Y' || esc == 'y') {
			return;
		} else {
			System.out.println("Exit.Thanks for your preference, check back often!");
			System.exit(0);
		}
		sc.close();
	}
}