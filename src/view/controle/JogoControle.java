/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.MslfJogo;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author dfdfdfdfd
 */
public class JogoControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista = lista;
this.fireTableDataChanged();
}

public MslfJogo getbean(int linha){
return (MslfJogo) lista.get(linha);
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
        MslfJogo jogo = (MslfJogo) lista.get(rowIndex);
      if (columnIndex == 0) {
             return jogo.getMslfIdJogo();
        }
        if (columnIndex == 1) {
             return jogo.getMslfNome();
        }
        if (columnIndex == 2) {
             return jogo.getMslfPreco();
        }
        if (columnIndex == 3) {
             return jogo.getMslfEstoque();
        
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
             return "Preço";
        }
        if (columnIndex == 3) {
             return "Estoque";
        }
       
    return null;
    }
}
