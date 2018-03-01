public class FirstSample {
    public static void main(String[] args) {
        Dog aDog = new Dog("Lapra kasari", 4, 40000, "lapra", 4, 0);
        Cat aCat = new Cat("Soon aali billi", 4, 478888, "billi", 0, 2);
        aDog.Barking();
        aCat.Meow();
        System.out.print("\nDog has:" + aDog.getlegs() + "legs");
        System.out.print("\nCat has:" + aCat.getlegs() + "legs");
        System.out.print("\nAnimal is:" + aDog.getName() + "");
        System.out.print("\nAnimal is:" + aCat.getName() + "");
        System.out.print("\nCat Price:" + aCat.getPrice() + "");
        System.out.print("\nDog Price:" + aDog.getPrice() + "");
        System.out.print("\nDog bread is:" + aDog.getBread() + "");
        System.out.print("\nCat bread is:" + aCat.getBread() + "");
        System.out.print("\nDog Stiffness:" + aDog.getStiffness() + "");
        System.out.print("\nCat Stiffness:" + aCat.getStiffness() + "");
        System.out.print("\nDog Softness:" + aDog.getSoftness() + "");
        System.out.print("\nCat Softness:" + aCat.getSoftness() + "");
    }
}
