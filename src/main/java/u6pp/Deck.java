package u6pp;

public class Deck
{
    private Card[] deck;
    private int cardleft = 51;


  public Deck(){
        deck = new Card[52];
        int index = 0;
        for(String Suit : Card.SUITS)
        {
            for(String Value : Card.VALUES)
            {   
              deck[index] = new Card(Suit, Value);
              index+1; 
              }
            
        }
        index-1;  
    }


  public int numLeft()
    { return this.cardleft + 1;
  }  
  public Card deal()
    {
  Card temp = deck[cardleft];
        cardleft--;
        return temp;  
    }

        public void shuffle()
{
for(int i = 0; i < deck.length; i++) {
int index = (int)(Math.random() * 52);
  Card currentCard = deck[index];
  deck[index] = deck[i];
 deck[i] = currentCard;
cardleft = 51; }
      }  

    
    }