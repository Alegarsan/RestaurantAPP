package org.ulpgc.is1.control;

import static java.util.Arrays.fill;

public class OrderManager {
    public static void main(String [] args) {
        OrderManager orderManager = new OrderManager();
        fill(orderManager);
        System.out.println("Add Customer: " + orderManager.addCustomer());
        System.out.println("Add Restaurant: " + orderManager.addRestaurant());
        System.out.println("Add Dish: " + orderManager.addDish());
        System.out.println("Customer: " + orderManager.getCustomer(String.valueOf(0)));
        System.out.println("Restaurant: " + orderManager.getRestaurant(0));
        System.out.println("Dish: " + orderManager.getDish(0));

    }

    private static void fill(OrderManager orderManager) {
    }

    private int getDish(int i) {
        return i;
    }

    private int getRestaurant(int i) {
        return i;
    }

    private String getCustomer(String i) {
        return i;
    }

    private String addDish() {
        return null;
    }

    private String addRestaurant() {
        return null;
    }

    private String addCustomer() {
        return null;
    }
}

