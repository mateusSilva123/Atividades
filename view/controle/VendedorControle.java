/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.MslfVendedor;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u04127224290
 */
public class VendedorControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
this.fireTableDataChanged();
}

public MslfVendedor getbean(int linha){
return (MslfVendedor) lista.get(linha);
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
        MslfVendedor vendedor = (MslfVendedor) lista.get(rowIndex);
      if (columnIndex == 0) {
             return vendedor.getMslfIdVendedor();
        }
        if (columnIndex == 1) {
             return vendedor.getMslfNome();
        }
        if (columnIndex == 2) {
             return vendedor.getMslfUsuarios();
        }
        if (columnIndex == 3) {
             return vendedor.getMslfCpf();
        
        }
       return null;
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
             return "Úsuario";
        }
        if (columnIndex == 3) {
             return "CPF";
        }
       
    return null;
    }
}
