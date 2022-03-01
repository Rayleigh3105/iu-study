package main.model;

/**
 * Aufgabe:
 * Erstelle eine Klasse mit folgenden Instanzmethoden:
 *
 * - toString()
 * - equals()
 * - hashCode()
 * - compareTo()
 * - clone()
 */
public class Kunde implements Comparable<Kunde>, Cloneable {

    private int id;
    private int kundenNummer;
    private String vorname;
    private String nachname;
    private String mail;
    private int plz;

    public Kunde() {
    }

    public Kunde(String vorname) {
        this.vorname = vorname;
    }

    /////////////////////////////////////
    // Instanz Methoden
    /////////////////////////////////////

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Kunden Objekt ");
        buffer.append(" id: " + id);
        buffer.append(",");
        buffer.append(" kundenNummer: "+ kundenNummer);
        buffer.append(",");
        buffer.append(" vorname: " + vorname);
        return buffer.toString();
    }

    public boolean equals(Object obj) {

        if (this == obj) { return true;}

        if (obj instanceof Kunde) {
            Kunde k = (Kunde) obj;
            return kundenNummer == k.kundenNummer;
        } else {
            return super.equals(obj);
        }
    }

    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + kundenNummer;
        return hash;
    }

    @Override
    public int compareTo(Kunde o) {
        return kundenNummer - o.kundenNummer;
    }

    public Kunde clone() {

        try {
            return (Kunde) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.printf("Das hätte nicht passieren dürfen");
            return null;
        }
    }

    /////////////////////////////////////
    // Getter / Setter
    /////////////////////////////////////


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

}
