package br.com.fiap.app8_passoapasso;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class PrimeiroFragment extends Fragment {
    private RecyclerView recycler;
    private ArrayList<Usuario> itens;
    private UsuarioAdapter adapter;
    private EditText nome;
    private EditText endereco;
    private Button cadastrar;
    private Button cancelar;
    protected View myView;

    public PrimeiroFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_primeiro, container, false);
        recycler = myView.findViewById(R.id.recycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(linearLayoutManager);

        itens = new ArrayList<Usuario>();
        itens.add(new Usuario("Título 1", "Descrição 1"));
        itens.add(new Usuario("Título 2", "Descrição 2"));
        itens.add(new Usuario("Título 3", "Descrição 3"));
        itens.add(new Usuario("Título 4", "Descrição 4"));
        itens.add(new Usuario("Título 5", "Descrição 5"));
        itens.add(new Usuario("Título 6", "Descrição 6"));

        adapter = new UsuarioAdapter(getContext(), itens);
        recycler.setAdapter(adapter);


        return myView;
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle().equals("New")){

        }else if(item.getTitle().equals("Delete")){
            adapter.delete();
        }
        return super.onContextItemSelected(item);
    }
}
