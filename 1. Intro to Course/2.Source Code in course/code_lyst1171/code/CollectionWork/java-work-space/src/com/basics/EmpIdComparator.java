package com.basics;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getEmpId()-o2.getEmpId();
    }
}
