package device;

class Monitor extends Device{
    int resolutionX;
    int resolutionY;


    @Override
    public String toString(){

        return "manufacturer =  " + manufacturer + "\nprice = " + price + "\nserialNumber = " + serialNumber + "\nX = " + resolutionX + "\nY = " + resolutionY;
    }

    @Override
    public boolean equals(Object o){
        if(o != null&& o.getClass()== this.getClass()){
            Monitor d = (Monitor) o;
            boolean compareManufacturer = d.manufacturer.equals(this.manufacturer);
            boolean comparePrice = d.price == this.price;
            boolean compareSerialNumber = d.serialNumber == this.serialNumber;
            boolean compareX = d.resolutionX == this.resolutionX;
            boolean compareY = d.resolutionY == this.resolutionY;
            return compareManufacturer&&comparePrice&&compareSerialNumber&&compareX&&compareY;
        }
        return false;
    }

    public Monitor(String manufacturer, float price, int serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + ((manufacturer != null) ? manufacturer.hashCode() : 0);
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + serialNumber;
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;
        return result;
    }
}
