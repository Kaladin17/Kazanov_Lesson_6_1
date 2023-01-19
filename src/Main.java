public class Main {
   public static void main(String[] args) {
        /*Boss boss = new Boss(1000, 50, new Weapon(WeaponType.STEEL, "Sword"));
       System.out.println("Health Boss: " + boss.getHealth() + " Damage Boss: " + boss.getDamage() + " Weapon type Boss: "
               + boss.getWeaponTypeBoss() + " Weapon name Boss: " + boss.getWeaponTypeBoss());*/

       Boss boss = new Boss(1000, 50, WeaponType.STEEL, "Sword");
       System.out.println("Health Boss: " + boss.getHealth() + " Damage Boss: " + boss.getDamage() + " Weapon type Boss: "
               + boss.getWeaponTypeBoss() + " Weapon name Boss: " + boss.getWeaponNameBoss());

   }


}