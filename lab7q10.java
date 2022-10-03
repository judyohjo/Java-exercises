abstract class Pokemon {
    String name;
    int power;
    int attack;
    int defense;
    public Pokemon(String newName, int newPower, int newAttack, int newDefense) {
        name = newName;
        power = newPower;
        attack = newAttack;
        defense = newDefense;
    }
    abstract int calculateImpact();
    final void showDamage() {
        System.out.printf("%s's damage is : %d\n", name, (calculateImpact() * power));
        power--;
    }
    public String toString() {
        return String.format("%s,power=%d,attack=%d,defense=%d", name, power, attack, defense);
    }
}
