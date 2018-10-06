package com.bukaapp.chatty.fragmentos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.bukaapp.chatty.R;

public class FragmentoContactos extends Fragment {

    RecyclerView recyclerView;
    ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View principal = inflater.inflate(R.layout.fragmento_lista, container, false);

        recyclerView = principal.findViewById(R.id.recycler_view);
        progressBar = principal.findViewById(R.id.progress_bar);
        return principal;
    }
}
