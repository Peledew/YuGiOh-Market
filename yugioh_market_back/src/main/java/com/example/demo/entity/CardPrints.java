package com.example.demo.entity;

import com.example.demo.EmbeddableClass.CardPrintsKey;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class CardPrints implements Serializable {
    //Attributes
    @EmbeddedId
    CardPrintsKey id;

    @ManyToOne
    @MapsId("cardSetId")
    @JoinColumn(name = "card_set_id")
    CardSet cardSet;

    @ManyToOne
    @MapsId("cardId")
    @JoinColumn(name = "card_id")
    Card card;

    @Column
    private String mark;

    //Constructors
    public CardPrints(){}

    public CardPrints(CardPrintsKey id, CardSet cardSet, Card card, String mark) {
        this.id = id;
        this.cardSet = cardSet;
        this.card = card;
        this.mark = mark;
    }

    public CardPrintsKey getId() {
        return id;
    }

    public void setId(CardPrintsKey id) {
        this.id = id;
    }

    public CardSet getCardSet() {
        return cardSet;
    }

    public void setCardSet(CardSet cardSet) {
        this.cardSet = cardSet;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
