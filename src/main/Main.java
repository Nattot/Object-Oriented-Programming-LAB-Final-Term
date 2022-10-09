package main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import transaction.WGS;

public class Main {

	Scanner scan = new Scanner(System.in);
	Connect connect = Connect.getConnection();
	ArrayList<WGS> wgs = new ArrayList<>();
	
	public Main() {
		// TODO Auto-generated constructor stub
		int de=0;
		do {
			System.out.println("Welcome to WG Stop");
			System.out.println("1. Create Transaction");
			System.out.println("2. View Transaction");
			System.out.println("3. Delete Transaction");
			System.out.println("4. Exit");
			de = scan.nextInt();
			scan.nextLine();
			
			switch(de) {
			case 1:
				insert();
				break;
			case 2:
				view();
				break;
			case 3:
				delete();
				break;
			}
		}while (de!=4);
	}

	private void insert() {
		String id, name, ext1, ext2;
		int price=1, quan, ext3;
		System.out.println("Input Customer Name: ");
		name = scan.nextLine();
		
		System.out.println("Input Customer Email: ");
		ext1 = scan.nextLine();
		
		System.out.println("Input Quantity: ");
		quan = scan.nextInt();
		scan.nextLine();
		
		price = price * quan;
		
		String ql = String.format("INSERT INTO transaction values('%s', '%s', '%s, '%s', %d)", id, ext2, name, ext1, quan);
		connect.executeUpdate(ql);
	}
	
	private void delete() {
		view();
		int oof;
		System.out.println("Input Number to Delete: ");
		oof = scan.nextInt();
		scan.nextLine();
		
		WGS wgs = wgss.remove(oof-1);
	}
	
	private void arry() {
		String take = "select * from transaction";
		ResultSet tiki = connect.executeQuery(take);
		
		try {
			while (tiki.next() == true) {
				Transaction transaction = new Transaction(tiki.getString("custid"), tiki.getString("id"), tiki.getString("name"), tiki.getString("email"), tiki.getInt("price"))
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void view() {
		int A = 0;
		for (WGS wgs2 : wgs) {
			A += 1;
			System.out.println(A+" | "+wgs2.getId()+" | "+wgs2.getName()+" | "+wgs2.getPrice()+" | "+wgs2.getClass());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
