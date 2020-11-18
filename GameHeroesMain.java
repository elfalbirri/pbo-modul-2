public class GameHeroesMain {
    public static void main(String[] args) {
        Heroes Raiden = new Heroes("Raiden", 10, 20);
        Heroes Subzero = new Heroes("Sub-Zero", 5, 25);
        
        Raiden.kick(Subzero);
        Subzero.kick(Raiden);
        for (int i=0;i<3;i++){
            Subzero.hit(Raiden);
        }
        for (int i=0;i<4;i++){
            Raiden.kick(Subzero);
        }
        System.out.println("Life Point dari objek Raiden adalah : " + Raiden.getLifePoint());
        System.out.println("Life Point dari objek Sub-Zero adalah : " + Subzero.getLifePoint());
    }
}
