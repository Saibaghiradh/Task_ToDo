package com.example.newlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
      DatabaseHelper mydb;
      EditText stname,stmarks,stid,edt3,prior,dat;
      Calendar mycalendar;
      Button insertbtn,showbtn,updatebtn,deletebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb =new DatabaseHelper(this);

        edt3=(EditText) findViewById(R.id.id3);
        mycalendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener date=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                mycalendar.set(Calendar.YEAR,year);
                mycalendar.set(Calendar.MONTH,month);
                mycalendar.set(Calendar.DAY_OF_MONTH,day);
                updateLabel();
            }
        };
        edt3.setOnClickListener(view -> {
            new DatePickerDialog(MainActivity.this,date,mycalendar.get(Calendar.YEAR),mycalendar.get(Calendar.MONTH),mycalendar.get(Calendar.DAY_OF_MONTH)).show();
        });

        stname=findViewById(R.id.name);
        stmarks=findViewById(R.id.marks);
        stid=findViewById(R.id.ids);
        prior=findViewById(R.id.id1);
        insertbtn=findViewById(R.id.button);
        showbtn=findViewById(R.id.show);
        updatebtn=findViewById(R.id.update);
        deletebtn=findViewById(R.id.delete);
        prior=findViewById(R.id.id1);
        insertdata();
        showdata();
        update();
        delete();
    }
    public void insertdata()
    {
        insertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Boolean inserted=   mydb.insertData(stname.getText().toString(),stmarks.getText().toString(),prior.getText().toString(),edt3.getText().toString());
             if(inserted)
             {
                 Toast.makeText(MainActivity.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
             }
             else{
                 Toast.makeText(MainActivity.this, "Data Not inserted", Toast.LENGTH_SHORT).show();
             }
                 
            }
        });
    }
    public void showdata(){
        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor=mydb.Showdata();
                if(cursor.getCount()==0){
                    message("Error","No data");
                    return;
                }
                    StringBuffer buffer=new StringBuffer();
                    while(cursor.moveToNext()){
                        buffer.append("Preference Num: "+cursor.getString(0)+"\n")
                              .append("Task Name: "+cursor.getString(1)+"\n")
                                .append("Description: "+cursor.getString(2)+"\n")
                                .append("Priority: "+cursor.getString(3)+"\n")
                                .append("Date: "+cursor.getString(4)+"\n")
                                .append("Task Status: Completed"+"\n\n");
                    }
                    message("data", buffer.toString());
                }

        });
    }
    public void update(){
        updatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Boolean updated= mydb.update(stid.getText().toString(),stname.getText().toString(),
                        stmarks.getText().toString(),prior.getText().toString(),edt3.getText().toString());
            if(updated)
            {
                Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Error in Updating", Toast.LENGTH_SHORT).show();
            }
            }
        });
    }
    public void delete(){
        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Integer delete= mydb.delete(stid.getText().toString());
               if(delete>0)
               {
                   Toast.makeText(MainActivity.this, "Data deleted", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(MainActivity.this, "Data not Deleted", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
    public void message(String title,String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title)
                .setMessage(message)
                .show();

    }
    public void updateLabel(){
        String myformat="MM/DD/YY EEEE";
        SimpleDateFormat dateFormat=new SimpleDateFormat(myformat, Locale.US);
        edt3.setText(dateFormat.format(mycalendar.getTime()));

    }
}