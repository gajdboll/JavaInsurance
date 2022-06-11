
package com.mycompany.insurancejava;

/**
 * Obiekt reprezentujący klienta firmy ubezpieczeniowej.
 *
 * @author Bartosz Wasko i Krzysztoff Gajdosz
 */
public class Client {

    /**
     * pola
     */
    String name, address1, address2, address3, postCode, telNo, dateOfBirth,
            claimIn5Years, thirdParty, engineCC,
            makeAndModel, registrationNumber, valuation, yearFirstRegistered, estimatedMileage, annualPremium, monthlyPremium;

   /**
    * Getters And setters
    * @return 
    */
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClaimIn5Years() {
        return claimIn5Years;
    }

    public void setClaimIn5Years(String claimIn5Years) {
        this.claimIn5Years = claimIn5Years;
    }

    public String getThirdParty() {
        return thirdParty;
    }

    public void setThirdParty(String thirdParty) {
        this.thirdParty = thirdParty;
    }

    public String getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(String engineCC) {
        this.engineCC = engineCC;
    }

    public String getAnnualPremium() {
        return annualPremium;
    }

    public void setAnnualPremium(String annualPremium) {
        this.annualPremium = annualPremium;
    }

    public String getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(String monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    public String getYearFirstRegistered() {
        return yearFirstRegistered;
    }

    public void setYearFirstRegistered(String yearFirstRegistered) {
        this.yearFirstRegistered = yearFirstRegistered;
    }

    public String getEstimatedMileage() {
        return estimatedMileage;
    }

    public void setEstimatedMileage(String estimatedMileage) {
        this.estimatedMileage = estimatedMileage;
    }
/**
 * Konstruktor zawierający wszystkie pola głównego programu GUI.
 */
    public Client(String name, String address1, String address2, String address3, String postCode, String telNo, String dateOfBirth, String claimIn5Years, String thirdParty, String engineCC, String makeAndModel, String registrationNumber, String valuation, String yearFirstRegistered, String estimatedMileage, String annualPremium, String monthlyPremium) {
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.postCode = postCode;
        this.telNo = telNo;
        this.dateOfBirth = dateOfBirth;
        this.claimIn5Years = claimIn5Years;
        this.thirdParty = thirdParty;
        this.engineCC = engineCC;
        this.makeAndModel = makeAndModel;
        this.registrationNumber = registrationNumber;
        this.valuation = valuation;
        this.yearFirstRegistered = yearFirstRegistered;
        this.estimatedMileage = estimatedMileage;
        this.annualPremium = annualPremium;
        this.monthlyPremium = monthlyPremium;
    }
/**
 * nadpisana metoda toString zawierająca informacje o kazdym polu.
 * @return String
 */
    @Override
    public String toString() {
        return name + ";" + address1 + ";" + address2 + ";" + address3 + ";" + postCode
                + ";" + telNo + ";" + dateOfBirth + ";" + claimIn5Years + ";"
                + thirdParty + ";" + engineCC + ";" + makeAndModel + ";"
                + registrationNumber + ";" + valuation + ";" + yearFirstRegistered + ";"
                + estimatedMileage + ";" + annualPremium + ";" + monthlyPremium;                  
    }
/**
 * Metoda wykorzystywana do przesyłania koniecznych informacji na serwer w odpowiednim formacie.
 * @return String
 */
    public String toStringDoWyslania() {
        return dateOfBirth + ";" + engineCC + ";" + claimIn5Years + ";" + thirdParty + ";" + estimatedMileage;
    }

}
