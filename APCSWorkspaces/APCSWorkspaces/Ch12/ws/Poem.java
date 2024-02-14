abstract class Poem {
    public abstract int numLines();

    public abstract int getSyllables(int k);

    public void printRhythm() {
        for (int i = 1; i <= numLines(); i++) {
            int syllables = getSyllables(i);
            for (int s = 0; s < syllables; s++) {
                System.out.print("ta-");
            }
            System.out.println(); // Move to the next line
        }
    }

}