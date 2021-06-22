package com.example.lsp.db.preference;

import android.content.Context;

import com.example.lsp.base.BaseApplication;
import com.tencent.mmkv.MMKV;

public class PublicPreferences extends AbstractPreferences {
    private static PublicPreferences _instance = null;

    private PublicPreferences(Context context) {
        importMMKV();
    }

    public static PublicPreferences getInstance() {
        if (_instance == null) {
            _instance = new PublicPreferences(BaseApplication.getContext());
        }
        return _instance;
    }

    public void importMMKV() {
        mMMKVPreferences = MMKV.mmkvWithID("PublicPreferences");
        if (mMMKVPreferences != null) {
            boolean is_import = mMMKVPreferences.getBoolean("is_import_mmkv", false);
            // migration
            if (!is_import) {
                mMMKVPreferences.putBoolean("is_import_mmkv", true);
            }
        }
    }
}
