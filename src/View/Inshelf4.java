
package View;

import Model.Produto;
import View.RoundedPanel;
import java.awt.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Inshelf4 extends javax.swing.JFrame {

    private Produto objproduto;
    
    public Inshelf4() {
        initComponents();
        this.objproduto = new Produto();
        additionalConfig();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paine_base = new javax.swing.JPanel();
        margin_top = new javax.swing.JPanel();
        margin_right = new javax.swing.JPanel();
        margin_bottom = new javax.swing.JPanel();
        margin_left = new javax.swing.JPanel();
        margin_center = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        menu_item_relatorios = new javax.swing.JPanel();
        menu_text_relatorios = new javax.swing.JLabel();
        menu_icon_relatorios = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        menu_item_funcionarios = new javax.swing.JPanel();
        menu_icon_funcionarios = new javax.swing.JLabel();
        menu_combo_box_funcionarios = new javax.swing.JComboBox<>();
        jPanel31 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        menu_item_produtos = new javax.swing.JPanel();
        menu_icon_produtos = new javax.swing.JLabel();
        menu_combo_box_produtos = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        menu_item_sair = new javax.swing.JPanel();
        menu_text_sair = new javax.swing.JLabel();
        menu_icon_sair = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        menu_item_sobre = new javax.swing.JPanel();
        menu_text_sobre = new javax.swing.JLabel();
        menu_icon_sobre = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        roundedPanel1 = new View.RoundedPanel();
        roundedPanel2 = new View.RoundedPanel();
        roundedPanel3 = new View.RoundedPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        roundedPanel4 = new View.RoundedPanel();
        roundedPanel6 = new View.RoundedPanel();
        roundedPanel7 = new View.RoundedPanel();
        painel_principal_superior = new javax.swing.JPanel();
        tela_sobre_superior = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tela_cadastro_produtos_superior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painel_campos_produtos_superior = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        campoTitulo = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        campoAutor = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        campoPreco = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        campoEditora = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        campoAnoPublicacao = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        campoGenero = new javax.swing.JComboBox<>();
        tela_gerenciamento_produtos_supeior = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tela_cadastro_funcionarios_superior = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tela_gerenciamento_funcionarios_superior = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tela_relatorios_superior = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        roundedPanel5 = new View.RoundedPanel();
        painel_principal_inferior = new javax.swing.JPanel();
        tela_sobre_inferior = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tela_cadastro_produtos_inferior = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        painel_campos_produtos_inferior = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        campoDataCadastro = new javax.swing.JTextField();
        jPanel61 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        campoDescricao = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        campoQuantidade = new javax.swing.JTextField();
        jPanel66 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        botao_cadastrar = new javax.swing.JButton();
        jPanel65 = new javax.swing.JPanel();
        tela_gerenciamento_produtos_inferior = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tela_cadastro_funcionarios_inferior = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tela_gerenciamento_funcionarios_inferior = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tela_relatorios_inferior = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        roundedPanel8 = new View.RoundedPanel();
        roundedPanel9 = new View.RoundedPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 245, 238));

        paine_base.setBackground(new java.awt.Color(251, 245, 238));
        paine_base.setLayout(new java.awt.BorderLayout());

        margin_top.setBackground(new java.awt.Color(251, 245, 238));
        margin_top.setPreferredSize(new java.awt.Dimension(1280, 20));

        javax.swing.GroupLayout margin_topLayout = new javax.swing.GroupLayout(margin_top);
        margin_top.setLayout(margin_topLayout);
        margin_topLayout.setHorizontalGroup(
            margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        margin_topLayout.setVerticalGroup(
            margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paine_base.add(margin_top, java.awt.BorderLayout.PAGE_START);

        margin_right.setBackground(new java.awt.Color(251, 245, 238));
        margin_right.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout margin_rightLayout = new javax.swing.GroupLayout(margin_right);
        margin_right.setLayout(margin_rightLayout);
        margin_rightLayout.setHorizontalGroup(
            margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        margin_rightLayout.setVerticalGroup(
            margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        paine_base.add(margin_right, java.awt.BorderLayout.LINE_END);

        margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        margin_bottom.setPreferredSize(new java.awt.Dimension(1280, 20));

        javax.swing.GroupLayout margin_bottomLayout = new javax.swing.GroupLayout(margin_bottom);
        margin_bottom.setLayout(margin_bottomLayout);
        margin_bottomLayout.setHorizontalGroup(
            margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        margin_bottomLayout.setVerticalGroup(
            margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        paine_base.add(margin_bottom, java.awt.BorderLayout.PAGE_END);

        margin_left.setBackground(new java.awt.Color(251, 245, 238));
        margin_left.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout margin_leftLayout = new javax.swing.GroupLayout(margin_left);
        margin_left.setLayout(margin_leftLayout);
        margin_leftLayout.setHorizontalGroup(
            margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        margin_leftLayout.setVerticalGroup(
            margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        paine_base.add(margin_left, java.awt.BorderLayout.LINE_START);

        margin_center.setBackground(new java.awt.Color(251, 245, 238));
        margin_center.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(251, 245, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 660));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(251, 245, 238));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(251, 245, 238));
        jPanel16.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(251, 245, 238));
        jPanel18.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel18, java.awt.BorderLayout.NORTH);

        jPanel19.setBackground(new java.awt.Color(251, 245, 238));
        jPanel19.setPreferredSize(new java.awt.Dimension(20, 80));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel19, java.awt.BorderLayout.WEST);

        jPanel20.setBackground(new java.awt.Color(251, 245, 238));
        jPanel20.setPreferredSize(new java.awt.Dimension(280, 180));

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(95, 74, 61));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/logo_40.png"))); // NOI18N
        jLabel1.setText("INSHELF");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIconTextGap(10);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel16, java.awt.BorderLayout.NORTH);

        jPanel8.setBackground(new java.awt.Color(251, 245, 238));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel21.setBackground(new java.awt.Color(251, 245, 238));
        jPanel21.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(251, 245, 238));
        jPanel17.setPreferredSize(new java.awt.Dimension(20, 80));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel17, java.awt.BorderLayout.WEST);

        jPanel28.setBackground(new java.awt.Color(251, 245, 238));
        jPanel28.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel28, java.awt.BorderLayout.NORTH);

        menu_item_relatorios.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_relatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_relatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_relatoriosMouseExited(evt);
            }
        });

        menu_text_relatorios.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_text_relatorios.setForeground(new java.awt.Color(91, 48, 22));
        menu_text_relatorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_text_relatorios.setText("Relatórios");

        menu_icon_relatorios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png"))); // NOI18N

        javax.swing.GroupLayout menu_item_relatoriosLayout = new javax.swing.GroupLayout(menu_item_relatorios);
        menu_item_relatorios.setLayout(menu_item_relatoriosLayout);
        menu_item_relatoriosLayout.setHorizontalGroup(
            menu_item_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_relatoriosLayout.createSequentialGroup()
                .addComponent(menu_icon_relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(menu_text_relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menu_item_relatoriosLayout.setVerticalGroup(
            menu_item_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_item_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(menu_text_relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(menu_icon_relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.add(menu_item_relatorios, java.awt.BorderLayout.CENTER);

        jPanel30.setBackground(new java.awt.Color(251, 245, 238));
        jPanel30.setMinimumSize(new java.awt.Dimension(300, 20));
        jPanel30.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel30, java.awt.BorderLayout.SOUTH);

        jPanel8.add(jPanel21, java.awt.BorderLayout.NORTH);

        jPanel22.setBackground(new java.awt.Color(251, 245, 238));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel32.setBackground(new java.awt.Color(251, 245, 238));
        jPanel32.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel32, java.awt.BorderLayout.NORTH);

        menu_item_funcionarios.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_funcionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_funcionariosMouseExited(evt);
            }
        });

        menu_icon_funcionarios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png"))); // NOI18N

        menu_combo_box_funcionarios.setBackground(new java.awt.Color(251, 245, 238));
        menu_combo_box_funcionarios.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_combo_box_funcionarios.setForeground(new java.awt.Color(91, 48, 22));
        menu_combo_box_funcionarios.setMaximumRowCount(3);
        menu_combo_box_funcionarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionarios", "Gerenciar Funcionarios", "Cadastrar Funcionario" }));
        menu_combo_box_funcionarios.setBorder(null);
        menu_combo_box_funcionarios.setFocusable(false);
        menu_combo_box_funcionarios.setRequestFocusEnabled(false);
        menu_combo_box_funcionarios.setVerifyInputWhenFocusTarget(false);
        menu_combo_box_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_combo_box_funcionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_combo_box_funcionariosMouseExited(evt);
            }
        });
        menu_combo_box_funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_combo_box_funcionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_item_funcionariosLayout = new javax.swing.GroupLayout(menu_item_funcionarios);
        menu_item_funcionarios.setLayout(menu_item_funcionariosLayout);
        menu_item_funcionariosLayout.setHorizontalGroup(
            menu_item_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_funcionariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_icon_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_combo_box_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_item_funcionariosLayout.setVerticalGroup(
            menu_item_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_item_funcionariosLayout.createSequentialGroup()
                .addGroup(menu_item_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(menu_icon_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_combo_box_funcionarios))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel22.add(menu_item_funcionarios, java.awt.BorderLayout.CENTER);

        jPanel31.setBackground(new java.awt.Color(251, 245, 238));
        jPanel31.setMinimumSize(new java.awt.Dimension(300, 20));
        jPanel31.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel31, java.awt.BorderLayout.SOUTH);

        jPanel33.setBackground(new java.awt.Color(251, 245, 238));
        jPanel33.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel33, java.awt.BorderLayout.WEST);

        jPanel8.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel23.setBackground(new java.awt.Color(251, 245, 238));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setBackground(new java.awt.Color(251, 245, 238));
        jPanel24.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel24, java.awt.BorderLayout.NORTH);

        menu_item_produtos.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_produtosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_produtosMouseExited(evt);
            }
        });

        menu_icon_produtos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png"))); // NOI18N

        menu_combo_box_produtos.setBackground(new java.awt.Color(251, 245, 238));
        menu_combo_box_produtos.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_combo_box_produtos.setForeground(new java.awt.Color(91, 48, 22));
        menu_combo_box_produtos.setMaximumRowCount(3);
        menu_combo_box_produtos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produtos", "Gerenciar Produtos", "Cadastrar Produto" }));
        menu_combo_box_produtos.setBorder(null);
        menu_combo_box_produtos.setFocusable(false);
        menu_combo_box_produtos.setLightWeightPopupEnabled(false);
        menu_combo_box_produtos.setRequestFocusEnabled(false);
        menu_combo_box_produtos.setVerifyInputWhenFocusTarget(false);
        menu_combo_box_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_combo_box_produtosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_item_produtosLayout = new javax.swing.GroupLayout(menu_item_produtos);
        menu_item_produtos.setLayout(menu_item_produtosLayout);
        menu_item_produtosLayout.setHorizontalGroup(
            menu_item_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_produtosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_icon_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_combo_box_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_item_produtosLayout.setVerticalGroup(
            menu_item_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_item_produtosLayout.createSequentialGroup()
                .addGroup(menu_item_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(menu_icon_produtos, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(menu_combo_box_produtos))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel23.add(menu_item_produtos, java.awt.BorderLayout.CENTER);

        jPanel26.setBackground(new java.awt.Color(251, 245, 238));
        jPanel26.setMinimumSize(new java.awt.Dimension(300, 20));
        jPanel26.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel26, java.awt.BorderLayout.SOUTH);

        jPanel34.setBackground(new java.awt.Color(251, 245, 238));
        jPanel34.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel34, java.awt.BorderLayout.WEST);

        jPanel8.add(jPanel23, java.awt.BorderLayout.SOUTH);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel7.setBackground(new java.awt.Color(251, 245, 238));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 200));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(251, 245, 238));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(251, 245, 238));
        jPanel10.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel10, java.awt.BorderLayout.NORTH);

        menu_item_sair.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_sair.setPreferredSize(new java.awt.Dimension(300, 80));
        menu_item_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_sairMouseExited(evt);
            }
        });

        menu_text_sair.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_text_sair.setForeground(new java.awt.Color(91, 48, 22));
        menu_text_sair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_text_sair.setText("Sair");

        menu_icon_sair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/logout-black.png"))); // NOI18N

        javax.swing.GroupLayout menu_item_sairLayout = new javax.swing.GroupLayout(menu_item_sair);
        menu_item_sair.setLayout(menu_item_sairLayout);
        menu_item_sairLayout.setHorizontalGroup(
            menu_item_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_sairLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_icon_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(menu_text_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_item_sairLayout.setVerticalGroup(
            menu_item_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_text_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu_item_sairLayout.createSequentialGroup()
                .addComponent(menu_icon_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(menu_item_sair, java.awt.BorderLayout.CENTER);

        jPanel15.setBackground(new java.awt.Color(251, 245, 238));
        jPanel15.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel15, java.awt.BorderLayout.SOUTH);

        jPanel35.setBackground(new java.awt.Color(251, 245, 238));
        jPanel35.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel35, java.awt.BorderLayout.WEST);

        jPanel7.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel9.setBackground(new java.awt.Color(251, 245, 238));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(251, 245, 238));
        jPanel11.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel11, java.awt.BorderLayout.NORTH);

        menu_item_sobre.setBackground(new java.awt.Color(251, 245, 238));
        menu_item_sobre.setPreferredSize(new java.awt.Dimension(0, 60));
        menu_item_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_sobreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_item_sobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_item_sobreMouseExited(evt);
            }
        });

        menu_text_sobre.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        menu_text_sobre.setForeground(new java.awt.Color(91, 48, 22));
        menu_text_sobre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_text_sobre.setText("Sobre");

        menu_icon_sobre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png"))); // NOI18N

        javax.swing.GroupLayout menu_item_sobreLayout = new javax.swing.GroupLayout(menu_item_sobre);
        menu_item_sobre.setLayout(menu_item_sobreLayout);
        menu_item_sobreLayout.setHorizontalGroup(
            menu_item_sobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_item_sobreLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_icon_sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(menu_text_sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_item_sobreLayout.setVerticalGroup(
            menu_item_sobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_text_sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu_item_sobreLayout.createSequentialGroup()
                .addComponent(menu_icon_sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.add(menu_item_sobre, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(251, 245, 238));
        jPanel14.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel14, java.awt.BorderLayout.SOUTH);

        jPanel36.setBackground(new java.awt.Color(251, 245, 238));
        jPanel36.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel36, java.awt.BorderLayout.WEST);

        jPanel7.add(jPanel9, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel7, java.awt.BorderLayout.SOUTH);

        margin_center.add(jPanel1, java.awt.BorderLayout.LINE_START);

        roundedPanel1.setBackground(new java.awt.Color(91, 48, 22));
        roundedPanel1.setRoundBottomLeft(50);
        roundedPanel1.setRoundBottomRight(50);
        roundedPanel1.setRoundTopLeft(50);
        roundedPanel1.setRoundTopRight(50);
        roundedPanel1.setLayout(new java.awt.BorderLayout());

        roundedPanel2.setBackground(new java.awt.Color(91, 48, 22));
        roundedPanel2.setPreferredSize(new java.awt.Dimension(940, 30));
        roundedPanel2.setRoundTopLeft(50);
        roundedPanel2.setRoundTopRight(50);

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel1.add(roundedPanel2, java.awt.BorderLayout.PAGE_START);

        roundedPanel3.setBackground(new java.awt.Color(91, 48, 22));
        roundedPanel3.setPreferredSize(new java.awt.Dimension(940, 30));
        roundedPanel3.setRoundBottomLeft(50);
        roundedPanel3.setRoundBottomRight(50);

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel1.add(roundedPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(91, 48, 22));
        jPanel2.setPreferredSize(new java.awt.Dimension(20, 590));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        roundedPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(91, 48, 22));
        jPanel3.setPreferredSize(new java.awt.Dimension(20, 590));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        roundedPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(91, 48, 22));
        jPanel4.setLayout(new java.awt.BorderLayout());

        roundedPanel4.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel4.setMinimumSize(new java.awt.Dimension(900, 290));
        roundedPanel4.setPreferredSize(new java.awt.Dimension(900, 290));
        roundedPanel4.setRoundBottomLeft(50);
        roundedPanel4.setRoundBottomRight(50);
        roundedPanel4.setRoundTopLeft(50);
        roundedPanel4.setRoundTopRight(50);
        roundedPanel4.setLayout(new java.awt.BorderLayout());

        roundedPanel6.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel6.setPreferredSize(new java.awt.Dimension(900, 30));
        roundedPanel6.setRoundTopLeft(50);
        roundedPanel6.setRoundTopRight(50);

        javax.swing.GroupLayout roundedPanel6Layout = new javax.swing.GroupLayout(roundedPanel6);
        roundedPanel6.setLayout(roundedPanel6Layout);
        roundedPanel6Layout.setHorizontalGroup(
            roundedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        roundedPanel6Layout.setVerticalGroup(
            roundedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel4.add(roundedPanel6, java.awt.BorderLayout.NORTH);

        roundedPanel7.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel7.setPreferredSize(new java.awt.Dimension(900, 30));
        roundedPanel7.setRoundBottomLeft(50);
        roundedPanel7.setRoundBottomRight(50);

        javax.swing.GroupLayout roundedPanel7Layout = new javax.swing.GroupLayout(roundedPanel7);
        roundedPanel7.setLayout(roundedPanel7Layout);
        roundedPanel7Layout.setHorizontalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        roundedPanel7Layout.setVerticalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel4.add(roundedPanel7, java.awt.BorderLayout.SOUTH);

        painel_principal_superior.setBackground(new java.awt.Color(251, 245, 238));
        painel_principal_superior.setLayout(new java.awt.CardLayout());

        tela_sobre_superior.setBackground(new java.awt.Color(0, 0, 100));

        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(251, 245, 238));
        jLabel9.setText("Sobre a equipe");

        javax.swing.GroupLayout tela_sobre_superiorLayout = new javax.swing.GroupLayout(tela_sobre_superior);
        tela_sobre_superior.setLayout(tela_sobre_superiorLayout);
        tela_sobre_superiorLayout.setHorizontalGroup(
            tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel9)
                .addContainerGap(388, Short.MAX_VALUE))
        );
        tela_sobre_superiorLayout.setVerticalGroup(
            tela_sobre_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_sobre_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_superior.add(tela_sobre_superior, "card6");

        tela_cadastro_produtos_superior.setBackground(new java.awt.Color(251, 245, 238));
        tela_cadastro_produtos_superior.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 48, 22));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de produto");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(140, 30));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        tela_cadastro_produtos_superior.add(jLabel2, java.awt.BorderLayout.NORTH);

        painel_campos_produtos_superior.setBackground(new java.awt.Color(251, 245, 238));
        painel_campos_produtos_superior.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        jPanel12.setBackground(new java.awt.Color(251, 245, 238));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel42.setBackground(new java.awt.Color(251, 245, 238));
        jPanel42.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel42.setLayout(new java.awt.BorderLayout());

        jPanel49.setBackground(new java.awt.Color(91, 48, 22));
        jPanel49.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(251, 245, 238));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Titulo");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel42.add(jPanel49, java.awt.BorderLayout.WEST);

        jPanel48.setBackground(new java.awt.Color(225, 195, 145));
        jPanel48.setPreferredSize(new java.awt.Dimension(290, 0));

        campoTitulo.setBackground(new java.awt.Color(225, 195, 145));
        campoTitulo.setBorder(null);

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel42.add(jPanel48, java.awt.BorderLayout.EAST);

        jPanel12.add(jPanel42, java.awt.BorderLayout.WEST);

        jPanel43.setBackground(new java.awt.Color(251, 245, 238));
        jPanel43.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel51.setBackground(new java.awt.Color(91, 48, 22));
        jPanel51.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel16.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(251, 245, 238));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Autor");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel51, java.awt.BorderLayout.WEST);

        jPanel50.setBackground(new java.awt.Color(225, 195, 145));
        jPanel50.setPreferredSize(new java.awt.Dimension(290, 0));

        campoAutor.setBackground(new java.awt.Color(225, 195, 145));
        campoAutor.setBorder(null);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel43.add(jPanel50, java.awt.BorderLayout.EAST);

        jPanel12.add(jPanel43, java.awt.BorderLayout.EAST);

        painel_campos_produtos_superior.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(251, 245, 238));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel45.setBackground(new java.awt.Color(251, 245, 238));
        jPanel45.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel45.setLayout(new java.awt.BorderLayout());

        jPanel55.setBackground(new java.awt.Color(91, 48, 22));
        jPanel55.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel14.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(251, 245, 238));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<html>Preço<br>(R$/unid.)</html>");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel45.add(jPanel55, java.awt.BorderLayout.WEST);

        jPanel54.setBackground(new java.awt.Color(225, 195, 145));
        jPanel54.setPreferredSize(new java.awt.Dimension(290, 0));

        campoPreco.setBackground(new java.awt.Color(225, 195, 145));
        campoPreco.setBorder(null);

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(jPanel54, java.awt.BorderLayout.EAST);

        jPanel13.add(jPanel45, java.awt.BorderLayout.WEST);

        jPanel44.setBackground(new java.awt.Color(251, 245, 238));
        jPanel44.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel44.setLayout(new java.awt.BorderLayout());

        jPanel53.setBackground(new java.awt.Color(91, 48, 22));
        jPanel53.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel17.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(251, 245, 238));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Editora");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel44.add(jPanel53, java.awt.BorderLayout.WEST);

        jPanel52.setBackground(new java.awt.Color(225, 195, 145));
        jPanel52.setPreferredSize(new java.awt.Dimension(290, 0));

        campoEditora.setBackground(new java.awt.Color(225, 195, 145));
        campoEditora.setBorder(null);

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel44.add(jPanel52, java.awt.BorderLayout.EAST);

        jPanel13.add(jPanel44, java.awt.BorderLayout.EAST);

        painel_campos_produtos_superior.add(jPanel13);

        jPanel38.setBackground(new java.awt.Color(251, 245, 238));
        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel46.setBackground(new java.awt.Color(251, 245, 238));
        jPanel46.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel46.setLayout(new java.awt.BorderLayout());

        jPanel57.setBackground(new java.awt.Color(91, 48, 22));
        jPanel57.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel15.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(251, 245, 238));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html>Ano de<br>publicacao</html>");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel46.add(jPanel57, java.awt.BorderLayout.WEST);

        jPanel56.setBackground(new java.awt.Color(225, 195, 145));
        jPanel56.setPreferredSize(new java.awt.Dimension(290, 0));

        campoAnoPublicacao.setBackground(new java.awt.Color(225, 195, 145));
        campoAnoPublicacao.setBorder(null);

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAnoPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoAnoPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel46.add(jPanel56, java.awt.BorderLayout.EAST);

        jPanel38.add(jPanel46, java.awt.BorderLayout.WEST);

        jPanel47.setBackground(new java.awt.Color(251, 245, 238));
        jPanel47.setPreferredSize(new java.awt.Dimension(420, 64));
        jPanel47.setLayout(new java.awt.BorderLayout());

        jPanel59.setBackground(new java.awt.Color(91, 48, 22));
        jPanel59.setPreferredSize(new java.awt.Dimension(125, 64));

        jLabel18.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(251, 245, 238));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Genero");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel47.add(jPanel59, java.awt.BorderLayout.WEST);

        jPanel58.setBackground(new java.awt.Color(225, 195, 145));
        jPanel58.setPreferredSize(new java.awt.Dimension(290, 0));

        campoGenero.setBackground(new java.awt.Color(225, 195, 145));
        campoGenero.setForeground(new java.awt.Color(91, 48, 22));
        campoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ficção Literária", "Romance", "Mistério e Suspense", "Ficção Científica e Fantasia", "Autoajuda e Desenvolvimento Pessoal", "História e Biografia", "Política e Atualidades", "Religião e Espiritualidade", "Infantil e Juvenil" }));
        campoGenero.setBorder(null);

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoGenero, 0, 290, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel47.add(jPanel58, java.awt.BorderLayout.EAST);

        jPanel38.add(jPanel47, java.awt.BorderLayout.EAST);

        painel_campos_produtos_superior.add(jPanel38);

        tela_cadastro_produtos_superior.add(painel_campos_produtos_superior, java.awt.BorderLayout.CENTER);

        painel_principal_superior.add(tela_cadastro_produtos_superior, "card5");

        tela_gerenciamento_produtos_supeior.setBackground(new java.awt.Color(200, 0, 0));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 245, 238));
        jLabel5.setText("Gerenciamento de produtos");

        javax.swing.GroupLayout tela_gerenciamento_produtos_supeiorLayout = new javax.swing.GroupLayout(tela_gerenciamento_produtos_supeior);
        tela_gerenciamento_produtos_supeior.setLayout(tela_gerenciamento_produtos_supeiorLayout);
        tela_gerenciamento_produtos_supeiorLayout.setHorizontalGroup(
            tela_gerenciamento_produtos_supeiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_gerenciamento_produtos_supeiorLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel5)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        tela_gerenciamento_produtos_supeiorLayout.setVerticalGroup(
            tela_gerenciamento_produtos_supeiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_gerenciamento_produtos_supeiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_superior.add(tela_gerenciamento_produtos_supeior, "card4");

        tela_cadastro_funcionarios_superior.setBackground(new java.awt.Color(0, 100, 0));

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 245, 238));
        jLabel6.setText("Cadastro de funcionario");

        javax.swing.GroupLayout tela_cadastro_funcionarios_superiorLayout = new javax.swing.GroupLayout(tela_cadastro_funcionarios_superior);
        tela_cadastro_funcionarios_superior.setLayout(tela_cadastro_funcionarios_superiorLayout);
        tela_cadastro_funcionarios_superiorLayout.setHorizontalGroup(
            tela_cadastro_funcionarios_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_cadastro_funcionarios_superiorLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel6)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        tela_cadastro_funcionarios_superiorLayout.setVerticalGroup(
            tela_cadastro_funcionarios_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_cadastro_funcionarios_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_superior.add(tela_cadastro_funcionarios_superior, "card3");

        tela_gerenciamento_funcionarios_superior.setBackground(new java.awt.Color(0, 200, 0));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 245, 238));
        jLabel7.setText("Gerenciamento de produtos");

        javax.swing.GroupLayout tela_gerenciamento_funcionarios_superiorLayout = new javax.swing.GroupLayout(tela_gerenciamento_funcionarios_superior);
        tela_gerenciamento_funcionarios_superior.setLayout(tela_gerenciamento_funcionarios_superiorLayout);
        tela_gerenciamento_funcionarios_superiorLayout.setHorizontalGroup(
            tela_gerenciamento_funcionarios_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_gerenciamento_funcionarios_superiorLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel7)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        tela_gerenciamento_funcionarios_superiorLayout.setVerticalGroup(
            tela_gerenciamento_funcionarios_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_gerenciamento_funcionarios_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_superior.add(tela_gerenciamento_funcionarios_superior, "card2");

        tela_relatorios_superior.setBackground(new java.awt.Color(0, 0, 200));

        jLabel8.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 245, 238));
        jLabel8.setText("Relatorios");

        javax.swing.GroupLayout tela_relatorios_superiorLayout = new javax.swing.GroupLayout(tela_relatorios_superior);
        tela_relatorios_superior.setLayout(tela_relatorios_superiorLayout);
        tela_relatorios_superiorLayout.setHorizontalGroup(
            tela_relatorios_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_relatorios_superiorLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel8)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        tela_relatorios_superiorLayout.setVerticalGroup(
            tela_relatorios_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_relatorios_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_superior.add(tela_relatorios_superior, "card1");

        roundedPanel4.add(painel_principal_superior, java.awt.BorderLayout.CENTER);

        jPanel25.setBackground(new java.awt.Color(251, 245, 238));
        jPanel25.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel4.add(jPanel25, java.awt.BorderLayout.WEST);

        jPanel27.setBackground(new java.awt.Color(251, 245, 238));
        jPanel27.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel4.add(jPanel27, java.awt.BorderLayout.EAST);

        jPanel4.add(roundedPanel4, java.awt.BorderLayout.PAGE_START);

        roundedPanel5.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel5.setMinimumSize(new java.awt.Dimension(900, 400));
        roundedPanel5.setPreferredSize(new java.awt.Dimension(900, 290));
        roundedPanel5.setRoundBottomLeft(50);
        roundedPanel5.setRoundBottomRight(50);
        roundedPanel5.setRoundTopLeft(50);
        roundedPanel5.setRoundTopRight(50);
        roundedPanel5.setLayout(new java.awt.BorderLayout());

        painel_principal_inferior.setBackground(new java.awt.Color(251, 245, 238));
        painel_principal_inferior.setLayout(new java.awt.CardLayout());

        tela_sobre_inferior.setBackground(new java.awt.Color(0, 0, 100));

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(251, 245, 238));
        jLabel10.setText("Sobre o projeto");

        javax.swing.GroupLayout tela_sobre_inferiorLayout = new javax.swing.GroupLayout(tela_sobre_inferior);
        tela_sobre_inferior.setLayout(tela_sobre_inferiorLayout);
        tela_sobre_inferiorLayout.setHorizontalGroup(
            tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel10)
                .addContainerGap(383, Short.MAX_VALUE))
        );
        tela_sobre_inferiorLayout.setVerticalGroup(
            tela_sobre_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_sobre_inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_inferior.add(tela_sobre_inferior, "card6");

        tela_cadastro_produtos_inferior.setBackground(new java.awt.Color(251, 245, 238));
        tela_cadastro_produtos_inferior.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 48, 22));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastro de produto avançado");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(209, 30));
        tela_cadastro_produtos_inferior.add(jLabel3, java.awt.BorderLayout.NORTH);

        painel_campos_produtos_inferior.setBackground(new java.awt.Color(251, 245, 238));
        painel_campos_produtos_inferior.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        jPanel39.setBackground(new java.awt.Color(251, 245, 238));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel60.setBackground(new java.awt.Color(251, 245, 238));
        jPanel60.setPreferredSize(new java.awt.Dimension(420, 0));
        jPanel60.setLayout(new java.awt.BorderLayout());

        jPanel63.setBackground(new java.awt.Color(91, 48, 22));
        jPanel63.setPreferredSize(new java.awt.Dimension(125, 60));

        jLabel20.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(251, 245, 238));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("<html>Data<br>de cadastro</html>");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel60.add(jPanel63, java.awt.BorderLayout.WEST);

        jPanel62.setBackground(new java.awt.Color(225, 195, 145));
        jPanel62.setPreferredSize(new java.awt.Dimension(290, 60));

        campoDataCadastro.setBackground(new java.awt.Color(225, 195, 145));
        campoDataCadastro.setBorder(null);

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel60.add(jPanel62, java.awt.BorderLayout.EAST);

        jPanel39.add(jPanel60, java.awt.BorderLayout.WEST);

        jPanel61.setBackground(new java.awt.Color(251, 245, 238));
        jPanel61.setPreferredSize(new java.awt.Dimension(420, 60));
        jPanel61.setLayout(new java.awt.BorderLayout());

        jPanel71.setBackground(new java.awt.Color(91, 48, 22));
        jPanel71.setPreferredSize(new java.awt.Dimension(125, 60));

        jLabel19.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(251, 245, 238));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Descricao");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel61.add(jPanel71, java.awt.BorderLayout.WEST);

        jPanel68.setBackground(new java.awt.Color(225, 195, 145));
        jPanel68.setPreferredSize(new java.awt.Dimension(290, 60));

        campoDescricao.setBackground(new java.awt.Color(225, 195, 145));
        campoDescricao.setBorder(null);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel61.add(jPanel68, java.awt.BorderLayout.EAST);

        jPanel39.add(jPanel61, java.awt.BorderLayout.EAST);

        painel_campos_produtos_inferior.add(jPanel39);

        jPanel40.setBackground(new java.awt.Color(251, 245, 238));
        jPanel40.setLayout(new java.awt.BorderLayout());

        jPanel67.setBackground(new java.awt.Color(251, 245, 238));
        jPanel67.setPreferredSize(new java.awt.Dimension(420, 0));
        jPanel67.setLayout(new java.awt.BorderLayout());

        jPanel75.setBackground(new java.awt.Color(91, 48, 22));
        jPanel75.setPreferredSize(new java.awt.Dimension(125, 60));

        jLabel21.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(251, 245, 238));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("<html>Quantidade<br>total (estoque)</html>");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel21.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel67.add(jPanel75, java.awt.BorderLayout.WEST);

        jPanel74.setBackground(new java.awt.Color(225, 195, 145));
        jPanel74.setPreferredSize(new java.awt.Dimension(290, 60));

        campoQuantidade.setBackground(new java.awt.Color(225, 195, 145));
        campoQuantidade.setBorder(null);

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel67.add(jPanel74, java.awt.BorderLayout.EAST);

        jPanel40.add(jPanel67, java.awt.BorderLayout.WEST);

        jPanel66.setBackground(new java.awt.Color(251, 245, 238));
        jPanel66.setPreferredSize(new java.awt.Dimension(420, 60));
        jPanel66.setLayout(new java.awt.BorderLayout());
        jPanel40.add(jPanel66, java.awt.BorderLayout.EAST);

        painel_campos_produtos_inferior.add(jPanel40);

        jPanel41.setBackground(new java.awt.Color(251, 245, 238));
        jPanel41.setLayout(new java.awt.BorderLayout());

        jPanel69.setBackground(new java.awt.Color(251, 245, 238));
        jPanel69.setPreferredSize(new java.awt.Dimension(420, 0));

        botao_cadastrar.setBackground(new java.awt.Color(251, 245, 238));
        botao_cadastrar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        botao_cadastrar.setForeground(new java.awt.Color(91, 48, 22));
        botao_cadastrar.setText("Cadastrar");
        botao_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 48, 22), 1, true));
        botao_cadastrar.setPreferredSize(new java.awt.Dimension(75, 15));
        botao_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_cadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_cadastrarMouseExited(evt);
            }
        });
        botao_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addGap(0, 320, Short.MAX_VALUE)
                .addComponent(botao_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(botao_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel41.add(jPanel69, java.awt.BorderLayout.EAST);

        jPanel65.setBackground(new java.awt.Color(251, 245, 238));
        jPanel65.setPreferredSize(new java.awt.Dimension(420, 0));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel41.add(jPanel65, java.awt.BorderLayout.WEST);

        painel_campos_produtos_inferior.add(jPanel41);

        tela_cadastro_produtos_inferior.add(painel_campos_produtos_inferior, java.awt.BorderLayout.CENTER);

        painel_principal_inferior.add(tela_cadastro_produtos_inferior, "card5");

        tela_gerenciamento_produtos_inferior.setBackground(new java.awt.Color(200, 0, 0));

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 245, 238));
        jLabel4.setText("Editar produto");

        javax.swing.GroupLayout tela_gerenciamento_produtos_inferiorLayout = new javax.swing.GroupLayout(tela_gerenciamento_produtos_inferior);
        tela_gerenciamento_produtos_inferior.setLayout(tela_gerenciamento_produtos_inferiorLayout);
        tela_gerenciamento_produtos_inferiorLayout.setHorizontalGroup(
            tela_gerenciamento_produtos_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_gerenciamento_produtos_inferiorLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel4)
                .addContainerGap(384, Short.MAX_VALUE))
        );
        tela_gerenciamento_produtos_inferiorLayout.setVerticalGroup(
            tela_gerenciamento_produtos_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_gerenciamento_produtos_inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_inferior.add(tela_gerenciamento_produtos_inferior, "card4");

        tela_cadastro_funcionarios_inferior.setBackground(new java.awt.Color(0, 100, 0));

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 245, 238));
        jLabel11.setText("Cadastro de funcionario avançado");

        javax.swing.GroupLayout tela_cadastro_funcionarios_inferiorLayout = new javax.swing.GroupLayout(tela_cadastro_funcionarios_inferior);
        tela_cadastro_funcionarios_inferior.setLayout(tela_cadastro_funcionarios_inferiorLayout);
        tela_cadastro_funcionarios_inferiorLayout.setHorizontalGroup(
            tela_cadastro_funcionarios_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_cadastro_funcionarios_inferiorLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel11)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        tela_cadastro_funcionarios_inferiorLayout.setVerticalGroup(
            tela_cadastro_funcionarios_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_cadastro_funcionarios_inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_inferior.add(tela_cadastro_funcionarios_inferior, "card3");

        tela_gerenciamento_funcionarios_inferior.setBackground(new java.awt.Color(0, 200, 0));

        jLabel12.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(251, 245, 238));
        jLabel12.setText("Editar funcionario");

        javax.swing.GroupLayout tela_gerenciamento_funcionarios_inferiorLayout = new javax.swing.GroupLayout(tela_gerenciamento_funcionarios_inferior);
        tela_gerenciamento_funcionarios_inferior.setLayout(tela_gerenciamento_funcionarios_inferiorLayout);
        tela_gerenciamento_funcionarios_inferiorLayout.setHorizontalGroup(
            tela_gerenciamento_funcionarios_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_gerenciamento_funcionarios_inferiorLayout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel12)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        tela_gerenciamento_funcionarios_inferiorLayout.setVerticalGroup(
            tela_gerenciamento_funcionarios_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_gerenciamento_funcionarios_inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        painel_principal_inferior.add(tela_gerenciamento_funcionarios_inferior, "card2");

        tela_relatorios_inferior.setBackground(new java.awt.Color(0, 0, 200));

        javax.swing.GroupLayout tela_relatorios_inferiorLayout = new javax.swing.GroupLayout(tela_relatorios_inferior);
        tela_relatorios_inferior.setLayout(tela_relatorios_inferiorLayout);
        tela_relatorios_inferiorLayout.setHorizontalGroup(
            tela_relatorios_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        tela_relatorios_inferiorLayout.setVerticalGroup(
            tela_relatorios_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        painel_principal_inferior.add(tela_relatorios_inferior, "card1");

        roundedPanel5.add(painel_principal_inferior, java.awt.BorderLayout.CENTER);

        jPanel29.setBackground(new java.awt.Color(251, 245, 238));
        jPanel29.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel5.add(jPanel29, java.awt.BorderLayout.WEST);

        jPanel37.setBackground(new java.awt.Color(251, 245, 238));
        jPanel37.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel5.add(jPanel37, java.awt.BorderLayout.EAST);

        roundedPanel8.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel8.setPreferredSize(new java.awt.Dimension(900, 30));
        roundedPanel8.setRoundTopLeft(50);
        roundedPanel8.setRoundTopRight(50);

        javax.swing.GroupLayout roundedPanel8Layout = new javax.swing.GroupLayout(roundedPanel8);
        roundedPanel8.setLayout(roundedPanel8Layout);
        roundedPanel8Layout.setHorizontalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        roundedPanel8Layout.setVerticalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel5.add(roundedPanel8, java.awt.BorderLayout.NORTH);

        roundedPanel9.setBackground(new java.awt.Color(251, 245, 238));
        roundedPanel9.setPreferredSize(new java.awt.Dimension(900, 30));
        roundedPanel9.setRoundBottomLeft(50);
        roundedPanel9.setRoundBottomRight(50);

        javax.swing.GroupLayout roundedPanel9Layout = new javax.swing.GroupLayout(roundedPanel9);
        roundedPanel9.setLayout(roundedPanel9Layout);
        roundedPanel9Layout.setHorizontalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        roundedPanel9Layout.setVerticalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundedPanel5.add(roundedPanel9, java.awt.BorderLayout.SOUTH);

        jPanel4.add(roundedPanel5, java.awt.BorderLayout.PAGE_END);

        roundedPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        margin_center.add(roundedPanel1, java.awt.BorderLayout.CENTER);

        paine_base.add(margin_center, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paine_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paine_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void additionalConfig(){
        
    }
    
    private void menu_item_relatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_relatoriosMouseEntered
//        menu_item_relatorios.setBackground(new Color(91,48,22));
//        menu_text_relatorios.setForeground(new Color(251,245,238));
//        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/relatorio_icon-white.png")));
    }//GEN-LAST:event_menu_item_relatoriosMouseEntered

    private void menu_item_relatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_relatoriosMouseExited
//        menu_item_relatorios.setBackground(new Color(251,245,238));
//        menu_text_relatorios.setForeground(new Color(91,48,22));
//        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
    }//GEN-LAST:event_menu_item_relatoriosMouseExited

    private void menu_item_funcionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_funcionariosMouseEntered
//        menu_item_funcionarios.setBackground(new Color(91,48,22));
//        menu_combo_box_funcionarios.setForeground(new Color(251,245,238));
//        menu_combo_box_funcionarios.setBackground(new Color(91,48,22));
//        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/id_card-white.png")));
        
    }//GEN-LAST:event_menu_item_funcionariosMouseEntered

    private void menu_item_funcionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_funcionariosMouseExited
//        menu_item_funcionarios.setBackground(new Color(251,245,238));
//        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
//        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
//        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
    }//GEN-LAST:event_menu_item_funcionariosMouseExited

    private void menu_item_produtosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_produtosMouseEntered
