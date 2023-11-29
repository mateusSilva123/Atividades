/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MslfVendas;
import bean.MslfVendedor;
import dao.ClienteDAO;
import dao.VendedorDAO;
import bean.MslfCliente;
import dao.VendasDAO;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import view.controle.VendasControle;

/**
 *
 * @author u04127224290
 */
public class JDlgVendas extends javax.swing.JDialog {
    
    boolean incluindo;
    MaskFormatter mascaraData;
    
    VendasDAO vendasDAO;
    VendasControle vendasControle;
    /**
k     */
    public JDlgVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Vendas");
        setLocationRelativeTo(null);
        
        vendasDAO = new VendasDAO();
        List lista = vendasDAO.listALL();
        vendasControle = new VendasControle();
        vendasControle.setList(lista);
        jTable1.setModel(vendasControle);

        
        VendedorDAO vendedorDAO = new VendedorDAO();
        List listaVendedor = vendedorDAO.listALL();
        for (int i = 0; i < listaVendedor.size(); i++) {
            jCboVendedor.addItem((MslfVendedor) listaVendedor.get(i));            
        }
        
        ClienteDAO clienteDAO = new ClienteDAO();
        List listaCliente = clienteDAO.listALL();
        for (int i = 0; i < listaCliente.size(); i++) {
            jCboCliente.addItem((MslfCliente) listaCliente.get(i));            
        }
        
         Util.habilitar(false, jTxtCodigo, jTxtTotal, jTxtObservacao, jTxtQuantidade, jCboCliente, 
                 jCboVendedor, jFmtData, jBtnCancelar, jBtnConfirmar);
                
        try {
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
        
        vendasControle = new  VendasControle();
    }
    
    public MslfVendas viewBean() {
        // TODO add your handling code here:
        MslfVendas vendas = new MslfVendas(); // criou o bean
        
        vendas.setMslfIdVendas(Util.strInt(jTxtCodigo.getText()));
        vendas.setMslfCliente((MslfCliente) jCboCliente.getSelectedItem());
        vendas.setMslfVendedor((MslfVendedor) jCboVendedor.getSelectedItem());
        vendas.setMslfDataEHora(Util.strDate(jFmtData.getText()));
        vendas.setMslfObservacao(jTxtObservacao.getText());
        vendas.setMslfQuantidade(Util.strInt(jTxtQuantidade.getText()));
        vendas.setMslfValorTotal(jTxtTotal.getText());

        return vendas;
    }
    
    public void beanView(MslfVendas vendas) {
        
        jTxtCodigo.setText(Util.intStr(vendas.getMslfIdVendas()));
        jCboCliente.setSelectedItem(vendas.getMslfCliente());
        jCboVendedor.setSelectedItem(vendas.getMslfVendedor());
        jFmtData.setText(Util.dateStr(vendas.getMslfDataEHora()));
        jTxtObservacao.setText(vendas.getMslfObservacao());
        jTxtQuantidade.setText(Util.intStr(vendas.getMslfQuantidade()));
        jTxtTotal.setText(vendas.getMslfValorTotal());
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jFmtData = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jCboCliente = new javax.swing.JComboBox<MslfCliente>();
        jLabel3 = new javax.swing.JLabel();
        jCboVendedor = new javax.swing.JComboBox<MslfVendedor>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtTotal = new javax.swing.JTextField();
        jBtnAlterar1 = new javax.swing.JButton();
        jBtnExcluir1 = new javax.swing.JButton();
        jBtnIncluir1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTxtObservacao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtQuantidade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmado.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });

        jFmtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        jCboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Cliente");

        jCboVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboVendedorActionPerformed(evt);
            }
        });

        jLabel5.setText("Vendedor");

        jLabel6.setText("total");

        jTxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalActionPerformed(evt);
            }
        });

        jBtnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar1ActionPerformed(evt);
            }
        });

        jBtnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jBtnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir1ActionPerformed(evt);
            }
        });

        jBtnIncluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Observação");

        jTxtObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtObservacaoActionPerformed(evt);
            }
        });

        jLabel10.setText("Quantidade");

        jTxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQuantidadeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Text 1", "Text 2", "Text 3", "Text 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnIncluir)
                            .addGap(40, 40, 40)
                            .addComponent(jBtnAlterar)
                            .addGap(29, 29, 29)
                            .addComponent(jBtnExcluir)
                            .addGap(41, 41, 41)
                            .addComponent(jBtnConfirmar)
                            .addGap(27, 27, 27)
                            .addComponent(jBtnPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnCancelar))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jTxtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jCboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10))
                            .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnAlterar1)
                        .addComponent(jBtnIncluir1))
                    .addComponent(jBtnExcluir1))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jBtnIncluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtCodigo, jTxtObservacao, jTxtQuantidade, jTxtTotal,
                jCboCliente, jCboVendedor, jFmtData, jBtnCancelar, jBtnConfirmar);
        
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        
        Util.limparCampos(jTxtCodigo, jTxtObservacao, jTxtQuantidade, jTxtTotal,
                jCboCliente, jCboVendedor, jFmtData);
        
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
       Util.habilitar(true, jTxtCodigo, jTxtObservacao, jTxtQuantidade, jTxtTotal,
                jCboCliente, jCboVendedor, jFmtData, jBtnCancelar, jBtnConfirmar);
        
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
         if ((Util.pergunta("Deseja excluir o registro?") == true)){
            MslfVendas vendas = viewBean();
            vendasDAO.delete(vendas);
            Util.mensagem("Exclusão realizada com sucesso");
        } else {
            Util.mensagem("Exclusão cancelada com sucesso");
        }      
          Util.limparCampos(jTxtCodigo, jTxtObservacao, jTxtQuantidade, jTxtTotal,
                jCboCliente, jCboVendedor, jFmtData);
                                    
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
         
        Util.habilitar(false, jTxtCodigo, jTxtObservacao, jTxtQuantidade, jTxtTotal,
                jCboCliente, jCboVendedor, jFmtData, jBtnCancelar, jBtnConfirmar);
        
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
         
         Util.limparCampos(jTxtCodigo, jTxtObservacao, jTxtQuantidade, jTxtTotal,
                jCboCliente, jCboVendedor, jFmtData);

        Util.mensagem("Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jCboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboClienteActionPerformed

    private void jCboVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboVendedorActionPerformed

    private void jTxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalActionPerformed

    private void jBtnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterar1ActionPerformed

    private void jBtnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluir1ActionPerformed

    private void jBtnIncluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBtnIncluir1ActionPerformed

    private void jTxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQuantidadeActionPerformed

    private void jTxtObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtObservacaoActionPerformed

    private void jFmtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        if (incluindo == true) {
            MslfVendas vendas = viewBean();
            vendasDAO.insert(vendas);
        }else{
            MslfVendas vendas = viewBean();
            vendasDAO.update(vendas);
        }

        Util.habilitar(false, jTxtCodigo, jTxtObservacao, jTxtQuantidade, jTxtTotal,
            jCboCliente, jCboVendedor, jFmtData, jBtnCancelar, jBtnConfirmar);

        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);

        Util.limparCampos(jTxtCodigo, jTxtObservacao, jTxtQuantidade, jTxtTotal,
            jCboCliente, jCboVendedor, jFmtData);

    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendas dialog = new JDlgVendas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterar1;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnExcluir1;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluir1;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<MslfCliente> jCboCliente;
    private javax.swing.JComboBox<MslfVendedor> jCboVendedor;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtObservacao;
    private javax.swing.JTextField jTxtQuantidade;
    private javax.swing.JTextField jTxtTotal;
    // End of variables declaration//GEN-END:variables
}
