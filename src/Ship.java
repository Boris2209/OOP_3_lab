/*Не хватает данных о положении корабля.
* Помоимо координат (буду счиать их координатами головы) не хватает направление корабля
* (горизонтальное или веритикальное). Создаю Enum с этими данными и при иницыализации
* нового корабля добаляю еще одно поле*/

public class Ship {

    private int length, x, y, wounds;
    private Placing placing;

    Ship(int length, int x, int y, Placing placing){
        this.length=length;
        this.x=x;
        this.y=y;
        this.wounds = 0;
        this.placing = placing;
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

    public Placing getPlacing() {
        return placing;
    }

    public void makeWound(){
        this.wounds++;
    }

    public boolean isDestroyed(){
        return this.wounds==this.length;
    }
}
