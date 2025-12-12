import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Example {
    public static void main(String[] args) {
        Multiset<String> mset = HashMultiset.create();

        mset.add("apple");
        mset.add("apple", 2);
        mset.add("banana");

        System.out.println(mset.count("apple"));  // 3
        System.out.println(mset.size());          // 4

        mset.remove("apple", 1);
        
        System.out.println(mset); // [apple x 2, banana x 1]
    }
}

