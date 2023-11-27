package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.flowers.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    public double price() {
        return super.price() + 40;
    }

    public String getDescription() {
        return super.getDescription() + " in ribbon";
    }
}