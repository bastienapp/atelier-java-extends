class WaterMonster extends Monster {

    public WaterMonster(String name, int attack) {
        super(name, attack, "water");
    }

    @Override
    // create an attack method which deals x2 damage to "fire"
    public boolean attack(Monster opponent) {
        
        int damage = this.getAttack();
        if (opponent.getType().equals("fire")) {
            damage *= 2; // damage = damage * 2;
        }
        opponent.setLife(opponent.getLife() - damage);

        return opponent.isKO();
    }
    
}