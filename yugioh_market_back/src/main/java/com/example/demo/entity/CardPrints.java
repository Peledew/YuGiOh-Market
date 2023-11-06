package com.example.demo.entity;

import com.example.demo.EmbeddableClass.CardPrintsKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

}
