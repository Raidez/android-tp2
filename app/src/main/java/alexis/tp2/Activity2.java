package alexis.tp2;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(this.getIntent().getExtras().getString("info"));
    }

}
