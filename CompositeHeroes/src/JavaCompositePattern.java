public class JavaCompositePattern {

    public static void main(String[] args) {

        HeroComponent Player1 = new Army("Player1 plays with King");
        HeroComponent airattack = new HeroDetail("use air attack");
        HeroComponent swordweapon = new HeroDetail("use steel sword");
        HeroComponent halfdamage = new HeroDetail("damage dealt:35");
        Player1.add(airattack);
        Player1.add(swordweapon);
        Player1.add(halfdamage);

        HeroComponent Player2 = new Army("Player2 plays with Warrior");
        HeroComponent Infantryattack = new HeroDetail("This hero use Infantry attack");
        HeroComponent cudgelweapon = new HeroDetail("use tree cudgel");
        HeroComponent damage = new HeroDetail("damage dealt:10 ");
        Player2.add(Infantryattack);
        Player2.add(cudgelweapon);
        Player2.add(damage);

        HeroComponent Player3 = new Army("Player3 plays with Mage");
        HeroComponent lightningAttack = new HeroDetail("Mage use lightning Attack ");
        Player3.add(lightningAttack);

        HeroComponent hero = new Army("Game start");
        hero.add(Player1);
        hero.add(Player2);
        hero.add(Player3);

        Player buyer = new Player(hero);

        buyer.getHero();
        int a = 1 + (int) (Math.random() * 3);
        System.out.println("This game win Player" + a);
        System.out.println("Game over ");
    }
}