/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uia;

/**
 * Superclass with information.
 * 
 * @author Snorre 
 * @version 1.0
 */
public class Person
{
   /**
    * Fields for this class.
    */
   private String navn;
   private String adresse;
   private String epost;
   private String mobil;
   private int personnr;
   
   
   /**
    * Constructor for class Info.
    * @param navn The name of the person.
    * @param adresse The address of the person.
    * @param epost The email of the person.
    * @param mobil The mobile number of the person.
    */
   public Person(String navn, String adresse, String epost, String mobil, int personnr)
   {
       this.navn = navn;
       this.adresse = adresse;
       this.epost = epost;
       this.mobil = mobil;
       this.personnr = personnr;
    }

   /**
    * @return navn.
    */
   public String getNavn()
   {
      return navn;
    }
   
   /**
    * @return adresse.
    */
   public String getAdresse()
   {
       return adresse;
    }
    
   /**
    * @return epost.
    * 
    */
   public String getEpost()
   {
       return epost;
    }
    
   /**
    * @return mobil.
    */
   public String getMobil()
   {
       return mobil;
    }
    
   /**
    * The 4 next methods are setters.
    */
   public void setNavn(String navn)
   {
       this.navn = navn;
    }
    
   public void setAdresse(String adresse)
   {
       this.adresse = adresse;
    }
    
   public void setEpost(String epost)
   {
       this.epost = epost;
    }
    
    public void setMobil(String mobil)
    {
        this.mobil = mobil;
    }
    
}
