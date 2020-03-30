class FireMonster extends Monster {

    // constructor and initialize type to "fire"
    public FireMonster(String name, int attack) {
        super(name, attack, "fire");
    }

    @Override
    // create an attack method which deals x2 damage to "air"
    public boolean attack(Monster opponent) {
        
        int damage = this.getAttack();
        if (opponent.getType().equals("air")) {
            damage *= 2; // damage = damage * 2;
        }
        opponent.setLife(opponent.getLife() - damage);

        return opponent.isKO();
    }
}