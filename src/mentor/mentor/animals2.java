package mentor.mentor;

public class animals2 {
    public static void main(String[] args) {

        int ship = 4;

        for (int i = 1; i < 5; i++) {
            String duckOne = "гуска";
            String shipOne = "вівця";

            if (i > 1) {
                duckOne = "гуски";
            }
            if (ship > 1) {
                shipOne = "вівці";
            }
            System.out.println("В хатинці маємо " + i + " " + duckOne + " " + ship-- + " " + shipOne);
        }
    }
}

/*
 б) змінити закінчення в залежності від числа, яке стоїть перед словом гуска и вівця.
	“В хатинці є 1 гуска и 4 вівці”
	“В хатинці є 2 гускі и 3 вівці”
 */

