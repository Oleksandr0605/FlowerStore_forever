package ua.edu.ucu.apps.spring.filters;

import ua.edu.ucu.apps.spring.flowers.Item;

public interface Filter {
    boolean match(Item item);
}
