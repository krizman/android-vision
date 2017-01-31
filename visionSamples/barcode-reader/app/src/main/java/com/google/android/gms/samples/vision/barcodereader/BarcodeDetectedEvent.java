package com.google.android.gms.samples.vision.barcodereader;

import com.google.android.gms.vision.barcode.Barcode;

/**
 * Created by Uroš Križman on 31.1.2017.
 */

public class BarcodeDetectedEvent {
    private final Barcode barcode;

    public BarcodeDetectedEvent(Barcode barcode) {
        this.barcode = barcode;
    }

    public Barcode getBarcode() {
        return barcode;
    }
}