//        menu_item_produtos.setBackground(new Color(91,48,22));
//        menu_combo_box_produtos.setForeground(new Color(251,245,238));
//        menu_combo_box_produtos.setBackground(new Color(91,48,22));
//        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/book-white.png")));
    }//GEN-LAST:event_menu_item_produtosMouseEntered

    private void menu_item_produtosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_produtosMouseExited
//        menu_item_produtos.setBackground(new Color(251,245,238));
//        menu_combo_box_produtos.setForeground(new Color(91,48,22));
//        menu_combo_box_produtos.setBackground(new Color(251,245,238));
//        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));
    }//GEN-LAST:event_menu_item_produtosMouseExited

    private void menu_item_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sairMouseEntered
        
    }//GEN-LAST:event_menu_item_sairMouseEntered

    private void menu_item_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sairMouseExited
        
    }//GEN-LAST:event_menu_item_sairMouseExited

    private void menu_item_sobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sobreMouseEntered
//        menu_item_sobre.setBackground(new Color(91,48,22));
//        menu_text_sobre.setForeground(new Color(251,245,238));
//        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/help-white.png")));
    }//GEN-LAST:event_menu_item_sobreMouseEntered

    private void menu_item_sobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sobreMouseExited
//        menu_item_sobre.setBackground(new Color(251,245,238));
//        menu_text_sobre.setForeground(new Color(91,48,22));
//        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));
    }//GEN-LAST:event_menu_item_sobreMouseExited

    private void menu_item_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menu_item_sairMouseClicked

    private void menu_item_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_relatoriosMouseClicked
        
        //-----hover effect-------
        
        //relatorio selecionado
        menu_item_relatorios.setBackground(new Color(91,48,22));
        menu_text_relatorios.setForeground(new Color(251,245,238));
        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/relatorio_icon-white.png")));
        
        //produto deseleciona
        menu_item_produtos.setBackground(new Color(251,245,238));
        menu_combo_box_produtos.setForeground(new Color(91,48,22));
        menu_combo_box_produtos.setBackground(new Color(251,245,238));
        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));
        
        //funcionario deseleciona
        menu_item_funcionarios.setBackground(new Color(251,245,238));
        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
        
        //sobre deseleciona
        menu_item_sobre.setBackground(new Color(251,245,238));
        menu_text_sobre.setForeground(new Color(91,48,22));
        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));
        
        
        //----mostrar conteudo do card--------
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior
        
        cardSuperior.show(painel_principal_superior, "card1"); //mostra card relatorios superior
        cardInferior.show(painel_principal_inferior, "card1"); //mostra card relatorios inferior
        
        menu_combo_box_funcionarios.setSelectedIndex(0); //redefine o combobox para funcionario
        menu_combo_box_produtos.setSelectedIndex(0); //redefine o combobox para produto
    }//GEN-LAST:event_menu_item_relatoriosMouseClicked

    private void menu_item_sobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sobreMouseClicked
        
        //-----hover effect-------
        
        //sobre selecionado
        menu_item_sobre.setBackground(new Color(91,48,22));
        menu_text_sobre.setForeground(new Color(251,245,238));
        menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/help-white.png")));
        
        //produto deseleciona
        menu_item_produtos.setBackground(new Color(251,245,238));
        menu_combo_box_produtos.setForeground(new Color(91,48,22));
        menu_combo_box_produtos.setBackground(new Color(251,245,238));
        menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));
        
        //funcionario deseleciona
        menu_item_funcionarios.setBackground(new Color(251,245,238));
        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
        
        //relatorio deseleciona
        menu_item_relatorios.setBackground(new Color(251,245,238));
        menu_text_relatorios.setForeground(new Color(91,48,22));
        menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
        
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior
        
        cardSuperior.show(painel_principal_superior, "card6"); //mostra card sobre superior
        cardInferior.show(painel_principal_inferior, "card6"); //mostra card sobre inferior
        
        menu_combo_box_funcionarios.setSelectedIndex(0);//redefine o combobox para funcionario
        menu_combo_box_produtos.setSelectedIndex(0);//redefine o combobox para produto
    }//GEN-LAST:event_menu_item_sobreMouseClicked

    private void menu_combo_box_funcionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_combo_box_funcionariosMouseEntered
