import java.awt.Image;
import java.awt.Graphics;

public class Coin {

    private enum side {HEADS, TAILS}
    private Image head, tail;
    public side displayed;

    public Coin(Image t, Image h){
        tail = t;
        head = h;
        displayed = side.HEADS;
    }

    public void flip(){
        if(displayed==side.HEADS){
            displayed = side.TAILS;
        }else{
            displayed = side.HEADS;
        }
    } 
    public void draw(Graphics g, int x, int y){
        if(displayed == side.TAILS){
            g.drawImage(tail, x-(tail.getWidth(null)/2), y-(tail.getHeight(null)/2), null);
        }else{
            g.drawImage(head, x-(head.getWidth(null)/2), y-(head.getHeight(null)/2), null);
        }
    }
}
