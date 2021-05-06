/***  Mason Porter-Brown
 *    mp3902@bard.edu
 *    3/23/20
 *    Moderation Project- Creating a GUI for the Guitar Hero Class
 */

//THIS CLASS CONTAINS MY WORK FOR THE MODERATION PROJECT//

package com.company;

import edu.princeton.cs.algs4.StdAudio;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class PianoGUI extends javax.swing.JFrame {
    public static GuitarString[] gtrStrings = new GuitarString[49];
    private static int keyTemp;
    public static int octave = 1;

    //Constructor for the PianoGUI
    public PianoGUI() {
        initComponents();
    }

    //The initComponents create the form of the GUI (JPanels, Jbuttons, JLabels)
    @SuppressWarnings("unchecked")
    private void initComponents() {
        JButton7 = new javax.swing.JButton();
        JButton11 = new javax.swing.JButton();
        JButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        JButton2 = new javax.swing.JButton();
        JButton13 = new javax.swing.JButton();
        JButton1 = new javax.swing.JButton();
        JButton3 = new javax.swing.JButton();
        JButton5 = new javax.swing.JButton();
        JButton6 = new javax.swing.JButton();
        JButton8 = new javax.swing.JButton();
        JButton10 = new javax.swing.JButton();
        JButton12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButton7.setBackground(new java.awt.Color(0, 0, 0));
        JButton7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton7.setForeground(new java.awt.Color(153, 153, 153));
        JButton7.setText("T");
        JButton7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton7ActionPerformed(evt);
            }
        });
        JButton7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("T"), "pluck7");
        JButton7.getActionMap().put("pluck7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(6);
            }
        });
        getContentPane().add(JButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 90, 170));

        JButton11.setBackground(new java.awt.Color(0, 0, 0));
        JButton11.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton11.setForeground(new java.awt.Color(153, 153, 153));
        JButton11.setText("U");
        JButton11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton11.setFocusable(true);
        JButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton11ActionPerformed(evt);
            }
        });
        JButton11.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("U"), "pluck11");
        JButton11.getActionMap().put("pluck11", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(10);
            }
        });
        getContentPane().add(JButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 90, 170));

        JButton4.setBackground(new java.awt.Color(0, 0, 0));
        JButton4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton4.setForeground(new java.awt.Color(153, 153, 153));
        JButton4.setText("E");
        JButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton4ActionPerformed(evt);
            }
        });
        JButton4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("E"), "pluck4");
        JButton4.getActionMap().put("pluck4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(3);
            }
        });
        getContentPane().add(JButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 90, 170));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(153, 153, 153));
        jButton9.setText("Y");
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("Y"), "pluck9");
        jButton9.getActionMap().put("pluck9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(8);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 90, 170));

        JButton2.setBackground(new java.awt.Color(0, 0, 0));
        JButton2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton2.setForeground(new java.awt.Color(153, 153, 153));
        JButton2.setText("W");
        JButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton2ActionPerformed(evt);
            }
        });
        JButton2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "pluck2");
        JButton2.getActionMap().put("pluck2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(1);
            }
        });
        getContentPane().add(JButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 90, 170));

        JButton13.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton13.setForeground(new java.awt.Color(153, 153, 153));
        JButton13.setText("K");
        JButton13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton13ActionPerformed(evt);
            }
        });
        JButton13.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("K"), "pluck13");
        JButton13.getActionMap().put("pluck13", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(12);
            }
        });
        getContentPane().add(JButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 90, 200));

        JButton1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton1.setForeground(new java.awt.Color(153, 153, 153));
        JButton1.setText("A");
        JButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton1.setFocusable(true);
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton1ActionPerformed(evt);
            }
        });
        JButton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "pluck1");
        JButton1.getActionMap().put("pluck1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(0);
            }
        });
        getContentPane().add(JButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, 200));

        JButton3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton3.setForeground(new java.awt.Color(153, 153, 153));
        JButton3.setText("S");
        JButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton3ActionPerformed(evt);
            }
        });
        JButton3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "pluck3");
        JButton3.getActionMap().put("pluck3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(2);
            }
        });
        getContentPane().add(JButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 90, 200));

        JButton5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton5.setForeground(new java.awt.Color(153, 153, 153));
        JButton5.setText("D");
        JButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton5ActionPerformed(evt);
            }
        });
        JButton5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "pluck5");
        JButton5.getActionMap().put("pluck5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(4);
            }
        });
        getContentPane().add(JButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 90, 200));

        JButton6.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton6.setForeground(new java.awt.Color(153, 153, 153));
        JButton6.setText("F");
        JButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton6ActionPerformed(evt);
            }
        });
        JButton6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F"), "pluck6");
        JButton6.getActionMap().put("pluck6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(5);
            }
        });
        getContentPane().add(JButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 90, 200));

        JButton8.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton8.setForeground(new java.awt.Color(153, 153, 153));
        JButton8.setText("G");
        JButton8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton8ActionPerformed(evt);
            }
        });
        JButton8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("G"), "pluck8");
        JButton8.getActionMap().put("pluck8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(7);
            }
        });
        getContentPane().add(JButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 90, 200));

        JButton10.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton10.setForeground(new java.awt.Color(153, 153, 153));
        JButton10.setText("H");
        JButton10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton10ActionPerformed(evt);
            }
        });
        JButton10.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("H"), "pluck10");
        JButton10.getActionMap().put("pluck10", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(9);
            }
        });
        getContentPane().add(JButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 90, 200));

        JButton12.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        JButton12.setForeground(new java.awt.Color(153, 153, 153));
        JButton12.setText("J");
        JButton12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton12ActionPerformed(evt);
            }
        });
        JButton12.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("J"), "pluck12");
        JButton12.getActionMap().put("pluck12", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pluck(11);
            }
        });
        getContentPane().add(JButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 90, 200));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(102, 102, 0));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 187, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 164, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 159, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 258, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 155, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        jButton1.setText("Octave Down");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        jButton2.setText("Octave Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setText("Octave:" + octave);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(26, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(66, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(520, 520, 520)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(335, 335, 335)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(157, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(340, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(655, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(59, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(176, 176, 176)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(179, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Phosphate", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("Piano GUI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(jLabel1)
                                .addContainerGap(299, Short.MAX_VALUE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 460));

        pack();
    }// </editor-fold>

    //Creates all of the string objects in the GuitarStrings Array
    public static void createStrings() {
        for (int i = 0; i < gtrStrings.length; i++) {
            double temp = (130.81) * (Math.pow(1.05956, i - 24));
            gtrStrings[i] = new GuitarString(temp);
        }
    }

    //Creates and plays the musical tone from Std Audio
    public static void play() {
        while (true) {
            // compute the superposition of samples
            double sample = 0;
            if (keyTemp != -1 && keyTemp < gtrStrings.length) {
                sample = gtrStrings[keyTemp].sample() + sample;
            }

            // play the sample on standard audio
            StdAudio.play(sample);

            // advance the simulation of each guitar string by one step
            if (keyTemp != -1 && keyTemp < gtrStrings.length) {
                gtrStrings[keyTemp].tic();
            }
        }
    }

    //Initiates the given guitarString[i] and adjusts which guitar string is plucked based on the octave value
    public static void pluck(int i) {
        if (octave == 0) {
            keyTemp = i;
            gtrStrings[i].pluck();
        } else if (octave == 1) {
            keyTemp = i + 12;
            gtrStrings[i + 12].pluck();
        } else if (octave == 2) {
            keyTemp = i + 24;
            gtrStrings[i + 24].pluck();
        } else if (octave == 3) {
            keyTemp = i + 36;
            gtrStrings[i + 36].pluck();
        }
    }

    //All JButtonActionPerformed methods below are called when a button is clicked with the mouse

    //These are the two octave buttons. They increment or decrement the octave value which is then used in pluck to
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (octave > 0) {
            octave = octave - 1;
        } else {
            System.out.println("Lowest Octave");
        }
        jLabel2.setText("Octave:" + octave);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (octave < 3) {
            octave = octave + 1;
        } else {
            System.out.println("Highest Octave");
        }
        jLabel2.setText("Octave:" + octave);
    }

    //Each JButton action below corresponds to a different note on the keyboard
    private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(0);
    }

    private void JButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(1);
    }

    private void JButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(2);
    }

    private void JButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(3);
    }

    private void JButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(4);
    }

    private void JButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(5);
    }

    private void JButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(6);
    }

    private void JButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(7);
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(8);
    }

    private void JButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(9);
    }

    private void JButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(10);
    }

    private void JButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(11);
    }

    private void JButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        pluck(12);
    }

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
            java.util.logging.Logger.getLogger(PianoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PianoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PianoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PianoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PianoGUI().setVisible(true);
            }
        });
        createStrings();
        play();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton JButton1;
    private javax.swing.JButton JButton10;
    private javax.swing.JButton JButton11;
    private javax.swing.JButton JButton12;
    private javax.swing.JButton JButton13;
    private javax.swing.JButton JButton2;
    private javax.swing.JButton JButton3;
    private javax.swing.JButton JButton4;
    private javax.swing.JButton JButton5;
    private javax.swing.JButton JButton6;
    private javax.swing.JButton JButton7;
    private javax.swing.JButton JButton8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
}