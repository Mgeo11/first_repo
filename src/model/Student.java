package model;

public class Student {
    private int groupNumber;
    private int averagePoint;
    private int id;
    private Student(Builder builder){
        this.groupNumber = groupNumber;
        this.averagePoint = averagePoint;
        this.id = id;
    }
    public static class Builder{
        private int groupNumber;
        private int averagePoint;
        private int id;
        public Builder setGroupNumber(int groupNumber){
            this.groupNumber = groupNumber;
            return this;
        }
        public Builder setaveragePoint(int averagePoint){
            this.averagePoint = averagePoint;
            return this;
        }
        public Builder setID(int id){
            this.id = id;
            return this;
        }
    }
}
