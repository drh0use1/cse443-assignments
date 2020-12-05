public abstract class AbstractPhoneFactory {
    protected abstract Phone preparePhone(String model);

    public Phone createPhone(String model) {
        Phone phone;

        phone = preparePhone(model);
        
        // production routine
        phone.attachBattery();
        phone.attachDisplay();
        phone.attachBattery();
        phone.attachStorage();
        phone.attachCamera();
        phone.encloseCase();
        
        return phone;
    }
}
