package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== TEST 1: department insert ===");
		Department newDep = new Department(null, "Food");
		depDao.insert(newDep);
		System.out.println("Department inserted! Id = " + newDep.getId());

		System.out.println("=== TEST 2: department findById ===");
		Department dep = depDao.findById(3);
		System.out.println(dep);

		System.out.println("\n=== TEST 3: department delete ===");
		System.out.print("Enter id for delete teste: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed");

		System.out.println("\n=== TEST 4: department findAll ===");
		List<Department> list = depDao.findAll();
		for (Department listing : list) {
			System.out.println(listing);
		}
	}
}
