public class Ship {

    int length, x, y, wounds;

    Ship(int length, int x, int y){
        this.length=length;
        this.x=x;
        this.y=y;
        this.wounds = 0;
    }

    public int getLength() {
        return length;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}