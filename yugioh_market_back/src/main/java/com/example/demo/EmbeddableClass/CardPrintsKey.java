package com.example.demo.EmbeddableClass;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CardPrintsKey implements Serializable {
    //Attributes
    @Column(name = "card_id")
    Long cardId;

    @Column(name = "cardset_id")
    Long cardSetId;

    public CardPrintsKey(){}

    //Constructors

    public CardPrintsKey(Long cardId, Long cardSetId) {
        this.cardId = cardId;
        this.cardSetId = cardSetId;
    }

    //Getters and Setters

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getCardSetId() {
        return cardSetId;
    }

    public void setCardSetId(Long cardSetId) {
        this.cardSetId = cardSetId;
    }

    //Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardPrintsKey that = (CardPrintsKey) o;
        return Objects.equals(cardId, that.cardId) && Objects.equals(cardSetId, that.cardSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, cardSetId);
    }
}
