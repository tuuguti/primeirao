package br.com.fiap.app8_passoapasso;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

public class UsuarioViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener, View.OnCreateContextMenuListener {
    TextView nome, endereco;
    MyLongClickListener longClickListener;

    public UsuarioViewHolder(View itemView) {
        super(itemView);
        nome = (TextView) itemView.findViewById(R.id.nome);
        endereco = (TextView) itemView.findViewById(R.id.endereco);
        itemView.setOnLongClickListener(this);
        itemView.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Ações : ");
        menu.add(0,0,0,"New");
        menu.add(0,1,0,"Delete");
    }


    public void setLongClickListener(MyLongClickListener longClickListener)
    {
        this.longClickListener=longClickListener;
    }

    @Override
    public boolean onLongClick(View v) {
        this.longClickListener.onLongClick(getLayoutPosition());
        return false;
    }
}