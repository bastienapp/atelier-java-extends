import java.util.ArrayList;
import java.util.List;

class Arena {

    public static void main(String[] args) {
        
        // create two monsters
        Monster tornado = new AirMonster("Tornado", 2);
        Monster typhon = new WaterMonster("Typhon", 8);

        // monsters attack each other
        while (tornado.getLife() > 0 && typhon.getLife() > 0) {
            tornado.attack(typhon);
            if (typhon.getLife() > 0) {
                typhon.attack(tornado);
            }
        }
    }
}