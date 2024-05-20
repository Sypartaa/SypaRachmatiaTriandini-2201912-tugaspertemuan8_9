/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author ASUS
 */
public class no2 {
    
    public static void main(String[] args) {
        Person person = new Person("Randi", "Jl. Manunggal 04", "085777629880", "randiramadhani123@gmail.com");
        Student student = new Student("Rifki", "Jl. MU 14", "085777629888", "rifkiseptiandi@gmail.com", Student.SENIOR);
        Employee employee = new Employee("Rony", "Jl. Mawar 10", "085777629889", "Ronyparulian@gmail.com", "Gedung FPMIPA B", 3000000, new MyDate());
        Faculty faculty = new Faculty("Prof. Dr. Nyoman", "Jl. Bali 23", "085777629822", "nyomanpaul@gmail.com", "Gedung Dekan FPMIPA ", 7500000, new MyDate(), 10, "Dekan");
        Staff staff = new Staff("Lyodra", "Jl. Jendral Sudirman", "085777629854", "lyodra@gmail.com", "Ruang staff FPMIPA", 4000000, new MyDate(), "Staff pemasaran");

        System.out.println(person.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(student.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(employee.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(faculty.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(staff.toString());
        System.out.println("=========================================");
        System.out.println();
    }
}