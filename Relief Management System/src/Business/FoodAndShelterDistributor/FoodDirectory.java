/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodAndShelterDistributor;


import java.util.ArrayList;

/**
 *
 * @author rk
 */
public class FoodDirectory {
    private ArrayList<Food> foodList;

    public FoodDirectory() {
        foodList = new ArrayList<>();
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }
    
        public Food addFoodType() {
        Food food = new Food();
        foodList.add(food);
        return food;
    }
    
    //Removing a FoodType from the Directory
    public void removeFoodType(Food food) {
        foodList.remove(food);
    }
}
