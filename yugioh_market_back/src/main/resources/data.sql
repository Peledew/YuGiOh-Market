/*

SELECT * FROM CARD;
SELECT * FROM CARD_SET;
SELECT * FROM CARD_PRINTS;
SELECT * FROM SELLER;
SELECT * FROM SELLER_BINDER;


*/


/*Adding Cards*/
INSERT INTO CARD (name, card_type, atk, def, is_effect, is_fusion, is_normal, is_pendulum, is_synchro, is_tuner, is_xyz, level, link_xyz_rank, attribute, pendulum_effect, rarity, summoning_condition, type, description)
VALUES('Blue-Eyes White Dragon', 'Monster', 3000, 2500, false, false, true, false, false, false, false, 8, 0, 'LIGHT', null, 'RARE', null, 'Dragon', 'Sibirski plavac');

INSERT INTO CARD (name, card_type, atk, def, is_effect, is_fusion, is_normal, is_pendulum, is_synchro, is_tuner, is_xyz, level, link_xyz_rank, attribute, pendulum_effect, rarity, summoning_condition, type, description)
VALUES('Exodia the Forbidden One', 'Monster', 0, 0, true, false, true, false, false, false, false, 3, 0, 'DARK', null, 'ULTRA_RARE', null, 'Spellcaster', 'If you have "Right Leg of the Forbidden One", "Left Leg of the Forbidden One", "Right Arm of the Forbidden One" and "Left Arm of the Forbidden One" in addition to this card in your hand, you win the Duel.');

INSERT INTO CARD (name, card_type, atk, def, is_effect, is_fusion, is_normal, is_pendulum, is_synchro, is_tuner, is_xyz, level, link_xyz_rank, attribute, pendulum_effect, rarity, summoning_condition, type, description)
VALUES('Dark Magician', 'Monster', 2500, 2000, false, false, true, false, false, false, false, 7, 0, 'DARK', null, 'SUPER_RARE', null, 'Spellcaster', 'The ultimate wizard in terms of attack and defense.');


/*Adding Card Sets*/
INSERT INTO CARD_SET (mark, name, description)
VALUES('MAMA', 'Magnificent Mavens', '1 pack of 70 card sleeves, 4 packs with 5 cards each. The set contains 115 cards.');

INSERT INTO CARD_SET (mark, name, description)
VALUES('DUNE', 'Duelist Nexus', 'There are 5 cards per pack and 30 packs per box. The set contains 81 cards.');

INSERT INTO CARD_SET (mark, name, description)
VALUES('PHHY', 'Photon Hypernova', 'In the TCG, there are 9 cards per pack and 24 packs per box. The set contains 100 cards.');
