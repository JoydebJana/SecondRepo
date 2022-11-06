import java.util.ArrayList;

public class ArrayList
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

    System.out.println(name+"\n");
    System.out.println(roll);
    }
}