package ua.edu.ucu.apps.demo.flowers;

import org.springframework.data.jpa.repository.JpaRepository;
// import ua.edu.ucu.apps.demo.flowers.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
