package com.driver;

public class Pizza {

    private int totalPrice;
    private Boolean isVeg;
    private String bill;
    public int cheesePrice;
    public int toppingPrice;
    public int paperBagPrice;
    public boolean isCheeseAdded;
    public boolean isToppingsAdded;
    public boolean ispaperBagAdded;
public boolean isBillAdded;
    public int basePrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
      basePrice=300;
        toppingPrice=70;
        }
        else{
            basePrice=400;
            toppingPrice=120;
        }
        cheesePrice=80;
        paperBagPrice=20;
        totalPrice=basePrice;
        bill=bill+"Base Price Of The Pizza: "+basePrice+"\n";
    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){ //cheese is not added then only enter this if statement
            isCheeseAdded=true //mark true;
totalPrice=toppingPrice+cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            isToppingsAdded=true;
            totalPrice=totalPrice+toppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(ispaperBagAdded==false){
            totalPrice=totalPrice+paperBagPrice;
            ispaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillAdded==false){ //bill added only once....so
            isBillAdded=true;
            bill=bill+"Extra Cheese Added: "+cheesePrice+"\n";

            bill=bill+"Extra Toppings Added: "+toppingPrice+"\n";

            bill=bill+"Paperbag Added: "+paperBagPrice+"\n";

            bill=bill+"Total Price: "+totalPrice+"\n";
        }
        return this.bill;
    }
}
