package CollectionFrameworks.ComparableComparator;

/*The Comparable interface in Java is used to define a natural ordering for objects of a class.
 It is commonly implemented to allow objects of a class to be compared to each other, typically for sorting purposes.

==>Key Points of Comparable Interface:
#Method to Implement: The Comparable interface has only one method:
***public int compareTo(T o);
This method compares the current object (this) with the specified object (o) and returns:
*A negative integer if the current object is less than the specified object.
*Zero if the current object is equal to the specified object.
*A positive integer if the current object is greater than the specified object.
#Usage: When a class implements Comparable, 
you can sort collections of that class's objects using methods like 
Collections.sort() or Arrays.sort(), which will use the compareTo method for comparison. */

    import java.util.*;

class ComparableEgStudent implements Comparable<ComparableEgStudent> {
    String name;
    int marks;

    ComparableEgStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(ComparableEgStudent other) {
        return this.marks - other.marks; // Sort by marks in ascending order
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }

    public static void main(String[] args) {
        List<ComparableEgStudent> students = new ArrayList<>();
        students.add(new ComparableEgStudent("Alice", 85));
        students.add(new ComparableEgStudent("Bob", 75));
        students.add(new ComparableEgStudent("Charlie", 90));

        Collections.sort(students);

        for (ComparableEgStudent s : students) {
            System.out.println(s);
        }
    }
}

