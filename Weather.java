public class Weather {

    public static int rollD100() {
        return (int) ( 1 + (Math.random() * 100));
    }

    public static void heatWave() {
        System.out.println("heat wave");
        System.out.println("\t\t- Fortitude save every hour");
        System.out.println("\t\t- DC 15");
        System.out.println("\t\t- 1d4 nonlethal damage on fail\n");
    }

    public static void coldSnap() {
        System.out.println("cold snap");
        System.out.println("\t\t- Fortitude save every hour");
        System.out.println("\t\t- DC 10");
        System.out.println("\t\t- 1 point of Constitution damage on fail\n");
    }

    public static void snow() {
        System.out.println("snow");
        System.out.println("\t\t- -4 penalty to Perception");
        System.out.println("\t\t- Reduce ranged weapons range by half");
        System.out.println("\t\t- Speed reduced to half when traveling through snow");
        System.out.println("\t\t- All cold snap rules\n");
        System.out.print("\t\t");
        coldSnap();
    }

    public static void rain() {
        System.out.println("rain");
        System.out.println("\t\t- -4 penalty to Perception");
        System.out.println("\t\t- -4 penalty to Climb and Acrobatics checks");
        System.out.println("\t\t- Reduce ranged weapons range by half");
        System.out.println("\t\t- Fire magic and effects are unusable\n");
    }

    public static void sandStorm() {
        System.out.println("sand storm");
        System.out.println("\t\t- -6 penalty to Perception");
        System.out.println("\t\t- Drowning rules if player has no face protection");
        System.out.println("\t\t- 50% chance fire magic and effects are unusable\n");
    }

    public static void snowstorm() {
        System.out.println("snowstorm");
        System.out.println("\t\t- -6 penalty to Perception");
        System.out.println("\t\t- Speed reduced to half when traveling through snow");
        System.out.println("\t\t- Attacks with ranged weapons impossible");
        System.out.println("\t\t- Medium or smaller sized creatures may be staggered");        
        System.out.println("\t\t\t* DC 15 Fortitude save");
        System.out.println("\t\t- All cold snap rules\n");
        System.out.print("\t\t");
        coldSnap();
    }

    public static void thunderstorm() {
        System.out.println("thunderstorm");
        System.out.println("\t\t- Lightning check each round");  
        System.out.println("\t\t- All rain rules\n");
        System.out.print("\t\t");
        rain();
        System.out.print("\t\t");
        lightningCheck();
    }

    public static void lightningCheck() {
        System.out.println("Lightning check:");
        System.out.println("\t\t- d100 roll to check for lightning");
        System.out.println("\t\t\t* 1-25 = harmless, distant lightning");
        System.out.println("\t\t\t* 26-50 = nearby lightning");
        System.out.println("\t\t\t\t# All players make a DC 15 Will save to" + "\n\t\t\t\tavoid being shaken");
        System.out.println("\t\t\t* 51-100 = someone is hit by lightning");
        System.out.println("\t\t\t\t# Attack roll: d20 against target's flat-footed" + "\n\t\t\t\tAC");
        System.out.println("\t\t\t\t# Damage roll: 6d8\n");
    }
    
    public static void lightningStorm() {
        System.out.println("lightning storm");
        System.out.println("\t\t- Lightning check each round");
    }

    public static void blizzard() {
        System.out.println("blizzard");
        System.out.println("\t\t- -8 penalty to Perception");
        System.out.println("\t\t- Speed reduced to half when traveling through snow");
        System.out.println("\t\t- Attacks with ranged weapons impossible");
        System.out.println("\t\t- Medium or smaller sized creatures may be staggered");        
        System.out.println("\t\t\t* DC 20 Fortitude save");
        System.out.println("\t\t- Additional cold snap rules");
        System.out.println("\t\t\t* Fortitude save every hour");
        System.out.println("\t\t\t* DC 15");
        System.out.println("\t\t\t* 2 point of Constitution damage on fail\n");
    }

    public static void windStorm() {
        System.out.println("wind storm");
        System.out.println("\t\t- Use of ranged weapons is impossible");  
        System.out.println("\t\t- Medium or smaller sized creatures may be staggered");        
        System.out.println("\t\t\t* DC 15 Fortitude save");
        System.out.println("\t\t- 75% chance fire magic and effects are unusable\n");
    }

    public static void hurricane() {
        System.out.println("hurricane");
        System.out.println("\t\t- -6 penalty to Perception");
        System.out.println("\t\t- Use of ranged weapons is impossible");
        System.out.println("\t\t- Medium or smaller sized creatures are staggered");      
        System.out.println("\t\t- Medium or smaller sized creatures may be blown away");      
        System.out.println("\t\t\t* DC 15 Fortitude save made every round");
        System.out.println("\t\t- Fire magic and effects are unusable");
        System.out.println("\t\t- Lightning check twice per round\n");
        System.out.print("\t\t");
        lightningCheck();
    }

    public static void tornado() {
        System.out.println("tornado");
        System.out.println("\t\t- Use of ranged weapons is impossible");
        System.out.println("\t\t- Perception checks are impossible");
        System.out.println("\t\t- Medium or smaller sized creatures are staggered");
        System.out.println("\t\t- Medium or smaller sized creatures may be pulled into the\n" + "\t\ttornado");
        System.out.println("\t\t\t* DC 20 Fortitude save");
        System.out.println("\t\t\t\t# Tornado damage: 6d6 for 1d10 rounds");
        System.out.println("\t\t- Fire magic and effects are unusable\n");
    }

    public static void downpour() {
        System.out.println("downpour");
        System.out.println("\t\t- -8 penalty to Perception");
        System.out.println("\t\t- -8 penalty to Climb and Acrobatics checks");
        System.out.println("\t\t- Reduce ranged weapons range by half");
        System.out.println("\t\t- Fire magic and effects are unusable\n");
    }

    public static void rollToWeather() {
        int initialRoll = rollD100();

        if (initialRoll >= 1 && initialRoll <= 70) {
            System.out.println("\nNormal weather\n");
            System.out.println("~ ~ ~");
            System.out.println("Cold climate: cold, calm\n");
            System.out.println("Temperate climate: normal for season\n");
            System.out.println("Hot climate: hot, calm");
        } else if (initialRoll >= 71 && initialRoll <= 80) {
            System.out.println("\nAbnormal weather\n");
            System.out.println("~ ~ ~");
            
            int coldRoll = rollD100();
            
            System.out.print("Cold climate: ");

            if (coldRoll >= 1 && coldRoll <= 30) {
                heatWave();
            } else {
                coldSnap();
            }

            System.out.print("Temperate climate: ");

            if (coldRoll >= 1 && coldRoll <= 50) {
                heatWave();
            } else {
                coldSnap();
            }

            System.out.println("Hot climate: hot, windy");

        } else if (initialRoll >= 81 && initialRoll <= 90) {
            System.out.println("\nInclement weather\n");
            System.out.println("~ ~ ~");
            System.out.print("Cold climate: ");
            snow();
            System.out.print("Temperate climate: rain or snow, depending on season\n\n");
            System.out.print("\t\t");
            rain();
            System.out.print("Hot climate: ");
            sandStorm();
        } else if (initialRoll >= 91 && initialRoll <=99) {
            System.out.println("\nStorm\n");
            System.out.println("~ ~ ~");
            System.out.print("Cold climate: ");
            snowstorm();
            System.out.print("Temperate climate: snowstorm or thunderstorm, depending on season\n\n");
            System.out.print("\t\t");
            thunderstorm();
            System.out.print("Hot climate: ");
            lightningStorm();
        } else {
            System.out.println("\nPowerful storm\n");
            System.out.println("~ ~ ~");
            System.out.print("Cold climate: ");
            blizzard();
            System.out.print("Temperate climate: blizzard, windstorm, hurricane, or tornado, depending on\n" + "\t\tseason\n\n");
            System.out.print("\t\t");
            windStorm();
            System.out.print("\t\t");
            hurricane();
            System.out.print("\t\t");
            tornado();
            System.out.print("Hot climate: ");
            downpour();
        }
    }

    public static void main(String[] args) {
        rollToWeather();
    }
}