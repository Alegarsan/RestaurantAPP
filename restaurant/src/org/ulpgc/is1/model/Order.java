package org.ulpgc.is1.model;

public class Order {

    private static int NEXT_ID = 0;
    private final int id;

    public static void setNextId(int nextId) {
        NEXT_ID = nextId;
    }

    public static int getNextId() {
        return NEXT_ID;
    }

    public int getId() {
        return id;
    }

    public Order(int id) {
        this.id = id;
    }
}
