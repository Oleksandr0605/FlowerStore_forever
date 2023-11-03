package ua.edu.ucu.apps.spring.decorators;

import ua.edu.ucu.apps.spring.flowers.Item;
import lombok.Getter;
import lombok.Setter;

public class BasketDecorator extends AbstractDecorator {
    private Item item;
    @Getter @Setter 
    private String description;

    public BasketDecorator(Item get_item) {
        item = get_item;
        description = "This is a basket";
    }

    public BasketDecorator(Item get_item, String get_description) {
        item = get_item;
        description = get_description;
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}