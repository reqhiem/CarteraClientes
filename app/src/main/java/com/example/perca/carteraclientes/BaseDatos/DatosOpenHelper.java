package com.example.perca.carteraclientes.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatosOpenHelper extends SQLiteOpenHelper {
    public DatosOpenHelper(Context context){
        super(context, "DATOS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sql = "CREATE TABLE IF NOT EXISTS CLIENTE(" +
                "NOMBRE VARCHAR(250), " +
                "DIRECCION VARCHAR(250), " +
                "EMAIL VARCHAR(200), " +
                "TELEFONO VARCHAR(20))";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
