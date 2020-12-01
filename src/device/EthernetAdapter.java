package device;

class EthernetAdapter extends Device{
    int speed ;
    String mac;

    public EthernetAdapter(String manufacturer, float price, int serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString(){

        return "manufacturer =  " + manufacturer + "\nprice = " + price + "\nserialNumber = " + serialNumber + "\nspeed = " + speed + "\nmac = " + mac;
    }

    @Override
    public boolean equals(Object o){
        if(o != null&& o.getClass()== this.getClass()){
            EthernetAdapter d = (EthernetAdapter) o;
            boolean compareManufacturer = d.manufacturer.equals(this.manufacturer);
            boolean comparePrice = d.price == this.price;
            boolean compareSerialNumber = d.serialNumber == this.serialNumber;
            boolean compareSpeed = d.speed == this.speed;
            boolean compareMac = d.mac.equals(this.mac);
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
        result = 37 * result + speed;
        result = 37 * result + ((mac != null) ? mac.hashCode() : 0);
        return result;
    }
}
