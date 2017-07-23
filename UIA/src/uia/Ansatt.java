/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uia;

/**
 * 
 * 
 * @author Snorre
 * @version 1.0
 */
public class Ansatt extends Person
{
    /**
    * Fields.
    */
    private String stilling;
    private String stillingsprosent;
    private int lonnstrinn;
    private String ansattype;
   
    
    public Ansatt(String navn, String adresse, String epost, String mobil, String stilling, 
    String stillingsprosent, int lonnstrinn, int personnr)
    {
      super(navn, adresse, epost, mobil, personnr);
      this.stilling = stilling;
      this.stillingsprosent = stillingsprosent;
      this.lonnstrinn = lonnstrinn;
    }
   
    /**
     * @return stilling.
     */
    public String getStilling()
    {
       return stilling;
    }
    
    /**
     * @return stillingsprosent. 
     */
    public String getStillingsprosent()
    {
       return stillingsprosent;
    }
    
    /**
     * @return lonnstrinn.
     */
    public int getLonnstrinn()
    {
       return lonnstrinn;
    }
    
}