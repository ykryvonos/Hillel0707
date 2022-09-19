package mentor.mentor;

public class task5 {
    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }

    /**
     * Написать функцию, которая переводит:
     * - все буквы "А" -> "Т"
     * - все буквы "T" -> "A"
     * - все буквы "C" -> "G"
     * - все буквы "G" -> "C"
     * Вводная строка - это набор букв «A», «T», «C», «G»
     * <p>
     * Пример:
     * "ATTGC" // вернуть "TAACG"
     * "GTAT" // вернуть "CATA"
     */

    public static String makeComplement(String dna) {
        String str = "";

        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                str += "T";
            }
            if (dna.charAt(i) == 'T') {
                str += "A";
            }
            if (dna.charAt(i) == 'C') {
                str += "G";
            }
            if (dna.charAt(i) == 'G') {
                str += "C";
            }
        }
        return str;
    }
}

