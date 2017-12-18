package com.project250.list_view_adapter;

class Car{
    String carname;
    String info1;
    String info2;
    String info3;
    String info4;
    String info5;
    String passengerno;
    String seats;
    String priceperday;
    String carlocation;
    String date;
    String time;

    public Car() {
    }

    public Car(String carname,String info1, String info2, String info3, String info4, String info5, String passengerno, String seats, String priceperday, String carlocation, String date, String time) {
        this.carname = carname;
        this.info1 = info1;
        this.info2 = info2;
        this.info3 = info3;
        this.info4 = info4;
        this.info5 = info5;
        this.passengerno = passengerno;
        this.seats = seats;
        this.priceperday = priceperday;
        this.carlocation = carlocation;
        this.date = date;
        this.time = time;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3;
    }

    public String getInfo4() {
        return info4;
    }

    public void setInfo4(String info4) {
        this.info4 = info4;
    }

    public String getInfo5() {
        return info5;
    }

    public void setInfo5(String info5) {
        this.info5 = info5;
    }

    public String getPassengerno() {
        return passengerno;
    }

    public void setPassengerno(String passengerno) {
        this.passengerno = passengerno;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getPriceperday() {
        return priceperday;
    }

    public void setPriceperday(String priceperday) {
        this.priceperday = priceperday;
    }

    public String getCarlocation() {
        return carlocation;
    }

    public void setCarlocation(String carlocation) {
        this.carlocation = carlocation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
