/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.enumproject;
import java.util.*;

/**
 *
 * @author user01
 */
public class Enumain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EnumMonth Christmas = EnumMonth.DECEMBER;
       EnumMonth Now = EnumMonth.SEPTEMBER;
       EnumMonth[] MONTHS = EnumMonth.values();
       ArrayList<String> HD = new ArrayList<>();
       HD.add("NO HOLIDAY");
       HD.add(" 23 Tuesday Special Working Day");
       HD.add(" 10 Saturday Lunar New Year's Day");
       HD.add(" 29 Friday Good Friday");
       HD.add(" 9 Tuesday Araw ng Kagitingan");
       HD.add(" 1 Wednesday Labor Day");
       HD.add(" 12 Wednesday Independence Day");
       HD.add(" 7 Sunday Amun Jadid");
       HD.add(" 26 Monday National Heroes Day");
       HD.add(" 8 Sunday Feast of the Nativity of Mary");
       HD.add(" 14 Monday Columbus Day");
       HD.add(" 2 All Souls’ Day & 30 Saturday Bonifacio Day");
       HD.add(" 25 Wednesday Christmas & 30 Monday Rizal Day");
       
       
       
       Scanner scan = new Scanner(System.in);
       System.out.println("THE LIST OF MONTHS THAT HAS HOLIDAYS!");
       for(EnumMonth i : MONTHS){
           System.out.print(i + ", ");
       }
       
       System.out.println(" ");
       System.out.println("__SPECIAL HOLIDAY SYSTEM__ ");
       System.out.println((EnumMonth.JANUARY.ordinal()+ 1) + ". JANUARY");
       System.out.println((EnumMonth.FEBUARY.ordinal()+ 1) +". FEBUARY");
       System.out.println((EnumMonth.MARCH.ordinal()+ 1) +". MARCH");
       System.out.println((EnumMonth.APRIL.ordinal()+ 1) +". APRIL");
       System.out.println((EnumMonth.MAY.ordinal()+ 1) +". MAY");
       System.out.println((EnumMonth.JUNE.ordinal()+ 1) +". JUNE");
       System.out.println((EnumMonth.JULY.ordinal()+ 1) +". JULY");
       System.out.println((EnumMonth.AUGUST.ordinal()+ 1) +". AUGUST");
       System.out.println((EnumMonth.SEPTEMBER.ordinal()+ 1) +". SEPTEMBER");
       System.out.println((EnumMonth.OCTOBER.ordinal()+ 1) +". OCTOBER");
       System.out.println((EnumMonth.NOVEMBER.ordinal()+ 1) +". NOVEMBER");
       System.out.println((EnumMonth.DECEMBER.ordinal()+ 1) +". DECEMBER");
       System.out.println("Choose (1-12): ");
       int month = scan.nextInt();
       
       switch(month){
           case 1:
               System.out.println(EnumMonth.JANUARY.toString()+ HD.get(month));
               break;
           case 2:
               System.out.println(EnumMonth.FEBUARY.toString()+ HD.get(month));
               break;
           case 3:
               System.out.println(EnumMonth.MARCH.toString()+ HD.get(month));
               break;
           case 4:
               System.out.println(EnumMonth.APRIL.toString()+ HD.get(month));
               break;
           case 5:
               System.out.println(EnumMonth.MAY.toString()+ HD.get(month));
               break;
           case 6:
               System.out.println(EnumMonth.JUNE.toString()+ HD.get(month));
               break;
           case 7:
               System.out.println(EnumMonth.JULY.toString()+ HD.get(month));
               break;
           case 8:
               System.out.println(EnumMonth.AUGUST.toString()+ HD.get(month));
               break;
           case 9:
               System.out.println(EnumMonth.SEPTEMBER.toString()+ HD.get(month));
               break;
           case 10:
               System.out.println(EnumMonth.OCTOBER.toString()+ HD.get(month));
               break;
           case 11:
               System.out.println(EnumMonth.NOVEMBER.toString()+ HD.get(month));
               break;
           case 12:
               System.out.println(EnumMonth.DECEMBER.toString()+ HD.get(month));
               break;
           default:
               
       }
       
       scan.nextLine();
       System.out.println(" ");
       System.out.println("___CHRISTMAS INFO___");
        if(EnumMonth.DECEMBER.equals(EnumMonth.NOVEMBER))
        {
            System.out.println("Both same month with different number Holiday");
        }else if(!EnumMonth.DECEMBER.equals(EnumMonth.NOVEMBER)){
            System.out.println("Not same month but same number Holiday");
            System.out.println(HD.get(11));
            System.out.println(HD.get(12));
        }
        
        
        
        System.out.println("Month remaining before Christmas: "+Christmas.compareTo(Now));
        Boolean loop = true;
        while(loop){
        System.out.println(" Q&A : What Month Christmas will begin? ");
        String QnA = scan.nextLine();
        EnumMonth Answer = EnumMonth.valueOf("DECEMBER");
        
        if(QnA.equals("DECEMBER"))
        {   
         System.out.println(Answer +" YOU GOT THE CORRECT ANSWER!");   
         loop = false;
        }else{
         System.out.println("BRUH YOU DIDN'T KNOW IT? (READ THE REMAINING MONTH AGAIN!)");
         
        }
        }
       
       
    }
    
}


//I used enum to be constant the list of Months then; 
//I used toString():System.out.println(EnumMonth.JANUARY.toString()+ HD.get(month)); to be printed the enum into Strings
//I used values(): EnumMonth[] MONTHS = EnumMonth.values(); so I can gather all enum or get the list of enum then print them into a string
//I used equals(): if(EnumMonth.DECEMBER.equals(EnumMonth.NOVEMBER)) to compare if it equals to the compared value.
//I used ordinal(): System.out.println((EnumMonth.JANUARY.ordinal()+ 1) + ". JANUARY"); to print the index/location of the enum.
//I used valuesOf(): EnumMonth Answer = EnumMonth.valueOf("DECEMBER"); to get the string value into the enum list.
//I used compareTo():  System.out.println("Month remaining before Christmas: "+Christmas.compareTo(Now)); to compare how long the compared value
// Why enum is advantage? 
// Better readability in code also ensures type safety to avoid errors; if code isn't readable, you might become confused, leading to many errors and difficulties in maintenance.
