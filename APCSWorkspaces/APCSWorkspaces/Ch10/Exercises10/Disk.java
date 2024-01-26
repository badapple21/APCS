public class Disk {
    private Point center;
    private Double radius;
    public Disk(Disk other){
        this.center = new Point(other.center);
        this.radius = other.radius;
    }
}
