/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buisness.ServiceProvider.Food;

import Buisness.FoodAndShelterDistributor.Food;
import java.util.ArrayList;

/**
 *
 * @author rk
 */
public class FoodInventory extends Food {
    
    private ArrayList<Food> foodInventory;

    public FoodInventory() {
        foodInventory = new ArrayList<>();
    }

    public ArrayList<Food> getFoodInventory() {
        return foodInventory;
    }

    public void setFoodInventory(ArrayList<Food> foodInventory) {
        this.foodInventory = foodInventory;
    }
    
    public Food addFood() {
        Food food = new Food();
        foodInventory.add(food);
        return food;
    }
    
    //Removing a FoodType from the Directory
    public void removeFood(Food food) {
        foodInventory.remove(food);
    }
    
}
