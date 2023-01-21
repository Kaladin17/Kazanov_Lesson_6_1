public class Skeleton extends Boss{

    int arrows;


    public Skeleton(int Health, int Damage, int arrows) {
        super(Health, Damage);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return "Health: " + this.getHealth() + " Damage: " + this.getDamage() + " Weapon boss: "
                + this.getBossWeapon().getWeaponType() + " " + this.getBossWeapon().getWeaponName() + " arrows: " + this.getArrows();
    }
}
