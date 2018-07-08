package np.com.shrestha.rojil.formbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    private  String name= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        name = intent.getStringExtra("UserName");


        final TextView editText = (TextView) findViewById(R.id.txtView);


        editText.setText("Welcome" + " " +name);
    }
}
