package model.services;

import java.util.List;
import java.util.Scanner;

import application.ShowView;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	static Scanner sc = new Scanner(System.in);
	
	public static void Department() {
	
	DepartmentDao depDao = DaoFactory.createDepartmentDao();
	
	int menuDepartment;
	
	do {
		
		ShowView.showDepartmentCrudOption();
		System.out.println("choose an option: ");
		menuDepartment = sc.nextInt();
		sc.nextLine();
		
		switch (menuDepartment) {
		case 1:
			System.out.println("=== TESTE 1: Department findById ====");
			Department dep = depDao.findById(6);
			System.out.println(dep);
			ContinueDepartment();
			break;
		case 2:
			System.out.println("=== TESTE 2: Department findAll ====");
			List<Department> list = depDao.findAll();
			for(Department obj : list) {
				System.out.println(obj);
			}
			ContinueDepartment();
			break;
		case 3:
			System.out.println("=== TESTE 3: Department insert ====");
			Department newDep = new Department(null,"chair");
			depDao.insert(newDep);
			System.out.println("INSERT DONE! id = "+newDep.getId());
			ContinueDepartment();
			break;
		case 4:
			System.out.println("=== TESTE 4: Department update ====");
			Department obj = new Department(6,"Fidge");
			depDao.update(obj);
			System.out.println("Update completed");
			ContinueDepartment();
			break;
		case 5:
			System.out.println("=== TESTE 5: Department delete ====");
			System.out.print("Enter id for delete teste: ");
			int id = sc.nextInt();
			depDao.deleteById(id);
			System.out.println("Delete completed");
			ContinueDepartment();
			break;

		default:
			System.out.println("Exit.Thanks for your preference, check back often!");
			break;
		}
		
	}while(menuDepartment >= 1&& menuDepartment <= 5);
	sc.close();
	}
	
	//método para continuar no programa do Department
			public static  void ContinueDepartment() {
				System.out.println("Deseja continuar? (Y/n)");
				char esc = sc.next().charAt(0);
				if (esc == 'Y' || esc == 'y') {
					return;
				} else {
					System.out.println("Exit.Thanks for your preference, check back often!");
					System.exit(0);
				}
			}
}