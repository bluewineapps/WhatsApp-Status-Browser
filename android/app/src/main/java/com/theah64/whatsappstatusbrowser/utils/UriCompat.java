package com.theah64.whatsappstatusbrowser.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;

import java.io.File;

/**
 * Created by theapache64 on 23/1/17.
 */
public class UriCompat {
    public static Uri fromFile(final Context context, File file) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".provider", file);
        }

        return Uri.fromFile(file);
    }
}