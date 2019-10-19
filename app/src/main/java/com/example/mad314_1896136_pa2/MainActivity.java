package com.example.mad314_1896136_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edusername,edpassword;
    Button btnsubmit;
    TextView tvmessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edusername=(EditText)findViewById(R.id.edusername);
        edpassword=(EditText)findViewById(R.id.edpassword);
        btnsubmit=(Button) findViewById(R.id.btnsubmit);
        tvmessage=(TextView)findViewById(R.id.tvdisplay);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=edusername.getText().toString();
                String password=edpassword.getText().toString();
                if (username.equals("Admin") && password.equals("Admin123")){
                    Intent i = new Intent(getApplicationContext(),DisplayActivity.class);
                    i.putExtra("name",username);
                    i.putExtra("password",password);
                    startActivity(i);
                }
                else{
                    tvmessage.setText("Invalid username or password");
                    Toast.makeText(getApplicationContext(),"Invalid USername or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

