package alexis.tp2;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import java.text.MessageFormat;

public class Activity2 extends Activity {
    private void print(Personne personne) {
        TextView txtResultat = findViewById(R.id.txtResultat);
        String message = MessageFormat.format("Salut {0} {1}, tu as {2} ans !", personne.getNom(), personne.getPrenom(), personne.getAge());
        txtResultat.setText(message);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Personne personne = (Personne) this.getIntent().getParcelableExtra("personne");
        if (personne != null) {
            print(personne);
        }
    }
}
