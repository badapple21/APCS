public class Scrabble {
    public static int computeScore(String word){
        int scores[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int score = 0;
        word = word.toLowerCase();
        word = word.trim();
        for(int i = 0; i < word.length();i++){
            score += scores[letters.indexOf(word.charAt(i))];
        }

        return score;
    }
    public static void main(String[] args) {
        System.out.println(computeScore("computer"));
    }
}