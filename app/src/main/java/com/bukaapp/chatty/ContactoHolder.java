package com.bukaapp.chatty;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bukaapp.chatty.modelos.Usuario;

public class ContactoHolder extends RecyclerView.ViewHolder {

    TextView tvNome, tvStatus, tvData;
    ImageView imageView;

    public ContactoHolder(@NonNull View itemView) {
        super(itemView);

        tvNome = itemView.findViewById(R.id.tv_titulo);
        tvStatus = itemView.findViewById(R.id.tv_status);
        tvData = itemView.findViewById(R.id.tv_data);
        imageView = itemView.findViewById(R.id.imagem);
    }

    public void bind(Usuario usuario){
        tvNome.setText( usuario.getNome());
        tvStatus.setText( usuario.getStatus());

        //TODO: mostrar imagem do usuario
        //imageView.setImageBitmap();

        // TODO: mostrar data de ultima presenca
        // tvData.setText(usuario.);
    }
}
