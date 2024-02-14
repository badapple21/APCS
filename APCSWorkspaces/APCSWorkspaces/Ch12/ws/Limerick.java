public class Limerick extends Poem {
    public int numLines() {
        return 5;
    }

    public int getSyllables(int k) {
        switch (k) {
            case 1:
            case 2:
            case 5:
                return 9;
            case 3:
            case 4:
                return 6;
            default:
                return 0;
        }
    }
}
