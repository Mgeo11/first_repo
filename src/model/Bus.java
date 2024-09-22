package model;


public class Bus {
    private String number;
    private String model;
    private int milieage;
    private Bus(Builder builder) {
        this.number = builder.number;
        this.model = builder.model;
        this.milieage = builder.milieage;
    }
    public static class Builder{
        private String number;
        private String model;
        private int milieage;
        public Builder setNumber(String number){
            this.number = number;
            return this;
        }
        public Builder setModel(String model){
            this.model = model;
            return this;
        }
        public Builder setMilieage(int milieage){
            this.milieage = milieage;
            return this;
        }
        public Bus build(){
            return new Bus(this);
        }
    }
}