//        menu_item_funcionarios.setBackground(new Color(251,245,238));
//        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
//        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
//        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
    }//GEN-LAST:event_menu_combo_box_funcionariosMouseEntered

    private void menu_combo_box_funcionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_combo_box_funcionariosMouseExited
//        menu_item_funcionarios.setBackground(new Color(251,245,238));
//        menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
//        menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
//        menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
    }//GEN-LAST:event_menu_combo_box_funcionariosMouseExited

    private void menu_combo_box_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_combo_box_funcionariosActionPerformed

        String option = (String)menu_combo_box_funcionarios.getSelectedItem(); //recebe a opcao escolhida no combo box
        
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior
        
        
        switch(option){
            
            case "Gerenciar Funcionarios":
                
                //-----hover effect-------

                    //funcionario selecionado
                    menu_item_funcionarios.setBackground(new Color(91,48,22));
                    menu_combo_box_funcionarios.setForeground(new Color(251,245,238));
                    menu_combo_box_funcionarios.setBackground(new Color(91,48,22));
                    menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/id_card-white.png")));

                    //produto deseleciona
                    menu_item_produtos.setBackground(new Color(251,245,238));
                    menu_combo_box_produtos.setForeground(new Color(91,48,22));
                    menu_combo_box_produtos.setBackground(new Color(251,245,238));
                    menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));

                    //sobre deseleciona
                    menu_item_sobre.setBackground(new Color(251,245,238));
                    menu_text_sobre.setForeground(new Color(91,48,22));
                    menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

                    //relatorio deseleciona
                    menu_item_relatorios.setBackground(new Color(251,245,238));
                    menu_text_relatorios.setForeground(new Color(91,48,22));
                    menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
                
                //----mostra conteudo------
                cardSuperior.show(painel_principal_superior, "card2"); //mostra card gerenciar funcionarios superior
                cardInferior.show(painel_principal_inferior, "card2"); //mostra card gerenciar funcionarios inferior
                //menu_combo_box_funcionarios.setSelectedIndex(0);
                menu_combo_box_produtos.setSelectedIndex(0);//redefine o combobox para produto
                break;
                
            case "Cadastrar Funcionario":
                
                //-----hover effect-------

                    //funcionario selecionado
                    menu_item_funcionarios.setBackground(new Color(91,48,22));
                    menu_combo_box_funcionarios.setForeground(new Color(251,245,238));
                    menu_combo_box_funcionarios.setBackground(new Color(91,48,22));
                    menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/id_card-white.png")));

                    //produto deseleciona
                    menu_item_produtos.setBackground(new Color(251,245,238));
                    menu_combo_box_produtos.setForeground(new Color(91,48,22));
                    menu_combo_box_produtos.setBackground(new Color(251,245,238));
                    menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));

                    //sobre deseleciona
                    menu_item_sobre.setBackground(new Color(251,245,238));
                    menu_text_sobre.setForeground(new Color(91,48,22));
                    menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

                    //relatorio deseleciona
                    menu_item_relatorios.setBackground(new Color(251,245,238));
                    menu_text_relatorios.setForeground(new Color(91,48,22));
                    menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
                
                //----mostra conteudo------
                cardSuperior.show(painel_principal_superior, "card3"); //mostra card cadastrar funcionario superior
                cardInferior.show(painel_principal_inferior, "card3"); //mostra card cadastrar funcionario inferior
                //menu_combo_box_funcionarios.setSelectedIndex(0);
                menu_combo_box_produtos.setSelectedIndex(0);//redefine o combobox para produto
                break;
                
            case "Funcionarios":
                //nenhuma acao
                break;
        }
        
    }//GEN-LAST:event_menu_combo_box_funcionariosActionPerformed

    private void menu_combo_box_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_combo_box_produtosActionPerformed
        
        String option = (String)menu_combo_box_produtos.getSelectedItem(); //recebe a opcao escolhida no combo box
        
        CardLayout cardSuperior = (CardLayout)(painel_principal_superior.getLayout()); //declaracao para manipular o card supeior
        CardLayout cardInferior = (CardLayout)(painel_principal_inferior.getLayout()); //declaracao para manipular o card inferior
        
        
        switch(option){
            
            case "Gerenciar Produtos":
                
                //-----hover effect-------

                    //produto selecionado
                    menu_item_produtos.setBackground(new Color(91,48,22));
                    menu_combo_box_produtos.setForeground(new Color(251,245,238));
                    menu_combo_box_produtos.setBackground(new Color(91,48,22));
                    menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/book-white.png")));

                    //funcionario deseleciona
                    menu_item_funcionarios.setBackground(new Color(251,245,238));
                    menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
                    menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
                    menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));

                    //sobre deseleciona
                    menu_item_sobre.setBackground(new Color(251,245,238));
                    menu_text_sobre.setForeground(new Color(91,48,22));
                    menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

                    //relatorio deseleciona
                    menu_item_relatorios.setBackground(new Color(251,245,238));
                    menu_text_relatorios.setForeground(new Color(91,48,22));
                    menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
                
                //----mostra conteudo------
                
                cardSuperior.show(painel_principal_superior, "card4"); //mostra card gerenciar produtos superior
                cardInferior.show(painel_principal_inferior, "card4"); //mostra card gerenciar produtos inferior
                //menu_combo_box_produtos.setSelectedIndex(0);
                menu_combo_box_funcionarios.setSelectedIndex(0);//redefine o combobox para funcionario
                break;
                
            case "Cadastrar Produto":
                
                //-----hover effect-------

                    //produto selecionado
                    menu_item_produtos.setBackground(new Color(91,48,22));
                    menu_combo_box_produtos.setForeground(new Color(251,245,238));
                    menu_combo_box_produtos.setBackground(new Color(91,48,22));
                    menu_icon_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/book-white.png")));

                    //funcionario deseleciona
                    menu_item_funcionarios.setBackground(new Color(251,245,238));
                    menu_combo_box_funcionarios.setForeground(new Color(91,48,22));
                    menu_combo_box_funcionarios.setBackground(new Color(251,245,238));
                    menu_icon_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));

                    //sobre deseleciona
                    menu_item_sobre.setBackground(new Color(251,245,238));
                    menu_text_sobre.setForeground(new Color(91,48,22));
                    menu_icon_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));

                    //relatorio deseleciona
                    menu_item_relatorios.setBackground(new Color(251,245,238));
                    menu_text_relatorios.setForeground(new Color(91,48,22));
                    menu_icon_relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
                
                //----mostra conteudo------
                
                cardSuperior.show(painel_principal_superior, "card5"); //mostra card cadastrar produto superior
                cardInferior.show(painel_principal_inferior, "card5"); //mostra card cadastrar produto inferior
                //menu_combo_box_produtos.setSelectedIndex(0);
                menu_combo_box_funcionarios.setSelectedIndex(0);//redefine o combobox para funcionario
                break;
                
            case "Produtos":
                //nenhuma acao
                break;
        }
        
    }//GEN-LAST:event_menu_combo_box_produtosActionPerformed

    private void botao_cadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cadastrarMouseEntered
        botao_cadastrar.setForeground(new Color(251,245,238));
        botao_cadastrar.setBackground(new Color(63,143,66));
        botao_cadastrar.setBorder(null);
    }//GEN-LAST:event_botao_cadastrarMouseEntered

    private void botao_cadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cadastrarMouseExited
        botao_cadastrar.setForeground(new Color(91,48,22));
        botao_cadastrar.setBackground(new Color(251,245,238));
        botao_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 48, 22), 1, true));
    }//GEN-LAST:event_botao_cadastrarMouseExited

    private void botao_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrarActionPerformed
        try {   
            // recebendo e validando dados da interface gr�fica.
            String nomeProduto = "";
            String descricaoProduto = "";
            int quantidadeProduto = 0;
            float precoProduto = 0;
            LocalDate dataCadastro;
            String categoriaProduto = "";
            String editoraProduto = "";
            String autorProduto = "";
            int anoLancamento = 0;
     
            if (this.campoTitulo.getText().length() < 2) {
                throw new Mensagens("Titulo deve conter ao menos 2 caracteres!");
            } else {
                nomeProduto = this.campoTitulo.getText();
            }
            
            if (this.campoDescricao.getText().length() < 2) {
                throw new Mensagens("Descrição deve conter ao menos 2 caracteres!");
            } else {
                descricaoProduto = this.campoDescricao.getText();
            }
            
            if (this.campoQuantidade.getText().length() <= 0) {
                throw new Mensagens("Tem que informar no Minimo 1 Unidade de Quantidade!");
            } else {
                quantidadeProduto = Integer.parseInt(this.campoQuantidade.getText());
            }
            
            if (this.campoPreco.getText().length() <= 0) {
                throw new Mensagens("Tem que informar um Preço maior que R$0,00!");
            } else {
                precoProduto = Float.parseFloat(this.campoPreco.getText());
            }
            
            if (this.campoDataCadastro.getText().length() <= 0) {
            throw new Mensagens("Tem que informar a data!");
        } else {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                dataCadastro = LocalDate.parse(this.campoDataCadastro.getText(), formatter);
            } catch (DateTimeParseException e) {
                throw new Mensagens("Formato de data inválido!");
            }
        }
            
            if (this.campoGenero.getSelectedItem().equals("Selecione")){
                throw new Mensagens("Deve selecionar uma categoria!");
            }else {
                categoriaProduto = (String) this.campoGenero.getSelectedItem();
            }
            
            if (this.campoEditora.getText().length() < 2) {
                throw new Mensagens("Editora deve conter ao menos 2 caracteres!");
            } else {
                editoraProduto = this.campoEditora.getText();
            }
            
            if (this.campoAutor.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres!");
            } else {
                autorProduto = this.campoAutor.getText();
            }
            
            if (this.campoAnoPublicacao.getText().length() < 2) {
                throw new Mensagens("O ano tem que ser maior que tres numeros!");
            } else {
                anoLancamento = Integer.parseInt(this.campoAnoPublicacao.getText());
            }   
            
            // envia os dados para o Controlador cadastrar
            if (this.objproduto.InsertProdutoBD(nomeProduto, descricaoProduto, quantidadeProduto, precoProduto, dataCadastro, categoriaProduto, editoraProduto, autorProduto, anoLancamento)) {
                JOptionPane.showMessageDialog(rootPane, "Produto Cadastrado com Sucesso!");

                // limpa campos da interface
                this.campoTitulo.setText("");
                this.campoDescricao.setText("");
                this.campoQuantidade.setText("");
                this.campoPreco.setText("");
                this.campoDataCadastro.setText("");
                this.campoGenero.setSelectedItem("Selecione");
                this.campoEditora.setText("");
                this.campoAutor.setText("");
                this.campoAnoPublicacao.setText("");

            }

            System.out.println(this.objproduto.getMinhaLista().toString());
            
        }catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        } catch (SQLException ex) {
            Logger.getLogger(Inshelf4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_cadastrarActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Inshelf4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inshelf4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inshelf4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inshelf4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Inshelf4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cadastrar;
    private javax.swing.JTextField campoAnoPublicacao;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoDataCadastro;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoEditora;
    private javax.swing.JComboBox<String> campoGenero;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel margin_bottom;
    private javax.swing.JPanel margin_center;
    private javax.swing.JPanel margin_left;
    private javax.swing.JPanel margin_right;
    private javax.swing.JPanel margin_top;
    private javax.swing.JComboBox<String> menu_combo_box_funcionarios;
    private javax.swing.JComboBox<String> menu_combo_box_produtos;
    private javax.swing.JLabel menu_icon_funcionarios;
    private javax.swing.JLabel menu_icon_produtos;
    private javax.swing.JLabel menu_icon_relatorios;
    private javax.swing.JLabel menu_icon_sair;
    private javax.swing.JLabel menu_icon_sobre;
    private javax.swing.JPanel menu_item_funcionarios;
    private javax.swing.JPanel menu_item_produtos;
    private javax.swing.JPanel menu_item_relatorios;
    private javax.swing.JPanel menu_item_sair;
    private javax.swing.JPanel menu_item_sobre;
    private javax.swing.JLabel menu_text_relatorios;
    private javax.swing.JLabel menu_text_sair;
    private javax.swing.JLabel menu_text_sobre;
    private javax.swing.JPanel paine_base;
    private javax.swing.JPanel painel_campos_produtos_inferior;
    private javax.swing.JPanel painel_campos_produtos_superior;
    private javax.swing.JPanel painel_principal_inferior;
    private javax.swing.JPanel painel_principal_superior;
    private View.RoundedPanel roundedPanel1;
    private View.RoundedPanel roundedPanel2;
    private View.RoundedPanel roundedPanel3;
    private View.RoundedPanel roundedPanel4;
    private View.RoundedPanel roundedPanel5;
    private View.RoundedPanel roundedPanel6;
    private View.RoundedPanel roundedPanel7;
    private View.RoundedPanel roundedPanel8;
    private View.RoundedPanel roundedPanel9;
    private javax.swing.JPanel tela_cadastro_funcionarios_inferior;
    private javax.swing.JPanel tela_cadastro_funcionarios_superior;
    private javax.swing.JPanel tela_cadastro_produtos_inferior;
    private javax.swing.JPanel tela_cadastro_produtos_superior;
    private javax.swing.JPanel tela_gerenciamento_funcionarios_inferior;
    private javax.swing.JPanel tela_gerenciamento_funcionarios_superior;
    private javax.swing.JPanel tela_gerenciamento_produtos_inferior;
    private javax.swing.JPanel tela_gerenciamento_produtos_supeior;
    private javax.swing.JPanel tela_relatorios_inferior;
    private javax.swing.JPanel tela_relatorios_superior;
    private javax.swing.JPanel tela_sobre_inferior;
    private javax.swing.JPanel tela_sobre_superior;
    // End of variables declaration//GEN-END:variables
}
