package ua.edu.ucu.apps.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.spring.flowers.Flower;
import ua.edu.ucu.apps.spring.decorators.AbstractDecorator;
import ua.edu.ucu.apps.spring.decorators.RibbonDecorator;
import ua.edu.ucu.apps.spring.decorators.PaperDecorator;
import ua.edu.ucu.apps.spring.decorators.BasketDecorator;

import org.junit.jupiter.api.Assertions;

public class DecoratorsTests {
    private Flower flower;
    private AbstractDecorator ribbonDecorator;
    private AbstractDecorator paperDecorator;
    private AbstractDecorator basketDecorator;

    private static final int RIBBON_COST = 40;
    private static final int PAPER_COST = 13;
    private static final int BASKET_COST = 4;

    @BeforeEach
    public void setUp() {
        flower = new Flower();
        ribbonDecorator = new RibbonDecorator(flower);
        paperDecorator = new PaperDecorator(flower);
        basketDecorator = new BasketDecorator(flower);
    }

    @Test
    public void testRibbonDecorator() {
        Assertions.assertEquals(ribbonDecorator.getPrice(), flower.getPrice() + RIBBON_COST);
    }

    @Test
    public void testPaperDecorator() {
        Assertions.assertEquals(paperDecorator.getPrice(), flower.getPrice() + PAPER_COST);
    }

    @Test
    public void testBasketDecorator() {
        Assertions.assertEquals(basketDecorator.getPrice(), flower.getPrice() + BASKET_COST);
    }
}