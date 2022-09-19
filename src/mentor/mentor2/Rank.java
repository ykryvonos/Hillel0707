package mentor.mentor2;

public enum Rank {

    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Valet"),
    QUEEN("Queen"),
    KING("King"),
    ACE("Ace");

    private String translation;

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "translation = " + translation;
    }

    Rank(String translation) {
        this.translation = translation;
    }
}
