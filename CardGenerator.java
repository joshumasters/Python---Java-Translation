import java.util.ArrayList;
import java.util.HashMap;

public class CardGenerator {

    int[] numVals = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
    String[] suits = { "Spades", "Diamonds", "Hearts", "Clubs" };

    class Card {
        String value;
        String suit;

        public Card(String value, String suit) {
            this.value = value;
            this.suit = suit;
        }
    }

    public ArrayList<Card> generateCards() {
        ArrayList<Card> cards = new ArrayList<>();

        HashMap<Integer, String> faces = new HashMap<>();
        faces.put(11, "Jack");
        faces.put(12, "Queen");
        faces.put(13, "King");
        faces.put(14, "Ace");

        for (Integer val : numVals) {
            for (String suit : suits) {
                if (faces.containsKey(val)) {
                    cards.add(new Card(faces.get(val), suit));
                } else {
                    cards.add(new Card(val.toString(), suit));
                }
            }
        }

        return cards;
    }

    public static void main(String[] args) {
        CardGenerator cardGen = new CardGenerator();

        for (Card card : cardGen.generateCards()) {
            System.out.println(card.value + " of " + card.suit);
        }

    }
}
