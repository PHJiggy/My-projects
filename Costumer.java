/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity2;
import java.util.*;
/**
 *
 * @author WW102
 */
public class Costumer {
    ArrayList<String> Customer = new ArrayList<>();
	ArrayList<Integer> Age = new ArrayList<>();
	ArrayList<String> Place = new ArrayList<>();
	
    Scanner scan =  new Scanner(System.in);
    String name;
	int choice;
	int newage;
	String newplace;
    
    public Costumer(){
			Customer.add("ALBEOS KYLE");
			
			Age.add(19);
			
			Place.add("Basak Iba");
        }
    
    void ADD_CUSTOMER(){
        System.out.println("You're adding new customer! Follow this format (ALBEOS KYLE)");
        System.out.println("The the (Lastname_Firstname)");
        name = scan.nextLine();
		System.out.println("Age: ");
		int age = scan.nextInt();
		System.out.println("Address: ");
      scan.nextLine();
		String Address = scan.nextLine();
      Customer.add(name);
		Age.add(age);
		Place.add(Address);
    }
    
    void SEARCH_CUSTOMER(){
		
		int count = 0;
		String search;
		
		System.out.println("Search name: ");
		search = scan.nextLine();
		int i = Customer.indexOf(search);
		if(Customer.contains(search)){
		System.out.println("Customer location at index " + i);
		}else{
			System.out.println("Customer not found");
		}
    }
	
	void UPDATE_CUSTOMER(){
		Boolean loop = true;
		while(loop){
			System.out.println("Press Enter to continue!");
			scan.nextLine();
			System.out.println("Customer name: ");
			String search = scan.nextLine();
			
			int searching = Customer.indexOf(search);
			if(searching >= 0 && Customer.contains(search))
			{
				System.out.println("___INFO OF THE CUSTOMER___");
				System.out.println("NAME: " + Customer.get(searching));
				System.out.println("AGE: " + Age.get(searching));
				System.out.println("ADDRESS: " + Place.get(searching));
				
				System.out.println("___UPDATE MENU___");
				System.out.println("1. AGE ");
				System.out.println("2. ADDRESS");
				System.out.println("3. BACK TO MENU");
				choice = scan.nextInt();
				
				switch(choice){
					case 1: 
					System.out.println("UPDATE AGE: ");
					newage = scan.nextInt();
					Age.set(searching, newage);
					scan.nextLine();
					break;
					case 2: 
					System.out.println("UPDATE ADDRESS: ");
					newplace = scan.nextLine();
					Place.set(searching, newplace);
					scan.nextLine();
					break;
					case 3:
					loop =  false;
					break;
					default:
				}
			}else{
				
					System.out.println("CUSTOMER NOT FOUND!");
			}
		}
	}
	void DISPLAY_CUSTOMER(){
		int i = 1;
		System.out.println("__LIST OF THE CUSTOMERS__");
      
		for(String custom : Customer){
			System.out.println(i +  ". " + custom);
			++i;
		}
	}
   
   
	void REMOVE_CUSTOMER(){
		Boolean loop = true;
		while(loop){
			String Customer_Remove;
			System.out.println("Enter the Customer that you want to remove: ");
			Customer_Remove = scan.nextLine();
			
			int i = Customer.indexOf(Customer_Remove);
			if(Customer.contains(Customer_Remove)){
				Customer.remove(i);
				System.out.println("Customer has benn removed!");
				loop = false;
				
			}else{
					System.out.println("Customer cannot found!");
			}
		}
	}
}

