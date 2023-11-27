package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.flowers.Item;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    public double price() {
        return super.price() + 13;
    }

    public String getDescription() {
        return super.getDescription() + " in paper";
    }
}