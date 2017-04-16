import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

  Player player1;
  Player player2;
  Player player3;
  Card card1;
  Card card2;
  Card card3;

  @Before
  public void before(){
    player1 = new Player("Keith");
    player2 = new Player("Craig");
    player3 = new Player("Bob");
    card1 = new Card(2, Suit.Clubs);
    card2 = new Card(3, Suit.Spades);
    card3 = new Card(9, Suit.Hearts);
    player1.setHand(card1, card2);
    player3.setCard(card3);
  }

  @Test
  public void hasName(){
    assertEquals("Keith", player1.getName());
  }

  @Test
  public void handStartsEmpty(){
    assertNull(player2.getHand()[0]);
  }

  @Test 
  public void canSetHand(){
    assertEquals(card1, player1.getHand()[0]);
  }

  @Test
  public void canSetCard(){
    assertEquals(card3, player3.getCard()[0]);
  }

  @Test
  public void canPrintHand(){
    assertEquals("Two of Clubs, Three of Spades", player1.printHand());
  }

  @Test
  public void canPrintCard(){
    assertEquals("Nine of Hearts", player3.printCard());
  }

}