package basicapp.basicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void login(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        TextView textView = (TextView) findViewById(R.id.txtUsername);
        TextView textView1 = (TextView) findViewById(R.id.txtPassword);
        String message = "You tried to login with Username: " + textView.getText().toString() + " and Password: " + textView1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void register(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        TextView textView = (TextView) findViewById(R.id.txtUsername);
        TextView textView1 = (TextView) findViewById(R.id.txtPassword);
        String message = "You tried to register with Username: " + textView.getText().toString() + " and Password:  "+ textView1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
