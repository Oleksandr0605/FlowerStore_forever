package ua.edu.ucu.apps.spring.decorators;

import ua.edu.ucu.apps.spring.flowers.Item;
import lombok.Getter;
import lombok.Setter;

public class PaperDecorator extends AbstractDecorator {
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
        int addind = 13;
        return item.getPrice() + addind;
    }
}