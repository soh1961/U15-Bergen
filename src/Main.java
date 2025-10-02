public class Main {
    // Vise antall bøker i kvar sjanger
    public static void visPerSjanger(Bok[] b){
        Sjanger[] verdier = Sjanger.values();

        System.out.println("Antall i kvar sjanger");
        for (Sjanger s : verdier){
            int antall = anntallAvSjanger(b, s);
            System.out.println(s + ": " + antall);
        }

    }
    // Telje antall bøker i ein gitt sjanger
    public static int anntallAvSjanger(Bok[] b, Sjanger s){
        int antall = 0;
        for (Bok e : b){
            if (e.getSjanger() == s){
                antall++;
            }
        }

        return antall;
    }

    public static void giRabatt(Bok[] b, int prosent){
        for (Bok e : b){
            double nyPris = e.getPris() - e.getPris() * prosent / 100;
            e.setPris(nyPris);
        }
    }
    public static void visBoker(Bok[] b){
        // antar ingen null-referansar i tabellen
        System.out.println("Alle bøkene");
        for (Bok e : b){
            e.vis();
            System.out.println();
        }
    }

    public static double samlaPris(Bok[] b){
        double total = 0;
        for (int i = 0; i < b.length; i++){
            total += b[i].getPris();
        }
        return total;
    }
    public static void main(String[] args) {

        Bok[] bTab = new Bok[4];
        bTab[0] = new Bok("Java", "Lars", 2025, 200, Sjanger.ROMANTIKK);
        bTab[1] = new Bok("Meir Java", "Sven-Olai", 2024, 100,Sjanger.ANNET);
        bTab[2] = new Bok("Operativsystmer", "Dag", 2023, 400, Sjanger.FANTASY);
        bTab[3] = new Bok("Hvem stal Javaboken", "Ole", 2025, 250, Sjanger.KRIM);

        // Forfatter som har skrive bok på plass 2
        //System.out.println(bTab[2].getForfatter());

        visBoker(bTab);

        // Samla pris for bøkene
        System.out.println("Total pris:" + samlaPris(bTab));

        // Reduser pris på alle bøkene med 50%
        giRabatt(bTab, 10);
        visBoker(bTab);

        // Telje antall med sjanger lik FANTASY
        int antall = anntallAvSjanger(bTab, Sjanger.FANTASY);
        System.out.println("Antall av sjanger fantasy: " + antall);

        // Telje antall med sjanger lik SKREKK
        antall = anntallAvSjanger(bTab, Sjanger.SKREKK);
        System.out.println("Antall av sjanger skrekk: " + antall);
        System.out.println();
        visPerSjanger(bTab);

        System.out.println("Plass for krim i sjanger: " + Sjanger.KRIM.ordinal());
        /*
        Bok b1 = new Bok();
        b1.vis();

        b1.setTittel("Java");
        b1.setForfatter("Olsen");
        b1.setUAar(2022);
        b1.setPris(399.50);
        b1.vis();
        System.out.println();

        // Skrive ut berre titel
        String t = b1.getTittel();
        System.out.println(t);  // kunne brukt kallet direkte
        // Vil ha med fornavn på forfatter
        b1.setForfatter("Olsen, Ole");
        b1.vis();

        Bok b2 = new Bok("Java 2", "Kristensen, Lars", 2024, 350);
        b2.vis();

        // Hva koster begge bøkene til sammen?
        double totalpris = b1.getPris() + b2.getPris();
        System.out.println("Totalpris: " + totalpris);

        System.out.println("\nEldste boka:");
        Bok b3 = b1.eldst(b2);
        b3.vis();
        */
    }
}

