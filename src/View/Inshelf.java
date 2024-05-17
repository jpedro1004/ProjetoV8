
package View;


import java.awt.*;
import javax.swing.*;
import View.Defaults;


public class Inshelf extends javax.swing.JFrame {


    public Inshelf() {
        
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_Base = new javax.swing.JPanel();
        margin_center = new javax.swing.JPanel();
        conteudo_Principal = new javax.swing.JPanel();
        principal_margin_top = new javax.swing.JPanel();
        principal_margin_left = new javax.swing.JPanel();
        principal_centro = new javax.swing.JPanel();
        principal_top = new javax.swing.JPanel();
        principal_pagina_fundo = new javax.swing.JPanel();
        pagina_fundo_margin_left = new javax.swing.JPanel();
        principal_fundo_center = new javax.swing.JPanel();
        pagina_fundo_margin_right = new javax.swing.JPanel();
        principal_pagina_frente = new javax.swing.JPanel();
        tela_produtos1 = new javax.swing.JPanel();
        tela_produtos1_margin_top = new javax.swing.JPanel();
        tela_produtos1_margin_bottom = new javax.swing.JPanel();
        tela_produtos1_margin_right = new javax.swing.JPanel();
        tela_produtos1_margin_left = new javax.swing.JPanel();
        tela_produto1_center = new javax.swing.JPanel();
        tela_produtos1_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tela_produto1_inputs = new javax.swing.JPanel();
        produtos1_inputs_linha1 = new javax.swing.JPanel();
        painel_categoria_nome_livro = new javax.swing.JPanel();
        categoria_texto_nome_livro = new javax.swing.JLabel();
        input_nome_livro = new javax.swing.JTextField();
        produtos1_inputs_linha2 = new javax.swing.JPanel();
        painel_categoria_descricao = new javax.swing.JPanel();
        categoria_texto_descricao = new javax.swing.JLabel();
        input_descricao = new javax.swing.JTextField();
        produtos1_inputs_linha3 = new javax.swing.JPanel();
        produto1_input_quantidade = new javax.swing.JPanel();
        painel_categoria_quantidade = new javax.swing.JPanel();
        categoria_texto_quantidade = new javax.swing.JLabel();
        input_quantidade = new javax.swing.JTextField();
        produto1_input_preco = new javax.swing.JPanel();
        painel_categoria_preco = new javax.swing.JPanel();
        categoria_texto_preco = new javax.swing.JLabel();
        input_preco = new javax.swing.JTextField();
        produtos1_inputs_linha4 = new javax.swing.JPanel();
        produto1_input_data_cadastro = new javax.swing.JPanel();
        painel_categoria_data_cadastro = new javax.swing.JPanel();
        categoria_texto_data_cadastro = new javax.swing.JLabel();
        input_data_cadastro = new javax.swing.JTextField();
        produto1_input_vazio = new javax.swing.JPanel();
        principal_divisao = new javax.swing.JPanel();
        principal_bottom = new javax.swing.JPanel();
        principal_pagina_frente2 = new javax.swing.JPanel();
        tela_produtos2 = new javax.swing.JPanel();
        tela_produto2_center = new javax.swing.JPanel();
        tela_produtos2_titulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tela_produto2_inputs = new javax.swing.JPanel();
        produtos2_inputs_linha1 = new javax.swing.JPanel();
        produto2_input_categoria = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        painel_categoria_categoria = new javax.swing.JPanel();
        categoria_texto_categoria = new javax.swing.JLabel();
        produto1_input_editora = new javax.swing.JPanel();
        painel_categoria_editora = new javax.swing.JPanel();
        categoria_texto_editora = new javax.swing.JLabel();
        input_editora = new javax.swing.JTextField();
        produtos2_inputs_linha2 = new javax.swing.JPanel();
        produto1_input_autor = new javax.swing.JPanel();
        painel_categoria_autor = new javax.swing.JPanel();
        categoria_texto_autor = new javax.swing.JLabel();
        input_autor = new javax.swing.JTextField();
        produto1_input_ano_lancamento = new javax.swing.JPanel();
        painel_categoria_ano_lancamento = new javax.swing.JPanel();
        categoria_texto_ano_lancamento = new javax.swing.JLabel();
        input_ano_lancamento = new javax.swing.JTextField();
        produtos2_inputs_linha3 = new javax.swing.JPanel();
        produtos2_inputs_linha4 = new javax.swing.JPanel();
        botao_cadastrar_produto = new javax.swing.JButton();
        tela_produtos2_margin_top = new javax.swing.JPanel();
        tela_produtos2_margin_bottom = new javax.swing.JPanel();
        tela_produtos2_margin_right = new javax.swing.JPanel();
        tela_produtos2_margin_left = new javax.swing.JPanel();
        principal_pagina_fundo2 = new javax.swing.JPanel();
        pagina_fundo_margin_left1 = new javax.swing.JPanel();
        principal_fundo_center1 = new javax.swing.JPanel();
        pagina_fundo_margin_right1 = new javax.swing.JPanel();
        principal_margin_right = new javax.swing.JPanel();
        principal_margin_bottom = new javax.swing.JPanel();
        menu_Principal = new javax.swing.JPanel();
        menu_Titulo = new javax.swing.JPanel();
        center_titulo = new javax.swing.JPanel();
        texto_Titulo = new javax.swing.JLabel();
        margin_top_titulo = new javax.swing.JPanel();
        margin_right_titulo = new javax.swing.JPanel();
        menu_Itens = new javax.swing.JPanel();
        menu_relatorio_funcionarios_produtos = new javax.swing.JPanel();
        menu_relatorio = new javax.swing.JPanel();
        relatorio_margin_top = new javax.swing.JPanel();
        relatorio_margin_center = new javax.swing.JPanel();
        texto_relatorios = new javax.swing.JLabel();
        relatorios_icon = new javax.swing.JLabel();
        relatorio_margin_bottom = new javax.swing.JPanel();
        menu_funcionarios = new javax.swing.JPanel();
        funcionario_margin_top = new javax.swing.JPanel();
        funcionario_margin_center = new javax.swing.JPanel();
        texto_funcionarios = new javax.swing.JLabel();
        funcionarios_icon = new javax.swing.JLabel();
        funcionario_margin_bottom = new javax.swing.JPanel();
        menu_produtos = new javax.swing.JPanel();
        produtos_margin_top = new javax.swing.JPanel();
        produtos_margin_center = new javax.swing.JPanel();
        texto_produtos = new javax.swing.JLabel();
        produtos_icon = new javax.swing.JLabel();
        produtos_margin_bottom = new javax.swing.JPanel();
        menu_empty = new javax.swing.JPanel();
        menu_sair_sobre = new javax.swing.JPanel();
        menu_sair = new javax.swing.JPanel();
        sair_margin_top = new javax.swing.JPanel();
        sair_margin_center = new javax.swing.JPanel();
        texto_sair = new javax.swing.JLabel();
        sair_icon = new javax.swing.JLabel();
        sair_margin_bottom = new javax.swing.JPanel();
        menu_sobre = new javax.swing.JPanel();
        sobre_margin_top = new javax.swing.JPanel();
        sobre_margin_center = new javax.swing.JPanel();
        texto_sobre = new javax.swing.JLabel();
        sobre_icon = new javax.swing.JLabel();
        sobre_margin_bottom = new javax.swing.JPanel();
        javax.swing.JPanel margin_left = new javax.swing.JPanel();
        margin_right = new javax.swing.JPanel();
        margin_top = new javax.swing.JPanel();
        margin_bottom = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INSHELF");
        setBackground(new java.awt.Color(251, 245, 238));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        setSize(new java.awt.Dimension(1240, 740));

        painel_Base.setBackground(new java.awt.Color(251, 245, 238));
        painel_Base.setMinimumSize(new java.awt.Dimension(1920, 1080));
        painel_Base.setLayout(new java.awt.BorderLayout());

        margin_center.setBackground(new java.awt.Color(255, 0, 255));
        margin_center.setLayout(new java.awt.BorderLayout());

        conteudo_Principal.setBackground(new java.awt.Color(91, 48, 22));
        conteudo_Principal.setPreferredSize(new java.awt.Dimension(1580, 1040));
        conteudo_Principal.setLayout(new java.awt.BorderLayout());

        principal_margin_top.setBackground(new java.awt.Color(91, 48, 22));
        principal_margin_top.setPreferredSize(new java.awt.Dimension(1580, 20));

        javax.swing.GroupLayout principal_margin_topLayout = new javax.swing.GroupLayout(principal_margin_top);
        principal_margin_top.setLayout(principal_margin_topLayout);
        principal_margin_topLayout.setHorizontalGroup(
            principal_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1580, Short.MAX_VALUE)
        );
        principal_margin_topLayout.setVerticalGroup(
            principal_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        conteudo_Principal.add(principal_margin_top, java.awt.BorderLayout.NORTH);

        principal_margin_left.setBackground(new java.awt.Color(91, 48, 22));
        principal_margin_left.setPreferredSize(new java.awt.Dimension(20, 1000));

        javax.swing.GroupLayout principal_margin_leftLayout = new javax.swing.GroupLayout(principal_margin_left);
        principal_margin_left.setLayout(principal_margin_leftLayout);
        principal_margin_leftLayout.setHorizontalGroup(
            principal_margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        principal_margin_leftLayout.setVerticalGroup(
            principal_margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );

        conteudo_Principal.add(principal_margin_left, java.awt.BorderLayout.WEST);

        principal_centro.setBackground(new java.awt.Color(91, 48, 22));
        principal_centro.setLayout(new java.awt.BorderLayout());

        principal_top.setBackground(new java.awt.Color(91, 48, 22));
        principal_top.setPreferredSize(new java.awt.Dimension(1540, 490));
        principal_top.setLayout(new java.awt.BorderLayout());

        principal_pagina_fundo.setBackground(new java.awt.Color(91, 48, 22));
        principal_pagina_fundo.setPreferredSize(new java.awt.Dimension(1540, 10));
        principal_pagina_fundo.setLayout(new java.awt.BorderLayout());

        pagina_fundo_margin_left.setBackground(new java.awt.Color(91, 48, 22));
        pagina_fundo_margin_left.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout pagina_fundo_margin_leftLayout = new javax.swing.GroupLayout(pagina_fundo_margin_left);
        pagina_fundo_margin_left.setLayout(pagina_fundo_margin_leftLayout);
        pagina_fundo_margin_leftLayout.setHorizontalGroup(
            pagina_fundo_margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pagina_fundo_margin_leftLayout.setVerticalGroup(
            pagina_fundo_margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        principal_pagina_fundo.add(pagina_fundo_margin_left, java.awt.BorderLayout.WEST);

        principal_fundo_center.setBackground(new java.awt.Color(187, 187, 187));
        principal_fundo_center.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout principal_fundo_centerLayout = new javax.swing.GroupLayout(principal_fundo_center);
        principal_fundo_center.setLayout(principal_fundo_centerLayout);
        principal_fundo_centerLayout.setHorizontalGroup(
            principal_fundo_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        principal_fundo_centerLayout.setVerticalGroup(
            principal_fundo_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        principal_pagina_fundo.add(principal_fundo_center, java.awt.BorderLayout.CENTER);

        pagina_fundo_margin_right.setBackground(new java.awt.Color(91, 48, 22));
        pagina_fundo_margin_right.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout pagina_fundo_margin_rightLayout = new javax.swing.GroupLayout(pagina_fundo_margin_right);
        pagina_fundo_margin_right.setLayout(pagina_fundo_margin_rightLayout);
        pagina_fundo_margin_rightLayout.setHorizontalGroup(
            pagina_fundo_margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pagina_fundo_margin_rightLayout.setVerticalGroup(
            pagina_fundo_margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        principal_pagina_fundo.add(pagina_fundo_margin_right, java.awt.BorderLayout.EAST);

        principal_top.add(principal_pagina_fundo, java.awt.BorderLayout.NORTH);

        principal_pagina_frente.setBackground(new java.awt.Color(251, 245, 238));
        principal_pagina_frente.setPreferredSize(new java.awt.Dimension(1540, 480));
        principal_pagina_frente.setLayout(new java.awt.CardLayout());

        tela_produtos1.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos1.setLayout(new java.awt.BorderLayout());

        tela_produtos1_margin_top.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos1_margin_top.setPreferredSize(new java.awt.Dimension(1540, 20));

        javax.swing.GroupLayout tela_produtos1_margin_topLayout = new javax.swing.GroupLayout(tela_produtos1_margin_top);
        tela_produtos1_margin_top.setLayout(tela_produtos1_margin_topLayout);
        tela_produtos1_margin_topLayout.setHorizontalGroup(
            tela_produtos1_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        tela_produtos1_margin_topLayout.setVerticalGroup(
            tela_produtos1_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        tela_produtos1.add(tela_produtos1_margin_top, java.awt.BorderLayout.NORTH);

        tela_produtos1_margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos1_margin_bottom.setPreferredSize(new java.awt.Dimension(1540, 20));

        javax.swing.GroupLayout tela_produtos1_margin_bottomLayout = new javax.swing.GroupLayout(tela_produtos1_margin_bottom);
        tela_produtos1_margin_bottom.setLayout(tela_produtos1_margin_bottomLayout);
        tela_produtos1_margin_bottomLayout.setHorizontalGroup(
            tela_produtos1_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        tela_produtos1_margin_bottomLayout.setVerticalGroup(
            tela_produtos1_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        tela_produtos1.add(tela_produtos1_margin_bottom, java.awt.BorderLayout.SOUTH);

        tela_produtos1_margin_right.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos1_margin_right.setPreferredSize(new java.awt.Dimension(40, 440));

        javax.swing.GroupLayout tela_produtos1_margin_rightLayout = new javax.swing.GroupLayout(tela_produtos1_margin_right);
        tela_produtos1_margin_right.setLayout(tela_produtos1_margin_rightLayout);
        tela_produtos1_margin_rightLayout.setHorizontalGroup(
            tela_produtos1_margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        tela_produtos1_margin_rightLayout.setVerticalGroup(
            tela_produtos1_margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        tela_produtos1.add(tela_produtos1_margin_right, java.awt.BorderLayout.EAST);

        tela_produtos1_margin_left.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos1_margin_left.setPreferredSize(new java.awt.Dimension(40, 280));

        javax.swing.GroupLayout tela_produtos1_margin_leftLayout = new javax.swing.GroupLayout(tela_produtos1_margin_left);
        tela_produtos1_margin_left.setLayout(tela_produtos1_margin_leftLayout);
        tela_produtos1_margin_leftLayout.setHorizontalGroup(
            tela_produtos1_margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        tela_produtos1_margin_leftLayout.setVerticalGroup(
            tela_produtos1_margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        tela_produtos1.add(tela_produtos1_margin_left, java.awt.BorderLayout.WEST);

        tela_produto1_center.setBackground(new java.awt.Color(251, 245, 238));
        tela_produto1_center.setLayout(new java.awt.BorderLayout());

        tela_produtos1_titulo.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos1_titulo.setPreferredSize(new java.awt.Dimension(1460, 50));

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(91, 48, 22));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastramento de produto");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tela_produtos1_tituloLayout = new javax.swing.GroupLayout(tela_produtos1_titulo);
        tela_produtos1_titulo.setLayout(tela_produtos1_tituloLayout);
        tela_produtos1_tituloLayout.setHorizontalGroup(
            tela_produtos1_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1460, Short.MAX_VALUE)
        );
        tela_produtos1_tituloLayout.setVerticalGroup(
            tela_produtos1_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tela_produto1_center.add(tela_produtos1_titulo, java.awt.BorderLayout.NORTH);

        tela_produto1_inputs.setBackground(new java.awt.Color(251, 245, 238));
        tela_produto1_inputs.setPreferredSize(new java.awt.Dimension(1460, 390));
        tela_produto1_inputs.setLayout(new java.awt.GridLayout(4, 1, 0, 20));

        produtos1_inputs_linha1.setBackground(new java.awt.Color(251, 245, 238));
        produtos1_inputs_linha1.setPreferredSize(new java.awt.Dimension(300, 390));
        produtos1_inputs_linha1.setLayout(new java.awt.BorderLayout());

        painel_categoria_nome_livro.setBackground(new java.awt.Color(91, 48, 22));
        painel_categoria_nome_livro.setPreferredSize(new java.awt.Dimension(300, 80));

        categoria_texto_nome_livro.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_nome_livro.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_nome_livro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_nome_livro.setText("Nome do livro");
        categoria_texto_nome_livro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_nome_livroLayout = new javax.swing.GroupLayout(painel_categoria_nome_livro);
        painel_categoria_nome_livro.setLayout(painel_categoria_nome_livroLayout);
        painel_categoria_nome_livroLayout.setHorizontalGroup(
            painel_categoria_nome_livroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_nome_livro, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_nome_livroLayout.setVerticalGroup(
            painel_categoria_nome_livroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_nome_livro, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        produtos1_inputs_linha1.add(painel_categoria_nome_livro, java.awt.BorderLayout.WEST);

        input_nome_livro.setBackground(new java.awt.Color(225, 195, 145));
        input_nome_livro.setForeground(new java.awt.Color(91, 48, 22));
        input_nome_livro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_nome_livro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        input_nome_livro.setPreferredSize(new java.awt.Dimension(1150, 22));
        input_nome_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nome_livroActionPerformed(evt);
            }
        });
        produtos1_inputs_linha1.add(input_nome_livro, java.awt.BorderLayout.EAST);

        tela_produto1_inputs.add(produtos1_inputs_linha1);

        produtos1_inputs_linha2.setBackground(new java.awt.Color(251, 245, 238));
        produtos1_inputs_linha2.setPreferredSize(new java.awt.Dimension(1160, 390));
        produtos1_inputs_linha2.setLayout(new java.awt.BorderLayout());

        painel_categoria_descricao.setBackground(new java.awt.Color(91, 48, 22));
        painel_categoria_descricao.setPreferredSize(new java.awt.Dimension(300, 80));

        categoria_texto_descricao.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_descricao.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_descricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_descricao.setText("Descrição");
        categoria_texto_descricao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_descricaoLayout = new javax.swing.GroupLayout(painel_categoria_descricao);
        painel_categoria_descricao.setLayout(painel_categoria_descricaoLayout);
        painel_categoria_descricaoLayout.setHorizontalGroup(
            painel_categoria_descricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_descricaoLayout.setVerticalGroup(
            painel_categoria_descricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        produtos1_inputs_linha2.add(painel_categoria_descricao, java.awt.BorderLayout.WEST);

        input_descricao.setBackground(new java.awt.Color(225, 195, 145));
        input_descricao.setForeground(new java.awt.Color(91, 48, 22));
        input_descricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_descricao.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        input_descricao.setPreferredSize(new java.awt.Dimension(1150, 22));
        produtos1_inputs_linha2.add(input_descricao, java.awt.BorderLayout.EAST);

        tela_produto1_inputs.add(produtos1_inputs_linha2);

        produtos1_inputs_linha3.setBackground(new java.awt.Color(251, 245, 238));
        produtos1_inputs_linha3.setLayout(new java.awt.BorderLayout());

        produto1_input_quantidade.setBackground(new java.awt.Color(251, 245, 238));
        produto1_input_quantidade.setPreferredSize(new java.awt.Dimension(725, 0));
        produto1_input_quantidade.setLayout(new java.awt.BorderLayout());

        painel_categoria_quantidade.setBackground(new java.awt.Color(91, 48, 22));
        painel_categoria_quantidade.setPreferredSize(new java.awt.Dimension(300, 82));

        categoria_texto_quantidade.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_quantidade.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_quantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_quantidade.setText("Quantidade (unid.)");
        categoria_texto_quantidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_quantidadeLayout = new javax.swing.GroupLayout(painel_categoria_quantidade);
        painel_categoria_quantidade.setLayout(painel_categoria_quantidadeLayout);
        painel_categoria_quantidadeLayout.setHorizontalGroup(
            painel_categoria_quantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_quantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_quantidadeLayout.setVerticalGroup(
            painel_categoria_quantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_quantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        produto1_input_quantidade.add(painel_categoria_quantidade, java.awt.BorderLayout.WEST);

        input_quantidade.setBackground(new java.awt.Color(225, 195, 145));
        input_quantidade.setForeground(new java.awt.Color(91, 48, 22));
        input_quantidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_quantidade.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        input_quantidade.setPreferredSize(new java.awt.Dimension(415, 22));
        produto1_input_quantidade.add(input_quantidade, java.awt.BorderLayout.EAST);

        produtos1_inputs_linha3.add(produto1_input_quantidade, java.awt.BorderLayout.WEST);

        produto1_input_preco.setBackground(new java.awt.Color(251, 245, 238));
        produto1_input_preco.setPreferredSize(new java.awt.Dimension(725, 82));
        produto1_input_preco.setLayout(new java.awt.BorderLayout());

        painel_categoria_preco.setBackground(new java.awt.Color(91, 48, 22));
        painel_categoria_preco.setPreferredSize(new java.awt.Dimension(300, 82));

        categoria_texto_preco.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_preco.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_preco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_preco.setText("Preço (R$)");
        categoria_texto_preco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_precoLayout = new javax.swing.GroupLayout(painel_categoria_preco);
        painel_categoria_preco.setLayout(painel_categoria_precoLayout);
        painel_categoria_precoLayout.setHorizontalGroup(
            painel_categoria_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_preco, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_precoLayout.setVerticalGroup(
            painel_categoria_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_preco, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        produto1_input_preco.add(painel_categoria_preco, java.awt.BorderLayout.WEST);

        input_preco.setBackground(new java.awt.Color(225, 195, 145));
        input_preco.setForeground(new java.awt.Color(91, 48, 22));
        input_preco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_preco.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        input_preco.setPreferredSize(new java.awt.Dimension(415, 22));
        produto1_input_preco.add(input_preco, java.awt.BorderLayout.EAST);

        produtos1_inputs_linha3.add(produto1_input_preco, java.awt.BorderLayout.EAST);

        tela_produto1_inputs.add(produtos1_inputs_linha3);

        produtos1_inputs_linha4.setBackground(new java.awt.Color(251, 245, 238));
        produtos1_inputs_linha4.setLayout(new java.awt.BorderLayout());

        produto1_input_data_cadastro.setBackground(new java.awt.Color(251, 245, 238));
        produto1_input_data_cadastro.setPreferredSize(new java.awt.Dimension(725, 0));

        painel_categoria_data_cadastro.setBackground(new java.awt.Color(91, 48, 22));
        painel_categoria_data_cadastro.setPreferredSize(new java.awt.Dimension(300, 82));

        categoria_texto_data_cadastro.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_data_cadastro.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_data_cadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_data_cadastro.setText("Data de cadastro");
        categoria_texto_data_cadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_data_cadastroLayout = new javax.swing.GroupLayout(painel_categoria_data_cadastro);
        painel_categoria_data_cadastro.setLayout(painel_categoria_data_cadastroLayout);
        painel_categoria_data_cadastroLayout.setHorizontalGroup(
            painel_categoria_data_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_data_cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_data_cadastroLayout.setVerticalGroup(
            painel_categoria_data_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_data_cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        input_data_cadastro.setBackground(new java.awt.Color(225, 195, 145));
        input_data_cadastro.setForeground(new java.awt.Color(91, 48, 22));
        input_data_cadastro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_data_cadastro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        input_data_cadastro.setPreferredSize(new java.awt.Dimension(415, 22));
        input_data_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_data_cadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout produto1_input_data_cadastroLayout = new javax.swing.GroupLayout(produto1_input_data_cadastro);
        produto1_input_data_cadastro.setLayout(produto1_input_data_cadastroLayout);
        produto1_input_data_cadastroLayout.setHorizontalGroup(
            produto1_input_data_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
            .addGroup(produto1_input_data_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(produto1_input_data_cadastroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(painel_categoria_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(input_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        produto1_input_data_cadastroLayout.setVerticalGroup(
            produto1_input_data_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(produto1_input_data_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(produto1_input_data_cadastroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(produto1_input_data_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(painel_categoria_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        produtos1_inputs_linha4.add(produto1_input_data_cadastro, java.awt.BorderLayout.WEST);

        produto1_input_vazio.setBackground(new java.awt.Color(251, 245, 238));
        produto1_input_vazio.setPreferredSize(new java.awt.Dimension(725, 82));

        javax.swing.GroupLayout produto1_input_vazioLayout = new javax.swing.GroupLayout(produto1_input_vazio);
        produto1_input_vazio.setLayout(produto1_input_vazioLayout);
        produto1_input_vazioLayout.setHorizontalGroup(
            produto1_input_vazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        produto1_input_vazioLayout.setVerticalGroup(
            produto1_input_vazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        produtos1_inputs_linha4.add(produto1_input_vazio, java.awt.BorderLayout.EAST);

        tela_produto1_inputs.add(produtos1_inputs_linha4);

        tela_produto1_center.add(tela_produto1_inputs, java.awt.BorderLayout.SOUTH);

        tela_produtos1.add(tela_produto1_center, java.awt.BorderLayout.CENTER);

        principal_pagina_frente.add(tela_produtos1, "card2");

        principal_top.add(principal_pagina_frente, java.awt.BorderLayout.SOUTH);

        principal_centro.add(principal_top, java.awt.BorderLayout.NORTH);

        principal_divisao.setBackground(new java.awt.Color(91, 48, 22));

        javax.swing.GroupLayout principal_divisaoLayout = new javax.swing.GroupLayout(principal_divisao);
        principal_divisao.setLayout(principal_divisaoLayout);
        principal_divisaoLayout.setHorizontalGroup(
            principal_divisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        principal_divisaoLayout.setVerticalGroup(
            principal_divisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        principal_centro.add(principal_divisao, java.awt.BorderLayout.CENTER);

        principal_bottom.setBackground(new java.awt.Color(91, 48, 22));
        principal_bottom.setPreferredSize(new java.awt.Dimension(1540, 490));
        principal_bottom.setLayout(new java.awt.BorderLayout());

        principal_pagina_frente2.setBackground(new java.awt.Color(251, 245, 238));
        principal_pagina_frente2.setPreferredSize(new java.awt.Dimension(1540, 480));
        principal_pagina_frente2.setLayout(new java.awt.CardLayout());

        tela_produtos2.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos2.setLayout(new java.awt.BorderLayout());

        tela_produto2_center.setBackground(new java.awt.Color(251, 245, 238));
        tela_produto2_center.setLayout(new java.awt.BorderLayout());

        tela_produtos2_titulo.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos2_titulo.setPreferredSize(new java.awt.Dimension(1460, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 48, 22));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastramento de produtos avançado");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tela_produtos2_tituloLayout = new javax.swing.GroupLayout(tela_produtos2_titulo);
        tela_produtos2_titulo.setLayout(tela_produtos2_tituloLayout);
        tela_produtos2_tituloLayout.setHorizontalGroup(
            tela_produtos2_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1460, Short.MAX_VALUE)
        );
        tela_produtos2_tituloLayout.setVerticalGroup(
            tela_produtos2_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tela_produto2_center.add(tela_produtos2_titulo, java.awt.BorderLayout.NORTH);

        tela_produto2_inputs.setBackground(new java.awt.Color(251, 245, 238));
        tela_produto2_inputs.setPreferredSize(new java.awt.Dimension(1460, 390));
        tela_produto2_inputs.setLayout(new java.awt.GridLayout(4, 1, 0, 20));

        produtos2_inputs_linha1.setBackground(new java.awt.Color(251, 245, 238));
        produtos2_inputs_linha1.setLayout(new java.awt.BorderLayout());

        produto2_input_categoria.setBackground(new java.awt.Color(251, 245, 238));
        produto2_input_categoria.setPreferredSize(new java.awt.Dimension(725, 0));
        produto2_input_categoria.setLayout(new java.awt.BorderLayout());

        jComboBox1.setBackground(new java.awt.Color(225, 195, 145));
        jComboBox1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(91, 48, 22));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ficção Literária", "Romance", "Mistério e Suspense", "Ficção Científica e Fantasia", "Autoajuda e Desenvolvimento Pessoal", "História e Biografia", "Política e Atualidades", "Religião e Espiritualidade", "Infantil e Juvenil" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(415, 22));
        produto2_input_categoria.add(jComboBox1, java.awt.BorderLayout.EAST);

        painel_categoria_categoria.setBackground(new java.awt.Color(91, 48, 22));

        categoria_texto_categoria.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_categoria.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_categoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_categoria.setText("Categoria");
        categoria_texto_categoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_categoriaLayout = new javax.swing.GroupLayout(painel_categoria_categoria);
        painel_categoria_categoria.setLayout(painel_categoria_categoriaLayout);
        painel_categoria_categoriaLayout.setHorizontalGroup(
            painel_categoria_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_categoriaLayout.setVerticalGroup(
            painel_categoria_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        produto2_input_categoria.add(painel_categoria_categoria, java.awt.BorderLayout.WEST);

        produtos2_inputs_linha1.add(produto2_input_categoria, java.awt.BorderLayout.WEST);

        produto1_input_editora.setBackground(new java.awt.Color(251, 245, 238));
        produto1_input_editora.setPreferredSize(new java.awt.Dimension(725, 82));
        produto1_input_editora.setLayout(new java.awt.BorderLayout());

        painel_categoria_editora.setBackground(new java.awt.Color(91, 48, 22));
        painel_categoria_editora.setPreferredSize(new java.awt.Dimension(300, 82));

        categoria_texto_editora.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_editora.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_editora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_editora.setText("Editora");
        categoria_texto_editora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_editoraLayout = new javax.swing.GroupLayout(painel_categoria_editora);
        painel_categoria_editora.setLayout(painel_categoria_editoraLayout);
        painel_categoria_editoraLayout.setHorizontalGroup(
            painel_categoria_editoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_editora, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_editoraLayout.setVerticalGroup(
            painel_categoria_editoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_editora, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        produto1_input_editora.add(painel_categoria_editora, java.awt.BorderLayout.WEST);

        input_editora.setBackground(new java.awt.Color(225, 195, 145));
        input_editora.setForeground(new java.awt.Color(91, 48, 22));
        input_editora.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_editora.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        input_editora.setPreferredSize(new java.awt.Dimension(415, 22));
        produto1_input_editora.add(input_editora, java.awt.BorderLayout.EAST);

        produtos2_inputs_linha1.add(produto1_input_editora, java.awt.BorderLayout.EAST);

        tela_produto2_inputs.add(produtos2_inputs_linha1);

        produtos2_inputs_linha2.setBackground(new java.awt.Color(251, 245, 238));
        produtos2_inputs_linha2.setLayout(new java.awt.BorderLayout());

        produto1_input_autor.setBackground(new java.awt.Color(251, 245, 238));
        produto1_input_autor.setPreferredSize(new java.awt.Dimension(725, 0));
        produto1_input_autor.setLayout(new java.awt.BorderLayout());

        painel_categoria_autor.setBackground(new java.awt.Color(91, 48, 22));
        painel_categoria_autor.setPreferredSize(new java.awt.Dimension(300, 82));

        categoria_texto_autor.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_autor.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_autor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_autor.setText("Autor");
        categoria_texto_autor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_autorLayout = new javax.swing.GroupLayout(painel_categoria_autor);
        painel_categoria_autor.setLayout(painel_categoria_autorLayout);
        painel_categoria_autorLayout.setHorizontalGroup(
            painel_categoria_autorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_autor, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_autorLayout.setVerticalGroup(
            painel_categoria_autorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_autor, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        produto1_input_autor.add(painel_categoria_autor, java.awt.BorderLayout.WEST);

        input_autor.setBackground(new java.awt.Color(225, 195, 145));
        input_autor.setForeground(new java.awt.Color(91, 48, 22));
        input_autor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_autor.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        input_autor.setPreferredSize(new java.awt.Dimension(415, 22));
        produto1_input_autor.add(input_autor, java.awt.BorderLayout.EAST);

        produtos2_inputs_linha2.add(produto1_input_autor, java.awt.BorderLayout.WEST);

        produto1_input_ano_lancamento.setBackground(new java.awt.Color(251, 245, 238));
        produto1_input_ano_lancamento.setPreferredSize(new java.awt.Dimension(725, 82));
        produto1_input_ano_lancamento.setLayout(new java.awt.BorderLayout());

        painel_categoria_ano_lancamento.setBackground(new java.awt.Color(91, 48, 22));
        painel_categoria_ano_lancamento.setPreferredSize(new java.awt.Dimension(300, 82));

        categoria_texto_ano_lancamento.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        categoria_texto_ano_lancamento.setForeground(new java.awt.Color(251, 245, 238));
        categoria_texto_ano_lancamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria_texto_ano_lancamento.setText("Ano de lançamento");
        categoria_texto_ano_lancamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painel_categoria_ano_lancamentoLayout = new javax.swing.GroupLayout(painel_categoria_ano_lancamento);
        painel_categoria_ano_lancamento.setLayout(painel_categoria_ano_lancamentoLayout);
        painel_categoria_ano_lancamentoLayout.setHorizontalGroup(
            painel_categoria_ano_lancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_ano_lancamento, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        painel_categoria_ano_lancamentoLayout.setVerticalGroup(
            painel_categoria_ano_lancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoria_texto_ano_lancamento, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        produto1_input_ano_lancamento.add(painel_categoria_ano_lancamento, java.awt.BorderLayout.WEST);

        input_ano_lancamento.setBackground(new java.awt.Color(225, 195, 145));
        input_ano_lancamento.setForeground(new java.awt.Color(91, 48, 22));
        input_ano_lancamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_ano_lancamento.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        input_ano_lancamento.setPreferredSize(new java.awt.Dimension(415, 22));
        produto1_input_ano_lancamento.add(input_ano_lancamento, java.awt.BorderLayout.EAST);

        produtos2_inputs_linha2.add(produto1_input_ano_lancamento, java.awt.BorderLayout.EAST);

        tela_produto2_inputs.add(produtos2_inputs_linha2);

        produtos2_inputs_linha3.setBackground(new java.awt.Color(251, 245, 238));

        javax.swing.GroupLayout produtos2_inputs_linha3Layout = new javax.swing.GroupLayout(produtos2_inputs_linha3);
        produtos2_inputs_linha3.setLayout(produtos2_inputs_linha3Layout);
        produtos2_inputs_linha3Layout.setHorizontalGroup(
            produtos2_inputs_linha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1460, Short.MAX_VALUE)
        );
        produtos2_inputs_linha3Layout.setVerticalGroup(
            produtos2_inputs_linha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        tela_produto2_inputs.add(produtos2_inputs_linha3);

        produtos2_inputs_linha4.setBackground(new java.awt.Color(251, 245, 238));

        botao_cadastrar_produto.setBackground(new java.awt.Color(251, 245, 238));
        botao_cadastrar_produto.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        botao_cadastrar_produto.setForeground(new java.awt.Color(91, 48, 22));
        botao_cadastrar_produto.setText("Cadastrar");
        botao_cadastrar_produto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 48, 22), 1, true));
        botao_cadastrar_produto.setPreferredSize(new java.awt.Dimension(200, 60));
        botao_cadastrar_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_cadastrar_produtoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_cadastrar_produtoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout produtos2_inputs_linha4Layout = new javax.swing.GroupLayout(produtos2_inputs_linha4);
        produtos2_inputs_linha4.setLayout(produtos2_inputs_linha4Layout);
        produtos2_inputs_linha4Layout.setHorizontalGroup(
            produtos2_inputs_linha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtos2_inputs_linha4Layout.createSequentialGroup()
                .addGap(0, 1260, Short.MAX_VALUE)
                .addComponent(botao_cadastrar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        produtos2_inputs_linha4Layout.setVerticalGroup(
            produtos2_inputs_linha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtos2_inputs_linha4Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(botao_cadastrar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tela_produto2_inputs.add(produtos2_inputs_linha4);

        tela_produto2_center.add(tela_produto2_inputs, java.awt.BorderLayout.SOUTH);

        tela_produtos2.add(tela_produto2_center, java.awt.BorderLayout.CENTER);

        tela_produtos2_margin_top.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos2_margin_top.setPreferredSize(new java.awt.Dimension(1540, 20));

        javax.swing.GroupLayout tela_produtos2_margin_topLayout = new javax.swing.GroupLayout(tela_produtos2_margin_top);
        tela_produtos2_margin_top.setLayout(tela_produtos2_margin_topLayout);
        tela_produtos2_margin_topLayout.setHorizontalGroup(
            tela_produtos2_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        tela_produtos2_margin_topLayout.setVerticalGroup(
            tela_produtos2_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        tela_produtos2.add(tela_produtos2_margin_top, java.awt.BorderLayout.NORTH);

        tela_produtos2_margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos2_margin_bottom.setPreferredSize(new java.awt.Dimension(1540, 20));

        javax.swing.GroupLayout tela_produtos2_margin_bottomLayout = new javax.swing.GroupLayout(tela_produtos2_margin_bottom);
        tela_produtos2_margin_bottom.setLayout(tela_produtos2_margin_bottomLayout);
        tela_produtos2_margin_bottomLayout.setHorizontalGroup(
            tela_produtos2_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        tela_produtos2_margin_bottomLayout.setVerticalGroup(
            tela_produtos2_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        tela_produtos2.add(tela_produtos2_margin_bottom, java.awt.BorderLayout.SOUTH);

        tela_produtos2_margin_right.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos2_margin_right.setPreferredSize(new java.awt.Dimension(40, 440));

        javax.swing.GroupLayout tela_produtos2_margin_rightLayout = new javax.swing.GroupLayout(tela_produtos2_margin_right);
        tela_produtos2_margin_right.setLayout(tela_produtos2_margin_rightLayout);
        tela_produtos2_margin_rightLayout.setHorizontalGroup(
            tela_produtos2_margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        tela_produtos2_margin_rightLayout.setVerticalGroup(
            tela_produtos2_margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        tela_produtos2.add(tela_produtos2_margin_right, java.awt.BorderLayout.EAST);

        tela_produtos2_margin_left.setBackground(new java.awt.Color(251, 245, 238));
        tela_produtos2_margin_left.setPreferredSize(new java.awt.Dimension(40, 440));

        javax.swing.GroupLayout tela_produtos2_margin_leftLayout = new javax.swing.GroupLayout(tela_produtos2_margin_left);
        tela_produtos2_margin_left.setLayout(tela_produtos2_margin_leftLayout);
        tela_produtos2_margin_leftLayout.setHorizontalGroup(
            tela_produtos2_margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        tela_produtos2_margin_leftLayout.setVerticalGroup(
            tela_produtos2_margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        tela_produtos2.add(tela_produtos2_margin_left, java.awt.BorderLayout.WEST);

        principal_pagina_frente2.add(tela_produtos2, "card2");

        principal_bottom.add(principal_pagina_frente2, java.awt.BorderLayout.NORTH);

        principal_pagina_fundo2.setBackground(new java.awt.Color(91, 48, 22));
        principal_pagina_fundo2.setPreferredSize(new java.awt.Dimension(1540, 10));
        principal_pagina_fundo2.setLayout(new java.awt.BorderLayout());

        pagina_fundo_margin_left1.setBackground(new java.awt.Color(91, 48, 22));
        pagina_fundo_margin_left1.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout pagina_fundo_margin_left1Layout = new javax.swing.GroupLayout(pagina_fundo_margin_left1);
        pagina_fundo_margin_left1.setLayout(pagina_fundo_margin_left1Layout);
        pagina_fundo_margin_left1Layout.setHorizontalGroup(
            pagina_fundo_margin_left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pagina_fundo_margin_left1Layout.setVerticalGroup(
            pagina_fundo_margin_left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        principal_pagina_fundo2.add(pagina_fundo_margin_left1, java.awt.BorderLayout.WEST);

        principal_fundo_center1.setBackground(new java.awt.Color(187, 187, 187));
        principal_fundo_center1.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout principal_fundo_center1Layout = new javax.swing.GroupLayout(principal_fundo_center1);
        principal_fundo_center1.setLayout(principal_fundo_center1Layout);
        principal_fundo_center1Layout.setHorizontalGroup(
            principal_fundo_center1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        principal_fundo_center1Layout.setVerticalGroup(
            principal_fundo_center1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        principal_pagina_fundo2.add(principal_fundo_center1, java.awt.BorderLayout.CENTER);

        pagina_fundo_margin_right1.setBackground(new java.awt.Color(91, 48, 22));
        pagina_fundo_margin_right1.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout pagina_fundo_margin_right1Layout = new javax.swing.GroupLayout(pagina_fundo_margin_right1);
        pagina_fundo_margin_right1.setLayout(pagina_fundo_margin_right1Layout);
        pagina_fundo_margin_right1Layout.setHorizontalGroup(
            pagina_fundo_margin_right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pagina_fundo_margin_right1Layout.setVerticalGroup(
            pagina_fundo_margin_right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        principal_pagina_fundo2.add(pagina_fundo_margin_right1, java.awt.BorderLayout.EAST);

        principal_bottom.add(principal_pagina_fundo2, java.awt.BorderLayout.SOUTH);

        principal_centro.add(principal_bottom, java.awt.BorderLayout.SOUTH);

        conteudo_Principal.add(principal_centro, java.awt.BorderLayout.CENTER);

        principal_margin_right.setBackground(new java.awt.Color(91, 48, 22));
        principal_margin_right.setPreferredSize(new java.awt.Dimension(20, 1000));

        javax.swing.GroupLayout principal_margin_rightLayout = new javax.swing.GroupLayout(principal_margin_right);
        principal_margin_right.setLayout(principal_margin_rightLayout);
        principal_margin_rightLayout.setHorizontalGroup(
            principal_margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        principal_margin_rightLayout.setVerticalGroup(
            principal_margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );

        conteudo_Principal.add(principal_margin_right, java.awt.BorderLayout.EAST);

        principal_margin_bottom.setBackground(new java.awt.Color(91, 48, 22));
        principal_margin_bottom.setPreferredSize(new java.awt.Dimension(1580, 20));

        javax.swing.GroupLayout principal_margin_bottomLayout = new javax.swing.GroupLayout(principal_margin_bottom);
        principal_margin_bottom.setLayout(principal_margin_bottomLayout);
        principal_margin_bottomLayout.setHorizontalGroup(
            principal_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1580, Short.MAX_VALUE)
        );
        principal_margin_bottomLayout.setVerticalGroup(
            principal_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        conteudo_Principal.add(principal_margin_bottom, java.awt.BorderLayout.SOUTH);

        margin_center.add(conteudo_Principal, java.awt.BorderLayout.EAST);

        menu_Principal.setBackground(new java.awt.Color(251, 245, 238));
        menu_Principal.setPreferredSize(new java.awt.Dimension(300, 1040));
        menu_Principal.setLayout(new java.awt.BorderLayout());

        menu_Titulo.setBackground(new java.awt.Color(225, 195, 145));
        menu_Titulo.setPreferredSize(new java.awt.Dimension(300, 100));
        menu_Titulo.setLayout(new java.awt.BorderLayout());

        center_titulo.setBackground(new java.awt.Color(251, 245, 238));

        texto_Titulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 36)); // NOI18N
        texto_Titulo.setForeground(new java.awt.Color(102, 78, 58));
        texto_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/logo_40.png"))); // NOI18N
        texto_Titulo.setText("INSHELF");
        texto_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        texto_Titulo.setIconTextGap(10);
        texto_Titulo.setMaximumSize(new java.awt.Dimension(750, 650));
        texto_Titulo.setMinimumSize(new java.awt.Dimension(750, 650));
        texto_Titulo.setPreferredSize(new java.awt.Dimension(20, 32));
        texto_Titulo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout center_tituloLayout = new javax.swing.GroupLayout(center_titulo);
        center_titulo.setLayout(center_tituloLayout);
        center_tituloLayout.setHorizontalGroup(
            center_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE)
        );
        center_tituloLayout.setVerticalGroup(
            center_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(center_tituloLayout.createSequentialGroup()
                .addComponent(texto_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
                .addGap(112, 112, 112))
        );

        menu_Titulo.add(center_titulo, java.awt.BorderLayout.CENTER);

        margin_top_titulo.setBackground(new java.awt.Color(251, 245, 238));
        margin_top_titulo.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout margin_top_tituloLayout = new javax.swing.GroupLayout(margin_top_titulo);
        margin_top_titulo.setLayout(margin_top_tituloLayout);
        margin_top_tituloLayout.setHorizontalGroup(
            margin_top_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        margin_top_tituloLayout.setVerticalGroup(
            margin_top_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        menu_Titulo.add(margin_top_titulo, java.awt.BorderLayout.NORTH);

        margin_right_titulo.setBackground(new java.awt.Color(251, 245, 238));
        margin_right_titulo.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout margin_right_tituloLayout = new javax.swing.GroupLayout(margin_right_titulo);
        margin_right_titulo.setLayout(margin_right_tituloLayout);
        margin_right_tituloLayout.setHorizontalGroup(
            margin_right_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        margin_right_tituloLayout.setVerticalGroup(
            margin_right_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menu_Titulo.add(margin_right_titulo, java.awt.BorderLayout.EAST);

        menu_Principal.add(menu_Titulo, java.awt.BorderLayout.NORTH);

        menu_Itens.setBackground(new java.awt.Color(251, 245, 238));
        menu_Itens.setPreferredSize(new java.awt.Dimension(300, 940));
        menu_Itens.setLayout(new java.awt.BorderLayout());

        menu_relatorio_funcionarios_produtos.setBackground(new java.awt.Color(251, 245, 238));
        menu_relatorio_funcionarios_produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu_relatorio_funcionarios_produtos.setPreferredSize(new java.awt.Dimension(300, 300));
        menu_relatorio_funcionarios_produtos.setLayout(new java.awt.BorderLayout());

        menu_relatorio.setBackground(new java.awt.Color(251, 245, 238));
        menu_relatorio.setMinimumSize(new java.awt.Dimension(0, 0));
        menu_relatorio.setPreferredSize(new java.awt.Dimension(300, 100));
        menu_relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_relatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_relatorioMouseExited(evt);
            }
        });
        menu_relatorio.setLayout(new java.awt.BorderLayout());

        relatorio_margin_top.setBackground(new java.awt.Color(251, 245, 238));
        relatorio_margin_top.setPreferredSize(new java.awt.Dimension(0, 15));

        javax.swing.GroupLayout relatorio_margin_topLayout = new javax.swing.GroupLayout(relatorio_margin_top);
        relatorio_margin_top.setLayout(relatorio_margin_topLayout);
        relatorio_margin_topLayout.setHorizontalGroup(
            relatorio_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        relatorio_margin_topLayout.setVerticalGroup(
            relatorio_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_relatorio.add(relatorio_margin_top, java.awt.BorderLayout.NORTH);

        relatorio_margin_center.setBackground(new java.awt.Color(251, 245, 238));
        relatorio_margin_center.setPreferredSize(new java.awt.Dimension(300, 70));
        relatorio_margin_center.setLayout(new java.awt.BorderLayout());

        texto_relatorios.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        texto_relatorios.setForeground(new java.awt.Color(91, 48, 22));
        texto_relatorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texto_relatorios.setText("Relatórios");
        texto_relatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        texto_relatorios.setPreferredSize(new java.awt.Dimension(200, 20));
        relatorio_margin_center.add(texto_relatorios, java.awt.BorderLayout.EAST);

        relatorios_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        relatorios_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png"))); // NOI18N
        relatorios_icon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        relatorios_icon.setPreferredSize(new java.awt.Dimension(85, 35));
        relatorio_margin_center.add(relatorios_icon, java.awt.BorderLayout.WEST);

        menu_relatorio.add(relatorio_margin_center, java.awt.BorderLayout.CENTER);

        relatorio_margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        relatorio_margin_bottom.setPreferredSize(new java.awt.Dimension(300, 15));

        javax.swing.GroupLayout relatorio_margin_bottomLayout = new javax.swing.GroupLayout(relatorio_margin_bottom);
        relatorio_margin_bottom.setLayout(relatorio_margin_bottomLayout);
        relatorio_margin_bottomLayout.setHorizontalGroup(
            relatorio_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        relatorio_margin_bottomLayout.setVerticalGroup(
            relatorio_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_relatorio.add(relatorio_margin_bottom, java.awt.BorderLayout.SOUTH);

        menu_relatorio_funcionarios_produtos.add(menu_relatorio, java.awt.BorderLayout.PAGE_START);

        menu_funcionarios.setBackground(new java.awt.Color(251, 245, 238));
        menu_funcionarios.setPreferredSize(new java.awt.Dimension(300, 100));
        menu_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_funcionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_funcionariosMouseExited(evt);
            }
        });
        menu_funcionarios.setLayout(new java.awt.BorderLayout());

        funcionario_margin_top.setBackground(new java.awt.Color(251, 245, 238));
        funcionario_margin_top.setPreferredSize(new java.awt.Dimension(0, 15));

        javax.swing.GroupLayout funcionario_margin_topLayout = new javax.swing.GroupLayout(funcionario_margin_top);
        funcionario_margin_top.setLayout(funcionario_margin_topLayout);
        funcionario_margin_topLayout.setHorizontalGroup(
            funcionario_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        funcionario_margin_topLayout.setVerticalGroup(
            funcionario_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_funcionarios.add(funcionario_margin_top, java.awt.BorderLayout.NORTH);

        funcionario_margin_center.setBackground(new java.awt.Color(251, 245, 238));
        funcionario_margin_center.setPreferredSize(new java.awt.Dimension(300, 70));
        funcionario_margin_center.setLayout(new java.awt.BorderLayout());

        texto_funcionarios.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        texto_funcionarios.setForeground(new java.awt.Color(91, 48, 22));
        texto_funcionarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texto_funcionarios.setText("Funcionarios");
        texto_funcionarios.setName(""); // NOI18N
        texto_funcionarios.setPreferredSize(new java.awt.Dimension(200, 24));
        funcionario_margin_center.add(texto_funcionarios, java.awt.BorderLayout.EAST);

        funcionarios_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        funcionarios_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png"))); // NOI18N
        funcionarios_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        funcionarios_icon.setPreferredSize(new java.awt.Dimension(85, 35));
        funcionario_margin_center.add(funcionarios_icon, java.awt.BorderLayout.WEST);

        menu_funcionarios.add(funcionario_margin_center, java.awt.BorderLayout.CENTER);

        funcionario_margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        funcionario_margin_bottom.setPreferredSize(new java.awt.Dimension(300, 15));

        javax.swing.GroupLayout funcionario_margin_bottomLayout = new javax.swing.GroupLayout(funcionario_margin_bottom);
        funcionario_margin_bottom.setLayout(funcionario_margin_bottomLayout);
        funcionario_margin_bottomLayout.setHorizontalGroup(
            funcionario_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        funcionario_margin_bottomLayout.setVerticalGroup(
            funcionario_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_funcionarios.add(funcionario_margin_bottom, java.awt.BorderLayout.SOUTH);

        menu_relatorio_funcionarios_produtos.add(menu_funcionarios, java.awt.BorderLayout.CENTER);

        menu_produtos.setBackground(new java.awt.Color(251, 245, 238));
        menu_produtos.setPreferredSize(new java.awt.Dimension(300, 100));
        menu_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_produtosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_produtosMouseExited(evt);
            }
        });
        menu_produtos.setLayout(new java.awt.BorderLayout());

        produtos_margin_top.setBackground(new java.awt.Color(251, 245, 238));
        produtos_margin_top.setPreferredSize(new java.awt.Dimension(0, 15));

        javax.swing.GroupLayout produtos_margin_topLayout = new javax.swing.GroupLayout(produtos_margin_top);
        produtos_margin_top.setLayout(produtos_margin_topLayout);
        produtos_margin_topLayout.setHorizontalGroup(
            produtos_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        produtos_margin_topLayout.setVerticalGroup(
            produtos_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_produtos.add(produtos_margin_top, java.awt.BorderLayout.NORTH);

        produtos_margin_center.setBackground(new java.awt.Color(251, 245, 238));
        produtos_margin_center.setPreferredSize(new java.awt.Dimension(300, 70));
        produtos_margin_center.setLayout(new java.awt.BorderLayout());

        texto_produtos.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        texto_produtos.setForeground(new java.awt.Color(91, 48, 22));
        texto_produtos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texto_produtos.setText("Produtos");
        texto_produtos.setPreferredSize(new java.awt.Dimension(200, 24));
        produtos_margin_center.add(texto_produtos, java.awt.BorderLayout.EAST);

        produtos_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        produtos_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png"))); // NOI18N
        produtos_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtos_icon.setPreferredSize(new java.awt.Dimension(85, 35));
        produtos_margin_center.add(produtos_icon, java.awt.BorderLayout.WEST);

        menu_produtos.add(produtos_margin_center, java.awt.BorderLayout.CENTER);

        produtos_margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        produtos_margin_bottom.setPreferredSize(new java.awt.Dimension(300, 15));

        javax.swing.GroupLayout produtos_margin_bottomLayout = new javax.swing.GroupLayout(produtos_margin_bottom);
        produtos_margin_bottom.setLayout(produtos_margin_bottomLayout);
        produtos_margin_bottomLayout.setHorizontalGroup(
            produtos_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        produtos_margin_bottomLayout.setVerticalGroup(
            produtos_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_produtos.add(produtos_margin_bottom, java.awt.BorderLayout.SOUTH);

        menu_relatorio_funcionarios_produtos.add(menu_produtos, java.awt.BorderLayout.PAGE_END);

        menu_Itens.add(menu_relatorio_funcionarios_produtos, java.awt.BorderLayout.PAGE_START);

        menu_empty.setBackground(new java.awt.Color(251, 245, 238));
        menu_empty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu_empty.setPreferredSize(new java.awt.Dimension(300, 100));

        javax.swing.GroupLayout menu_emptyLayout = new javax.swing.GroupLayout(menu_empty);
        menu_empty.setLayout(menu_emptyLayout);
        menu_emptyLayout.setHorizontalGroup(
            menu_emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menu_emptyLayout.setVerticalGroup(
            menu_emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menu_Itens.add(menu_empty, java.awt.BorderLayout.CENTER);

        menu_sair_sobre.setBackground(new java.awt.Color(251, 245, 238));
        menu_sair_sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu_sair_sobre.setPreferredSize(new java.awt.Dimension(300, 200));
        menu_sair_sobre.setLayout(new java.awt.BorderLayout());

        menu_sair.setBackground(new java.awt.Color(251, 245, 238));
        menu_sair.setPreferredSize(new java.awt.Dimension(300, 100));
        menu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_sairMouseExited(evt);
            }
        });
        menu_sair.setLayout(new java.awt.BorderLayout());

        sair_margin_top.setBackground(new java.awt.Color(251, 245, 238));
        sair_margin_top.setPreferredSize(new java.awt.Dimension(0, 15));

        javax.swing.GroupLayout sair_margin_topLayout = new javax.swing.GroupLayout(sair_margin_top);
        sair_margin_top.setLayout(sair_margin_topLayout);
        sair_margin_topLayout.setHorizontalGroup(
            sair_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sair_margin_topLayout.setVerticalGroup(
            sair_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_sair.add(sair_margin_top, java.awt.BorderLayout.NORTH);

        sair_margin_center.setBackground(new java.awt.Color(251, 245, 238));
        sair_margin_center.setPreferredSize(new java.awt.Dimension(300, 70));
        sair_margin_center.setLayout(new java.awt.BorderLayout());

        texto_sair.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        texto_sair.setForeground(new java.awt.Color(91, 48, 22));
        texto_sair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texto_sair.setText("Sair");
        texto_sair.setPreferredSize(new java.awt.Dimension(200, 24));
        sair_margin_center.add(texto_sair, java.awt.BorderLayout.EAST);

        sair_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sair_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/logout-black.png"))); // NOI18N
        sair_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sair_icon.setPreferredSize(new java.awt.Dimension(85, 35));
        sair_margin_center.add(sair_icon, java.awt.BorderLayout.WEST);

        menu_sair.add(sair_margin_center, java.awt.BorderLayout.CENTER);

        sair_margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        sair_margin_bottom.setPreferredSize(new java.awt.Dimension(300, 15));

        javax.swing.GroupLayout sair_margin_bottomLayout = new javax.swing.GroupLayout(sair_margin_bottom);
        sair_margin_bottom.setLayout(sair_margin_bottomLayout);
        sair_margin_bottomLayout.setHorizontalGroup(
            sair_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sair_margin_bottomLayout.setVerticalGroup(
            sair_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_sair.add(sair_margin_bottom, java.awt.BorderLayout.SOUTH);

        menu_sair_sobre.add(menu_sair, java.awt.BorderLayout.NORTH);

        menu_sobre.setBackground(new java.awt.Color(251, 245, 238));
        menu_sobre.setPreferredSize(new java.awt.Dimension(300, 100));
        menu_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_sobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_sobreMouseExited(evt);
            }
        });
        menu_sobre.setLayout(new java.awt.BorderLayout());

        sobre_margin_top.setBackground(new java.awt.Color(251, 245, 238));
        sobre_margin_top.setPreferredSize(new java.awt.Dimension(0, 15));

        javax.swing.GroupLayout sobre_margin_topLayout = new javax.swing.GroupLayout(sobre_margin_top);
        sobre_margin_top.setLayout(sobre_margin_topLayout);
        sobre_margin_topLayout.setHorizontalGroup(
            sobre_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        sobre_margin_topLayout.setVerticalGroup(
            sobre_margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_sobre.add(sobre_margin_top, java.awt.BorderLayout.NORTH);

        sobre_margin_center.setBackground(new java.awt.Color(251, 245, 238));
        sobre_margin_center.setPreferredSize(new java.awt.Dimension(300, 70));
        sobre_margin_center.setLayout(new java.awt.BorderLayout());

        texto_sobre.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        texto_sobre.setForeground(new java.awt.Color(91, 48, 22));
        texto_sobre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texto_sobre.setText("Sobre");
        texto_sobre.setPreferredSize(new java.awt.Dimension(200, 24));
        sobre_margin_center.add(texto_sobre, java.awt.BorderLayout.EAST);

        sobre_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sobre_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png"))); // NOI18N
        sobre_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sobre_icon.setPreferredSize(new java.awt.Dimension(85, 35));
        sobre_margin_center.add(sobre_icon, java.awt.BorderLayout.WEST);

        menu_sobre.add(sobre_margin_center, java.awt.BorderLayout.CENTER);

        sobre_margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        sobre_margin_bottom.setPreferredSize(new java.awt.Dimension(300, 15));

        javax.swing.GroupLayout sobre_margin_bottomLayout = new javax.swing.GroupLayout(sobre_margin_bottom);
        sobre_margin_bottom.setLayout(sobre_margin_bottomLayout);
        sobre_margin_bottomLayout.setHorizontalGroup(
            sobre_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        sobre_margin_bottomLayout.setVerticalGroup(
            sobre_margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        menu_sobre.add(sobre_margin_bottom, java.awt.BorderLayout.SOUTH);

        menu_sair_sobre.add(menu_sobre, java.awt.BorderLayout.SOUTH);

        menu_Itens.add(menu_sair_sobre, java.awt.BorderLayout.PAGE_END);

        menu_Principal.add(menu_Itens, java.awt.BorderLayout.SOUTH);

        margin_center.add(menu_Principal, java.awt.BorderLayout.WEST);

        painel_Base.add(margin_center, java.awt.BorderLayout.CENTER);

        margin_left.setBackground(new java.awt.Color(251, 245, 238));
        margin_left.setPreferredSize(new java.awt.Dimension(20, 1080));

        javax.swing.GroupLayout margin_leftLayout = new javax.swing.GroupLayout(margin_left);
        margin_left.setLayout(margin_leftLayout);
        margin_leftLayout.setHorizontalGroup(
            margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        margin_leftLayout.setVerticalGroup(
            margin_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        painel_Base.add(margin_left, java.awt.BorderLayout.WEST);

        margin_right.setBackground(new java.awt.Color(251, 245, 238));
        margin_right.setPreferredSize(new java.awt.Dimension(20, 1080));

        javax.swing.GroupLayout margin_rightLayout = new javax.swing.GroupLayout(margin_right);
        margin_right.setLayout(margin_rightLayout);
        margin_rightLayout.setHorizontalGroup(
            margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        margin_rightLayout.setVerticalGroup(
            margin_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        painel_Base.add(margin_right, java.awt.BorderLayout.EAST);

        margin_top.setBackground(new java.awt.Color(251, 245, 238));
        margin_top.setPreferredSize(new java.awt.Dimension(1920, 20));

        javax.swing.GroupLayout margin_topLayout = new javax.swing.GroupLayout(margin_top);
        margin_top.setLayout(margin_topLayout);
        margin_topLayout.setHorizontalGroup(
            margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        margin_topLayout.setVerticalGroup(
            margin_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        painel_Base.add(margin_top, java.awt.BorderLayout.PAGE_START);

        margin_bottom.setBackground(new java.awt.Color(251, 245, 238));
        margin_bottom.setPreferredSize(new java.awt.Dimension(1920, 20));

        javax.swing.GroupLayout margin_bottomLayout = new javax.swing.GroupLayout(margin_bottom);
        margin_bottom.setLayout(margin_bottomLayout);
        margin_bottomLayout.setHorizontalGroup(
            margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        margin_bottomLayout.setVerticalGroup(
            margin_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        painel_Base.add(margin_bottom, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_Base, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //----------- HOVER EFFECT MOUSE ENTERED ------------
    private void menu_relatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_relatorioMouseEntered

        relatorio_margin_center.setBackground(new Color(91,48,22));
        texto_relatorios.setForeground(new Color(251,245,238));
        
        relatorios_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/relatorio_icon-white.png")));
    }//GEN-LAST:event_menu_relatorioMouseEntered

    private void menu_funcionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_funcionariosMouseEntered

        funcionario_margin_center.setBackground(new Color(91,48,22));
        texto_funcionarios.setForeground(new Color(251,245,238));
        
        funcionarios_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/id_card-white.png")));
    }//GEN-LAST:event_menu_funcionariosMouseEntered

    private void menu_produtosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_produtosMouseEntered

        produtos_margin_center.setBackground(new Color(91,48,22));
        texto_produtos.setForeground(new Color(251,245,238));
        
        produtos_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/book-white.png")));
    }//GEN-LAST:event_menu_produtosMouseEntered

    private void menu_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sairMouseEntered

        sair_margin_center.setBackground(new Color(91,48,22));
        texto_sair.setForeground(new Color(251,245,238));
        
        sair_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/logout-white.png")));
    }//GEN-LAST:event_menu_sairMouseEntered

    private void menu_sobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sobreMouseEntered

        sobre_margin_center.setBackground(new Color(91,48,22));
        texto_sobre.setForeground(new Color(251,245,238));
        
        sobre_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/whiteIcons/help-white.png")));
    }//GEN-LAST:event_menu_sobreMouseEntered

    
    
    
    
    private void menu_relatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_relatorioMouseExited

        relatorio_margin_center.setBackground(new Color(251,245,238));
        texto_relatorios.setForeground(new Color(91,48,22));
        
        relatorios_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/relatorio_icon-black.png")));
    }//GEN-LAST:event_menu_relatorioMouseExited

    private void menu_funcionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_funcionariosMouseExited

        funcionario_margin_center.setBackground(new Color(251,245,238));
        texto_funcionarios.setForeground(new Color(91,48,22));
        
        funcionarios_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/id_card-black.png")));
    }//GEN-LAST:event_menu_funcionariosMouseExited

    private void menu_produtosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_produtosMouseExited

        produtos_margin_center.setBackground(new Color(251,245,238));
        texto_produtos.setForeground(new Color(91,48,22));
        
        produtos_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/book-black.png")));
    }//GEN-LAST:event_menu_produtosMouseExited

    private void menu_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sairMouseExited

        sair_margin_center.setBackground(new Color(251,245,238));
        texto_sair.setForeground(new Color(91,48,22));
        
        sair_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/logout-black.png")));
    }//GEN-LAST:event_menu_sairMouseExited

    private void menu_sobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sobreMouseExited

        sobre_margin_center.setBackground(new Color(251,245,238));
        texto_sobre.setForeground(new Color(91,48,22));
        
        sobre_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/brownIcons/help-black.png")));
    }//GEN-LAST:event_menu_sobreMouseExited

    private void menu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menu_sairMouseClicked

    private void input_nome_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nome_livroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nome_livroActionPerformed

    private void input_data_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_data_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_cadastroActionPerformed

    private void botao_cadastrar_produtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cadastrar_produtoMouseEntered
        botao_cadastrar_produto.setBackground(new Color(66,143,65));
        botao_cadastrar_produto.setBorder(null);
        botao_cadastrar_produto.setForeground(new Color(251,245,238));
    }//GEN-LAST:event_botao_cadastrar_produtoMouseEntered

    private void botao_cadastrar_produtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cadastrar_produtoMouseExited
        botao_cadastrar_produto.setBackground(new Color(251,245,238));
        botao_cadastrar_produto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 48, 22), 1, true));
        botao_cadastrar_produto.setForeground(new Color(91,48,22));
    }//GEN-LAST:event_botao_cadastrar_produtoMouseExited


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
            java.util.logging.Logger.getLogger(Inshelf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inshelf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inshelf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inshelf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inshelf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cadastrar_produto;
    private javax.swing.JLabel categoria_texto_ano_lancamento;
    private javax.swing.JLabel categoria_texto_autor;
    private javax.swing.JLabel categoria_texto_categoria;
    private javax.swing.JLabel categoria_texto_data_cadastro;
    private javax.swing.JLabel categoria_texto_descricao;
    private javax.swing.JLabel categoria_texto_editora;
    private javax.swing.JLabel categoria_texto_nome_livro;
    private javax.swing.JLabel categoria_texto_preco;
    private javax.swing.JLabel categoria_texto_quantidade;
    public javax.swing.JPanel center_titulo;
    private javax.swing.JPanel conteudo_Principal;
    private javax.swing.JPanel funcionario_margin_bottom;
    private javax.swing.JPanel funcionario_margin_center;
    private javax.swing.JPanel funcionario_margin_top;
    private javax.swing.JLabel funcionarios_icon;
    private javax.swing.JTextField input_ano_lancamento;
    private javax.swing.JTextField input_autor;
    private javax.swing.JTextField input_data_cadastro;
    private javax.swing.JTextField input_descricao;
    private javax.swing.JTextField input_editora;
    private javax.swing.JTextField input_nome_livro;
    private javax.swing.JTextField input_preco;
    private javax.swing.JTextField input_quantidade;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel margin_bottom;
    private javax.swing.JPanel margin_center;
    private javax.swing.JPanel margin_right;
    private javax.swing.JPanel margin_right_titulo;
    private javax.swing.JPanel margin_top;
    private javax.swing.JPanel margin_top_titulo;
    private javax.swing.JPanel menu_Itens;
    private javax.swing.JPanel menu_Principal;
    private javax.swing.JPanel menu_Titulo;
    private javax.swing.JPanel menu_empty;
    private javax.swing.JPanel menu_funcionarios;
    private javax.swing.JPanel menu_produtos;
    private javax.swing.JPanel menu_relatorio;
    private javax.swing.JPanel menu_relatorio_funcionarios_produtos;
    private javax.swing.JPanel menu_sair;
    private javax.swing.JPanel menu_sair_sobre;
    private javax.swing.JPanel menu_sobre;
    private javax.swing.JPanel pagina_fundo_margin_left;
    private javax.swing.JPanel pagina_fundo_margin_left1;
    private javax.swing.JPanel pagina_fundo_margin_right;
    private javax.swing.JPanel pagina_fundo_margin_right1;
    private javax.swing.JPanel painel_Base;
    private javax.swing.JPanel painel_categoria_ano_lancamento;
    private javax.swing.JPanel painel_categoria_autor;
    private javax.swing.JPanel painel_categoria_categoria;
    private javax.swing.JPanel painel_categoria_data_cadastro;
    private javax.swing.JPanel painel_categoria_descricao;
    private javax.swing.JPanel painel_categoria_editora;
    private javax.swing.JPanel painel_categoria_nome_livro;
    private javax.swing.JPanel painel_categoria_preco;
    private javax.swing.JPanel painel_categoria_quantidade;
    private javax.swing.JPanel principal_bottom;
    private javax.swing.JPanel principal_centro;
    private javax.swing.JPanel principal_divisao;
    private javax.swing.JPanel principal_fundo_center;
    private javax.swing.JPanel principal_fundo_center1;
    private javax.swing.JPanel principal_margin_bottom;
    private javax.swing.JPanel principal_margin_left;
    private javax.swing.JPanel principal_margin_right;
    private javax.swing.JPanel principal_margin_top;
    private javax.swing.JPanel principal_pagina_frente;
    private javax.swing.JPanel principal_pagina_frente2;
    private javax.swing.JPanel principal_pagina_fundo;
    private javax.swing.JPanel principal_pagina_fundo2;
    private javax.swing.JPanel principal_top;
    private javax.swing.JPanel produto1_input_ano_lancamento;
    private javax.swing.JPanel produto1_input_autor;
    private javax.swing.JPanel produto1_input_data_cadastro;
    private javax.swing.JPanel produto1_input_editora;
    private javax.swing.JPanel produto1_input_preco;
    private javax.swing.JPanel produto1_input_quantidade;
    private javax.swing.JPanel produto1_input_vazio;
    private javax.swing.JPanel produto2_input_categoria;
    private javax.swing.JPanel produtos1_inputs_linha1;
    private javax.swing.JPanel produtos1_inputs_linha2;
    private javax.swing.JPanel produtos1_inputs_linha3;
    private javax.swing.JPanel produtos1_inputs_linha4;
    private javax.swing.JPanel produtos2_inputs_linha1;
    private javax.swing.JPanel produtos2_inputs_linha2;
    private javax.swing.JPanel produtos2_inputs_linha3;
    private javax.swing.JPanel produtos2_inputs_linha4;
    private javax.swing.JLabel produtos_icon;
    private javax.swing.JPanel produtos_margin_bottom;
    private javax.swing.JPanel produtos_margin_center;
    private javax.swing.JPanel produtos_margin_top;
    private javax.swing.JPanel relatorio_margin_bottom;
    private javax.swing.JPanel relatorio_margin_center;
    private javax.swing.JPanel relatorio_margin_top;
    private javax.swing.JLabel relatorios_icon;
    private javax.swing.JLabel sair_icon;
    private javax.swing.JPanel sair_margin_bottom;
    private javax.swing.JPanel sair_margin_center;
    private javax.swing.JPanel sair_margin_top;
    private javax.swing.JLabel sobre_icon;
    private javax.swing.JPanel sobre_margin_bottom;
    private javax.swing.JPanel sobre_margin_center;
    private javax.swing.JPanel sobre_margin_top;
    private javax.swing.JPanel tela_produto1_center;
    private javax.swing.JPanel tela_produto1_inputs;
    private javax.swing.JPanel tela_produto2_center;
    private javax.swing.JPanel tela_produto2_inputs;
    private javax.swing.JPanel tela_produtos1;
    private javax.swing.JPanel tela_produtos1_margin_bottom;
    private javax.swing.JPanel tela_produtos1_margin_left;
    private javax.swing.JPanel tela_produtos1_margin_right;
    private javax.swing.JPanel tela_produtos1_margin_top;
    private javax.swing.JPanel tela_produtos1_titulo;
    private javax.swing.JPanel tela_produtos2;
    private javax.swing.JPanel tela_produtos2_margin_bottom;
    private javax.swing.JPanel tela_produtos2_margin_left;
    private javax.swing.JPanel tela_produtos2_margin_right;
    private javax.swing.JPanel tela_produtos2_margin_top;
    private javax.swing.JPanel tela_produtos2_titulo;
    private javax.swing.JLabel texto_Titulo;
    private javax.swing.JLabel texto_funcionarios;
    private javax.swing.JLabel texto_produtos;
    private javax.swing.JLabel texto_relatorios;
    private javax.swing.JLabel texto_sair;
    private javax.swing.JLabel texto_sobre;
    // End of variables declaration//GEN-END:variables

    
    //classe para painel ter bordas
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            //graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border

        }
    }
    
}
