package com.marc.noticieeesss_app.Registro;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.marc.noticieeesss_app.R;

public class Registro1 extends Fragment implements View.OnClickListener{

    private EditText userName;
    private EditText passw;
    private EditText repeatPassw;
    private EditText email;
    private Button siguiente;
    private Button cancelar;

    private Usuario user;

    public Registro1() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_registro1, container, false);

        userName = v.findViewById(R.id.et_registro1_userName);
        passw = v.findViewById(R.id.et_registro1_password);
        repeatPassw = v.findViewById(R.id.et_registro1_repeatPassword);
        email = v.findViewById(R.id.et_registro1_email);
        siguiente = v.findViewById(R.id.btn_registro1_siguiente);
        cancelar = v.findViewById(R.id.btn_registro1_cancelar);

        siguiente.setOnClickListener(this);
        cancelar.setOnClickListener(this);

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_registro1_siguiente)
        {
            if(comprobarLosCampos())
            {
                //pasar los datos a registro2
            }
        }
    }

    private boolean comprobarLosCampos()
    {
        String txtUser = userName.getText().toString();
        String txtPassw = passw.getText().toString();
        String txtRepeatPassw = repeatPassw.getText().toString();
        String txtEmail = email.getText().toString();
        boolean validado = true;

        if (!txtUser.isEmpty())
        {
            if (!txtEmail.isEmpty())
            {
                if (!txtPassw.isEmpty())
                {
                    if (txtPassw==txtRepeatPassw)
                    {
                        validado = true;
                    }
                }
                else {
                    validado = false;
                }
            }
            else
            {
                validado = false;
            }
        }
        else
        {
            validado = false;
        }
        return validado;
    }
}
