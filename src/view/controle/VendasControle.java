/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.MslfVendas;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u04122722490
 */
public class VendasControle extends AbstractTableModel {
private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public MslfVendas getBean(int linha) {
        return (MslfVendas) lista.get(linha);
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
            return vendas.getMslfCliente();
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
             return "Cliente";
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
