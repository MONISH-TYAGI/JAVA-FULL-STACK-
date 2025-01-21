package com.basics;

import com.sun.source.tree.Tree;

import java.util.*;

public class CompExample {
    public static void main(String[] args) {


//Collection of employees with sorted in id wise manner
        Set<Emp> set1 = new TreeSet<>(new EmpIdComparator());
        set1.add(new Emp(1005, "durgesh", 20, 1000));
        set1.add(new Emp(1002, "harsh", 10, 2000));
        set1.add(new Emp(1010, "ankit", 18, 5000));

        System.out.println(set1);

        Set<Emp> set2 = new TreeSet<>(new EmpNameComparator());
        set2.addAll(set1);

        System.out.println(set2);

        Set<Emp> set3 = new TreeSet<>(new EmpSalaryComparator());
        set3.addAll(set2);

        System.out.println(set3);


        List<Emp> list = new ArrayList<>();
        list.addAll(set1);
        list.sort(new EmpSalaryComparator());
        System.out.println(list);

    }
}
