public class Bok {
    // objektvariabler
    private String tittel;
    private String forfatter;
    private int uAar;
    private double pris;
    private Sjanger sjanger;

    // Konstruktører. Alltid samme navn som klassen. Ingen returtype
    // Standard konstruktør (ingen paramtrar)
    public Bok(){
        tittel = "ukjent";
        forfatter = "NN";
    }

    public Bok(String tittel, String forfatter, int uAar, double pris, Sjanger s){
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.uAar = uAar;
        this.pris = pris;
        this.sjanger = s;
    }


    // Aksessmetoder
    // get-metoder
    public String getTittel(){
        return tittel;
    }

    public String getForfatter(){
        return forfatter;
    }

    public int getUAar(){
        return uAar;
    }

    public double getPris() {
        return pris;
    }

    public Sjanger getSjanger(){
        return sjanger;
    }

    // set-metoder
    public void setTittel(String ny){
        tittel = ny;
    }

    public void setForfatter(String ny){
        forfatter = ny;
    }

    public void setUAar(int ny){
        uAar = ny;
    }

    public void setPris(double ny){
        pris = ny;
    }



    // objektmetoder
    // Metode for å vise tilstanden til et objekt
    public void vis(){
        System.out.println("Tittel: " + tittel);
        System.out.println("Forfatter: " + forfatter);
        System.out.println("Ugivelsesår: " + uAar);
        System.out.println("Pris: " + pris);
        System.out.println("Sjanger: " + sjanger);
    }

    public Bok eldst(Bok b){
        if (this.uAar <= b.uAar){
            return this;
        } else {
            return b;
        }
    }
}

