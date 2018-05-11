package br.com.fiap.app8_passoapasso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioViewHolder>{
    private Context context;
    private ArrayList<Usuario> itens;
    int selectedPos;
    public UsuarioAdapter(Context context, ArrayList<Usuario> itens) {
        this.context = context;
        this.itens = itens;
    }
    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.usuario, parent, false);
        UsuarioViewHolder vh = new UsuarioViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        Usuario usuario = itens.get(position);
        holder.nome.setText(usuario.getNome());
        holder.endereco.setText(usuario.getEndereco());
        holder.setLongClickListener(new MyLongClickListener() {
            @Override
            public void onLongClick(int pos) {
                selectedPos = pos;
            }
        });

    }
    @Override
    public int getItemCount() {
        return itens != null? itens.size() : 0;
    }
    
}
