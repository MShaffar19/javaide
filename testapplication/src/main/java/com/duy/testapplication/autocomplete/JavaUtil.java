package com.duy.testapplication.autocomplete;

/**
 * Created by Duy on 20-Jul-17.
 */

public class JavaUtil {
    public String getSimpleName(String className) {
        if (className.contains(".")) {
            return className.substring(className.lastIndexOf("."));
        } else {
            return className;
        }
    }

    public String getPackageName(String classname) {
        if (classname.contains(".")) {
            return classname.substring(0, classname.indexOf("."));
        } else {
            return "";
        }
    }

    public String getInverseName(String className) {
        String[] split = className.split(".");
        String result = "";
        for (String s : split) {
            result = s + result;
        }
        return result;
    }

}