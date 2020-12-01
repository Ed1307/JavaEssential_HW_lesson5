package device;

import animal.Animal;

class Device {
    String manufacturer;
    float price;
    int serialNumber;

    public Device(String manufacturer, float price, int serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public Device() {
    }

    @Override
    public String toString(){

        return "manufacturer =  " + manufacturer + "\nprice = " + price + "\nserialNumber = " + serialNumber;
    }

    @Override
    public boolean equals(Object o){
        if(o != null&& o.getClass()== this.getClass()){
            Device d = (Device) o;
            boolean compareManufacturer = d.manufacturer.equals(this.manufacturer);
            boolean comparePrice = d.price == this.price;
            boolean compareSerialNumber = d.serialNumber == this.serialNumber;
            return compareManufacturer&&comparePrice&&compareSerialNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + ((manufacturer != null) ? manufacturer.hashCode() : 0);
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + serialNumber;
        return result;
    }
}
