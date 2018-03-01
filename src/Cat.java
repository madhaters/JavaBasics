public class Cat extends Animals {
    public Cat(String name, int legs, int price, String bread, int stiffness, int softness) {
        super(name, legs, price, bread, stiffness, softness);
    }

    public void Meow() {
        System.out.print(" \nthe Cat:\nmeow meow meow");
    }
}
