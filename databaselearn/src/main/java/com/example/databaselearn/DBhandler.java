package com.example.databaselearn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by artur on 09.10.2017.
 */

public class DBhandler extends SQLiteOpenHelper implements IDBhandler{
    //Operators
    private final static String CREATE = "CREATE TABLE ";
    private final static String SEPARATOR = ", ";
    //Fields of TABLE
    private final static String TABLE_NAME = " My_table";
    private final static String ID = "id";
    private final static String L_NAME = " name";
    private final static String F_NAME = " fname";
    private final static String AGE = " age";


    //Types of columns
    private final static String TEXT = " TEXT";
    private final static String INT = " INTEGER";
    private final static String IDconfig = " integer primary key autoincrement";

    //Information about DATABASE
    private final static int DATABASE_VERSION = 1;
    private final static String DATABASE_NAME = "My_database";

    //Potrion
    private String[] projection = new String[]{ID, F_NAME, L_NAME,AGE};
    public DBhandler(Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Create_Table = CREATE+TABLE_NAME+"("+ID+IDconfig+SEPARATOR+F_NAME+TEXT+SEPARATOR+
                L_NAME+TEXT+SEPARATOR+AGE+INT+")";
        sqLiteDatabase.execSQL(Create_Table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public void addEmployee(Employee employee) {
        SQLiteDatabase database = this.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(F_NAME, employee.getFname());
        values.put(L_NAME, employee.getLname());

        values.put(AGE, employee.getAge());
        database.insert(TABLE_NAME, null, values);
        database.close();

    }

    @Override
    public Employee getEmployee(int id) {
        SQLiteDatabase database =  this.getReadableDatabase();
        Cursor cursor = database.query(TABLE_NAME, projection, ID+"=?",new String[]{String.valueOf(id)}, null, null, null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        Employee employee = new Employee( cursor.getString(1), cursor.getString(2), cursor.getInt(3));
        database.close();
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        SQLiteDatabase db = this.getWritableDatabase();
        List<Employee> employeesList = new ArrayList<Employee>();
        String selectQuery = "SELECT * FROM" + TABLE_NAME;


        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Employee employee = new Employee();

                employee.setFname(cursor.getString(1));
                employee.setLname(cursor.getString(2));
                employee.setAge(cursor.getInt(3));
                employeesList.add(employee);
            } while (cursor.moveToNext());
        }

        return employeesList;
    }

    @Override
    public int getEmployeeCounts() {
        return 0;
    }

    @Override
    public int updateEmployee(Employee employee) {
        return 0;
    }

    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public void deleteAll() {

    }
}
