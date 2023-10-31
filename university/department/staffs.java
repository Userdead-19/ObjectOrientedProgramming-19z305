package university.department;

import java.util.ArrayList;

public class staffs {
    public ArrayList<String> staffs = new ArrayList<String>();

    public void add(String s) {
        staffs.add(s);
    }

    public void remove(String s) {
        staffs.remove(s);
    }

    public void print() {
        System.out.println(staffs);
    }

    public int size() {
        return staffs.size();
    }

}
