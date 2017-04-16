package card_game;
import card_game.*;

public class Player {

  private String name;
  private Card[] hand = new Card[2];
  private Card[] card = new Card[1];

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setHand(Card card1, Card card2){
    this.hand[0] = card1;
    this.hand[1] = card2;
  }

  public void setCard(Card card1){
    this.card[0] = card1;
  }

  public Card[] getHand(){
    return this.hand;
  }

  public Card[] getCard(){
    return this.card;
  }

  public String printHand(){
    return this.hand[0].toString() + ", " + this.hand[1].toString();
  }

  public String printCard(){
    return this.card[0].toString();
  }

}