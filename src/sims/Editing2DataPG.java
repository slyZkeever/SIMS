/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sims;

/**
 *
 * @author Vic's
 */
public class Editing2DataPG 
{
    
    private int passYearVal;    
    
    private String schoolVal, cityVal;
        
    private float percent1Val, percent2Val, percent3Val, percent4Val;
    
    private static volatile Editing2DataPG instance = null;
    
    
    Editing2DataPG()
    {}
    
    
    public static Editing2DataPG getInstance()
    {
        if(instance == null)
        {
            instance = new Editing2DataPG();
        }
        
        return instance;
    }
    

    public int getPassYearVal() 
    {
        return passYearVal;
    }

    public void setPassYearVal(int passYearVal) 
    {
        this.passYearVal = passYearVal;
        System.out.println(passYearVal);
    }

    
    public String getSchoolVal() 
    {
        return schoolVal;
    }

    public void setSchoolVal(String schoolVal) 
    {
        this.schoolVal = schoolVal;
        System.out.println(schoolVal);
    }

    
    public String getCityVal() 
    {
        return cityVal;
    }

    public void setCityVal(String cityVal) 
    {
        this.cityVal = cityVal;
        System.out.println(cityVal);
    }

    
    public float getPercent1Val() 
    {
        return percent1Val;
    }

    public void setPercent1Val(float percent1Val) 
    {
        this.percent1Val = percent1Val;
        System.out.println(percent1Val);
    }

    
    public float getPercent2Val() 
    {
        return percent2Val;
    }
    
    public void setPercent2Val(float percent2Val) 
    {
        this.percent2Val = percent2Val;
        System.out.println(percent2Val);
    }

    
    public float getPercent3Val() 
    {
        return percent3Val;
    }

    public void setPercent3Val(float percent3Val) 
    {
        this.percent3Val = percent3Val;
        System.out.println(percent3Val);
    }

    
    public float getPercent4Val() 
    {
        return percent4Val;
    }

    public void setPercent4Val(float percent4Val) 
    {
        this.percent4Val = percent4Val;
        System.out.println(percent4Val);
    }

    
}