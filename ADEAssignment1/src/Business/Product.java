/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author priyank
 */
public class Product {
private String CarMake;
private String CarModel;
private String Miles;
private String BatteryStatus;
private String EngineStatus;
private String OilStatus;
private String ServiceDate;
private String ServiceDescription;
private String CustomerName;
private String CustomerPhoneNumber;
private String EmailAddress;

    public String getCarMake() {
        return CarMake;
    }

    public void setCarMake(String CarMake) {
        this.CarMake = CarMake;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }

    public String getMiles() {
        return Miles;
    }

    public void setMiles(String Miles) {
        this.Miles = Miles;
    }

    public String getBatteryStatus() {
        return BatteryStatus;
    }

    public void setBatteryStatus(String BatteryStatus) {
        this.BatteryStatus = BatteryStatus;
    }

    public String getEngineStatus() {
        return EngineStatus;
    }

    public void setEngineStatus(String EngineStatus) {
        this.EngineStatus = EngineStatus;
    }

    public String getOilStatus() {
        return OilStatus;
    }

    public void setOilStatus(String OilStatus) {
        this.OilStatus = OilStatus;
    }

    public String getServiceDate() {
        return ServiceDate;
    }

    public void setServiceDate(String ServiceDate) {
        this.ServiceDate = ServiceDate;
    }

    public String getServiceDescription() {
        return ServiceDescription;
    }

    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String CustomerPhoneNumber) {
        this.CustomerPhoneNumber = CustomerPhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }
public void trimText(String txtCarMake,String txtCarModel,String txtMiles,String txtBatteryStatus,String txtEngineStatus,String txtOilStatus,String txtServiceDate,String txtServiceDescription,String txtCustomerName,String txtCustomerPhoneNumber,String txtEmailAddress)
{
 txtCarMake = txtCarMake.trim();

txtCarModel = txtCarModel.trim();
txtMiles = txtMiles.trim();
txtBatteryStatus  = txtBatteryStatus.trim();
txtEngineStatus  = txtEngineStatus.trim();
txtOilStatus  = txtOilStatus.trim();
txtServiceDate = txtServiceDate.trim();
txtServiceDescription = txtServiceDescription.trim();
txtCustomerName = txtCustomerName.trim();
txtCustomerPhoneNumber = txtCustomerPhoneNumber.trim();
txtEmailAddress = txtEmailAddress.trim();
}
}

