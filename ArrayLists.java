import java.util.ArrayList;

public class ArrayLists
{
    public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Integer> roll = new ArrayList<Integer>();

    name.add("Joydeb Jana");
    name.add("Buddhadev Jana");
    name.add("Khokan Chandra Jana");

    roll.add(1);
    roll.add(2);
    roll.add(3);

    System.out.println(name);
    System.out.println(roll);
    }
}

/* Basic methods of ArrayList   :--
    a.) set(0,1)    // Basically it update the value of specified index
    b.) get();      // It returns the Element of specified Index...
    c.) remove(0); // It removes the ELement of the Specified index...
    d.) add(5); // It appends the element at the Very Last position...
    e.) sort(); // It sorts the ArrayList...
    f.) size(); // It gives us the size/Total number of Elements presents in ArratList...

*/