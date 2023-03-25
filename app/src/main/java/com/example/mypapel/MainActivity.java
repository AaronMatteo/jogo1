package com.example.mypapel;

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


    public void selecionadoPedra(View view){
        //System.out.println("selecionado pedra");
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        //System.out.println("selecionado papel");
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        //System.out.println("selecionado tesoura");
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario){
        ImageView imgResultado = findViewById(R.id.imgResultado); // metodo captura um componente da tela e retorn
        TextView textResultado = findViewById(R.id.textResultado); //referenciar e retornar


        //System.out.println("item clicado:"+ opcaoSelecionada);
// criar int numero (aleatorio) instaciar o random

        int numero = new Random().nextInt(3); //0 1 2(0 e pedra, 1 e papel e 2 tesoura
        String[] opcoes = {"pedra", "papel", "tesoura"}; //array de opcoes
        String escolhaApp = opcoes[numero]; //criar string opcoes

        switch (escolhaApp){
            case "pedra":
                imgResultado.setImageResource(R.drawable.pedra); //conf uma imag atraves de um recursos(troca de img)
                break;
            case "papel":
                imgResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgResultado.setImageResource(R.drawable.tesoura);
                break;


        } //app ganhador
        if(
                (escolhaApp =="tesoura" && escolhaUsuario == "papel") ||
                (escolhaApp =="papel" && escolhaUsuario == "pedra") ||
                (escolhaApp =="pedra" && escolhaUsuario == "teoura")
        ){
            textResultado.setText("Voce Perdeu :( ");

        //usuario ganhador
        }else if(
                (escolhaUsuario =="tesoura" && escolhaApp == "papel") ||
                (escolhaUsuario =="papel" && escolhaApp == "pedra") ||
                (escolhaUsuario =="pedra" && escolhaApp == "tesoura")
        ){
            textResultado.setText("Voce Ganhou :) ");

        // empate
        }else{
            textResultado.setText("Empatamos :| ");
        }

        System.out.println("item clicado:" + escolhaApp);



    }


}