package ba.unsa.etf.rma.myapplication;

public class Muzicar {
    private String ime;
    private String prezime;
    private String biografija;
    private String webStranica;

    public enum  Zanr {

        POP("pop"), FOLK("folk"), ROCK("rock"), RAP("rap"), JAZZ("jazz");

        private String imeZanra;

        private Zanr(String s)
        {
            imeZanra = s;
        }

        public String getImeZanra()
        {
            return imeZanra;
        }
    }
    private Zanr zanr;

    Muzicar (String ime, String prezime, Zanr zanr, String biografija, String webStranica) {
        this.ime=ime;
        this.prezime=prezime;
        this.zanr=zanr;
        this.biografija=biografija;
        this.webStranica=webStranica;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public String getBiografija() {
        return biografija;
    }

    public String getWebStranica() {
        return webStranica;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public void setWebStranica(String webStranica) {
        this.webStranica = webStranica;
    }
}
