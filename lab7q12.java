class PoisonPokemon extends Pokemon {
    public PoisonPokemon(String newName, int newPower, int newAttack, int newDefense) {
        super(newName, newPower, newAttack, newDefense);
    }
    public int calculateImpact() {
        return (super.attack - super.defense);
    }
}
