/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.Usuarios;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class UsuarioControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public Usuarios getbean(int linha){
return (Usuarios) lista.get(linha);
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
        Usuarios usuarios = (Usuarios) lista.get(rowIndex);
      if (columnIndex == 0) {
             return usuarios.getIdusuarios();
        }
        if (columnIndex == 1) {
             return usuarios.getNome();
        }
        if (columnIndex == 2) {
             return usuarios.getApelido();
        }
        if (columnIndex == 3) {
             return usuarios.getCpf();
        
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
             return "Apelido";
        }
        if (columnIndex == 3) {
             return "CPF";
        }
       
    return null;
    }
}
