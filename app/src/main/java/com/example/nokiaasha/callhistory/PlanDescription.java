package com.example.nokiaasha.callhistory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by NOKIA ASHA on 27/03/2015.
 */
public class PlanDescription extends Activity{

    String[] plans = {"hello","how","are","you"};
    ListView plan;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_description);

        plan = (ListView) findViewById(R.id.plans);

        ArrayAdapter<String> adapterPlan = new ArrayAdapter<String>(PlanDescription.this, android.R.layout.simple_list_item_1,plans);
        plan.setAdapter(adapterPlan);

    }
}
