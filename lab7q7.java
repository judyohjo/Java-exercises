abstract class Burger {
    abstract void addToppings();
    final void make() {
        layBread();
        spreadSauce();
        addLettuce();
        addToppings();
    }
    public void layBread() {
        System.out.println("lay bread");
    }
    public void spreadSauce() {
        System.out.println("spread Sauce");
    }
    public void addLettuce() {
        System.out.println("add lettuce");
    }
}
