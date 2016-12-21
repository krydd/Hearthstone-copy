package se.krydd.boardentity.heropower;

import se.krydd.game.HeroClass;

public class StandardHeroPowers {

    public static HeroPower forClass(HeroClass heroClass) {
        switch (heroClass) {
            case Druid:
                return new DruidHeroPower();
            case Hunter:
                return new HunterHeroPower();
            case Mage:
                return new MageHeroPower();
            case Paladin:
                return new PaladinHeroPower();
            case Preist:
                return new PriestHeroPower();
            case Rogue:
                return new RogueHeroPower();
            case Shaman:
                return new ShamanHeroPower();
            case Warlock:
                return new WarlockHeroPower();
            case Warrior:
                return new WarriorHeroPower();
            default:
                throw new RuntimeException("No standard hero power for class '" + heroClass.name() + "'");
        }
    }
}
