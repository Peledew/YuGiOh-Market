package com.example.demo.entity;

import com.example.demo.EmbeddableClass.SellerBinderKey;
import jakarta.persistence.*;

import java.io.Serializable;

/*This class is used to track which cards seller has.
Because of that I named class this way
* */
@Entity
public class SellerBinder implements Serializable {
    //Attributes
    @EmbeddedId
    SellerBinderKey id;

    @ManyToOne
    @MapsId("sellerId")
    @JoinColumn(name = "seller_id")
    Seller seller;

    @ManyToOne
    @MapsId("cardId")
    @JoinColumn(name = "card_id")
    Card card;
    @Column
    private int cardNumber;

    //Constructors
    public SellerBinder(){}

    public SellerBinder(SellerBinderKey id, Seller seller, Card card, int cardNumber) {
        this.id = id;
        this.seller = seller;
        this.card = card;
        this.cardNumber = cardNumber;
    }

    //Getters and Setters

    public SellerBinderKey getId() {
        return id;
    }

    public void setId(SellerBinderKey id) {
        this.id = id;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
