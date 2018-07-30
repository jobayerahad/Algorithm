package algorithm;

import java.awt.print.Book;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ahad
 */
public class SearchApp extends javax.swing.JFrame {

    /**
     * Creates new form SearchApp
     */
    DefaultTableModel model ;
    public SearchApp() {
        initComponents();
        StartPage.CenteredFrame(this);
        model = new DefaultTableModel();
        tableInfo.setModel(model);
        tableInfo.setVisible(false);
        showTable.setVisible(false);
        tableLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        showTable = new javax.swing.JButton();
        button = new javax.swing.JButton();
        tableLabel = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        output = new javax.swing.JLabel();
        lvlName = new javax.swing.JLabel();
        lvlInfo = new javax.swing.JLabel();
        searchingAlgorithmList = new javax.swing.JComboBox<>();
        lvlSearching = new javax.swing.JLabel();
        timeTaken = new javax.swing.JLabel();
        lvlName1 = new javax.swing.JLabel();
        inputSearch = new javax.swing.JTextField();
        lvlInfo1 = new javax.swing.JLabel();
        arraySortOrNOt = new javax.swing.JLabel();
        startPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableInfo);

        showTable.setText("Show");
        showTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTableActionPerformed(evt);
            }
        });

        button.setText("Search");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        tableLabel.setText("Click \"Show\" to See Other Algorithm's Time Taken for Your Numbers");

        input.setToolTipText("");
        input.setSelectionColor(new java.awt.Color(51, 204, 255));

        lvlName.setText("Enter an Array : ");

        lvlInfo.setText("(Separate numbers with just a space)");

        searchingAlgorithmList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select any --", "Linear Search", "Binary Search", "Jump Search", "Interpolation Search", "Exponential Search" }));

        lvlSearching.setText("Select Searching Algorithm :");

        lvlName1.setText("Enter a number for search in array : ");

        inputSearch.setToolTipText("");
        inputSearch.setSelectionColor(new java.awt.Color(51, 204, 255));

        lvlInfo1.setText("*By default, we sort your array with merge sort");

        startPage.setText("Back to Start Page");
        startPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tableLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showTable))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startPage)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lvlName)
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(86, 86, 86)
                                            .addComponent(button)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lvlInfo))
                                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(timeTaken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lvlName1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lvlSearching)
                                    .addGap(82, 82, 82)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lvlInfo1)
                                        .addComponent(searchingAlgorithmList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(arraySortOrNOt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlName)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvlInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlName1)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchingAlgorithmList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlSearching))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvlInfo1)
                .addGap(29, 29, 29)
                .addComponent(arraySortOrNOt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeTaken, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showTable)
                    .addComponent(tableLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String string;
    LinearSearch lSearch;
    BinarySearch bSearch;
    JumpSearch jSearch;
    InterpolationSearch iSearch;
    ExponentialSearch eSearch;
    MergeSorting mSort;
    int algoNum;
    String linearTime, binaryTime, jumpTime, interpolationTime, exponentialTime;
    int linearResult, binaryResult, jumpResult, interpolationResult, exponentialResult;
    int searchItem;
    
    private void showTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTableActionPerformed
        if (input.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter numbers separated with space", "Message", JOptionPane.WARNING_MESSAGE);
            input.requestFocus();
        } else if (inputSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter number for Search", "Message", JOptionPane.WARNING_MESSAGE);
            inputSearch.requestFocus();
        } else if (searchingAlgorithmList.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select any algorithm", "Message", JOptionPane.INFORMATION_MESSAGE);
            searchingAlgorithmList.requestFocus();
        } else if (output.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Sort The Array First", "Notice", JOptionPane.INFORMATION_MESSAGE);
            button.requestFocus();
        } else {
            string = input.getText();
            algoNum = searchingAlgorithmList.getSelectedIndex();
            String strarray[] = string.split(" ") ;
            int[] integers = new int[strarray.length];
            for (int i = 0; i < integers.length; i++){
                integers[i] = Integer.parseInt(strarray[i]);
            }
            mSort.mergeSort(integers);
            searchItem = Integer.parseInt(inputSearch.getText());

            long startTime = System.nanoTime();
            linearResult = lSearch.search(integers, integers.length, searchItem);
            long stopTime = System.nanoTime();
            linearTime = String.valueOf((stopTime-startTime)/1000);

            startTime = System.nanoTime();
            binaryResult = bSearch.binarySearch(searchItem, integers);
            stopTime = System.nanoTime();
            binaryTime = String.valueOf((stopTime-startTime)/1000);

            startTime = System.nanoTime();
            jumpResult = jSearch.jumpSearch(integers, searchItem);
            stopTime = System.nanoTime();
            jumpTime = String.valueOf((stopTime-startTime)/1000);

            startTime = System.nanoTime();
            interpolationResult = iSearch.interpolationSearch(integers, searchItem);
            stopTime = System.nanoTime();
            interpolationTime = String.valueOf((stopTime-startTime)/1000);

            startTime = System.nanoTime();
            exponentialResult = eSearch.exponentialSearch(integers, integers.length, searchItem);
            stopTime = System.nanoTime();
            exponentialTime = String.valueOf((stopTime-startTime)/1000);

            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("Linear Search", linearTime);
            hm.put("Binary Search", binaryTime);
            hm.put("Jump Search", jumpTime);
            hm.put("Interpolation Search", interpolationTime);
            hm.put("Exponential Search", exponentialTime);

            int[] tableValues = new int[4] ;
            int cols = tableInfo.getColumnCount();
            if (cols <= 3) {
                int i = 0;
                for(Map.Entry<String, String> entry:hm.entrySet()) {
                    if(entry.getKey() != searchingAlgorithmList.getSelectedItem().toString()) {
                        model.addColumn(entry.getKey());
                        tableValues[i] = Integer.parseInt(entry.getValue());
                        i++;
                    }
                }
                model.addRow(new Object[] {tableValues[0], tableValues[1], tableValues[2], tableValues[3]});
            }
        }
    }//GEN-LAST:event_showTableActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        if (input.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter numbers separated with space", "Message", JOptionPane.WARNING_MESSAGE);
            input.requestFocus();
        } else if (inputSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter number for Search", "Message", JOptionPane.WARNING_MESSAGE);
            inputSearch.requestFocus();
        } else if (searchingAlgorithmList.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select any algorithm", "Message", JOptionPane.INFORMATION_MESSAGE);
            searchingAlgorithmList.requestFocus();
        } else {
            tableInfo.setVisible(true);
            showTable.setVisible(true);
            tableLabel.setVisible(true);

            string = input.getText();
            algoNum = searchingAlgorithmList.getSelectedIndex();
            String strarray[] = string.split(" ") ;
            int[] integers = new int[strarray.length];
            for (int i = 0; i < integers.length; i++){
                integers[i] = Integer.parseInt(strarray[i]);
            }
            if (algoNum != 1) {
                mSort.mergeSort(integers);
            }
            searchItem = Integer.parseInt(inputSearch.getText());

            if(algoNum == 1) {
                long startTime = System.nanoTime();
                linearResult = lSearch.search(integers, integers.length, searchItem);
                long stopTime = System.nanoTime();
                linearTime = String.valueOf((stopTime-startTime)/1000);
                timeTaken.setText("Time taken : "+linearTime+ " microseconds");
                String value = "Searched in Unsorted Array : ";
                for (int i: integers) {
                    value+= i+", ";
                }
                arraySortOrNOt.setText(value);
                if (linearResult != -1) {
                    output.setText(searchItem+" found at index "+linearResult);
                } else {
                    output.setText(searchItem+" not found in array.");
                }
            } else if (algoNum == 2) {
                long startTime = System.nanoTime();
                binaryResult = bSearch.binarySearch(searchItem, integers);
                long stopTime = System.nanoTime();
                binaryTime = String.valueOf((stopTime-startTime)/1000);
                timeTaken.setText("Time taken : "+binaryResult+ " microseconds");
                String value = "Searched in Sorted Array : ";
                for (int i: integers) {
                    value+= i+", ";
                }
                arraySortOrNOt.setText(value);
                if (binaryResult != -1) {
                    output.setText(searchItem+" found at index "+binaryResult);
                } else {
                    output.setText(searchItem+" not found in array.");
                }
            } else if (algoNum == 3) {
                long startTime = System.nanoTime();
                jumpResult = jSearch.jumpSearch(integers, searchItem);
                long stopTime = System.nanoTime();
                jumpTime = String.valueOf((stopTime-startTime)/1000);
                timeTaken.setText("Time taken : "+jumpTime+ " microseconds");
                String value = "Searched in Sorted Array : ";
                for (int i: integers) {
                    value+= i+", ";
                }
                arraySortOrNOt.setText(value);
                if (jumpResult != -1) {
                    output.setText(searchItem+" found at index "+jumpResult);
                } else {
                    output.setText(searchItem+" not found in array.");
                }
            } else if (algoNum == 4) {
                long startTime = System.nanoTime();
                interpolationResult = iSearch.interpolationSearch(integers, searchItem);
                long stopTime = System.nanoTime();
                interpolationTime = String.valueOf((stopTime-startTime)/1000);
                timeTaken.setText("Time taken : "+interpolationTime+ " microseconds");
                String value = "Searched in Sorted Array : ";
                for (int i: integers) {
                    value+= i+", ";
                }
                arraySortOrNOt.setText(value);
                if (interpolationResult != -1) {
                    output.setText(searchItem+" found at index "+interpolationResult);
                } else {
                    output.setText(searchItem+" not found in array.");
                }
            } else if (algoNum == 5) {
                long startTime = System.nanoTime();
                exponentialResult = eSearch.exponentialSearch(integers, integers.length, searchItem);
                long stopTime = System.nanoTime();
                exponentialTime = String.valueOf((stopTime-startTime)/1000);
                timeTaken.setText("Time taken : "+exponentialTime+ " microseconds");
                String value = "Searched in Sorted Array : ";
                for (int i: integers) {
                    value+= i+", ";
                }
                arraySortOrNOt.setText(value);
                if (exponentialResult != -1) {
                    output.setText(searchItem+" found at index "+exponentialResult);
                } else {
                    output.setText(searchItem+" not found in array.");
                }
            }
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void startPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPageActionPerformed
        StartPage sp = new StartPage();
        sp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startPageActionPerformed

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
            java.util.logging.Logger.getLogger(SearchApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arraySortOrNOt;
    private javax.swing.JButton button;
    private javax.swing.JTextField input;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lvlInfo;
    private javax.swing.JLabel lvlInfo1;
    private javax.swing.JLabel lvlName;
    private javax.swing.JLabel lvlName1;
    private javax.swing.JLabel lvlSearching;
    private javax.swing.JLabel output;
    private javax.swing.JComboBox<String> searchingAlgorithmList;
    private javax.swing.JButton showTable;
    private javax.swing.JButton startPage;
    private javax.swing.JTable tableInfo;
    private javax.swing.JLabel tableLabel;
    private javax.swing.JLabel timeTaken;
    // End of variables declaration//GEN-END:variables
}