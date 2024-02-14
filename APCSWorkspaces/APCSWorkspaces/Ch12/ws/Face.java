abstract class Face {

    public abstract void drawLips(Graphics g);

    public void draw(Graphics g) {
        g.drawOval(20, 20, 30, 30);
        drawEyes(g);
        drawLips(g);
    }

    public void drawEyes(Graphics g) {
        g.fillOval(28, 28, 5, 5);
        g.fillOval(38, 28, 5, 5);
    }

}
