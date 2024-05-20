/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author ASUS
 */
public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty() {
    }

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Kelas: Faculty\nNama: " + name + "\nAlamat: " + address + "\nNoTelpon: " + phoneNumber + "\nEmail: " + email + "\nKantor: " + office + "\nGaji: " + salary + "\nTanggal mulai kerja: " + dateHired + "\nLama jam kerja: " + officeHours + "\nPangkat: " + rank;
    }
}