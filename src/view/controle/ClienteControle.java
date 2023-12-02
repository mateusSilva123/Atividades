/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.MslfCliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u04127224290
 */
public class ClienteControle extends AbstractTableModel {
    private List lista = new ArrayList();

public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
}

public MslfCliente getBean(int linha){
    return (MslfCliente) lista.get(linha);
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
        MslfCliente cliente = (MslfCliente) lista.get(rowIndex);
      if (columnIndex == 0) {
             return cliente.getMslfIdCliente();
        }
        if (columnIndex == 1) {
             return cliente.getMslfNome();
        }
        if (columnIndex == 2) {
             return cliente.getMslfNivel();
        }
        if (columnIndex == 3) {
             return cliente.getMslfApelido();
        
        }
       return "";
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Nome";
        }
        if (columnIndex == 2) {
             return "Nivel";
        }
        if (columnIndex == 3) {
             return "Apelido";
        }
       
    return "";
    }
}
