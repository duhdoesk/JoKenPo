package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Pedra(View view){
        this.OpcaoSelecionada("pedra");
    }

    public void Papel(View view){
        this.OpcaoSelecionada("papel");
    }

    public void Tesoura(View view){
        this.OpcaoSelecionada("tesoura");
    }

    public void OpcaoSelecionada(String OpcaoSelecionada){
        ImageView imgRes = findViewById(R.id.ImagemApp);
        TextView txtRes = findViewById(R.id.txtRes);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];

        switch(opcaoApp){
            case "pedra": imgRes.setImageResource(R.drawable.pedra); break;
            case "papel": imgRes.setImageResource(R.drawable.papel); break;
            case "tesoura": imgRes.setImageResource(R.drawable.tesoura);
        }

        if(OpcaoSelecionada == "pedra") {
            switch (opcaoApp) {
                case "pedra": txtRes.setText("Empate!"); break;
                case "papel": txtRes.setText("Você perdeu!"); break;
                case "tesoura": txtRes.setText("Você venceu! irraaa");
            }
        } else if (OpcaoSelecionada == "papel"){
            switch(opcaoApp) {
                case "papel": txtRes.setText("Empate!"); break;
                case "tesoura": txtRes.setText("Você perdeu!"); break;
                case "pedra": txtRes.setText("Você venceu! irraaa");
            }
        } else {
            switch(opcaoApp) {
                case "tesoura": txtRes.setText("Empate!"); break;
                case "pedra": txtRes.setText("Você perdeu!"); break;
                case "papel": txtRes.setText("Você venceu! irraaa");
            }
        }
    }
}