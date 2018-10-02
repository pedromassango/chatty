package com.bukaapp.chatty;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
implements TabLayout.OnTabSelectedListener {

    private Toolbar toolbar;
    private TabLayout tabLayout;

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        //TODO: substituir fragmento
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) { }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tab_layout);

        // substitui a ActionBar predefinida
        setSupportActionBar(toolbar);

        // adicionar items no TabLayout
        TabLayout.Tab tab1 = tabLayout.newTab()
                .setIcon(R.drawable.ic_action_contactos);
        TabLayout.Tab tab2 = tabLayout.newTab()
                .setIcon(R.drawable.ic_action_chat);
        TabLayout.Tab tab3 = tabLayout.newTab()
                .setIcon(R.drawable.ic_action_perfil);

        tabLayout.addTab(tab1);
        tabLayout.addTab(tab2);
        tabLayout.addTab(tab3);

        // adicionar detector de clicks das tabs
        tabLayout.addOnTabSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Item de pesquisa clicado
        if(item.getItemId() == R.id.acao_pesquisar){

        }
        return super.onOptionsItemSelected(item);
    }
}
