
public class Main {
    public static void main(String[] args) {
        Animal tortuga=new Animal("Emilia","tortuga golfina",25);
        Animal perro=new Animal("Bruno","Husky",3);
        Animal hamster=new Animal("Dori","manchado",1);
        Animal gato=new Animal("Ahri","Siames",2);
        gato.comer();
        perro.dormir();
        hamster.hibernar();
        tortuga.comer();
    }
}