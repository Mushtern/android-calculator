package mx.tec.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var showResultado:TextView
    var temp = 0.toDouble()
    var temp2 = 0.toDouble()
    var resultado = 0.toDouble()
    var operacion = ""
    var decimal = false
    var cero = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCero = findViewById<Button>(R.id.btnCero)
        val btnUno = findViewById<Button>(R.id.btnUno)
        val btnDos = findViewById<Button>(R.id.btnDos)
        val btnTres = findViewById<Button>(R.id.btnTres)
        val btnCuatro = findViewById<Button>(R.id.btnCuatro)
        val btnCinco = findViewById<Button>(R.id.btnCinco)
        val btnSeis = findViewById<Button>(R.id.btnSeis)
        val btnSiete = findViewById<Button>(R.id.btnSiete)
        val btnOcho = findViewById<Button>(R.id.btnOcho)
        val btnNueve = findViewById<Button>(R.id.btnNueve)
        val btnMas = findViewById<Button>(R.id.btnMas)
        val btnMenos = findViewById<Button>(R.id.btnMenos)
        val btnPor = findViewById<Button>(R.id.btnPor)
        val btnEntre = findViewById<Button>(R.id.btnEntre)
        val btnDecimal = findViewById<Button>(R.id.btnDecimal)
        val btnIgual = findViewById<Button>(R.id.btnIgual)
        val btnAC = findViewById<Button>(R.id.btnAC)
        val btnDelete = findViewById<Button>(R.id.btnDelete)


        showResultado = findViewById(R.id.showResultado)

        //btnCero.setOnClickListener {  }
        btnCero.setOnClickListener(this)
        btnUno.setOnClickListener(this)
        btnDos.setOnClickListener(this)
        btnTres.setOnClickListener(this)
        btnCuatro.setOnClickListener(this)
        btnCinco.setOnClickListener(this)
        btnSeis.setOnClickListener(this)
        btnSiete.setOnClickListener(this)
        btnOcho.setOnClickListener(this)
        btnNueve.setOnClickListener(this)
        btnMas.setOnClickListener(this)
        btnMenos.setOnClickListener(this)
        btnPor.setOnClickListener(this)
        btnEntre.setOnClickListener(this)
        btnDecimal.setOnClickListener(this)
        btnIgual.setOnClickListener(this)
        btnAC.setOnClickListener(this)
        btnDelete.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        //switch
        when(v?.id){
            //case
            R.id.btnCero -> {
                if(cero == false) {
                    showResultado.text = "${showResultado.text}0"
                }
            }
            R.id.btnUno -> {
                if(cero == true){
                    showResultado.text = "1"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "1"
                }
            }
            R.id.btnDos -> {
                if(cero == true){
                    showResultado.text = "2"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "2"
                }
            }
            R.id.btnTres -> {
                if(cero == true){
                    showResultado.text = "3"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "3"
                }
            }
            R.id.btnCuatro -> {
                if(cero == true){
                    showResultado.text = "4"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "4"
                }
            }
            R.id.btnCinco -> {
                if(cero == true){
                    showResultado.text = "5"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "5"
                }
            }
            R.id.btnSeis -> {
                if(cero == true){
                    showResultado.text = "6"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "6"
                }
            }
            R.id.btnSiete -> {
                if(cero == true){
                    showResultado.text = "7"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "7"
                }
            }
            R.id.btnOcho -> {
                if(cero == true){
                    showResultado.text = "8"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "8"
                }
            }
            R.id.btnNueve -> {
                if(cero == true){
                    showResultado.text = "9"
                    cero = false
                }
                else{
                    showResultado.text = showResultado.text.toString() + "9"
                }
            }
            R.id.btnDecimal -> {
                if(decimal == false){
                    showResultado.text = "${showResultado.text}."
                    decimal = true
                    cero = false
                }
            }

            R.id.btnMas -> {
                operacion = "suma"
                decimal = false
                cero = true
                if (temp == 0.0) {
                    temp = showResultado.text.toString().toDouble()
                }
                else{
                    temp = temp + showResultado.text.toString().toDouble()
                }
                //temp = temp + showResultado.text.toString().toInt()
                showResultado.text = "0"
            }

            R.id.btnMenos -> {
                operacion = "resta"
                decimal = false
                cero = true
                if (temp == 0.0) {
                    temp = showResultado.text.toString().toDouble()
                }
                else{
                    temp = temp - showResultado.text.toString().toDouble()
                }
                showResultado.text = "0"
            }

            R.id.btnPor -> {
                operacion = "multiplicacion"
                decimal = false
                cero = true
                if (temp == 0.0) {
                    temp = showResultado.text.toString().toDouble()
                }
                else{
                    temp = temp * showResultado.text.toString().toDouble()
                }
                showResultado.text = "0"
            }

            R.id.btnEntre -> {
                temp2 = showResultado.text.toString().toDouble()
                operacion = "division"
                decimal = false
                cero = true
                if (temp == 0.0) {
                    temp = showResultado.text.toString().toDouble()
                }
                else if(temp2 == 0.0){
                    Toast.makeText(this@MainActivity,
                        R.string.error_cero,//Toast dinámico, busca en los recursos un string llamado app_name
                        Toast.LENGTH_SHORT).show()
                    temp = 0.0
                    showResultado.text = "0"
                    operacion= ""
                }
                else{
                    temp = temp / showResultado.text.toString().toDouble()
                }
                showResultado.text = "0"
            }


            R.id.btnIgual -> {
                decimal = false
                if(operacion == "suma"){
                    if(temp!=0.0) {
                        resultado = temp + showResultado.text.toString().toDouble()
                    }
                    showResultado.text = resultado.toString()
                    temp = 0.0
                }

                if(operacion == "resta"){
                    if(temp!=0.0){
                        resultado = temp - showResultado.text.toString().toDouble()
                    }
                    showResultado.text = resultado.toString()
                    temp = 0.0
                }

                if(operacion == "multiplicacion"){
                    if(temp!=0.0){
                        resultado = temp * showResultado.text.toString().toDouble()
                    }
                    showResultado.text = resultado.toString()
                    temp = 0.0
                }

                if(operacion == "division"){
                    temp2 = showResultado.text.toString().toDouble()
                    if(temp2 == 0.0){
                        Toast.makeText(this@MainActivity,
                            R.string.error_cero,//Toast dinámico, busca en los recursos un string llamado app_name
                            Toast.LENGTH_SHORT).show()
                        temp = 0.0
                        showResultado.text = "0"
                        operacion= ""
                    }
                    else {
                        if (temp != 0.0) {
                            resultado = temp / showResultado.text.toString().toDouble()
                        }
                        showResultado.text = resultado.toString()
                        temp = 0.0
                    }
                }
            }

            R.id.btnAC -> {
                showResultado.text = "0"
                temp = 0.0
                operacion = ""
                decimal = false
                cero = true
            }

            R.id.btnDelete ->{
                if(cero == false){
                    showResultado.text = showResultado.text.substring(0,showResultado.text.length-1)
                    if(showResultado.text.length == 0){
                        showResultado.text = "0"
                        cero = true
                    }
                }

            }
            //default
            else -> {
                Toast.makeText(this@MainActivity,
                    R.string.app_name,//Toast dinámico, busca en los recursos un string llamado app_name
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}