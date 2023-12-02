/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.MslfVendasJogo;
import java.util.ArrayList;


import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author u04127224290
 */
public class VendasJogoControle extends AbstractTableModel {

    private List lista = new ArrayList();

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public MslfVendasJogo getBean(int linha) {
        return (MslfVendasJogo) lista.get(linha);
    }
 
    public void addBean(MslfVendasJogo mslfVendasJogo) {
        lista.add(mslfVendasJogo);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int index) {
        lista.remove(index);
        this.fireTableDataChanged();
    }
    
    public void updateBean(int index, MslfVendasJogo mslfVendasJogo) {
        lista.set(index, mslfVendasJogo);
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MslfVendasJogo vendasJogo = (MslfVendasJogo) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendasJogo.getMslfJogo();
        }
        if (columnIndex == 1) {
            return vendasJogo.getMslfQuantidade();
        }
        if (columnIndex == 2) {
            return vendasJogo.getMslfValorUnitario();
        }
        if (columnIndex == 3) {
            return vendasJogo.getMslfValorUnitario() * vendasJogo.getMslfQuantidade();

        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Produto";
        }
        if (columnIndex == 1) {
            return "Quantidade";
        }
        if (columnIndex == 2) {
            return "Valor";
        }
        if (columnIndex == 3) {
            return "Total";
        }

        return null;
    }
}
