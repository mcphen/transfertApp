package com.example.adja.mobilebankinok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BillListActivity extends AppCompatActivity {
    private ListView listBill;
    private String bill;
    private String[]tabBill={"SDE","SENELEC","SONATEL","CANAL+","RAPIDO"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_list);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(BillListActivity.this,android.R.layout.simple_list_item_1,tabBill);
        listBill=(ListView)findViewById(R.id.listBill);
        listBill.setAdapter(adapter);
    }
}
