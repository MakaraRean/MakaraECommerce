package com.makara.logic;

public class Helper {
    public static double subtractIfDecimal(double value) {
        String val = String.valueOf(value);
        if (val.contains(".00")) {
            int intval = Integer.parseInt(val.replace(".00", ""));
            return intval;
        } else {
            return Double.parseDouble(val);
        }
    }
}
