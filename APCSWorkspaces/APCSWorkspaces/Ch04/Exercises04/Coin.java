import java.awt.Image;
import java.awt.Graphics;

public class Coin {
    private Image head, tail;
    public int side;

    public Coin(Image t, Image h){
        tail = t;
        head = h;
        side = 1;
    }

    public void flip(){
        side *= -1;
    } 
    public void draw(Graphics g, int x, int y){
        if(side == -1){
            g.drawImage(tail, x-(tail.getWidth(null)/2), y-(tail.getHeight(null)/2), null);
        }else{
            g.drawImage(head, x-(head.getWidth(null)/2), y-(head.getHeight(null)/2), null);
        }
    }
}
