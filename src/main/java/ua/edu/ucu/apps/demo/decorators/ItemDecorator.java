package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.flowers.Item;

public abstract class ItemDecorator extends Item {
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

}
