package com.sergio.practica01_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0, botonPunto, botonResultado,
            botonDel, botonDiv, botonMulti, botonResta, botonSuma,
            botonClear, botonResto,
            botonSin, botonCos, botonTan, botonLn, botonRz;
    TextView etiquetaAddNumeros;
    TextView etiquetaShowNumeros;

    String txtIntroNum, txtMostrarNum;

    double oper1, oper2;
    int tipoOperacion;
    boolean operando = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();

        if(getApplication().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            accionesLand();
        }
    }

    private void accionesLand()
    {
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);

        boton0.setOnClickListener(this);
        botonPunto.setOnClickListener(this);
        botonResultado.setOnClickListener(this);

        botonDel.setOnClickListener(this);
        botonDiv.setOnClickListener(this);
        botonMulti.setOnClickListener(this);
        botonResta.setOnClickListener(this);
        botonSuma.setOnClickListener(this);

        botonClear .setOnClickListener(this);
        botonResto .setOnClickListener(this);

        botonSin.setOnClickListener(this);
        botonCos.setOnClickListener(this);
        botonTan.setOnClickListener(this);
        botonLn.setOnClickListener(this);
        botonRz.setOnClickListener(this);
    }

    private void instancias() {
        etiquetaAddNumeros = findViewById(R.id.etiquetaAddNumeros);
        etiquetaShowNumeros = findViewById(R.id.etiquetaShowNumeros);

        boton1 = findViewById(R.id.btn1);
        boton2 = findViewById(R.id.btn2);
        boton3 = findViewById(R.id.btn3);
        boton4 = findViewById(R.id.btn4);
        boton5 = findViewById(R.id.btn5);
        boton6 = findViewById(R.id.btn6);
        boton7 = findViewById(R.id.btn7);
        boton8 = findViewById(R.id.btn8);
        boton9 = findViewById(R.id.btn9);

        boton0 = findViewById(R.id.btn0);
        botonPunto = findViewById(R.id.btnPunto);
        botonResultado = findViewById(R.id.btnResultado);

        botonDel = findViewById(R.id.btnDel);
        botonDiv = findViewById(R.id.btnDiv);
        botonMulti = findViewById(R.id.btnMulti);
        botonResta = findViewById(R.id.btnResta);
        botonSuma = findViewById(R.id.btnSuma);

        botonClear = findViewById(R.id.btnClear);
        botonResto = findViewById(R.id.btnResto);

        botonSin = findViewById(R.id.btnSin);
        botonCos = findViewById(R.id.btnCos);
        botonTan = findViewById(R.id.btnTan);
        botonLn = findViewById(R.id.btnLn);
        botonRz = findViewById(R.id.btnRz);
    }

    private void acciones() {
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);

        boton0.setOnClickListener(this);
        botonPunto.setOnClickListener(this);
        botonResultado.setOnClickListener(this);

        botonDel.setOnClickListener(this);
        botonDiv.setOnClickListener(this);
        botonMulti.setOnClickListener(this);
        botonResta.setOnClickListener(this);
        botonSuma.setOnClickListener(this);

        botonClear .setOnClickListener(this);
        botonResto .setOnClickListener(this);

