package com.example.nokiaasha.callhistory;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by NOKIA ASHA on 27/03/2015.
 */

public class Suggest extends Activity implements View.OnClickListener {


    TableLayout table;
    TableRow tableRow;
    TextView price, description;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suggest_plans);
        Log.e("suggest","i m all write");
        table = (TableLayout)findViewById(R.id.table);


        for(int i=0;i<6;i++){
            tableRow =new TableRow(this);
            TableRow.LayoutParams param = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT);
            tableRow.setLayoutParams(param);
            tableRow.setId(View.generateViewId());
            Log.e("suggest","after setting parameters");

            price = new TextView(this);
            description = new TextView(this);

            price.setText("price  "+i);
            description.setText("description  " + i);

            price.setTextSize((float) 30.0);
            description.setTextSize((float) 30.0);
            Log.e("suggest","after set text");

            price.setId(View.generateViewId());
            description.setId(View.generateViewId());

            tableRow.addView(price);
            tableRow.addView(description);
            Log.e("suggest","after adding view");


            table.addView(tableRow);

            price.setOnClickListener(this);
            description.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent i = new Intent(this, PlanDescription.class);
        startActivity(i);
    }
}
