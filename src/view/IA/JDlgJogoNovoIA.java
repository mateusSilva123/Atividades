package view.IA;

import dao.JogoDAO;
import bean.MslfJogo;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import view.JDlgJogoNovo;
import view.controle.JogoControle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dfgh
 */
public class JDlgJogoNovoIA extends javax.swing.JDialog {

    public JDlgJogoNovo jDlgJogoNovo;
    MaskFormatter mascaraData;
    
    JDlgJogoNovoIA jDlgJogoNovoIA;
    JogoControle jogoControle;
    
    
    public JDlgJogoNovoIA(java.awt.Frame parent, boolean modal, JogoControle nome) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Incluir Jogo");
        
        jogoControle = nome;
        
        jogoControle = new JogoControle();
        jDlgJogoNovo = new JDlgJogoNovo(null, true);
        
        Util.limparCampos(jTxtAvaliacao, jTxtDesconto, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtNome, jTxtPreco,
                jCboBrinde, jCboClassificacao, jCboEdicao, jCboGenero, jCboIdioma, jFmtAno);
        try {
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgJogoNovoIA.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtAno.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
    
    
 public MslfJogo viewBean() {
        MslfJogo jogo = new MslfJogo(); // criou o bean
        
        jogo.setMslfAno(Util.strDate(jFmtAno.getText()));
        jogo.setMslfAvaliacaoGeral(jTxtAvaliacao.getText());
        jogo.setMslfBrinde((String) jCboBrinde.getSelectedItem());
        jogo.setMslfClassificacao((String) jCboClassificacao.getSelectedItem());
        jogo.setMslfDesconto(Util.strDouble(jTxtDesconto.getText()));
        jogo.setMslfEdicao((String) jCboEdicao.getSelectedItem());
        jogo.setMslfEmpresa(jTxtEmpresa.getText());
        jogo.setMslfEstoque(Util.strInt(jTxtEstoque.getText())); // VIRA INTEIRO
        jogo.setMslfGenero((String) jCboGenero.getSelectedItem());
        jogo.setMslfIdJogo(Util.strInt(jTxtID.getText()));
        jogo.setMslfIdioma((String) jCboIdioma.getSelectedItem());
        jogo.setMslfNome(jTxtNome.getText());
        jogo.setMslfPreco(Util.strDouble(jTxtPreco.getText()));

        return jogo;
    };
 
  public void beanView(MslfJogo jogo) {
        jTxtID.setText(Util.intStr(jogo.getMslfIdJogo()));
        jTxtAvaliacao.setText(jogo.getMslfAvaliacaoGeral());
        jCboBrinde.setSelectedItem(jogo.getMslfBrinde());
        jCboClassificacao.setSelectedItem(jogo.getMslfClassificacao());
        jTxtDesconto.setText(Util.doubleStr(jogo.getMslfDesconto()));
        jCboEdicao.setSelectedItem(jogo.getMslfEdicao());
        jTxtEmpresa.setText(jogo.getMslfEmpresa());
        jTxtEstoque.setText(Util.intStr(jogo.getMslfEstoque()));
        jCboGenero.setSelectedItem(jogo.getMslfGenero());
        jCboIdioma.setSelectedItem(jogo.getMslfIdioma());
        jTxtNome.setText(jogo.getMslfNome());
        jTxtPreco.setText(Util.doubleStr(jogo.getMslfPreco()));
        jFmtAno.setText(Util.dateStr(jogo.getMslfAno()));
    };
  
  public void setTelaAnterior(JDlgJogoNovo jDlgJogoNovo) {
      this.jDlgJogoNovo = jDlgJogoNovo;
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtEstoque = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTxtEmpresa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jFmtAno = new javax.swing.JFormattedTextField();
        jTxtPreco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCboGenero = new javax.swing.JComboBox<>();
        jTxtAvaliacao = new javax.swing.JTextField();
        jTxtID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtDesconto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCboClassificacao = new javax.swing.JComboBox<>();
        jCboIdioma = new javax.swing.JComboBox<>();
        jCboEdicao = new javax.swing.JComboBox<>();
        jCboBrinde = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmado.png"))); // NOI18N
        jBtnOk.setText("Confirmar");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOk);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jLabel8.setText("Preço");

        jLabel9.setText("Brinde");

        jLabel10.setText("Estoque");

        jLabel11.setText("Edição");

        jLabel18.setText("Empresa");

        jLabel19.setText("Nome");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel21.setText("Avaliação Geral");

        jLabel14.setText("Gênero");

        jCboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Terror", "Puzzle", "Infantil", "Estrategia", "RPG", "Corrida", "Simulação", "Esportes" }));
        jCboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboGeneroActionPerformed(evt);
            }
        });

        jTxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIDActionPerformed(evt);
            }
        });

        jLabel13.setText("ID");

        jLabel6.setText("Desconto");

        jTxtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDescontoActionPerformed(evt);
            }
        });

        jLabel7.setText("Classificação");

        jLabel16.setText("Idioma");

        jLabel17.setText("Ano");

        jCboClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "+10", "+14", "+16", "+18" }));
        jCboClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboClassificacaoActionPerformed(evt);
            }
        });

        jCboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Inglês", "Espanhol" }));

        jCboEdicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Colecionador", "Luxo", "Especial" }));

        jCboBrinde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mouse Pad", "Mouse", "Controle", "Adesivos", "Pen drive", "Chaveiro" }));
        jCboBrinde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboBrindeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel8))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFmtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(31, 31, 31)
                                .addComponent(jCboIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEstoque)
                                    .addComponent(jCboBrinde, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13)
                        .addGap(48, 48, 48)
                        .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel19)
                        .addGap(37, 37, 37)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(23, 23, 23)
                        .addComponent(jTxtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11)
                        .addGap(33, 33, 33)
                        .addComponent(jCboEdicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jTxtAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(22, 22, 22)
                        .addComponent(jCboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCboClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTxtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCboEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jCboClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jCboBrinde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jCboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jCboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        this.dispose();
        Util.limparCampos(jTxtAvaliacao, jTxtDesconto, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtNome, jTxtPreco,
                jCboBrinde, jCboClassificacao, jCboEdicao, jCboGenero, jCboIdioma, jFmtAno);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        MslfJogo jogo = viewBean();
        JogoDAO jogoDAO = new JogoDAO();
        
        if (getTitle().toUpperCase().substring(0, 1).equals("I"))
        {   
            jogoDAO.insert(jogo);
            jDlgJogoNovo.jogoControle.addBean(jogo);
            //List lista = jogoDAO.listALL();      
            //jogoControle.setList(lista);
            
        } else {
            jogoDAO.update(jogo);
            jDlgJogoNovo.jogoControle.updateBean(jDlgJogoNovo.getSelectedRow(), jogo);
//            jogoDAO.update(jogo);
//            jDlgJogoNovo.jogoControle.updateBean(jDlgJogoNovo.getse );
//            
//            jDlgJogoNovo.vendas
//            
//            List lista = jogoDAO.listALL();       
//            jogoControle.setList(lista);
        }
       setVisible(false);
       this.dispose();
        
        Util.limparCampos(jTxtAvaliacao, jTxtDesconto, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtNome, jTxtPreco,
                jCboBrinde, jCboClassificacao, jCboEdicao, jCboGenero, jCboIdioma, jFmtAno);           
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jCboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGeneroActionPerformed

    private void jTxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIDActionPerformed

    private void jCboClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboClassificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboClassificacaoActionPerformed

    private void jCboBrindeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboBrindeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboBrindeActionPerformed

    private void jTxtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDescontoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgJogoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgJogoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgJogoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgJogoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgJogoNovoIA dialog = new JDlgJogoNovoIA(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<String> jCboBrinde;
    private javax.swing.JComboBox<String> jCboClassificacao;
    private javax.swing.JComboBox<String> jCboEdicao;
    private javax.swing.JComboBox<String> jCboGenero;
    private javax.swing.JComboBox<String> jCboIdioma;
    private javax.swing.JFormattedTextField jFmtAno;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtAvaliacao;
    private javax.swing.JTextField jTxtDesconto;
    private javax.swing.JTextField jTxtEmpresa;
    private javax.swing.JTextField jTxtEstoque;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtPreco;
    // End of variables declaration//GEN-END:variables
}
