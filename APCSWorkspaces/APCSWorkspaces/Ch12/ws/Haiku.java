public class Haiku extends Poem {
    public int numLines() {
        return 3;
    }

    public int getSyllables(int k) {
        switch (k) {
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 5;
            default:
                return 0;
        }
    }
}
