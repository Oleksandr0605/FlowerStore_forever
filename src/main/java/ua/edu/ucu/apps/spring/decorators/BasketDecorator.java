package ua.edu.ucu.apps.spring.decorators;

import ua.edu.ucu.apps.spring.flowers.Item;
import lombok.Getter;
import lombok.Setter;

public class BasketDecorator extends AbstractDecorator {
    private static final int ADDITION_CONSTANT = 4;
    private Item item;
    @Getter @Setter 
    private String description;

    public BasketDecorator(Item getItem) {
        item = getItem;
        description = "This is a basket";
    }

    public BasketDecorator(Item getItem, String getDescription) {
        item = getItem;
        description = getDescription;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + ADDITION_CONSTANT;
    }
}