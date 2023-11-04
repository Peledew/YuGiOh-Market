package com.example.demo.EmbeddableClass;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SellerBinderKey implements Serializable {
    @Column(name = "card_id")
    Long cardId;

    @Column(name = "seller_id")
    Long sellerId;

    public SellerBinderKey(){}

    public SellerBinderKey(Long cardId, Long sellerId) {
        this.cardId = cardId;
        this.sellerId = sellerId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    //Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerBinderKey that = (SellerBinderKey) o;
        return Objects.equals(cardId, that.cardId) && Objects.equals(sellerId, that.sellerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, sellerId);
    }
}
