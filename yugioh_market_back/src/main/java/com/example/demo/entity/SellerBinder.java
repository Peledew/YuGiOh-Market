package com.example.demo.entity;

import com.example.demo.EmbeddableClass.SellerBinderKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/*This class is used to track which cards seller has.
Because of that I named class this way
* */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

}
