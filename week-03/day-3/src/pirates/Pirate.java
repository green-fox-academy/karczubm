package pirates;

public class Pirate {
    int rumDrinked=0;
    boolean isAlive=true;
    public void drinkSomeRum(){
        if (isAlive) {
            ++rumDrinked;
        } else {
            System.out.println("Deads dont drink anymore!");
        }
    }
    public void die(){
        isAlive=false;
    }
    public void brawl(Pirate pirate){
        if (this.isAlive && pirate.isAlive){
            int random=(int)Math.random();
            if (random==0){
                this.die();
            }else if (random==1){
                pirate.die();
            }
        }else{
            System.out.println("Deads cannot figth!");
        }
    }
}
