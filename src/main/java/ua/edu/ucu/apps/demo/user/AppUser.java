package ua.edu.ucu.apps.demo.user;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Getter;

@Getter
public class AppUser {
    @Id
    private Integer id;
    private Integer age;

    @Column(unique = true)
    private String email;

    @Transient
    private LocalDate dateOfBirth;

    // Adding a getter for age that calculates age based on dateOfBirth
    public Integer getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }
}