/*

Jack Luft
This program takes orders for a coffee shop and displays the order and cost after the order has been taken
No help was received or given on this program

*/
import java.util.Scanner;
public class CoffeeShop{
  public static void main(String[] args){
    //declare and initialize all variables
    Scanner input = new Scanner(System.in);
    double total = 0.0;
    int size = 0;
    boolean temp = false;
    boolean latte = false;
    boolean iced = false;
    boolean esp = false;
    boolean shot = false;
    String flavor = " ";
    boolean donut = false;
    int number = 0;
    double cost = 0.0;
    
    //Welcome customer to Java Da Hut and ask his/her name 
    System.out.println("Welcome to Java Da Hut!!");
    System.out.print("Enter the customer's name --> ");
    String name = input.next();
    
    //Allow customer to choose between hot and cold coffee
    System.out.print("Does " + name + " want hot or cold coffee (answer true for hot) --> ");
    temp = input.nextBoolean();
    
    //if customer chooses hot coffee, allow him/her to choose between latte or brewed coffee
    if(temp){
    	    System.out.println("What type of hot drink would " + name + " like? (answer true for latte or false ");
    	    System.out.print("for brewed coffee) --> ");
    	    latte = input.nextBoolean();
    	    
            //once the type of coffee is chosen, allow customer to choose between 8 oz, 12 oz, or 16 oz cup sizes
            System.out.print("What size would " + name + " like? (answer 8, 12, or 16) --> ");
            size = input.nextInt();
            	    
            	    //once size is chosen, calculate cost based on coffee type and cup size
            	    if(latte&&(size==8))
            	    	   total = 2.95;
            	    else if(latte&&(size==12))
            	    	   total = 3.40;
            	    else if(latte&&(size==16))
            	    	   total = 4.05;
            	    else if(!latte&&(size==8))
            	    	   total = 1.65;
            	    else if(!latte&&(size==12))
            	    	   total = 2.10;
            	    else if(!latte&&(size==16))
            	    	   total = 2.75;
            	    //if customer selects a size that is not an option, allow him/her to again choose between 8 oz, 12 oz, or 16 oz cup sizes
            	    else{
            	   	   System.out.print("Incorrect size, please choose 8, 12, or 16 --> ");
                           size = input.nextInt();
            	    
            	           //once size is chosen, calculate cost based on coffee type and cup size
            	           if(latte&&(size==8))
            	    	          total = 2.95;
            	           else if(latte&&(size==12))
            	    	          total = 3.40;
            	           else if(latte&&(size==16))
            	    	          total = 4.05;
            	           else if(!latte&&(size==8))
            	    	          total = 1.65;
            	           else if(!latte&&(size==12))
            	    	          total = 2.10;
            	           else if(!latte&&(size==16))
            	    	          total = 2.75;
            	    	  
            	    	   //if customer again selects a size that is not an option, give him/her the 16 oz cup
            	    	   else{
            	    	   	  System.out.println("Sorry, we'll make a 16 oz drink");
            	    	   	  size = 16;
            	    	   	  if(latte)
            	    	   	  	  total = 4.05;
            	    	   	  else
            	    	   	  	  total = 2.75;
            	    	   }
            	    }
            	    
            	    //if the customer got a latte, ask him/her if he wants an extra shot of espresso
            	    if(latte){
            	    	    System.out.println("Would " + name + " like to add an extra shot of espresso?");
            	    	    System.out.print("(answer true for yes or false for no) --> ");
            	    	    esp = input.nextBoolean();
            	    	    
            	    	    //if he/she does, add the cost onto the total
            	    	    if(esp)
            	    	    	    total = total + 1.25;
            	    }
    }
             
    //if customer chooses cold coffee, allow him/her to choose between iced or frozen coffee
    else if(!temp){
   	    System.out.println("What type of cold drink would " + name + " like? (answer true for iced coffee or false");
            System.out.print("for frozen coffee) --> ");
    	    iced = input.nextBoolean();
    	    
            //once the type of coffee is chosen, allow customer to choose between 12 oz, 18 oz, or 24 oz cup sizes
            System.out.print("What size would " + name + " like? (answer 12, 18, or 24) --> ");
            size = input.nextInt();
            	    
            	    //once size is chosen, calculate cost based on coffee type and cup size
            	    if(iced&&(size==12))
            	    	   total = 2.10;
            	    else if(iced&&(size==18))
            	    	   total = 2.75;
            	    else if(iced&&(size==24))
            	    	   total = 3.55;
            	    else if(!iced&&(size==12))
            	    	   total = 3.25;
            	    else if(!iced&&(size==18))
            	    	   total = 3.90;
            	    else if(!iced&&(size==24))
            	    	   total = 4.70;
            	    //if customer selects a size that is not an option, allow him/her to again choose between 12 oz, 18 oz, or 24 oz cup sizes
            	    else{
            	   	   System.out.print("Incorrect size, please choose 12, 18, or 24 --> ");
                           size = input.nextInt();
            	    
            	           //once size is chosen, calculate cost based on coffee type and cup size
            	           if(iced&&(size==12))
            	    	          total = 2.10;
            	           else if(iced&&(size==18))
            	    	          total = 2.75;
            	           else if(iced&&(size==24))
            	    	          total = 3.55;
            	           else if(!iced&&(size==12))
            	    	          total = 3.25;
            	           else if(!iced&&(size==18))
            	    	          total = 3.90;
            	           else if(!iced&&(size==24))
            	    	          total = 4.70;
            	    	  
            	    	   //if customer again selects a size that is not an option, give him/her the 24 oz cup
            	    	   else{
            	    	   	  System.out.println("Sorry, we'll make a 24 oz drink");
            	    	   	  size = 24;
            	    	   	  if(iced)
            	    	   	  	  total = 3.55;
            	    	   	  else
            	    	   	  	  total = 4.70;
            	    	   }
            	    }
            	    
    }
        
    //ask customer if he/she wants to add a syrup to his/her coffee
    System.out.println("Would " + name + " like a shot of flavoring? (answer true for yes");
    System.out.print("or false for no) --> ");
    shot = input.nextBoolean();
    //if he/she does want a syrup, ask what flavor and add the cost of a syrup to the total
    if(shot){
    	    total += 0.50;
    	    System.out.print("What flavor would " + name + " like to add? --> ");
    	    flavor = input.next();
    }
    	    
    //ask customer if he wants to buy any donuts with his/her coffee
    System.out.println("Would " + name + " like to order any donuts? (answer true for yes");
    System.out.print("or false for no) --> ");
    donut = input.nextBoolean();
    
    //if he/she does, ask how many donuts he/she wants to buy
    if(donut){
    	    System.out.print("How many donuts would " + name + " like? --> ");
    	    number = input.nextInt();
    	    
    	    //if the number is not a positive integer, ask him/her again how many donuts he/she wants
    	    if(number < 1){
    	    	    System.out.print("Please re-enter, you must order at least 1 donut --> ");
    	    	    number = input.nextInt();
    	    }
    	    //add the cost for each donut to the total
            cost = number * 0.9;
            total += cost;
    }
    
    //display the total cost for all items purchased
    System.out.println();
    System.out.print("The total price for " + name + "'s " + size + " oz ");
    if(shot)
    	    System.out.print(flavor + " ");
    if(temp){
    	    if(latte){
    	    	    System.out.print("latte ");
    	    	    if(esp)
    	    	    	    System.out.print("and an extra shot of expresso ");
    	    }
    	    else{
    	    	    System.out.print("brewed coffee ");
    	    }
    }
    else if(!temp){
    	    if(iced){
    	    	    System.out.print("iced coffee ");
    	    }
    	    else{
    	    	    System.out.print("frozen coffee ");
    	    }
    }
    if(donut){
    	    if(number == 1){
    	    	    System.out.print("with 1 donut ");
    	    }
    	    else{
    	    	    System.out.print("with " + number + " donuts ");
    	    }
    }
    System.out.println("is $" + total);
  }
}

