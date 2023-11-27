package ua.edu.ucu.apps.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.decorators.PaperDecorator;
import ua.edu.ucu.apps.demo.decorators.RibbonDecorator;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.Item;

class Decorators {

    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        Item tree1 = new PaperDecorator(new Flower());
        assertEquals(tree1.getDescription(),
                "Flower in paper");

        Item tree2 = new RibbonDecorator(new PaperDecorator(new PaperDecorator(new Flower())));
        assertEquals(tree2.getDescription(),
                "Flower in paper in paper in ribbon");
    }

}
