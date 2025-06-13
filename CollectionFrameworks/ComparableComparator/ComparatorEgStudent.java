package CollectionFrameworks.ComparableComparator;
/* The Comparator interface in Java is used to define a custom order for sorting objects.
 Unlike the Comparable interface, which defines a natural order within a class, 
Comparator allows you to create multiple sorting orders for the same class.

==>Key Points of Comparator Interface:
Method to Implement: The Comparator interface has two key methods (though usually only the compare method is implemented):
****int compare(T o1, T o2);
This method compares two objects o1 and o2 and returns:
*A negative integer if o1 is less than o2.
*Zero if o1 is equal to o2.
*A positive integer if o1 is greater than o2.
#Usage: Comparator is used when you need multiple ways to compare and sort objects.
 For instance, you might want to sort a list of students by marks, and in another case, by name.
 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks; // Sort by marks in ascending order
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Sort by name in alphabetical order
    }
}

public class ComparatorEgStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 90));

        // Sort by marks using MarksComparator
        Collections.sort(students, new MarksComparator());
        System.out.println("Sorted by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name using NameComparator
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}


