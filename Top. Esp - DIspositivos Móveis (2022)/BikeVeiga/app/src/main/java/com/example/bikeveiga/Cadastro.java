package com.example.bikeveiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {
    private EditText nomeAluno;
    private EditText sobrenomeAluno;
    private EditText matAluno;
    private EditText emailAluno;
    private EditText telefoneAluno;
    private EditText numCard;
    private EditText vencCard;
    private EditText cvvCard;
    private Button btn_prosseguir;
    protected RadioGroup sex;
    private RadioGroup bandeira;
    private RadioGroup curso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nomeAluno = findViewById(R.id.editTextNome);
        sobrenomeAluno = findViewById(R.id.editTextSobrenome);
        matAluno = findViewById(R.id.editTextMat);
        emailAluno= findViewById(R.id.editTextEmail);
        telefoneAluno = findViewById(R.id.editTextTel);
        numCard = findViewById(R.id.editTextCard);
        cvvCard = findViewById(R.id.editTextCVV);
        vencCard = findViewById(R.id.editTextVenc);
        sex = findViewById(R.id.radioSexo);
        bandeira = findViewById(R.id.radioBandeira);
        curso = findViewById(R.id.radioCurso);
        Context context = getApplicationContext();



        btn_prosseguir = findViewById(R.id.btn_prosseguir);

        btn_prosseguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if      (nomeAluno.getText().toString().isEmpty()
                        || nomeAluno.getText().toString().isEmpty()
                        || nomeAluno.getText().toString().isEmpty()
                        || nomeAluno.getText().toString().isEmpty()
                        || nomeAluno.getText().toString().isEmpty()
                        || nomeAluno.getText().toString().isEmpty()
                        || nomeAluno.getText().toString().isEmpty()
                        || nomeAluno.getText().toString().isEmpty() )
                {
                    Toast.makeText(context, "Preencha Todos os Campos!",
                            Toast.LENGTH_LONG).show();


                } else {
                    Intent revisar = new Intent(getApplicationContext(), Revisar.class);

                    revisar.putExtra("nome", nomeAluno.getText().toString());
                    revisar.putExtra("sobrenome", sobrenomeAluno.getText().toString());
                    revisar.putExtra("matricula", matAluno.getText().toString());
                    revisar.putExtra("sexo", getSex());
                    revisar.putExtra("curso", getCurso());
                    revisar.putExtra("email", emailAluno.getText().toString());
                    revisar.putExtra("numerocartao", numCard.getText().toString());
                    revisar.putExtra("datacartao", vencCard.getText().toString());
                    revisar.putExtra("cvv", cvvCard.getText().toString());
                    revisar.putExtra("bandeira", getBandeira());
                    revisar.putExtra("telefone", telefoneAluno.getText().toString());
                    startActivity(revisar);
                }

            }

        });
    }

    public String getSex(){
      int id = sex.getCheckedRadioButtonId();

      RadioButton radiobutton = findViewById(id);

      return radiobutton.getText().toString();
    }

    public String getBandeira(){
        int id = bandeira.getCheckedRadioButtonId();

        RadioButton radiobutton = findViewById(id);

        return radiobutton.getText().toString();
    }

    public String getCurso(){
        int id = curso.getCheckedRadioButtonId();

        RadioButton radiobutton = findViewById(id);

        return radiobutton.getText().toString();
    }
}

