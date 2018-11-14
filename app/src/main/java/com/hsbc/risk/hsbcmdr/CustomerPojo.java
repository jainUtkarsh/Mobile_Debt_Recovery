package com.hsbc.risk.hsbcmdr;

public class CustomerPojo {

    private String customerName;
    private String customerAge;
    private String customerPhone;
    private String customerAccount;
    private String customerAddressLine1;
    private String customerAddressLine2;
    private String customerAddressLine3;
    private String customerCity;
    private String customerCountry;
    private String customerPin;

    CustomerPojo(String customerName, String customerAddressLine1,String customerAccount, String customerPhone){
        this.customerAccount= customerAccount;
        this.customerName = customerName;
        this.customerAddressLine1 = customerAddressLine1;
        this.customerPhone = customerPhone;
    }
    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getCustomerPin() {
        return customerPin;
    }

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }

    private String customerLatitude;

    public String getCustomerLatitude() {
        return customerLatitude;
    }

    public void setCustomerLatitude(String customerLatitude) {
        this.customerLatitude = customerLatitude;
    }

    public String getCustomerLongitude() {
        return customerLongitude;
    }

    public void setCustomerLongitude(String customerLongitude) {
        this.customerLongitude = customerLongitude;
    }

    private String customerLongitude;

    public String getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getCustomerAddressLine1() {
        return customerAddressLine1;
    }

    public void setCustomerAddressLine1(String customerAddressLine1) {
        this.customerAddressLine1 = customerAddressLine1;
    }

    public String getCustomerAddressLine2() {
        return customerAddressLine2;
    }

    public void setCustomerAddressLine2(String customerAddressLine2) {
        this.customerAddressLine2 = customerAddressLine2;
    }

    public String getCustomerAddressLine3() {
        return customerAddressLine3;
    }

    public void setCustomerAddressLine3(String customerAddressLine3) {
        this.customerAddressLine3 = customerAddressLine3;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
