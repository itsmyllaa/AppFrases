package com.toplaytouch.frasesdodiaprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public void gerarNovaFrase(View view){

        String[] frases = {
                "A diferença entre as pessoas normais e as especiais está no colorido que elas deixam quando entram em nossas vidas.",
                "Pessoas especiais como você merecem ser homenageadas todos os diaa. Independente de datas ou acontecimentos especiais, hoje gostaria de te dizer o quanto é importante para mim.",
                "Parabéns por mais esse obstáculo vencido, sempre acreditei na sua força e hoje acredito ainda mais.",
                "Nunca deixe que te digam que você não é especial, pois você é muito! poucas pessoas têm esse brilho que vejo dentro dos teus olhos.",
                "Parabéns! Você é uma pessoa especial e merece um dia maravilhoso!"
        };
        int numero = new Random().nextInt(5);

      TextView texto = findViewById(R.id.textResultado);
      texto.setText( frases [numero]);

  }

}
