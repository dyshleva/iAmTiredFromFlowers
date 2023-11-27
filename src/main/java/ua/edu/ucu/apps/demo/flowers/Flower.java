package ua.edu.ucu.apps.demo.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Flower extends Item {

    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Flower";
    }

}
