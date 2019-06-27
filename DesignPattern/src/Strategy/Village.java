package Strategy;

import java.util.Comparator;

public class Village {
    public int id;
    public String name;
    public int populaion;
    public double area;

    public Village(int id, String name, int populaion, double area) {
        this.id = id;
        this.name = name;
        this.populaion = populaion;
        this.area = area;
    }

    @Override
    public String toString() {
		return id + "." + name + " people: " + populaion + " Area: " + area;
    }
}


class SortVillageById implements Comparator<Village> {
	@Override
	public int compare(Village o1, Village o2) {
		if (o1.id > o2.id) {
            return 1;
        } else if (o1.id < o2.id) {
            return -1;
        } else {
            return 0;
        }
	}
}

class SortVillageByArea implements Comparator<Village> {
	@Override
	public int compare(Village o1, Village o2) {
		if (o1.area > o2.area) {
            return 1;
        } else if (o1.area < o2.area) {
            return -1;
        } else {
            return 0;
        }
	}
}

class SortVillageByName implements Comparator<Village> {
	@Override
	public int compare(Village o1, Village o2) {
		if (o1.name.charAt(0) > o2.name.charAt(0)) {
            return 1;
        } else if (o1.name.charAt(0) < o2.name.charAt(0)) {
            return -1;
        } else {
            return 0;
        }
	}
}
