package Business.FoodAndShelterDistributor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rk
 */
public class Food {
    private String foodType;
    private String foodId;
    private int quantity;
    private double price;
    private boolean flag;
    private double totalPrice;
    private static int fCount;

    public Food() {
        foodId= "FOOD"+" "+(++fCount);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public static int getfCount() {
        return fCount;
    }

    public static void setfCount(int fCount) {
        Food.fCount = fCount;
    }
    
    @Override
    public String toString(){
        return this.foodId;
    }
    
    
    
}
