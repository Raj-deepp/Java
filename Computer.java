// CPU.java
class CPU {
    private String manufacturer;
    private double price;

    public CPU(String manufacturer, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    class Processor {
        private int numCores;
        private String manufacturer;
        private double cache;

        public Processor(int numCores, String manufacturer, double cache) {
            this.numCores = numCores;
            this.manufacturer = manufacturer;
            this.cache=cache;
        }

        public int getNumCores() {
            return numCores;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public double getCache() {
            return cache;
        }

        public void setCache(double cache) {
            this.cache = cache;
        }
    }

    class RAM {
        private double memory;
        private String manufacturer;

        public RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public double getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }
}


// Computer.java
class Computer {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel", 300.00);
        CPU.Processor p = cpu.new Processor(8, "Intel", 32);
        CPU.RAM r = cpu.new RAM(16.0, "Corsair");

        // Display CPU details
        System.out.println("CPU Manufacturer: " + cpu.getManufacturer());
        System.out.println("CPU Price: $" + cpu.getPrice());

        // Display Processor details
        System.out.println("Processor Manufacturer: " + p.getManufacturer());
        System.out.println("Number of Cores: " + p.getNumCores());
        System.out.println("Cache: " + p.getCache()+" MB");

        // Display RAM details
        System.out.println("RAM Manufacturer: " + r.getManufacturer());
        System.out.println("RAM Memory: " + r.getMemory() + "GB");
    }
}
