package com.example.calculadoradenotas

import android.graphics.Color
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_calcular = Calcular
        val resultado = Resultado

        btn_calcular.setOnClickListener {
            val nota1 = Integer.parseInt(Nota1.text.toString())
            val nota2 = Integer.parseInt(Nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(Faltas.text.toString())

            if(media >= 6 && faltas <= 10){
                resultado.setText("Aluno foi aprovado :D" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno foi reprovado :(" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}