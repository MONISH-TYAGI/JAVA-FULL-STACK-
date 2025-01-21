package com.basics;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getSalary()-o2.getSalary();
    }
}
