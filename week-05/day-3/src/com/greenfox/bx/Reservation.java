package com.greenfox.bx;

/**
 * Created by regnisalram on 11/16/16.
 */
public class Reservation implements Reservationy{

    String dowBooking;
    String codeBooking;

    public Reservation(String s) {
        this.dowBooking = s;
        this.codeBooking = randomZeroToZ(8);
    }

    @Override
    public void setDowBooking(String dowBooking) {
        this.dowBooking = dowBooking;
    }

    @Override
    public String getDowBooking() {
        return dowBooking;
    }

    @Override
    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    @Override
    public String getCodeBooking() {
        return this.codeBooking;
    }

    @Override
    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return true;
    }

    @Override
    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return true;
    }

    @Override
    public String toString() {
        return "Booking# " + getCodeBooking() + " for " + getDowBooking();
    }

    final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static String randomZeroToZ(int len) {
        String out = "";
        for(int i= 0; i<len; i++) {
            out += ls.charAt((int) (Math.random() * 36));
        }
        return out;
    }
}
