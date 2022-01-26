package com.ushwamala.interview.functionalinterface;

import java.util.HashMap;
import java.util.Map;

public class Functions {
    public static void main(String[] args) {
        //a method that receives one value and returns another.
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("Ushamah", name -> name.length());

        Permission permission = Permission.ADMIN;
        String permissionName = permission.name();
        System.out.println(permission);
    }
}


enum Permission{
    ADMIN("ADMIN"),
    USER("USER");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }
}
