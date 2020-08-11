package com.example.perca.carteraclientes.BaseDatos;

import android.provider.BaseColumns;

public final class FeedReaderClient {
    private FeedReaderClient() {}

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "CLIENTE";
        public static final String COLUMN_NAME_TITLE = "NOMBRE";
        public static final String COLUMN_ADDRESS_TITLE = "DIRECCION";
        public static final String COLUMN_EMAIL_TITLE = "EMAIL";
        public static final String COLUMN_MOBILE_TITLE = "TELEFONO";
    }
}