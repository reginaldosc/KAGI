/*
 * TelaPrincipal.java
 *
 * Created on 1 de Agosto de 2015
 */
package br.khomp.kagi.reginaldo.limite;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import br.khomp.kagi.reginaldo.controle.Aplicacao;
import br.khomp.kagi.reginaldo.controle.CallTableModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reginaldo Goncalves
 */
public class TelaPrincipal extends javax.swing.JFrame {

    final int ALTURA = 500;
    final int LARGURA = 800;
    private final Aplicacao aplicacao;
    private ConteudoTelaPrincipal conteudo = new ConteudoTelaPrincipal();
    private CallTableModel tableModel;

    public TelaPrincipal(Aplicacao aplicacao) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException | ClassNotFoundException ex) {
        }
        initComponents();
        this.setCampos();
        this.aplicacao = aplicacao;
        this.mostraTabelaChannels();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// copiar
        setLocation(screenSize.width / 2 - LARGURA / 2,// Centraliza o Frame Principal no meio da Tela
                screenSize.height / 2 - ALTURA / 2);// r
        setSize(LARGURA, ALTURA);//determina o Tamanho da tela Principa
    }

    public void mostraTela(Boolean mostra) {
        this.setVisible(mostra);
        if (mostra == false) {
            this.dispose();
        }
    }

    public ConteudoTelaPrincipal getConteudo() {
        return conteudo;
    }

    public void setConteudo(ConteudoTelaPrincipal conteudo) {
        this.conteudo = conteudo;
    }

    public final void setCampos() {
        jtfChannel.setText(conteudo.getChannel());
        jtfContext.setText(conteudo.getContext());
        jtfNumber.setText(conteudo.getNumber());
        jtfPassword.setText(conteudo.getPassword());
        jtfServerIP.setText(conteudo.getServerIp());
        jtfServerPort.setText(String.valueOf(conteudo.getServerPort()));
        jtfUser.setText(conteudo.getUser());
        jtaEvents.setText(conteudo.getEventText());
        jlConnection.setText(conteudo.getJlConnection());
    }
    
    public void mostraTabelaChannels(){
        //neste ponto � criado o modelo da JTable
        tableModel = new CallTableModel(conteudo.getTabela());
	jtChannels.setModel(tableModel);
        jtChannels.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void habilitaCampos() {

        jbConnect.setEnabled(true);
        jbDisconnect.setEnabled(false);
        jbPing.setEnabled(true);
        jbHangup.setEnabled(false);
        jbSendSms.setEnabled(false);
        jbClearSMS.setEnabled(false);
        jbCall.setEnabled(false);
        jcbSMS.setSelected(false);
        jpSMS.setEnabled(false);
        jtaEvents.setEditable(false);
        jtaEvents.setEnabled(false);
        jbClearEvents.setEnabled(false);
        jcbConfirmation.setEnabled(false);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jpSocketConnection = new javax.swing.JPanel();
        jlServerIP = new javax.swing.JLabel();
        jtfServerIP = new javax.swing.JTextField();
        jlServerPort = new javax.swing.JLabel();
        jtfServerPort = new javax.swing.JTextField();
        jlUser = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JPasswordField();
        jtfUser = new javax.swing.JTextField();
        jbConnect = new javax.swing.JButton();
        jbPing = new javax.swing.JButton();
        jbDisconnect = new javax.swing.JButton();
        jpEvents = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaEvents = new javax.swing.JTextArea();
        jbClearEvents = new javax.swing.JButton();
        jpExtensions = new javax.swing.JPanel();
        jlNumber = new javax.swing.JLabel();
        jlChannel = new javax.swing.JLabel();
        jlContext = new javax.swing.JLabel();
        jtfNumber = new javax.swing.JTextField();
        jtfChannel = new javax.swing.JTextField();
        jtfContext = new javax.swing.JTextField();
        jbCall = new javax.swing.JButton();
        jbHangup = new javax.swing.JButton();
        jpSMS = new javax.swing.JPanel();
        jbSendSms = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSMS = new javax.swing.JTextArea();
        jbClearSMS = new javax.swing.JButton();
        jcbSMS = new javax.swing.JCheckBox();
        jpStatus = new javax.swing.JPanel();
        jlConnection = new javax.swing.JLabel();
        jpTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtChannels = new javax.swing.JTable();
        jcbConfirmation = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmTestes = new javax.swing.JMenu();
        jmiAsterisk = new javax.swing.JMenuItem();
        jmiFreeSwitch = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KAGI");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(875, 690));
        setName("jfPrincipal"); // NOI18N
        setResizable(false);

        jpSocketConnection.setBorder(javax.swing.BorderFactory.createTitledBorder("Socket Connection"));

        jlServerIP.setText("Server IP: ");

        jtfServerIP.setToolTipText("");

        jlServerPort.setText("Server Port: ");

        jtfServerPort.setText("5038");

        jlUser.setText("User: ");

        jlPassword.setText("Password: ");

        jbConnect.setText("Login");
        jbConnect.setMaximumSize(new java.awt.Dimension(85, 23));
        jbConnect.setMinimumSize(new java.awt.Dimension(85, 23));
        jbConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConnectActionPerformed(evt);
            }
        });

        jbPing.setText("Ping");
        jbPing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPingActionPerformed(evt);
            }
        });

        jbDisconnect.setText("Disconnect");
        jbDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDisconnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSocketConnectionLayout = new javax.swing.GroupLayout(jpSocketConnection);
        jpSocketConnection.setLayout(jpSocketConnectionLayout);
        jpSocketConnectionLayout.setHorizontalGroup(
            jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSocketConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpSocketConnectionLayout.createSequentialGroup()
                        .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlUser)
                            .addComponent(jlServerIP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfServerIP)
                            .addComponent(jtfUser, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlServerPort, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfPassword)
                            .addComponent(jtfServerPort, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(jpSocketConnectionLayout.createSequentialGroup()
                        .addComponent(jbConnect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jbDisconnect)
                        .addGap(77, 77, 77)
                        .addComponent(jbPing)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpSocketConnectionLayout.setVerticalGroup(
            jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSocketConnectionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlServerIP)
                    .addComponent(jtfServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlServerPort)
                    .addComponent(jtfServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUser)
                    .addComponent(jlPassword)
                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConnect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPing)
                    .addComponent(jbDisconnect))
                .addContainerGap())
        );

        jpEvents.setBorder(javax.swing.BorderFactory.createTitledBorder("Events"));

        jtaEvents.setColumns(20);
        jtaEvents.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jtaEvents.setRows(5);
        jScrollPane2.setViewportView(jtaEvents);

        jbClearEvents.setText("Clear");
        jbClearEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearEventsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEventsLayout = new javax.swing.GroupLayout(jpEvents);
        jpEvents.setLayout(jpEventsLayout);
        jpEventsLayout.setHorizontalGroup(
            jpEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEventsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbClearEvents)
                .addGap(133, 133, 133))
        );
        jpEventsLayout.setVerticalGroup(
            jpEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEventsLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbClearEvents)
                .addContainerGap())
        );

        jpExtensions.setBorder(javax.swing.BorderFactory.createTitledBorder("Extensions"));

        jlNumber.setText("Number: ");

        jlChannel.setText("Channel: ");

        jlContext.setText("Context: ");

        jtfChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfChannelActionPerformed(evt);
            }
        });

        jbCall.setText("Call");
        jbCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCallActionPerformed(evt);
            }
        });

        jbHangup.setText("Hangup");
        jbHangup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHangupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpExtensionsLayout = new javax.swing.GroupLayout(jpExtensions);
        jpExtensions.setLayout(jpExtensionsLayout);
        jpExtensionsLayout.setHorizontalGroup(
            jpExtensionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtensionsLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jpExtensionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpExtensionsLayout.createSequentialGroup()
                        .addComponent(jlChannel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfChannel))
                    .addGroup(jpExtensionsLayout.createSequentialGroup()
                        .addComponent(jlContext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfContext))
                    .addGroup(jpExtensionsLayout.createSequentialGroup()
                        .addComponent(jlNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExtensionsLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jbCall)
                .addGap(31, 31, 31)
                .addComponent(jbHangup)
                .addGap(28, 28, 28))
        );
        jpExtensionsLayout.setVerticalGroup(
            jpExtensionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtensionsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpExtensionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumber)
                    .addComponent(jtfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpExtensionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlChannel)
                    .addComponent(jtfChannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpExtensionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContext)
                    .addComponent(jtfContext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jpExtensionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCall)
                    .addComponent(jbHangup))
                .addContainerGap())
        );

        jpSMS.setBorder(javax.swing.BorderFactory.createTitledBorder("SMS text"));
        jpSMS.setEnabled(false);
        jpSMS.setOpaque(false);

        jbSendSms.setText("Send");
        jbSendSms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSendSmsActionPerformed(evt);
            }
        });

        jtaSMS.setColumns(20);
        jtaSMS.setRows(5);
        jtaSMS.setEnabled(false);
        jScrollPane1.setViewportView(jtaSMS);

        jbClearSMS.setText("Clear");
        jbClearSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearSMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSMSLayout = new javax.swing.GroupLayout(jpSMS);
        jpSMS.setLayout(jpSMSLayout);
        jpSMSLayout.setHorizontalGroup(
            jpSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jpSMSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSendSms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(jbClearSMS)
                .addContainerGap())
        );
        jpSMSLayout.setVerticalGroup(
            jpSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSMSLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSendSms)
                    .addComponent(jbClearSMS))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jcbSMS.setText("SMS");
        jcbSMS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbSMSItemStateChanged(evt);
            }
        });
        jcbSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSMSActionPerformed(evt);
            }
        });

        jpStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jpStatusLayout = new javax.swing.GroupLayout(jpStatus);
        jpStatus.setLayout(jpStatusLayout);
        jpStatusLayout.setHorizontalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlConnection, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpStatusLayout.setVerticalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlConnection)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Channels"));

        jtChannels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Título 3", "Título 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtChannels.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtChannelsKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jtChannels);

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpTableLayout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
            .addGroup(jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
        );

        jcbConfirmation.setText("Confirmation");
        jcbConfirmation.setToolTipText("Confirmação de recebimento de SMS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jpExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpSMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcbSMS, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbConfirmation)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jpSocketConnection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpSocketConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbSMS)
                                    .addComponent(jcbConfirmation))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpSMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jpEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jmTestes.setMnemonic('T');
        jmTestes.setText("Teste");
        jmTestes.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        jmiAsterisk.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        jmiAsterisk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asterisk-icon.png"))); // NOI18N
        jmiAsterisk.setMnemonic('A');
        jmiAsterisk.setText("Asterisk");
        jmiAsterisk.setToolTipText("");
        jmiAsterisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAsteriskActionPerformed(evt);
            }
        });
        jmTestes.add(jmiAsterisk);

        jmiFreeSwitch.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        jmiFreeSwitch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fs64_tiny.png"))); // NOI18N
        jmiFreeSwitch.setMnemonic('F');
        jmiFreeSwitch.setText("FreeSwitch");
        jmiFreeSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFreeSwitchActionPerformed(evt);
            }
        });
        jmTestes.add(jmiFreeSwitch);

        jMenuBar1.add(jmTestes);

        jmSobre.setMnemonic('S');
        jmSobre.setText("Sobre");
        jmSobre.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        jmSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSobreMouseClicked
        aplicacao.sobre();
    }//GEN-LAST:event_jmSobreMouseClicked

    private void jmiFreeSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFreeSwitchActionPerformed
        aplicacao.teste("F");
    }//GEN-LAST:event_jmiFreeSwitchActionPerformed

    private void jmiAsteriskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAsteriskActionPerformed
        aplicacao.teste("A");
    }//GEN-LAST:event_jmiAsteriskActionPerformed

    private void jtfChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfChannelActionPerformed
        System.out.println("presionou");
    }//GEN-LAST:event_jtfChannelActionPerformed

    private void jbConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConnectActionPerformed
        conteudo.setServerIp(jtfServerIP.getText());
        conteudo.setServerPort(Integer.parseInt(jtfServerPort.getText()));
        conteudo.setUser(jtfUser.getText());
        conteudo.setPassword(jtfPassword.getText());
                
        try {
            if (aplicacao.onConnect()) {
                this.setCampos();
                jbDisconnect.setEnabled(true);
                jbConnect.setEnabled(false);
                jbCall.setEnabled(true);
                jtaEvents.setEnabled(true);
                jbClearEvents.setEnabled(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
    }//GEN-LAST:event_jbConnectActionPerformed

    
    private void jbDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDisconnectActionPerformed
        aplicacao.onDisconnect();
        this.setCampos();
        jbDisconnect.setEnabled(false);
        jbConnect.setEnabled(true);
    }//GEN-LAST:event_jbDisconnectActionPerformed

    private void jbPingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPingActionPerformed
        if (!aplicacao.sendPing()) {
            System.out.println("error");
        } else {
            this.setCampos();
        }
    }//GEN-LAST:event_jbPingActionPerformed

    private void jbCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCallActionPerformed
        conteudo.setNumber(jtfNumber.getText());
        conteudo.setChannel(jtfChannel.getText());
        conteudo.setContext(jtfContext.getText());
        if (aplicacao.onCall()){            
            jbHangup.setEnabled(true);
        }
    }//GEN-LAST:event_jbCallActionPerformed

    private void jbHangupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHangupActionPerformed
        int i = jtChannels.getSelectedRow();
        String actionID = jtChannels.getValueAt(i, 0).toString();
        String channel  = jtChannels.getValueAt(i, 1).toString();
        
        if (aplicacao.hangUp(actionID, channel)){
            tableModel.onRemove(i);
        }
    }//GEN-LAST:event_jbHangupActionPerformed

    private void jcbSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSMSActionPerformed
        if (jcbSMS.isSelected()) {
            jpSMS.setEnabled(true);
            jtaSMS.setEnabled(true);
            jtaSMS.setEditable(true);
            jbSendSms.setEnabled(true);
            jbClearSMS.setEnabled(true);
            jcbConfirmation.setEnabled(true);
        } else {
            jpSMS.setEnabled(false);
            jtaSMS.setEditable(false);
            jbSendSms.setEnabled(false);
            jbClearSMS.setEnabled(false);
            jtaSMS.setText(null);
            jcbConfirmation.setEnabled(false);
        }
       
    }//GEN-LAST:event_jcbSMSActionPerformed

    private void jcbSMSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbSMSItemStateChanged
        aplicacao.cbSMSischanged();
    }//GEN-LAST:event_jcbSMSItemStateChanged

    private void jbSendSmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSendSmsActionPerformed
        conteudo.setSmsText(jtaSMS.getText());
        conteudo.setChannel(jtfChannel.getText());
        conteudo.setNumber(jtfNumber.getText());
        conteudo.setConfirmation(jcbConfirmation.isSelected());
        aplicacao.sendSms();
    }//GEN-LAST:event_jbSendSmsActionPerformed

    private void jbClearSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearSMSActionPerformed
        jtaSMS.setText(null);
    }//GEN-LAST:event_jbClearSMSActionPerformed

    private void jbClearEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearEventsActionPerformed
        //jtaEvents.setSmsText(null);
        aplicacao.changeInfo("");
        
    }//GEN-LAST:event_jbClearEventsActionPerformed

    private void jtChannelsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtChannelsKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if(keyCode == 127) {
            System.out.println("Pressionou o delete");
            int ret = JOptionPane.showConfirmDialog(null, "Deseja realmente finalizar a ligação?");
            switch (ret) {
                case 0:
                    System.out.println("Sim");
                    tableModel.onRemove(jtChannels.getSelectedRow());
                    break;
                case 1:
                    System.out.println("Não");
                    break;
                case 2:
                    System.out.println("Cancelar");
                    break;
            }            
        } else {
            JOptionPane.showMessageDialog(null, "Para desligar a ligação, pressione o 'Delete'");
        }
    }//GEN-LAST:event_jtChannelsKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        Object[] options = {"Sim", "N�o"};
        int opcao = JOptionPane.showOptionDialog(this, "Deseja mesmo sair?", "Confirma��o de sa�da",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        if (opcao == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbCall;
    private javax.swing.JButton jbClearEvents;
    private javax.swing.JButton jbClearSMS;
    private javax.swing.JButton jbConnect;
    private javax.swing.JButton jbDisconnect;
    private javax.swing.JButton jbHangup;
    private javax.swing.JButton jbPing;
    private javax.swing.JButton jbSendSms;
    private javax.swing.JCheckBox jcbConfirmation;
    private javax.swing.JCheckBox jcbSMS;
    private javax.swing.JLabel jlChannel;
    private javax.swing.JLabel jlConnection;
    private javax.swing.JLabel jlContext;
    private javax.swing.JLabel jlNumber;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlServerIP;
    private javax.swing.JLabel jlServerPort;
    private javax.swing.JLabel jlUser;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenu jmTestes;
    private javax.swing.JMenuItem jmiAsterisk;
    private javax.swing.JMenuItem jmiFreeSwitch;
    private javax.swing.JPanel jpEvents;
    private javax.swing.JPanel jpExtensions;
    private javax.swing.JPanel jpSMS;
    private javax.swing.JPanel jpSocketConnection;
    private javax.swing.JPanel jpStatus;
    private javax.swing.JPanel jpTable;
    private javax.swing.JTable jtChannels;
    private javax.swing.JTextArea jtaEvents;
    private javax.swing.JTextArea jtaSMS;
    private javax.swing.JTextField jtfChannel;
    private javax.swing.JTextField jtfContext;
    private javax.swing.JTextField jtfNumber;
    private javax.swing.JPasswordField jtfPassword;
    private javax.swing.JTextField jtfServerIP;
    private javax.swing.JTextField jtfServerPort;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables

    public void changeJlConnection() {
        jlConnection.setText(conteudo.getJlConnection());
        
    }

    public String getJtaEvents() {
        String str = jtaEvents.getText();
        return str;

    }

    public void setJtaEvents(String str) {
        jtaEvents.setText(this.getJtaEvents() + "\n" + str);
        
    }

    public void changeJtaEvents(String txtEvents) {
        conteudo.setEventText(txtEvents);
        //jtaEvents.setSmsText(conteudo.getEventText() + "\n");
        
    }

}
