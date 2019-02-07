package com.plpellegrini.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.plpellegrini.maskutils.MaskUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText cpfEdit = findViewById(R.id.edit_cpf);
        EditText cnpjEdit = findViewById(R.id.edit_cnpj);
        EditText cpfCnpjEdit = findViewById(R.id.edit_cpf_cnpj);
        EditText cepEdit = findViewById(R.id.edit_cep);
        EditText phoneEdit = findViewById(R.id.edit_phone);
        EditText moneyEdit = findViewById(R.id.edit_money);
        EditText customEdit = findViewById(R.id.edit_custom);

        MaskUtils.cpfMask(cpfEdit);
        MaskUtils.cnpjMask(cnpjEdit);
        MaskUtils.cpfCnpjMask(cpfCnpjEdit);
        MaskUtils.phoneMask(phoneEdit);
        MaskUtils.moneyMask(moneyEdit);
        MaskUtils.customMask(customEdit, "##.##.##-####");
    }
}
