/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uia;

/**
 * Write a description of class FagligAnsatt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FagligAnsatt extends Ansatt
{
    /**
     * Fields
     */
    private String fagomrade;
    
    public FagligAnsatt(String navn, String adresse, String epost, String mobil, String stilling,
    String stillingsprosent, int lonnstrinn, String fagomrade, int personnr)
    {
      super(navn, adresse, epost, mobil, stilling, stillingsprosent, lonnstrinn, personnr);
      this.fagomrade = fagomrade;
    }
    /* public FagligAnsatt()
    {
        fagomrade = "Matte";
    }*/
}
