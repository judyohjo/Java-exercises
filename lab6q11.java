public class ElectronicToy {
    private EmbeddedBattery battery;
    public ElectronicToy(){ 
        this.battery = new EmbeddedBattery();
    }
    public int getToyID(){ 
        return battery.getBatteryID(); 
    }
    private class EmbeddedBattery {
        private final int ID;
        public EmbeddedBattery(){ 
            ID = (int) (Math.random() * (100 - 1) + 1);
        }
        public int getBatteryID() { 
            return ID; 
        }
    }
}
