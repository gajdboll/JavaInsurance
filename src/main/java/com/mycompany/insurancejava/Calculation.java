/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insurancejava;

/**
 *
 * @author pre12
 */
public class Calculation 
{
    private int age;
    private char engineClass;
    private char claimInLast5Years;
    private int estimatedMileage;
    private char coverType;

    public char getCoverType() {
        return coverType;
    }

    public void setCoverType(char CoverType) {
        this.coverType = CoverType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getEngineClass() {
        return engineClass;
    }

    public void setEngineClass(char engineClass) {
        this.engineClass = engineClass;
    }

    public char getClaimInLast5Years() {
        return claimInLast5Years;
    }

    public void setClaimInLast5Years(char claimInLast5Years) {
        this.claimInLast5Years = claimInLast5Years;
    }

    public int getEstimatedMileage() {
        return estimatedMileage;
    }

    public void setEstimatedMileage(int estimatedMileage) {
        this.estimatedMileage = estimatedMileage;
    }

    public Calculation(int age, char engineClass, char claimInLast5Years, int estimatedMileage, char CoverType) {
        this.age = age;
        this.engineClass = engineClass;
        this.claimInLast5Years = claimInLast5Years;
        this.estimatedMileage = estimatedMileage;
        this.coverType = CoverType;
    }

    



    
    
    public int CalculateRate()
    {
        int discount=100;
        switch(claimInLast5Years)
        {
            case 'Y'-> 
            {
                discount = 100;
                break;
            }
            case 'N' ->
            {
                if(age<25)
                {
                    if( engineClass =='A' || engineClass =='B' || engineClass =='C' )
                        discount = 100;break;
                }
                else
                {
                    switch(engineClass)
                    {
                        case 'A' -> discount = 80;
                        case 'B' -> discount = 70;
                        case 'C' -> discount = 60;
                        case 'D' -> discount = 50;
                        case 'E' -> discount = 40;
                    }
                }
            }
            
        }
        if (estimatedMileage < 6000)
            discount =- 5;
        if (coverType == 'Y') discount /= 2;
        return discount;
    }
    
}
