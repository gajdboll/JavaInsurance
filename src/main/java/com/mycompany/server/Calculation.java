/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.server;

/**
 *
 * @author pre12
 */
public class Calculation 
{
    private int age;
    private String engineClass;
    private String claimInLast5Years;
    private String coverType;
    private String estimatedMileage;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEngineClass() {
        return engineClass;
    }

    public void setEngineClass(String engineClass) {
        this.engineClass = engineClass;
    }

    public String getClaimInLast5Years() {
        return claimInLast5Years;
    }

    public void setClaimInLast5Years(String claimInLast5Years) {
        this.claimInLast5Years = claimInLast5Years;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getEstimatedMileage() {
        return estimatedMileage;
    }

    public void setEstimatedMileage(String estimatedMileage) {
        this.estimatedMileage = estimatedMileage;
    }

    public Calculation(int age, String engineClass, String claimInLast5Years, String coverType, String estimatedMileage) {
        this.age = age;
        this.engineClass = engineClass;
        this.claimInLast5Years = claimInLast5Years;
        this.coverType = coverType;
        this.estimatedMileage = estimatedMileage;
    }
    
    public int CalculateRate()
    {
        int discount=100;
        switch(claimInLast5Years)
        {
            case "true"-> 
            {
                discount = 100;
                break;
            }
            case "false" ->
            {
                //{"800 or less", "Between 800 - 1000", "Between 1000 - 1500",
                //"Between 1500 - 2000", "More than 2000"}
                if(age<25)
                {
                    if( engineClass.equals("More than 2000") || engineClass.equals("Between 1500 - 2000") 
                            || engineClass.equals("Between 1000 - 1500") )
                        discount = 100;break;
                }
                else
                {
                    switch(engineClass)
                    {
                        case "More than 2000" -> discount = 80;
                        case "Between 1500 - 2000" -> discount = 70;
                        case "Between 1000 - 1500" -> discount = 60;
                        case "Between 800 - 1000" -> discount = 50;
                        case "800 or less" -> discount = 40;
                    }
                }
            }
            
        }
        
        if (coverType.equals("false")) discount /= 2;
        if (Integer.parseInt(estimatedMileage) < 6000 ) discount -= 5;
        return discount;
    }
    
}
