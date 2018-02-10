abstract class Bank {
    abstract void run();
}

class Honda4 extends Bank {
    @Override
    public void run() {
        System.out.println("running safely..");
    }


}