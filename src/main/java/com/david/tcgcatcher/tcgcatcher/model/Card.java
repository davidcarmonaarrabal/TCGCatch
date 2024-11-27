package com.david.tcgcatcher.tcgcatcher.model;

import jakarta.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private String era;
    private String cardSet;
    private int number;
    private double price;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getEra() { return era; }
    public void setEra(String era) { this.era = era; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCardSet() { return cardSet; }
    public void setCardSet(String cardSet) { this.cardSet = cardSet; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
}
