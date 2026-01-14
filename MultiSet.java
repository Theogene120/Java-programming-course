import java.util.ArrayList;

public class MultiSet {
    private ArrayList<Integer> elements;

    // Constructor
    public MultiSet() {
        elements = new ArrayList<>();
    }

    // Insert element
    public void insert(int value) {
        elements.add(value);
    }

    // Delete one occurrence of element
    public void delete(int value) {
        if (elements.contains(value)) {
            elements.remove(Integer.valueOf(value));
        } else {
            System.out.println(value + " not found in the multiset.");
        }
    }

    // Return total number of elements (including duplicates)
    public int size() {
        return elements.size();
    }

    // Union: combine elements of two multisets
    public MultiSet union(MultiSet other) {
        MultiSet result = new MultiSet();
        result.elements.addAll(this.elements);   // add all from this
        result.elements.addAll(other.elements);  // add all from other
        return result;
    }

    // Show all elements
    public void display() {
        System.out.println(elements);
    } 
}
