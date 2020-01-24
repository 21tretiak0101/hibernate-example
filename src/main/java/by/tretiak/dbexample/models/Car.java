package by.tretiak.dbexample.models;

import javax.persistence.*;

@Entity
@Table(name = "orm_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "model")
    private String model;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    public Car() {
    }

    public Car(String model, User owner) {
        this.model = model;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", owner=" + owner +
                '}';
    }
}
