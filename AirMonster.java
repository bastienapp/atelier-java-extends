class AirMonster extends Monster {

    // add constructor and initialize type to "air"
    public AirMonster(String name, int attack) {
        super(name, attack, "air");
    }

    @Override
    // create an attack method which deals x2 damage to "water"
    public boolean attack(Monster opponent) {
        
        int damage = this.getAttack();
        if (opponent.getType().equals("water")) {
            damage *= 2; // damage = damage * 2;
        }
        opponent.setLife(opponent.getLife() - damage);

        return opponent.isKO();
    }
    
}