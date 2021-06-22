package com.example.lsp.db.preference;

public class PreferenceUtil {
    public static final String STRING = "string";
    public static final String BOOLEAN = "boolean";
    public static final String INT = "int";
    public static final String LONG = "long";
    public static final String FLOAT = "float";
    public static final String VALUE = "value";

    public static String getVoidString() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        return publicPreferences.getStringValue(STRING);
    }
    public static void setString() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(STRING, "");
    }


    public static boolean getVoidBoolean() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        return publicPreferences.getBooleanValue(BOOLEAN);
    }
    public static void setBoolean() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(BOOLEAN, true);
    }

    public static int getVoidInt() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        return publicPreferences.getIntValue(INT);
    }
    public static void setInt() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(INT, 0);
    }

    public static long getVoidLong() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        return publicPreferences.getLongValue(LONG);
    }
    public static void setLong() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(LONG, 0L);
    }

    public static float getVoidFloat() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        return publicPreferences.getFloatValue(FLOAT);
    }
    public static void setFloat() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(LONG, 0F);
    }

    public static void getVoidValue() {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(VALUE, "");
    }

    public static void saveObject(String key, String value) {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(key, value);
    }

    public static void saveObject(String key, int value) {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(key, value);
    }

    public static void saveObject(String key, boolean value) {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(key, value);
    }

    public static void saveObject(String key, float value) {
        PublicPreferences publicPreferences = PublicPreferences.getInstance();
        publicPreferences.setValue(key, value);
    }

}
