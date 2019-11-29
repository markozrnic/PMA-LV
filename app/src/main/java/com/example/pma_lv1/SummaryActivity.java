package com.example.pma_lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    private String sIme;
    private String sPrezime;
    private String sGodina;
    private TextView oImePrezime;
    private TextView oGodina;


    //Drugi Activity
    private String sPredmet;
    private TextView oPredmet;

    private String sImeProfesra;
    private TextView oImeProfesora;

    private String sAkademskaGodina;
    private TextView oAkademskaGodina;

    private String sBrojSatiPred;
    private TextView oBrojSatiPred;

    private String sBrojSatiVjezbi;
    private TextView oBrojSatiVjezbi;


    private Button oPovratak;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        final Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("Ime", sIme);
        sPrezime=oExtras.getString("Prezime",sPrezime);
        sPredmet = oExtras.getString("predmet", sPredmet);
        sGodina=oExtras.getString("Godina",sGodina);
        sImeProfesra=oExtras.getString("ImeProfesora",sImeProfesra);
        sAkademskaGodina=oExtras.getString("AkademGod",sAkademskaGodina);
        sBrojSatiPred=oExtras.getString("BrojSatiPred",sBrojSatiPred);
        sBrojSatiVjezbi=oExtras.getString("BrojSatiVjezbi",sBrojSatiVjezbi);

        oImePrezime = (TextView)findViewById(R.id.tvImePrezime);
        oImePrezime.setText(sIme + " "+ sPrezime);

        oPredmet = (TextView)findViewById(R.id.tvPredmet);
        oPredmet.setText(sPredmet);

        oGodina=(TextView)findViewById(R.id.tvGodina);
        oGodina.setText(sGodina);

        oImeProfesora=(TextView)findViewById(R.id.tvImeProfesora);
        oImeProfesora.setText(sImeProfesra);

        oAkademskaGodina=(TextView)findViewById(R.id.tvAkademskaGodina);
        oAkademskaGodina.setText(sAkademskaGodina);

        oBrojSatiPred=(TextView)findViewById(R.id.tvBrojSatiPredavanja);
        oBrojSatiPred.setText(sBrojSatiPred);

        oBrojSatiVjezbi=(TextView)findViewById(R.id.tvBrojSatiVjezbi);
        oBrojSatiVjezbi.setText(sBrojSatiVjezbi);


        oPovratak = (Button)findViewById(R.id.btnPovratak);
        oPovratak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDataStorage myDataStorage = MyDataStorage.getInstance();
                Student student = new Student(sIme,sPrezime,sPredmet);
                myDataStorage.setStudents(student);
                Intent oMainActivityIntent = new Intent(getApplicationContext(), PocetniActivity.class);
                //oMainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(oMainActivityIntent);
            }
        });


    }
}
