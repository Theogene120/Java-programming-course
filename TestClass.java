import java.util.*;


class MultiSet {
    private ArrayList<Integer> elements;

    public MultiSet() {
        elements = new ArrayList<>();
    }

    public void insert(int value) {
        elements.add(value);
    }

    public void delete(int value) {
        if (elements.contains(value)) {
            elements.remove(Integer.valueOf(value));
        } else {
            System.out.println(value + " not found in the multiset.");
        }
    }

    public int size() {
        return elements.size();
    }

    public MultiSet union(MultiSet other) {
        MultiSet result = new MultiSet();
        result.elements.addAll(this.elements);
        result.elements.addAll(other.elements);
        return result;
    }

    public void display() {
        System.out.println(elements);
    }
}

// Here is the TestClass class to test if multiSet we created is working
public class TestClass {
    public static void main(String[] args) {
        MultiSet ms1 = new MultiSet();
        ms1.insert(1);
        ms1.insert(2);
        ms1.insert(2);
        ms1.insert(3);

        MultiSet ms2 = new MultiSet();
        ms2.insert(3);
        ms2.insert(4);

        System.out.print("Multiset 1: ");
        ms1.display();

        System.out.print("Multiset 2: ");
        ms2.display();

        MultiSet unionSet = ms1.union(ms2);
        System.out.print("Union: ");
        unionSet.display();

        ms1.delete(2);
        System.out.print("First '2' deleted from Multiset 1: ");
        ms1.display();

        System.out.println("Size of Multiset 1: " + ms1.size());
    }
}

