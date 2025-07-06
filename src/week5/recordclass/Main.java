package week5.recordclass;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", "Yılmaz", 1001);
        Student s2 = new Student("Ayşe", "Kara", 1002);
        Student s3 = new Student("Ali", "Yılmaz", 1001); // s1 ile aynı

        // Öğrencileri yazdır
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        System.out.println("\nSet içerisindeki öğrenci sayısı: " + studentSet.size());
        System.out.println("Set içeriği:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
