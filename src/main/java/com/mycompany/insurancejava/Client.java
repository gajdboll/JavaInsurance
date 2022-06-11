
package com.mycompany.insurancejava;

/**
 * Obiekt reprezentujący klienta firmy ubezpieczeniowej.
 *
 * @author Bartosz Wasko i Krzysztof Gajdosz
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
    * @return parameter value if getter -> set a value for setters
    */
    
    public String getName() {
        return name;
    }
/**
 * setter  
 * @param name name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * get address
 * @return address
 */
    public String getAddress1() {
        return address1;
    }
/**
 * set address
 *  
 */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
/**
 * get address2
 * @return address2
 */
    public String getAddress2() {
        return address2;
    }
/**
 * set address2
 * 
 */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
/**
 * get address3
 * @return address3
 */
    public String getAddress3() {
        return address3;
    }
/**
 * set address3
 * 
 */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

   /**
 * get postCode
 * @return postCode
 */ public String getPostCode() {
        return postCode;
    }
/**
 * set postCode
 * @param postCode
 */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
/**
 * get getTelNo
 * @return getTelNo
 */
    public String getTelNo() {
        return telNo;
    }
/**
 * set telNo
 * @param telNo
 */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
/**
 * get dateOfBirth
 * @return dateOfBirth
 */
    public String getDateOfBirth() {
        return dateOfBirth;
    }
/**
 * set dateOfBirth
 *@param  dateOfBirth
 */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
/**
 * get claimIn5Years
 * @return claimIn5Years
 */
    public String getClaimIn5Years() {
        return claimIn5Years;
    }
/**
 * set claimIn5Years
 * @param claimIn5Years
 */
    public void setClaimIn5Years(String claimIn5Years) {
        this.claimIn5Years = claimIn5Years;
    }
/**
 * get thirdParty
 * @return thirdParty
 */
    public String getThirdParty() {
        return thirdParty;
    }
/**
 * set thirdParty
 * @param thirdParty
 */
    public void setThirdParty(String thirdParty) {
        this.thirdParty = thirdParty;
    }
/**
 * get engineCC
 * @return engineCC
 */
    public String getEngineCC() {
        return engineCC;
    }
/**
 * set engineCC
 *@param  engineCC
 */
    public void setEngineCC(String engineCC) {
        this.engineCC = engineCC;
    }
/**
 * get annualPremium
 * @return annualPremium
 */
    public String getAnnualPremium() {
        return annualPremium;
    }
/**
 * set annualPremium
 * @param annualPremium
 */
    public void setAnnualPremium(String annualPremium) {
        this.annualPremium = annualPremium;
    }
/**
 * get monthlyPremium
 * @return monthlyPremium
 */
    public String getMonthlyPremium() {
        return monthlyPremium;
    }
/**
 * set monthlyPremium
 * @param  monthlyPremium
 */
    public void setMonthlyPremium(String monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }
/**
 * get makeAndModel
 * @return makeAndModel
 */
    public String getMakeAndModel() {
        return makeAndModel;
    }
/**
 * set makeAndModel
 *  @param makeAndModel
 */
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
/**
 * get registrationNumber
 * @return registrationNumber
 */
    public String getRegistrationNumber() {
        return registrationNumber;
    }
/**
 * set registrationNumber
 *  @param registrationNumber
 */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
/**
 * get valuation
 * @return valuation
 */
    public String getValuation() {
        return valuation;
    }
/**
 * set valuation
 *  @param valuation
 */
    public void setValuation(String valuation) {
        this.valuation = valuation;
    }
/**
 * get yearFirstRegistered
 * @return yearFirstRegistered
 */
    public String getYearFirstRegistered() {
        return yearFirstRegistered;
    }
/**
 * set yearFirstRegistered
 *  @param yearFirstRegistered
 */
    public void setYearFirstRegistered(String yearFirstRegistered) {
        this.yearFirstRegistered = yearFirstRegistered;
    }
/**
 * get estimatedMileage
 * @return estimatedMileage
 */
    public String getEstimatedMileage() {
        return estimatedMileage;
    }
/**
 * set estimatedMileage
 *  @param estimatedMileage
 */
    public void setEstimatedMileage(String estimatedMileage) {
        this.estimatedMileage = estimatedMileage;
    }
/**
 * Konstruktor zawierający wszystkie pola głównego programu GUI.
 * @param name imie
 * @param address1 address1
 * @param address2 address2
 * @param address3 address3
 * @param postCode postcode
 * @param telNo telefon
 * @param dateOfBirth DOB
 * @param claimIn5Years claim in 5 years
 * @param thirdParty third party 
 * @param engineCC engine size
 * @param makeAndModel model
 * @param registrationNumber reg
 * @param valuation valuation
 * @param yearFirstRegistered reg year
 * @param estimatedMileage milage
 * @param annualPremium annual premium 
 * @param monthlyPremium  monthly premium
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
