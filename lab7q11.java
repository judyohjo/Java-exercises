class FlightingPokemon extends Pokemon {
    public FlightingPokemon(String newName, int newPower, int newAttack, int newDefense) {
        super(newName, newPower, newAttack, newDefense);
    }
    public int calculateImpact() {
        return (super.attack + super.defense);
    }
}
