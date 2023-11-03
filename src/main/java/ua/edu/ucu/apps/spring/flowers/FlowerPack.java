package ua.edu.ucu.apps.spring.flowers;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int new_quantity) {
        if (new_quantity < 0) {
            quantity = 0;
        }
        else {
            quantity = new_quantity;
        }
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

}
