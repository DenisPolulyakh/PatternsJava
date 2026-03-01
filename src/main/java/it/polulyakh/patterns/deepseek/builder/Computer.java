package it.polulyakh.patterns.deepseek.builder;

public class Computer {
    private String processor;
    private int ram;

    private int storage;
    private String storageType;
    private String graphicsCard;
    private boolean hasWifi;
    private boolean hasBluetooth;
    private String operatingSystem;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.storageType = builder.storageType;
        this.graphicsCard = builder.graphicsCard;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
        this.operatingSystem = builder.operatingSystem;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", storageType='" + storageType + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", hasWifi=" + hasWifi +
                ", hasBluetooth=" + hasBluetooth +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    public static class Builder {

        private final String processor;
        private final int ram;
        private int storage = 512;
        private String storageType = "SSD";
        private String graphicsCard = "Интегрированная";
        private boolean hasWifi = false;
        private boolean hasBluetooth = false;
        private String operatingSystem = "Без ОС";

        public Builder(String processor, int ram){
            if (processor == null || processor.trim().isEmpty()) {
                throw new IllegalArgumentException("Процессор не может быть пустым");
            }
            if (ram <= 0) {
                throw new IllegalArgumentException("RAM должна быть положительным числом");
            }
            this.processor = processor;
            this.ram = ram;
        }

        public Builder storage(int storage){
            if(storage <= 0){
                throw new IllegalArgumentException("storage доложен быть больше 0");
            }
            this.storage = storage;
            return this;
        }

        public Builder storageType(String storageType){
            if(!storageType.equalsIgnoreCase("HDD") && !storageType.equalsIgnoreCase("SSD")) {
                throw new IllegalArgumentException("только HDD или SSD");
            }
            this.storageType = storageType;
            return this;
        }

        public Builder graphicsCard(String graphicsCard){
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder hasWifi(boolean hasWifi){
            this.hasWifi = hasWifi;
            return this;
        }

        public Builder hasBluetooth(boolean hasBluetooth){
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder operatingSystem(String operatingSystem){
            if (operatingSystem != null && operatingSystem.trim().isEmpty()) {
                throw new IllegalArgumentException("Название ОС не может быть пустой строкой");
            }
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build(){
            // Проверка совместимости HDD и объема
            if ("HDD".equalsIgnoreCase(storageType) && storage < 500) {
                throw new IllegalStateException("Для HDD минимальный объем 500 ГБ (текущий: " + storage + " ГБ)");
            }
            return new Computer(this);
        }

    }
}
