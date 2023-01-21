public class Main {
   public static void main(String[] args) {

       Boss boss = new Boss(1000, 50);
       Weapon bossWeapon = new Weapon(WeaponType.STEEL, "Sword");
       boss.setBossWeapon(bossWeapon);
       System.out.println("Health Boss: " + boss.getHealth() + " Damage Boss: " + boss.getDamage() + " Weapon Boss: "
               + bossWeapon.getWeaponType() + " " + bossWeapon.getWeaponName());

       System.out.println(boss.printInfo());

       Skeleton skeletonMagik = new Skeleton(200, 20, 5);
       Weapon skeletonMagikWeapon = new Weapon(WeaponType.FIREARMS, "Magik orb");
       skeletonMagik.setBossWeapon(skeletonMagikWeapon);

       System.out.println(skeletonMagik.printInfo());

       Skeleton skeletonPhysical = new Skeleton(200, 20,5);
       Weapon skeletonPhysicalWeapon = new Weapon(WeaponType.THROWN, "Stones");
       skeletonPhysical.setBossWeapon(skeletonPhysicalWeapon);

       System.out.println(skeletonPhysical.printInfo());
   }

}