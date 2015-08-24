/*
 * TelaPrincipal.java
 *
 * Created on 1 de Agosto de 2015
 */
package br.khomp.kami.limite;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import br.khomp.kami.controle.Aplicacao;
import br.khomp.kami.controle.CallTableModel;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reginaldo Goncalves
 */
public class TelaPrincipal extends javax.swing.JFrame implements Observer{

    final int ALTURA = 600;
    final int LARGURA = 800;
    private final Aplicacao aplicacao;
    private ConteudoTelaPrincipal conteudo = new ConteudoTelaPrincipal();
    private CallTableModel tableModel;
    private Observable observador;
    private String botao = "Ramal";

    public TelaPrincipal(Aplicacao aplicacao) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException | ClassNotFoundException ex) {
        }
        initComponents();
        this.setCampos();
        this.aplicacao = aplicacao;
        this.mostraTabelaChannels();
        this.opcao();
        

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// copiar
        setLocation(screenSize.width / 2 - LARGURA / 2,// Centraliza o Frame Principal no meio da Tela
                screenSize.height / 2 - ALTURA / 2);// r
        setSize(LARGURA, ALTURA);//determina o Tamanho da tela Principa
        
        setObervador();
        
    }
    
    private void setObervador(){
        this.observador = conteudo;
        this.observador.addObserver(this);
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
        jtfApplication.setText(conteudo.getContext());
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
        jcbAlertMsg.setEnabled(false);
        jcbAsync.setEnabled(false);
        jcbEncoding.setEnabled(false);
        jcbLineFeed.setEnabled(false);
        jcbWap.setEnabled(false);
        jtfPort.setEnabled(false);
               
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jbExport = new javax.swing.JButton();
        jpTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtChannels = new javax.swing.JTable();
        jpStatus = new javax.swing.JPanel();
        jlConnection = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpExtensions = new javax.swing.JPanel();
        jbCall = new javax.swing.JButton();
        jbHangup = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jpCallApplication = new javax.swing.JPanel();
        jtfChannel = new javax.swing.JTextField();
        jtfApplication = new javax.swing.JTextField();
        jlChannel = new javax.swing.JLabel();
        jlApplication = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfData = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jpCallRamal = new javax.swing.JPanel();
        jlTech1 = new javax.swing.JLabel();
        jcbTech1 = new javax.swing.JComboBox();
        jtfNumber = new javax.swing.JTextField();
        jtfChannel1 = new javax.swing.JTextField();
        jtfContext1 = new javax.swing.JTextField();
        jlNumber1 = new javax.swing.JLabel();
        jlChannel1 = new javax.swing.JLabel();
        jlContext1 = new javax.swing.JLabel();
        jcbRestrict1 = new javax.swing.JCheckBox();
        jpSMS = new javax.swing.JPanel();
        jcbSMS = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSMS = new javax.swing.JTextArea();
        jbSendSms = new javax.swing.JButton();
        jbClearSMS = new javax.swing.JButton();
        jcbConfirmation = new javax.swing.JCheckBox();
        jcbAlertMsg = new javax.swing.JCheckBox();
        jcbLineFeed = new javax.swing.JCheckBox();
        jcbAsync = new javax.swing.JCheckBox();
        jcbEncoding = new javax.swing.JComboBox();
        jlEncoding = new javax.swing.JLabel();
        jlPort = new javax.swing.JLabel();
        jtfPort = new javax.swing.JTextField();
        jlWap = new javax.swing.JLabel();
        jcbWap = new javax.swing.JComboBox();
        jpSimCard = new javax.swing.JPanel();
        jlChannelSim = new javax.swing.JLabel();
        jtfChannelSim = new javax.swing.JTextField();
        jlSimCard = new javax.swing.JLabel();
        jcbSimCard = new javax.swing.JComboBox();
        jbSendSimSelect = new javax.swing.JButton();
        jpUSSD = new javax.swing.JPanel();
        jlDeviceUSSD = new javax.swing.JLabel();
        jbSendUSSD = new javax.swing.JButton();
        jtfDeviceUSSD = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaMessageUSSD = new javax.swing.JTextArea();
        jlMessageUSSD = new javax.swing.JLabel();
        jpUUI = new javax.swing.JPanel();
        jlDevice = new javax.swing.JLabel();
        jtfUUIDevice = new javax.swing.JTextField();
        jlProtocol = new javax.swing.JLabel();
        jtfUUIProtocol = new javax.swing.JTextField();
        jlLength = new javax.swing.JLabel();
        jtfUUILength = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaUUIData = new javax.swing.JTextArea();
        jlData = new javax.swing.JLabel();
        jbSendUUI = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmTestes = new javax.swing.JMenu();
        jmiAsterisk = new javax.swing.JMenuItem();
        jmiFreeSwitch = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmiAjuda = new javax.swing.JMenuItem();
        jmiSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KAMI");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1080, 680));
        setName("jfPrincipal"); // NOI18N

        jpSocketConnection.setBorder(javax.swing.BorderFactory.createTitledBorder("Socket Connection"));

        jlServerIP.setText("Server IP:");

        jtfServerIP.setText("255.255.255.255");
        jtfServerIP.setToolTipText("");

        jlServerPort.setText("Server Port:");

        jtfServerPort.setText("00000");
        jtfServerPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfServerPortActionPerformed(evt);
            }
        });

        jlUser.setText("User:");

        jlPassword.setText("Password:");

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
                .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSocketConnectionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbConnect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jbDisconnect)
                        .addGap(83, 83, 83)
                        .addComponent(jbPing)
                        .addGap(124, 124, 124))
                    .addGroup(jpSocketConnectionLayout.createSequentialGroup()
                        .addComponent(jlServerIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlServerPort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpSocketConnectionLayout.setVerticalGroup(
            jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSocketConnectionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpSocketConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPassword)
                    .addComponent(jlUser)
                    .addComponent(jlServerPort)
                    .addComponent(jlServerIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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

        jbExport.setText("Exportar");
        jbExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEventsLayout = new javax.swing.GroupLayout(jpEvents);
        jpEvents.setLayout(jpEventsLayout);
        jpEventsLayout.setHorizontalGroup(
            jpEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpEventsLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jbClearEvents)
                .addGap(18, 18, 18)
                .addComponent(jbExport)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jpEventsLayout.setVerticalGroup(
            jpEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEventsLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbClearEvents)
                    .addComponent(jbExport))
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        jpStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jpStatusLayout = new javax.swing.GroupLayout(jpStatus);
        jpStatus.setLayout(jpStatusLayout);
        jpStatusLayout.setHorizontalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlConnection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpStatusLayout.setVerticalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlConnection, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jpExtensions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCall.setText("Call");
        jbCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCallActionPerformed(evt);
            }
        });
        jpExtensions.add(jbCall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 69, -1));

        jbHangup.setText("Hangup");
        jbHangup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHangupActionPerformed(evt);
            }
        });
        jpExtensions.add(jbHangup, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));
        jpExtensions.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 32, -1, 80));

        jpCallApplication.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlChannel.setText("Channel: ");

        jlApplication.setText("Aplicação: ");

        jLabel2.setText("Data: ");

        javax.swing.GroupLayout jpCallApplicationLayout = new javax.swing.GroupLayout(jpCallApplication);
        jpCallApplication.setLayout(jpCallApplicationLayout);
        jpCallApplicationLayout.setHorizontalGroup(
            jpCallApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCallApplicationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCallApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCallApplicationLayout.createSequentialGroup()
                        .addGroup(jpCallApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlChannel)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37))
                    .addGroup(jpCallApplicationLayout.createSequentialGroup()
                        .addComponent(jlApplication)
                        .addGap(35, 35, 35)))
                .addGroup(jpCallApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfApplication, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jtfChannel)
                    .addComponent(jtfData))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jpCallApplicationLayout.setVerticalGroup(
            jpCallApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCallApplicationLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpCallApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlChannel)
                    .addComponent(jtfChannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpCallApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpCallApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApplication))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpExtensions.add(jpCallApplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 170));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Ramal");
        jRadioButton1.setActionCommand("Ramal");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jpExtensions.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Aplicação");
        jRadioButton2.setActionCommand("app");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jpExtensions.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, -1));

        jpCallRamal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlTech1.setText("Tech: ");

        jcbTech1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SIP", "Khomp" }));
        jcbTech1.setSelectedIndex(1);
        jcbTech1.setActionCommand("");
        jcbTech1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTech1ActionPerformed(evt);
            }
        });

        jlNumber1.setText("Number: ");

        jlChannel1.setText("Channel: ");

        jlContext1.setText("Context: ");

        jcbRestrict1.setText("Modo Privado");
        jcbRestrict1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbRestrict1ItemStateChanged(evt);
            }
        });
        jcbRestrict1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRestrict1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCallRamalLayout = new javax.swing.GroupLayout(jpCallRamal);
        jpCallRamal.setLayout(jpCallRamalLayout);
        jpCallRamalLayout.setHorizontalGroup(
            jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCallRamalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCallRamalLayout.createSequentialGroup()
                        .addGroup(jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlChannel1)
                            .addComponent(jlContext1)
                            .addGroup(jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlTech1)
                                .addComponent(jlNumber1)))
                        .addGap(35, 35, 35)
                        .addGroup(jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfContext1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfChannel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTech1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jcbRestrict1))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jpCallRamalLayout.setVerticalGroup(
            jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCallRamalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbRestrict1)
                .addGap(7, 7, 7)
                .addGroup(jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTech1)
                    .addComponent(jcbTech1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNumber1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfChannel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlChannel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCallRamalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfContext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContext1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpExtensions.add(jpCallRamal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 170));

        jTabbedPane1.addTab("Chamadas", jpExtensions);

        jpSMS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jpSMS.add(jcbSMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, 103, -1));

        jtaSMS.setColumns(20);
        jtaSMS.setRows(5);
        jtaSMS.setEnabled(false);
        jScrollPane1.setViewportView(jtaSMS);

        jpSMS.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, -1, 155));

        jbSendSms.setText("Send");
        jbSendSms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSendSmsActionPerformed(evt);
            }
        });
        jpSMS.add(jbSendSms, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, -1, -1));

        jbClearSMS.setText("Clear");
        jbClearSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearSMSActionPerformed(evt);
            }
        });
        jpSMS.add(jbClearSMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 214, -1, -1));

        jcbConfirmation.setText("Confirmation");
        jcbConfirmation.setToolTipText("Confirmação de recebimento de SMS");
        jpSMS.add(jcbConfirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 48, 93, -1));

        jcbAlertMsg.setText("Alert message");
        jpSMS.add(jcbAlertMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 76, -1, -1));

        jcbLineFeed.setText("Line Feed");
        jpSMS.add(jcbLineFeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 106, 93, -1));

        jcbAsync.setText("Async");
        jpSMS.add(jcbAsync, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 136, 93, -1));

        jcbEncoding.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7", "binary", "16" }));
        jpSMS.add(jcbEncoding, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 49, 63, -1));

        jlEncoding.setText("Encoding: ");
        jpSMS.add(jlEncoding, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 52, -1, -1));

        jlPort.setText("Port: ");
        jpSMS.add(jlPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 82, -1, -1));
        jpSMS.add(jtfPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 79, 63, -1));

        jlWap.setText("WAP: ");
        jpSMS.add(jlWap, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 112, -1, -1));

        jcbWap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "SI", "SL" }));
        jpSMS.add(jcbWap, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 109, 63, -1));

        jTabbedPane1.addTab("SMS", jpSMS);

        jpSimCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlChannelSim.setText("Channel: ");
        jpSimCard.add(jlChannelSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 44, -1, -1));
        jpSimCard.add(jtfChannelSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 41, 60, -1));

        jlSimCard.setText("SIM card: ");
        jpSimCard.add(jlSimCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 82, -1, -1));

        jcbSimCard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        jpSimCard.add(jcbSimCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 79, 60, -1));

        jbSendSimSelect.setText("Send");
        jbSendSimSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSendSimSelectActionPerformed(evt);
            }
        });
        jpSimCard.add(jbSendSimSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 128, -1, -1));

        jTabbedPane1.addTab("SIM Card", jpSimCard);

        jlDeviceUSSD.setText("Device: ");

        jbSendUSSD.setText("Send");
        jbSendUSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSendUSSDActionPerformed(evt);
            }
        });

        jtfDeviceUSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDeviceUSSDActionPerformed(evt);
            }
        });

        jtaMessageUSSD.setColumns(20);
        jtaMessageUSSD.setRows(5);
        jScrollPane4.setViewportView(jtaMessageUSSD);

        jlMessageUSSD.setText("Message: ");

        javax.swing.GroupLayout jpUSSDLayout = new javax.swing.GroupLayout(jpUSSD);
        jpUSSD.setLayout(jpUSSDLayout);
        jpUSSDLayout.setHorizontalGroup(
            jpUSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUSSDLayout.createSequentialGroup()
                .addGroup(jpUSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUSSDLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jpUSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlDeviceUSSD)
                            .addComponent(jlMessageUSSD))
                        .addGap(18, 18, 18)
                        .addGroup(jpUSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jtfDeviceUSSD)))
                    .addGroup(jpUSSDLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jbSendUSSD)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jpUSSDLayout.setVerticalGroup(
            jpUSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUSSDLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jpUSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDeviceUSSD)
                    .addComponent(jtfDeviceUSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpUSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMessageUSSD))
                .addGap(18, 18, 18)
                .addComponent(jbSendUSSD)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("USSD", jpUSSD);

        jlDevice.setText("Device: ");

        jlProtocol.setText("Protocol: ");

        jlLength.setText("Length: ");

        jtaUUIData.setColumns(20);
        jtaUUIData.setRows(5);
        jScrollPane5.setViewportView(jtaUUIData);

        jlData.setText("Data: ");

        jbSendUUI.setText("Send");
        jbSendUUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSendUUIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpUUILayout = new javax.swing.GroupLayout(jpUUI);
        jpUUI.setLayout(jpUUILayout);
        jpUUILayout.setHorizontalGroup(
            jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUUILayout.createSequentialGroup()
                .addGroup(jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUUILayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlLength)
                            .addComponent(jlProtocol)
                            .addComponent(jlDevice))
                        .addGap(10, 10, 10)
                        .addGroup(jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpUUILayout.createSequentialGroup()
                                .addGroup(jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfUUIProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfUUIDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jlData))
                            .addComponent(jtfUUILength, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUUILayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jbSendUUI)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jpUUILayout.setVerticalGroup(
            jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUUILayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpUUILayout.createSequentialGroup()
                        .addGroup(jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDevice)
                            .addComponent(jtfUUIDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlData))
                        .addGap(18, 18, 18)
                        .addGroup(jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlProtocol)
                            .addComponent(jtfUUIProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpUUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLength)
                            .addComponent(jtfUUILength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jbSendUUI)
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("UUI", jpUUI);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpSocketConnection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpSocketConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Chamadas");

        jmTestes.setMnemonic('T');
        jmTestes.setText("Teste");
        jmTestes.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        jmiAsterisk.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        jmiAsterisk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/khomp/kami/images/ast_icon.png"))); // NOI18N
        jmiAsterisk.setMnemonic('A');
        jmiAsterisk.setText("Asterisk");
        jmiAsterisk.setToolTipText("");
        jmiAsterisk.setBorderPainted(true);
        jmiAsterisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAsteriskActionPerformed(evt);
            }
        });
        jmTestes.add(jmiAsterisk);

        jmiFreeSwitch.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        jmiFreeSwitch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/khomp/kami/images/fs_icon.png"))); // NOI18N
        jmiFreeSwitch.setMnemonic('F');
        jmiFreeSwitch.setText("FreeSwitch");
        jmiFreeSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFreeSwitchActionPerformed(evt);
            }
        });
        jmTestes.add(jmiFreeSwitch);

        jMenuBar1.add(jmTestes);

        jmAjuda.setMnemonic('S');
        jmAjuda.setText("Ajuda");
        jmAjuda.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        jmiAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/khomp/kami/images/ico_help.png"))); // NOI18N
        jmiAjuda.setText("Conteúdo Ajuda");
        jmiAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAjudaActionPerformed(evt);
            }
        });
        jmAjuda.add(jmiAjuda);

        jmiSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/khomp/kami/images/ico_sobre.png"))); // NOI18N
        jmiSobre.setText("Sobre");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jmAjuda.add(jmiSobre);

        jMenuBar1.add(jmAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFreeSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFreeSwitchActionPerformed
        aplicacao.teste("F");
    }//GEN-LAST:event_jmiFreeSwitchActionPerformed

    private void jmiAsteriskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAsteriskActionPerformed
        aplicacao.teste("A");
    }//GEN-LAST:event_jmiAsteriskActionPerformed

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
            System.out.println("error ping");
        } else {
            this.setCampos();
        }
    }//GEN-LAST:event_jbPingActionPerformed

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

    private void jbExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportActionPerformed
        JOptionPane.showMessageDialog(this, "not implemented yet!");
        conteudo.setEventText(jtaEvents.getText());
        aplicacao.exportLog();
    }//GEN-LAST:event_jbExportActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        aplicacao.sobre();
    }//GEN-LAST:event_jmiSobreActionPerformed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        JOptionPane.showMessageDialog(this, "not implemented yet!");
    }//GEN-LAST:event_jmiAjudaActionPerformed

    private void jtfServerPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfServerPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfServerPortActionPerformed

    private void jbSendUUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSendUUIActionPerformed
        conteudo.setUuiData(jtaUUIData.getText());
        conteudo.setUuiDevice(jtfUUIDevice.getText());
        conteudo.setUuiLength(jtfUUILength.getText());
        conteudo.setUuiProtocol(jtfUUIProtocol.getText());
        aplicacao.kSendUuiMessage();
    }//GEN-LAST:event_jbSendUUIActionPerformed

    private void jtfDeviceUSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDeviceUSSDActionPerformed
        conteudo.setUSSDDevice(jtfDeviceUSSD.getText());
        conteudo.setUSSDMessage(jtaMessageUSSD.getText());
        aplicacao.kSendUssdMessage();
    }//GEN-LAST:event_jtfDeviceUSSDActionPerformed

    private void jbSendUSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSendUSSDActionPerformed
        conteudo.setUSSDDevice(jtfDeviceUSSD.getText());
        conteudo.setUSSDMessage(jtaMessageUSSD.getText());
        aplicacao.kSendUssdMessage();
    }//GEN-LAST:event_jbSendUSSDActionPerformed

    private void jbSendSimSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSendSimSelectActionPerformed
        conteudo.setSimCardChannel(jtfChannelSim.getText());
        conteudo.setSimCardSelected(jcbSimCard.getSelectedIndex());
        aplicacao.kSendSimCardSelection();
    }//GEN-LAST:event_jbSendSimSelectActionPerformed

    private void jbClearSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearSMSActionPerformed
        jtaSMS.setText(null);
    }//GEN-LAST:event_jbClearSMSActionPerformed

    private void jbSendSmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSendSmsActionPerformed
        conteudo.setSmsText(jtaSMS.getText());
        conteudo.setChannel(jtfChannel.getText());
        conteudo.setNumber(jtfNumber.getText());
        conteudo.setConfirmation(jcbConfirmation.isSelected());
        boolean sendSms = aplicacao.kSendSMS();
    }//GEN-LAST:event_jbSendSmsActionPerformed

    private void jcbSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSMSActionPerformed
        boolean mark = jcbSMS.isSelected();
        if (!mark){
            jtaSMS.setText(null);
        }

        jpSMS.setEnabled(mark);
        jtaSMS.setEditable(mark);
        jbSendSms.setEnabled(mark);
        jbClearSMS.setEnabled(mark);
        jtaSMS.setEnabled(mark);
        jtaSMS.setEditable(mark);
        jcbConfirmation.setEnabled(mark);
        jcbAlertMsg.setEnabled(mark);
        jcbAsync.setEnabled(mark);
        jcbEncoding.setEnabled(mark);
        jcbLineFeed.setEnabled(mark);
        jcbWap.setEnabled(mark);
        jtfPort.setEnabled(mark);
    }//GEN-LAST:event_jcbSMSActionPerformed

    private void jcbSMSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbSMSItemStateChanged
        aplicacao.cbSMSischanged();
    }//GEN-LAST:event_jcbSMSItemStateChanged

    private void jbHangupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHangupActionPerformed
        int i = jtChannels.getSelectedRow();
        if (i > -1) {
            String actionID = jtChannels.getValueAt(i, 0).toString();
            String channel = jtChannels.getValueAt(i, 1).toString();

            if (aplicacao.kHangUp(actionID, channel)) {
                tableModel.onRemove(i);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione a linha da tabela.");
        }
    }//GEN-LAST:event_jbHangupActionPerformed

    private void jbCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCallActionPerformed
        
        int ret = -1;
        if (botao.equalsIgnoreCase("Ramal")) {
            conteudo.setNumber(jtfNumber.getText());
            conteudo.setChannel(jtfChannel.getText());
            conteudo.setContext(jtfApplication.getText());

            ret = aplicacao.makeCallRamal();
        } else {
            conteudo.setChannel(jtfChannel1.getText());
            //conteudo.setAplication(jtf)
        }
        // retorno positivo
        if ( ret == 1){
            jbHangup.setEnabled(true);
            // retorno de campo em branco
        } else if (ret == 0) {
            JOptionPane.showMessageDialog(this, "Existem campos em branco!");
            // retorno de falha no comando
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao enviar comando.");
        }
    }//GEN-LAST:event_jbCallActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        botao = buttonGroup1.getSelection().getActionCommand();
        //System.out.println(botao);
        conteudo.setCallOption(botao);
        opcao();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        botao = buttonGroup1.getSelection().getActionCommand();
        //System.out.println(botao);
        conteudo.setCallOption(botao);
        opcao();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jcbTech1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTech1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTech1ActionPerformed

    private void jcbRestrict1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbRestrict1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRestrict1ItemStateChanged

    private void jcbRestrict1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRestrict1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRestrict1ActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbCall;
    private javax.swing.JButton jbClearEvents;
    private javax.swing.JButton jbClearSMS;
    private javax.swing.JButton jbConnect;
    private javax.swing.JButton jbDisconnect;
    private javax.swing.JButton jbExport;
    private javax.swing.JButton jbHangup;
    private javax.swing.JButton jbPing;
    private javax.swing.JButton jbSendSimSelect;
    private javax.swing.JButton jbSendSms;
    private javax.swing.JButton jbSendUSSD;
    private javax.swing.JButton jbSendUUI;
    private javax.swing.JCheckBox jcbAlertMsg;
    private javax.swing.JCheckBox jcbAsync;
    private javax.swing.JCheckBox jcbConfirmation;
    private javax.swing.JComboBox jcbEncoding;
    private javax.swing.JCheckBox jcbLineFeed;
    private javax.swing.JCheckBox jcbRestrict1;
    private javax.swing.JCheckBox jcbSMS;
    private javax.swing.JComboBox jcbSimCard;
    private javax.swing.JComboBox jcbTech1;
    private javax.swing.JComboBox jcbWap;
    private javax.swing.JLabel jlApplication;
    private javax.swing.JLabel jlChannel;
    private javax.swing.JLabel jlChannel1;
    private javax.swing.JLabel jlChannelSim;
    private javax.swing.JLabel jlConnection;
    private javax.swing.JLabel jlContext1;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlDevice;
    private javax.swing.JLabel jlDeviceUSSD;
    private javax.swing.JLabel jlEncoding;
    private javax.swing.JLabel jlLength;
    private javax.swing.JLabel jlMessageUSSD;
    private javax.swing.JLabel jlNumber1;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlPort;
    private javax.swing.JLabel jlProtocol;
    private javax.swing.JLabel jlServerIP;
    private javax.swing.JLabel jlServerPort;
    private javax.swing.JLabel jlSimCard;
    private javax.swing.JLabel jlTech1;
    private javax.swing.JLabel jlUser;
    private javax.swing.JLabel jlWap;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmTestes;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JMenuItem jmiAsterisk;
    private javax.swing.JMenuItem jmiFreeSwitch;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JPanel jpCallApplication;
    private javax.swing.JPanel jpCallRamal;
    private javax.swing.JPanel jpEvents;
    private javax.swing.JPanel jpExtensions;
    private javax.swing.JPanel jpSMS;
    private javax.swing.JPanel jpSimCard;
    private javax.swing.JPanel jpSocketConnection;
    private javax.swing.JPanel jpStatus;
    private javax.swing.JPanel jpTable;
    private javax.swing.JPanel jpUSSD;
    private javax.swing.JPanel jpUUI;
    private javax.swing.JTable jtChannels;
    private javax.swing.JTextArea jtaEvents;
    private javax.swing.JTextArea jtaMessageUSSD;
    private javax.swing.JTextArea jtaSMS;
    private javax.swing.JTextArea jtaUUIData;
    private javax.swing.JTextField jtfApplication;
    private javax.swing.JTextField jtfChannel;
    private javax.swing.JTextField jtfChannel1;
    private javax.swing.JTextField jtfChannelSim;
    private javax.swing.JTextField jtfContext1;
    private javax.swing.JTextField jtfData;
    private javax.swing.JTextField jtfDeviceUSSD;
    private javax.swing.JTextField jtfNumber;
    private javax.swing.JPasswordField jtfPassword;
    private javax.swing.JTextField jtfPort;
    private javax.swing.JTextField jtfServerIP;
    private javax.swing.JTextField jtfServerPort;
    private javax.swing.JTextField jtfUUIDevice;
    private javax.swing.JTextField jtfUUILength;
    private javax.swing.JTextField jtfUUIProtocol;
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

    @Override
    public void update(Observable o, Object arg) {
        jtaEvents.setText(conteudo.getEventText());
    }

    private void opcao() {
        if(botao.equalsIgnoreCase("ramal")){
            System.out.println("opcao1");
            jpCallApplication.setVisible(false);
            jpCallRamal.setVisible(true);
        } else {
            System.out.println("opcao2");
            jpCallRamal.setVisible(false);
            jpCallApplication.setVisible(true);
        }
    }

}
