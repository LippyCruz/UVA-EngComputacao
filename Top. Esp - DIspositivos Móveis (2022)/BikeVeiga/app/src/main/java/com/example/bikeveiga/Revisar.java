package com.example.bikeveiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Revisar extends AppCompatActivity {
    private TextView nomeAluno;
    private TextView sobrenomeAluno;
    private TextView matAluno;
    private TextView sexAluno;
    private TextView cursoAluno;
    private TextView emailAluno;
    private TextView telefoneAluno;
    private TextView numCard;
    private TextView vencCard;
    private TextView cvvCard;
    private TextView bandeiraCard;
    private Button confirmar;
    private Button cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revisar);

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString ("nome");
        String sobrenome = dados.getString ("sobrenome");
        String matricula = dados.getString ("matricula");
        String cvv = dados.getString ("cvv");
        String ncartao = dados.getString ("numerocartao");
        String venc = dados.getString ("datacartao");
        String sex = dados.getString ("sexo");
        String curso = dados.getString ("curso");
        String email = dados.getString ("email");
        String telefone = dados.getString ("telefone");
        String bandeira = dados.getString ("bandeira");

        nomeAluno = findViewById(R.id.textNome);
        nomeAluno.setText(nome);

        sobrenomeAluno = findViewById(R.id.textSobrenome);
        sobrenomeAluno.setText(sobrenome);

        matAluno = findViewById(R.id.textMatricula);
        matAluno.setText(matricula);

        sexAluno = findViewById(R.id.textSexo);
        sexAluno.setText(sex);

        cursoAluno = findViewById(R.id.textCurso);
        cursoAluno.setText(curso);

        emailAluno = findViewById(R.id.textEmail);
        emailAluno.setText(email);

        telefoneAluno = findViewById(R.id.textTelefone);
        telefoneAluno.setText(telefone);

        numCard = findViewById(R.id.textCartao);
        numCard.setText(ncartao);

        vencCard = findViewById(R.id.textVenc);
        vencCard.setText(venc);

        cvvCard = findViewById(R.id.textCVV);
        cvvCard.setText(cvv);

        bandeiraCard = findViewById(R.id.textBandeira);
        bandeiraCard.setText(bandeira);

        confirmar = findViewById(R.id.btnConfirmar);
        cancelar = findViewById(R.id.btnCancelar);


        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                Toast.makeText(context, "Dados Corretos!",
                        Toast.LENGTH_LONG).show();

                Intent home = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(home);
            }
        });




        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Cadastro.class);
                startActivity(intent);

            }
        });



    }
}

