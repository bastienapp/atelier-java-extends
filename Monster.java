abstract class Monster {

    private String name;
    private int attack;
    private String type;

    public Monster(String name, int attack, String type) {
        this.name = name;
        this.attack = attack;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Monster name(String name) {
        this.name = name;
        return this;
    }

    abstract void attack(Monster opponent);
}