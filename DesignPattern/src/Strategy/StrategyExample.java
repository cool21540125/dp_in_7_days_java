package Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class StrategyExample {
	public static void main(String[] args) {
        Village v1 = new Village(3, "apple", 32, 5.1);
        Village v2 = new Village(1, "banana", 22, 1.7);
        Village v3 = new Village(2, "cape", 10, 10.2);

        ArrayList<Village> villages = new ArrayList<>();
        villages.add(v1);
        villages.add(v2);
        villages.add(v3);

        System.out.println("沒排序");
        showList(villages);

        System.out.println("依照 id");
        Collections.sort(villages, new SortVillageById());
        showList(villages);

        System.out.println("依照面積");
        Collections.sort(villages, new SortVillageByArea());
        showList(villages);
    }

    public static void showList(ArrayList<Village> list_) {
        for (Village v : list_) {
            System.out.println(v);
        }
    }
}
