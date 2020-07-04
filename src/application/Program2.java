package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: Department findById ====");
		Department dep = depDao.findById(6);
		System.out.println(dep);
		
		System.out.println("=== TESTE 2: Department findAll ====");
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TESTE 3: Department insert ====");
		Department newDep = new Department(null,"chair");
		depDao.insert(newDep);
		System.out.println("INSERT DONE! id = "+newDep.getId());
		
		System.out.println("=== TESTE 4: Department update ====");
		Department obj = new Department(6,"Fidge");
		depDao.update(obj);
		System.out.println("Update completed");
		
		System.out.println("=== TESTE 5: Department delete ====");
		System.out.println("Enter id for delete teste: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}
}