package potatobeetlesapp;

import java.awt.Color;

public class UserPanel extends javax.swing.JPanel {

    private Field field;
    
    public UserPanel() {
        initComponents();
    }
    
    public void setField(Field newField) {
        field = newField;
    }

    private void updateInfo() {
        if (field != null) {
            countPotatoLabel.setText(String.valueOf(field.getPotatoNumber()));
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        countWeekLabel = new javax.swing.JLabel();
        alivePlantsLabel = new javax.swing.JLabel();
        deadPlantsLabel = new javax.swing.JLabel();
        potatoLabel = new javax.swing.JLabel();
        weekLabel = new javax.swing.JLabel();
        countAlivePlantsLabel = new javax.swing.JLabel();
        countInfectPlantsLabel = new javax.swing.JLabel();
        countDiedPlantsLabel = new javax.swing.JLabel();
        infectedPlantsLabel = new javax.swing.JLabel();
        countPotatoLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        numTubersLabel = new javax.swing.JLabel();
        numPlantsLabel = new javax.swing.JLabel();
        collectBugsLabel = new javax.swing.JLabel();
        collectBugsToggleButton = new javax.swing.JToggleButton();
        effTubersLabel = new javax.swing.JLabel();
        effPlantsLabel = new javax.swing.JLabel();
        numTubersSpinner = new javax.swing.JSpinner();
        numPlantsSpinner = new javax.swing.JSpinner();
        effTubersSpinner = new javax.swing.JSpinner();
        effPlantsSpinner = new javax.swing.JSpinner();
        stepButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        infoPanel.setBackground(new java.awt.Color(255, 255, 255));
        infoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Информация", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14))); // NOI18N

        countWeekLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        countWeekLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countWeekLabel.setText("0");

        alivePlantsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        alivePlantsLabel.setText("Число живых растений");

        deadPlantsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        deadPlantsLabel.setText("Число погибших растений");
        deadPlantsLabel.setToolTipText("");

        potatoLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        potatoLabel.setText("Прогнозируемый урожай");
        potatoLabel.setToolTipText("");

        weekLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        weekLabel.setText("Неделя");

        countAlivePlantsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        countAlivePlantsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countAlivePlantsLabel.setText("0");

        countInfectPlantsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        countInfectPlantsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countInfectPlantsLabel.setText("0");

        countDiedPlantsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        countDiedPlantsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countDiedPlantsLabel.setText("0");

        infectedPlantsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        infectedPlantsLabel.setText("Число заражённых растений");

        countPotatoLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        countPotatoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countPotatoLabel.setText("0");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(weekLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countWeekLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(alivePlantsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countAlivePlantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(infectedPlantsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countInfectPlantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(potatoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countPotatoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(deadPlantsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countDiedPlantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekLabel)
                    .addComponent(countWeekLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alivePlantsLabel)
                    .addComponent(countAlivePlantsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infectedPlantsLabel)
                    .addComponent(countInfectPlantsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deadPlantsLabel)
                    .addComponent(countDiedPlantsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potatoLabel)
                    .addComponent(countPotatoLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resetButton.setText("Сброс");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        settingsPanel.setBackground(new java.awt.Color(255, 255, 255));
        settingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Параметры", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 2, 14))); // NOI18N

        numTubersLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        numTubersLabel.setText("Число обработанных клубней");

        numPlantsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        numPlantsLabel.setText("Число обработанных растений");

        collectBugsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        collectBugsLabel.setText("Сбор жуков");

        collectBugsToggleButton.setText("Включить");
        collectBugsToggleButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                collectBugsToggleButtonStateChanged(evt);
            }
        });

        effTubersLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        effTubersLabel.setText("Эффективность обработки клубней (%)");

        effPlantsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        effPlantsLabel.setText("Эффективность обработки растений (%)");

        numTubersSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 130, 1));

        numPlantsSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 130, 1));

        effTubersSpinner.setModel(new javax.swing.SpinnerNumberModel(90, 0, 100, 1));

        effPlantsSpinner.setModel(new javax.swing.SpinnerNumberModel(60, 0, 100, 1));

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numTubersLabel)
                            .addComponent(numPlantsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numTubersSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numPlantsSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(effTubersLabel)
                            .addComponent(effPlantsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(effTubersSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(effPlantsSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(collectBugsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(collectBugsToggleButton)))
                .addContainerGap())
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numTubersLabel)
                    .addComponent(numTubersSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPlantsLabel)
                    .addComponent(numPlantsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(effTubersLabel)
                    .addComponent(effTubersSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(effPlantsLabel)
                    .addComponent(effPlantsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collectBugsLabel)
                    .addComponent(collectBugsToggleButton))
                .addGap(13, 13, 13))
        );

        stepButton.setText("Шаг");

        startButton.setText("Старт");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        stopButton.setText("Стоп");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(stopButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stepButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stopButton)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stepButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //Нажатие кнопки "Сброс"
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        numTubersSpinner.setValue(0);
        numPlantsSpinner.setValue(0);
        effTubersSpinner.setValue(90);
        effPlantsSpinner.setValue(60);
        collectBugsToggleButton.setSelected(false);
    }//GEN-LAST:event_resetButtonActionPerformed
    
    //Нажатие кнопки включения/выключения сбора жуков
    private void collectBugsToggleButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_collectBugsToggleButtonStateChanged
        if (collectBugsToggleButton.isSelected()) {
            collectBugsToggleButton.setText("Выключить");
        }
        else {
            collectBugsToggleButton.setText("Включить");
        }
    }//GEN-LAST:event_collectBugsToggleButtonStateChanged

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
        updateInfo();
    }//GEN-LAST:event_startButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alivePlantsLabel;
    private javax.swing.JLabel collectBugsLabel;
    private javax.swing.JToggleButton collectBugsToggleButton;
    private javax.swing.JLabel countAlivePlantsLabel;
    private javax.swing.JLabel countDiedPlantsLabel;
    private javax.swing.JLabel countInfectPlantsLabel;
    private javax.swing.JLabel countPotatoLabel;
    private javax.swing.JLabel countWeekLabel;
    private javax.swing.JLabel deadPlantsLabel;
    private javax.swing.JLabel effPlantsLabel;
    private javax.swing.JSpinner effPlantsSpinner;
    private javax.swing.JLabel effTubersLabel;
    private javax.swing.JSpinner effTubersSpinner;
    private javax.swing.JLabel infectedPlantsLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel numPlantsLabel;
    private javax.swing.JSpinner numPlantsSpinner;
    private javax.swing.JLabel numTubersLabel;
    private javax.swing.JSpinner numTubersSpinner;
    private javax.swing.JLabel potatoLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stepButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel weekLabel;
    // End of variables declaration//GEN-END:variables
}
