/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uia;

/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdminAnsatt extends Ansatt {

    /**
     * Fields.
     */
    private String fakultet;
    private boolean fellesadmin;

    public AdminAnsatt(String navn, String adresse, String epost, String mobil, String stilling,
            String stillingsprosent, int lonnstrinn, String fakultet, boolean fellesadmin, int personnr) {
        super(navn, adresse, epost, mobil, stilling, stillingsprosent, lonnstrinn, personnr);
        this.fakultet = fakultet;
        this.fellesadmin = fellesadmin;

    }

    /* public AdminAnsatt()
    {
       fakultet = "Realfag";
       fellesadmin = false;
    } */
    /**
     * @return fakultet.
     */
    public String getFakultet() {
        return fakultet;
    }

    /**
     * @return fellesadmin.
     */
    public boolean getFellesadmin() {
        return fellesadmin;
    }

    /**
     * Print all informasjon om en ansatt.
     */
    public void printInformasjon() {
        System.out.println("Navn: " + getNavn());
        System.out.println("Adresse: " + getAdresse());
        System.out.println("E-post: " + getEpost());
        System.out.println("Mobilnummer: " + getMobil());
        System.out.println("Stilling: " + getStilling());
        System.out.println("Stillingsprosent: " + getStillingsprosent());
        System.out.println("Lønnstrinn: " + getLonnstrinn());
        System.out.println("Fakultet: " + fakultet);
        if (fellesadmin == false) {
            System.out.println("Er i fellesadministrasjonen: Nei");
        } else {
            System.out.println("Er i fellesadministrasjonen: Ja");
        }
    }
}
