package org.example;

import java.util.HashMap;

public class IdToName {
    private static HashMap<String,String> map;

    public IdToName() {
        map=new HashMap<>();
        map.put("שוקו טרה בבקבוק","344687");
        map.put("מנה חמה שקית נודלס ט.בקר","375424");
        map.put("מסיר כתמים שטיחים וניש","345424");
    }

    public String get(String name) {
        return map.get(name);
    }
}
