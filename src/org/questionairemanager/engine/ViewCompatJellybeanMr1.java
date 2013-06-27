package org.questionairemanager.engine;

import android.graphics.Paint;
import android.view.View;

/**
 * Jellybean MR1 - specific View API access.
 */
class ViewCompatJellybeanMr1 {

    public static int getLabelFor(View view) {
        return view.getLabelFor();
    }

    public static void setLabelFor(View view, int id) {
        view.setLabelFor(id);
    }

    public static void setLayerPaint(View view, Paint paint) {
        view.setLayerPaint(paint);
    }
}