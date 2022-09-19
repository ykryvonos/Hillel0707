package mentor.mentor2;

public enum Suit {
    DIAMONDS(1),
    CLUBS(2),
    HEARTS(3),
    SPADES(4);

    private int countCard;

    Suit(int countCard) {
        this.countCard = countCard;
    }

    public int getCountCard() {
        return countCard;
    }
}
