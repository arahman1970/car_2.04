package com.example.demo;


    // Define setter and getters. Program does not do any validations or null value check

   public class Carinfo {

        private long id;


        private String car_name;


        private String car_type;


        private String car_desc;


        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getCar_name() {
            return car_name;
        }

        public void setCar_name(String car_name) {
            this.car_name = car_name;
        }

        public String getCar_type() {
            return car_type;
        }

        public void setCar_type(String car_type) {
            this.car_type = car_type;
        }

        public String getCar_desc() {
            return car_desc;
        }

        public void setCar_desc(String car_desc) {
            this.car_desc = car_desc;
        }
    }
