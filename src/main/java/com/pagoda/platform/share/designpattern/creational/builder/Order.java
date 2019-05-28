package com.pagoda.platform.share.designpattern.creational.builder;

import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xizhou
 * @date 2019/5/28 20:58
 */
@Setter
public class Order {
    private List<Food> foods;
    private List<Drink> drinks;

    public static OrderBuilder builder(){
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        private List<Food> foods = new ArrayList<>();
        private List<Drink> drinks = new ArrayList<>();

        public OrderBuilder food(Food ... food){
            foods.addAll(Arrays.asList(food));
            return this;
        }
        public OrderBuilder drink(Drink... drink){
            drinks.addAll(Arrays.asList(drink));
            return this;
        }
        public Order build(){
            Order order = new Order();
            order.setFoods(foods);
            order.setDrinks(drinks);
            return order;
        }
    }
}
