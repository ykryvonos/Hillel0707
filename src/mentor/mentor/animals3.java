package mentor.mentor;

public class animals3 {
    public static void main(String[] args) {

        int shipCount = 4;
        int shipLeg = 4;
        int duckLeg = 2;

        for (int i = 1; i < 5; i++) {
            String duckOne = "гуска";
            String shipOne = "вівця";

            if (i > 1) {
                duckOne = "гуски";
            }
            if (shipCount > 1) {
                shipOne = "вівці";
            }
            System.out.println("В хатинці маємо " + i + " " + duckOne + " " + shipCount + " " + shipOne + ". Кількість ніг " + " = " + (duckLeg * i + shipLeg * shipCount));
            shipCount--;
        }
    }
}
