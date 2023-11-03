package ua.edu.ucu.apps.spring.decorators;

import ua.edu.ucu.apps.spring.flowers.Item;
import lombok.Getter;
import lombok.Setter;

public class PaperDecorator extends AbstractDecorator {
    private static final int ADDITION_CONSTANT = 13;
    private Item item;
    @Getter @Setter 
    private String description;

    public PaperDecorator(Item getItem) {
        item = getItem;
        description = "This is a basket";
    }

    public PaperDecorator(Item getItem, String getDescription) {
        item = getItem;
        description = getDescription;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + ADDITION_CONSTANT;
    }
}