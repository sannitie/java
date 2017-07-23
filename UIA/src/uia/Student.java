/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uia;

/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    /**
     * Fields.
     */
    private String studiestart;
    private int studiepoeng;
    private String studie;
    
    /**
     * Constructor.
     */
    public Student(String studiestart, int studiepoeng, String studie, String navn, 
    String adresse, String epost, String mobil, int personnr)
    {
        super(navn, adresse, epost, mobil, personnr);
        this.studiestart = studiestart;
        this.studiepoeng = studiepoeng;
        this.studie = studie;
    }
    
    /**
     * @return studiestart.
     */
    public String getStudiestart()
    {
        return studiestart;
    }
    
    /**
     * @return studiepoeng.
     */
    public int getStudiepoeng()
    {
        return studiepoeng;
    }
    
    /**
     * @return studie.
     */
    public String getStudie()
    {
        return studie;
    }
}

