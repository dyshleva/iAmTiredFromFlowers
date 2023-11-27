package ua.edu.ucu.apps.demo.delivery;

import java.util.List;

import ua.edu.ucu.apps.demo.flowers.Item;

public interface Delivery {
    List<Item> deliver(List<Item> items);
}
