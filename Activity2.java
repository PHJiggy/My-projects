/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2;
import java.util.*;
/**
 *
 * @author WW102
 */
public class Activity2 {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        Costumer cs =  new Costumer();
        Boolean loop = true;
        while(loop)
        {
        int choice;
        System.out.println("_____MENU_______");
        System.out.println("1. ADD CUSTOMER");
        System.out.println("2. SEARCH CUSTOMER");
        System.out.println("3. UPDATE CUSTOMER INFO");
        System.out.println("4. DELETE CUSTOMER");
        System.out.println("5. DISPLAY ALL CUSTOMER");
        System.out.println("6. EXIT");
        System.out.println("______END_______");
        choice = scan.nextInt();
        
        // Array[] = { kyle, hey, upi,}
        
        switch(choice){
            case 1:
                cs.ADD_CUSTOMER();
                break;
            case 2: 
               cs.SEARCH_CUSTOMER();
               break;
            case 3:
               cs.UPDATE_CUSTOMER();
               break;
            case 4:
            cs.REMOVE_CUSTOMER();
            break;
            case 5:
            cs.DISPLAY_CUSTOMER();
            break;
            case 6:
            loop = false;
            break;
            
            default:
        }
        }
        
    }
}
