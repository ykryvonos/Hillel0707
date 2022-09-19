package mentor.mentor2;

public class main {
    public static void main(String[] args) {
        Rank rank = Rank.ACE;
        System.out.println(rank.getTranslation());

        Suit suit = Suit.SPADES;
        System.out.println(suit.name());

        System.out.println(Rank.valueOf("SIX"));

        Rank king = Rank.KING;
        System.out.println(king.ordinal());
    }
}
