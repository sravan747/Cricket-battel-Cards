package com.cricketcardbattle.model;

public class PlayerCard {
     private String cardId;
     private CricketPlayer cricketPlayer;

     public PlayerCard(
          String cardId,
          CricketPlayer cricketPlayer
     ){
          this.cardId = cardId;
          this.cricketPlayer = cricketPlayer;
     }

     public String getCardId(){
          return cardId;
     }
     public CricketPlayer getCricketPlayer(){
          return cricketPlayer;
     }

}
