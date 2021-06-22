package com.example.lsp.db.preference;
import com.tencent.mmkv.MMKV;

public abstract class AbstractPreferences {
    protected MMKV mMMKVPreferences;

    public void setValue(String key, String value) {
        mMMKVPreferences.putString(key, value);
    }

    public String getStringValue(String key) {
        return mMMKVPreferences.getString(key, null);
    }

    public void setValue(String key, int value) {
        mMMKVPreferences.putInt(key, value);
    }

    public void setValue(String key, long value) {
        mMMKVPreferences.putLong(key, value);
    }

    public long getLongValue(String key) {
        return mMMKVPreferences.getLong(key, 0);
    }

    public long getLongValue(String key, long defaultValue) {
        return mMMKVPreferences.getLong(key, defaultValue);
    }

    public int getIntValue(String key) {
        return mMMKVPreferences.getInt(key, 0);
    }

    public int getIntValue(String key, int defaultValue) {
        return mMMKVPreferences.getInt(key, defaultValue);
    }

    public void setValue(String key, Float value) {
        mMMKVPreferences.putFloat(key, value);
    }

    public float getFloatValue(String key) {
        return mMMKVPreferences.getFloat(key, 0);
    }

    public void setValue(String key, Boolean value) {
        mMMKVPreferences.putBoolean(key, value);
    }

    public Boolean getBooleanValue(String key) {
        return mMMKVPreferences.getBoolean(key, false);
    }

    public Boolean getBooleanValue(String key, boolean defaultValue) {
        return mMMKVPreferences.getBoolean(key, defaultValue);
    }

    public boolean isContain(String key) {
        return mMMKVPreferences.contains(key);
    }

    public void removeKey(String key) {
        mMMKVPreferences.remove(key);
    }
}
