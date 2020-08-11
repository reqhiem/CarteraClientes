package com.example.perca.carteraclientes.BaseDatos;

import com.example.perca.carteraclientes.BaseDatos.FeedReaderClient;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class DatosOpenHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "DATOS";

    private static final String SQL_CREATE_ENTRIES  =
            "CREATE TABLE IF NOT EXISTS " + FeedReaderClient.FeedEntry.TABLE_NAME + " (" +
                    FeedReaderClient.FeedEntry.COLUMN_NAME_TITLE + " VARCHAR(250), " +
                    FeedReaderClient.FeedEntry.COLUMN_ADDRESS_TITLE + " VARCHAR(250), " +
                    FeedReaderClient.FeedEntry.COLUMN_EMAIL_TITLE+ " VARCHAR(200), " +
                    FeedReaderClient.FeedEntry.COLUMN_MOBILE_TITLE + " VARCHAR(20))";


    public DatosOpenHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
