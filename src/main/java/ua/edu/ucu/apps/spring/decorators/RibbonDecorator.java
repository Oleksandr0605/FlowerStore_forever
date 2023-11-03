package ua.edu.ucu.apps.spring.decorators;

import ua.edu.ucu.apps.spring.flowers.Item;
import lombok.Getter;
import lombok.Setter;

public class RibbonDecorator extends AbstractDecorator {
    private Item item;
    @Getter @Setter 
    private String description;

    public RibbonDecorator(Item getItem) {
        item = getItem;
        description = "This is a ribbon";
    }

    public RibbonDecorator(Item getItem, String getDescription) {
        item = getItem;
        description = getDescription;
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }
}