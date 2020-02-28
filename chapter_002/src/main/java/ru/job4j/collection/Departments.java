package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> temp = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String str : deps) {
            for (String el : str.split("/")) {
                if (el.length() < 3) {
                    temp.add(el);
                    sb = new StringBuilder(el);
                } else if (el.length() == 3) {
                    temp.add(sb + "/" + el);
                    sb.append("/").append(el);
                } else {
                    temp.add(sb + "/" + el);
                }
            }
        }
        deps.clear();
        deps.addAll(temp);
        return deps;
    }
    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }
    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }

    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("K1/SK1");
        ls.add("K1/SK2");
        ls.add("K1/SK1/SSK1");
        ls.add("K1/SK1/SSK2");
        ls.add("K2");
        ls.add("K2/SK1/SSK1");
        ls.add("K2/SK1/SSK2");
        System.out.println(Departments.fillGaps(ls));
        Departments.sortAsc(ls);
        System.out.println(ls);
        Departments.sortDesc(ls);
        System.out.println(ls);
    }
}
