package alexis.tp2;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button btnSearch = (Button) findViewById(R.id.button);
        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, Activity2.class);

        Bundle bd = new Bundle();
        bd.putString("info", ((EditText) findViewById(R.id.editText)).getText().toString());
        it.putExtras(bd);

        startActivity(it);
    }
}
