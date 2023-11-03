package ua.edu.ucu.apps.spring.decorators;

import ua.edu.ucu.apps.spring.flowers.Item;
import lombok.Getter;
import lombok.Setter;

public class PaperDecorator extends AbstractDecorator {
    private Item item;
    @Getter @Setter 
    private String description;

    public PaperDecorator(Item get_item) {
        item = get_item;
        description = "This is a basket";
    }

    public PaperDecorator(Item getItem, String getDescription) {
        item = getItem;
        description = getDescription;
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}