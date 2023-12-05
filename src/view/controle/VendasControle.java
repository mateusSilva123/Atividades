/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.MslfVendas;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u04122722490
 */
public class VendasControle extends AbstractTableModel {
    private List lista = new ArrayList();
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public MslfVendas getBean(int linha) {
        return (MslfVendas) lista.get(linha);
    }
    
     public void addBean(MslfVendas mslfVendas) {
        lista.add(mslfVendas);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int index) {
        lista.remove(index);
        this.fireTableDataChanged();
    }
    
    public void updateBean(int index, MslfVendas mslfVendas) {
        lista.set(index, mslfVendas);
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
        MslfVendas vendas = (MslfVendas) lista.get(rowIndex);
       if (columnIndex == 0) {
            return vendas.getMslfIdVendas();
        }
        if (columnIndex == 1) {
            return vendas.getMslfObservacao();
        }
        if (columnIndex == 2) {
            return vendas.getMslfQuantidade();
        }
        if (columnIndex == 3) {
            return vendas.getMslfValorTotal();
        }
       return "";
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Observação";
        }
        if (columnIndex == 2) {
             return "Quantidade";
        }
        if (columnIndex == 3) {
             return "Valor Total";
        }
       
    return "";
    }
}