/*        botonSin.setOnClickListener(this);
        botonCos.setOnClickListener(this);
        botonTan.setOnClickListener(this);
        botonLn.setOnClickListener(this);
        botonRz.setOnClickListener(this);*/
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.btn0)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "0");
            }
            else
            {
                etiquetaAddNumeros.setText("0");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn1)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "1");
            }
            else
            {
                etiquetaAddNumeros.setText("1");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn2)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "2");
            }
            else
            {
                etiquetaAddNumeros.setText("2");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn3)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "3");
            }
            else
            {
                etiquetaAddNumeros.setText("3");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn4)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "4");
            }
            else
            {
                etiquetaAddNumeros.setText("4");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn5)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "5");
            }
            else
            {
                etiquetaAddNumeros.setText("5");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn6)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "6");
            }
            else
            {
                etiquetaAddNumeros.setText("6");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn7)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "7");
            }
            else
            {
                etiquetaAddNumeros.setText("7");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn8)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "8");
            }
            else
            {
                etiquetaAddNumeros.setText("8");
                operando = false;
            }
        }

        if(v.getId() == R.id.btn9)
        {
            if (!operando)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + "9");
            }
            else
            {
                etiquetaAddNumeros.setText("9");
                operando = false;
            }
        }

        if (v.getId() == R.id.btnSuma)
        {
            operando = true;
            oper1 = Double.valueOf(String.valueOf(etiquetaAddNumeros.getText()));
            tipoOperacion = 1;
        }

        if (v.getId() == R.id.btnResta)
        {
            operando = true;
            oper1 = Double.valueOf(String.valueOf(etiquetaAddNumeros.getText()));
            tipoOperacion = 2;
        }

        if (v.getId() == R.id.btnMulti)
        {
            operando = true;
            oper1 = Double.valueOf(String.valueOf(etiquetaAddNumeros.getText()));
            tipoOperacion = 3;
        }

        if (v.getId() == R.id.btnDiv)
        {
            operando = true;
            oper1 = Double.valueOf(String.valueOf(etiquetaAddNumeros.getText()));
            tipoOperacion = 4;
        }

        if (v.getId() == R.id.btnResto)
        {
            operando = true;
            oper1 = Double.valueOf(String.valueOf(etiquetaAddNumeros.getText()));
            tipoOperacion = 5;
        }

        if(v.getId() == R.id.btnDel)
        {
            String mostrar = etiquetaAddNumeros.getText().toString();
            if(!mostrar.equals(""))
            {
                mostrar = mostrar.substring(0, mostrar.length()-1);
                etiquetaAddNumeros.setText(mostrar);
            }
        }

        if(v.getId() == R.id.btnSin)
        {
            if(etiquetaAddNumeros.getText().toString() != "")
            {
                double radianes = Math.toRadians(Double.parseDouble(etiquetaAddNumeros.getText().toString()));
                etiquetaShowNumeros.setText(String.valueOf(Math.sin(radianes)));
            }
        }

        if(v.getId() == R.id.btnCos)
        {
            if (etiquetaAddNumeros.getText().toString() != "")
            {
                double radianes = Math.toRadians(Double.parseDouble(etiquetaAddNumeros.getText().toString()));
                etiquetaShowNumeros.setText(String.valueOf(Math.cos(radianes)));
            }
        }

        if(v.getId() == R.id.btnTan) {
            if (etiquetaAddNumeros.getText().toString() != "")
            {
                double radianes = Math.toRadians(Double.parseDouble(etiquetaAddNumeros.getText().toString()));
                etiquetaShowNumeros.setText(String.valueOf(Math.tan(radianes)));
            }
        }

        if (v.getId() == R.id.btnLn) {
            if (etiquetaAddNumeros.getText().toString() != "") {
                etiquetaShowNumeros.setText(String.valueOf(Math.log(Double.parseDouble(etiquetaAddNumeros.getText().toString()))));
            }
        }

        if (v.getId() == R.id.btnRz) {
            if (etiquetaAddNumeros.getText().toString() != "") {
                etiquetaShowNumeros.setText(String.valueOf(Math.sqrt(Double.parseDouble(etiquetaAddNumeros.getText().toString()))));
            }
        }

        if (v.getId() == R.id.btnClear)
        {
            etiquetaAddNumeros.setText("");
            oper2 = 0;
            etiquetaShowNumeros.setText("");
        }

        if (v.getId() == R.id.btnPunto) {
            int posicion = etiquetaAddNumeros.getText().toString().lastIndexOf(".");
            if(posicion == -1)
            {
                etiquetaAddNumeros.setText(etiquetaAddNumeros.getText() + ".");
            }
        }

        if (v.getId() == R.id.btnResultado)
        {
            oper2 = Double.valueOf(etiquetaAddNumeros.getText().toString());
            double resultado = 0;
            switch (tipoOperacion) {
                case 1:
                    resultado = oper1 + oper2;
                    break;
                case 2:
                    resultado = oper1 - oper2;
                    break;
                case 3:
                    resultado = oper1 * oper2;
                    break;
                case 4:
                    resultado = oper1 / oper2;
                    break;
                case 5:
                    resultado = (oper1 * oper2) / 100;
                    break;
            }
            etiquetaShowNumeros.setText(String.valueOf(resultado));
        }
    }
    // Esta función nos permite guardar el valor de los datos de la pantalla al cambiar la orientación de la pantalla
    @Override
    protected void onSaveInstanceState(Bundle guardaEstado)
    {
        super.onSaveInstanceState(guardaEstado);

        //****** Guardamos en las variables el texto del campo EditText y TextView ******
        txtIntroNum = etiquetaAddNumeros.getText().toString();
        txtMostrarNum = etiquetaShowNumeros.getText().toString();

        //****** Guardamos los datos en el Bundle para poder recuperarlos después ******
        guardaEstado.putString("textI", txtIntroNum);
        TextView tv = findViewById(R.id.etiquetaAddNumeros);
        guardaEstado.putString("textH", txtMostrarNum);
        TextView tw = findViewById(R.id.etiquetaShowNumeros);

    }

    //****** Esta función nos permite restaurar el valor de los datos salvados al restaurar  ******
//****** la orientación de la pantalla                                                   ******
    @Override
    protected void onRestoreInstanceState(Bundle recuperaEstado)
    {
        super.onRestoreInstanceState(recuperaEstado);

        //****** Recuperamos los String del Bundle ******
        txtIntroNum = recuperaEstado.getString("textI");
        txtMostrarNum = recuperaEstado.getString("textH");

        //****** Ponemos el valor del EditText y del TextView con el valor de nuestra cadena ******
        etiquetaAddNumeros.setText(txtIntroNum);
        etiquetaShowNumeros.setText(txtMostrarNum);

        //****** Posiciona el cursor al final del campo donde introduce datos ******
        int textLength = etiquetaAddNumeros.getText().length();
    }
}
