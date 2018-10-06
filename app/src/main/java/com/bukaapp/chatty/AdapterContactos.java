package com.bukaapp.chatty;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bukaapp.chatty.modelos.Usuario;

import java.util.ArrayList;

public class AdapterContactos extends RecyclerView.Adapter<ContactoHolder> {

    private ArrayList<Usuario> data = new ArrayList<>();

    @NonNull
    @Override
    public ContactoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.layout_usuario, parent, false);

        return (new ContactoHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoHolder holder, int position) {
        Usuario item = data.get(position);

        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
