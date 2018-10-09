package alexis.tp2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Activity1 extends Activity implements View.OnClickListener {
    private List<EditText> recupChamps() {
        List<EditText> champs = new ArrayList<>();
        champs.add((EditText) findViewById(R.id.edtNom));
        champs.add((EditText) findViewById(R.id.edtPrenom));
        champs.add((EditText) findViewById(R.id.edtAge));
        return champs;
    }

    private void highlightEmpty(EditText champ) {
        champ.setHighlightColor(Color.RED);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        ((Button) findViewById(R.id.btnEnvoyer)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Personne personne = new Personne();

        // vérification si tout les champs sont remplis
        boolean hasEmpty = false;
        for (EditText edt : recupChamps()) {
            edt.setHighlightColor(Color.BLACK);
            if (edt.getText().length() == 0) {
                hasEmpty = true;
                edt.setHighlightColor(Color.RED);
            } else {
                if (edt.getId() == R.id.edtNom) {
                    personne.setNom(edt.getText().toString());
                } else if (edt.getId() == R.id.edtPrenom) {
                    personne.setPrenom(edt.getText().toString());
                } else if (edt.getId() == R.id.edtAge) {
                    personne.setAge(Integer.parseInt(edt.getText().toString()));
                }
            }
        }

        // si aucune erreur
        if (!hasEmpty) {
            Intent it = new Intent(this, Activity2.class);
            Bundle bd = new Bundle();
            bd.putParcelable("personne", personne);
            it.putExtras(bd);

            startActivity(it);
        }
    }
}
