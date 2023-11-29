/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.Usuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u13766540670
 */
public class UsuarioController extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public Usuarios getBean(int row) {
        return (Usuarios) lista.get(row);
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
    public Object getValueAt(int row, int column) {
      Usuarios usuarios = (Usuarios) lista.get(row);
      if (column == 0) {
          return usuarios.getIdusuarios();
      } 
      if (column == 1) {
          return usuarios.getIdusuarios();
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
