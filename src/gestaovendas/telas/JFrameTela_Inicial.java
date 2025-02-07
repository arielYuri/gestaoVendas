/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaovendas.telas;

import gestaovendas.dao.ProdutoDAO;
import javax.swing.JDesktopPane;

/**
 *
 * @author lucas
 */
public class JFrameTela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTela_Inicial
     */
    public JFrameTela_Inicial() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniCadastrarOperacao = new javax.swing.JMenuItem();
        mniCadastrarCliente = new javax.swing.JMenuItem();
        mniCadastrarProduto = new javax.swing.JMenuItem();
        mniCadastrarCategoria = new javax.swing.JMenuItem();
        mniCadastrarCor = new javax.swing.JMenuItem();
        mniCadastrarMarca = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniListaClientes = new javax.swing.JMenuItem();
        mniListaProdutos = new javax.swing.JMenuItem();
        mniListaCategorias = new javax.swing.JMenuItem();
        mniListaCores = new javax.swing.JMenuItem();
        mniListaMarcas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        jMenu1.setBackground(new java.awt.Color(153, 153, 255));
        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        mniCadastrarOperacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniCadastrarOperacao.setText("Cadastrar Operação");
        mniCadastrarOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarOperacaoActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadastrarOperacao);

        mniCadastrarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniCadastrarCliente.setText("Cadastrar Cliente");
        mniCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadastrarCliente);

        mniCadastrarProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniCadastrarProduto.setText("Cadastrar Produto");
        mniCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadastrarProduto);

        mniCadastrarCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniCadastrarCategoria.setText("Cadastrar Categoria");
        mniCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadastrarCategoria);

        mniCadastrarCor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniCadastrarCor.setText("Cadastrar Cor");
        mniCadastrarCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarCorActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadastrarCor);

        mniCadastrarMarca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniCadastrarMarca.setText("Cadastrar Marca");
        mniCadastrarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarMarcaActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadastrarMarca);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listagem");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        mniListaClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniListaClientes.setText("Clientes");
        mniListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListaClientesActionPerformed(evt);
            }
        });
        jMenu2.add(mniListaClientes);

        mniListaProdutos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniListaProdutos.setText("Produtos");
        mniListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListaProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(mniListaProdutos);

        mniListaCategorias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniListaCategorias.setText("Categorias");
        mniListaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListaCategoriasActionPerformed(evt);
            }
        });
        jMenu2.add(mniListaCategorias);

        mniListaCores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniListaCores.setText("Cores");
        mniListaCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListaCoresActionPerformed(evt);
            }
        });
        jMenu2.add(mniListaCores);

        mniListaMarcas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mniListaMarcas.setText("Marcas");
        mniListaMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListaMarcasActionPerformed(evt);
            }
        });
        jMenu2.add(mniListaMarcas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniCadastrarOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarOperacaoActionPerformed
        JFrameCadastrarOperacao operacao = new JFrameCadastrarOperacao();
       
        operacao.setVisible(true);
    }//GEN-LAST:event_mniCadastrarOperacaoActionPerformed

    private void mniCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarProdutoActionPerformed
        JFrameCadastrarProduto produto = new JFrameCadastrarProduto();
       
        produto.setVisible(true);
    }//GEN-LAST:event_mniCadastrarProdutoActionPerformed

    private void mniCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarCategoriaActionPerformed
        JFrameCadastrarCategoria categoria = new JFrameCadastrarCategoria();
        jPanel1.add(categoria);
        categoria.setVisible(true);
    }//GEN-LAST:event_mniCadastrarCategoriaActionPerformed

    private void mniCadastrarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarMarcaActionPerformed
        JFrameCadastrarMarca marca = new JFrameCadastrarMarca();
        jPanel1.add(marca);
        marca.setVisible(true);
    }//GEN-LAST:event_mniCadastrarMarcaActionPerformed

    private void mniCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarClienteActionPerformed
        JFrameCadastrarCliente cliente = new JFrameCadastrarCliente();
       
        cliente.setVisible(true);
    }//GEN-LAST:event_mniCadastrarClienteActionPerformed

    private void mniCadastrarCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarCorActionPerformed
        JFrameCadastrarCor cor = new JFrameCadastrarCor();
        jPanel1.add(cor);
        cor.setVisible(true);
    }//GEN-LAST:event_mniCadastrarCorActionPerformed

    private void mniListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListaClientesActionPerformed

    }//GEN-LAST:event_mniListaClientesActionPerformed

    private void mniListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListaProdutosActionPerformed
        JFrameListaProdutos produtos = new JFrameListaProdutos();
      
        produtos.setVisible(true);
    }//GEN-LAST:event_mniListaProdutosActionPerformed

    private void mniListaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListaCategoriasActionPerformed
        JFrameListaCategorias categoria = new JFrameListaCategorias();
        jPanel1.add(categoria);
        categoria.setVisible(true);
    }//GEN-LAST:event_mniListaCategoriasActionPerformed

    private void mniListaCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListaCoresActionPerformed
        JFrameListaCores cores = new JFrameListaCores();
        jPanel1.add(cores);
        cores.setVisible(true);
    }//GEN-LAST:event_mniListaCoresActionPerformed

    private void mniListaMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListaMarcasActionPerformed
        JFrameListaMarcas marcas = new JFrameListaMarcas();
        jPanel1.add(marcas);
        marcas.setVisible(true);
    }//GEN-LAST:event_mniListaMarcasActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mniCadastrarCategoria;
    private javax.swing.JMenuItem mniCadastrarCliente;
    private javax.swing.JMenuItem mniCadastrarCor;
    private javax.swing.JMenuItem mniCadastrarMarca;
    private javax.swing.JMenuItem mniCadastrarOperacao;
    private javax.swing.JMenuItem mniCadastrarProduto;
    private javax.swing.JMenuItem mniListaCategorias;
    private javax.swing.JMenuItem mniListaClientes;
    private javax.swing.JMenuItem mniListaCores;
    private javax.swing.JMenuItem mniListaMarcas;
    private javax.swing.JMenuItem mniListaProdutos;
    // End of variables declaration//GEN-END:variables
}
