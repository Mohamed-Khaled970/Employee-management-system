/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author El-Wattaneya
 */
public class EmployeeManagementForm extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeManagementForm
     */
    public EmployeeManagementForm() {
        initComponents();
        loadEmployeeTypes(); // تحميل أنواع الموظفين عند بدء البرنامج
        loadDepartments(); // تحميل الأقسام عند بدء البرنامج
        loadEmployeesInTable();
        loadDepartmentsInTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add Employee");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("First Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Salary Or Hourly Rate");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Hours Worked");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Employee Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Department");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Employee", jPanel1);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("All Employees In The System");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Salary Or Hourly Rate", "Employee Type", "Department"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Display All Employees", jPanel2);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("All Departments In The System");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel12)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("All Department", jPanel4);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Enter Employee Id To Calculate The Salary");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Employee Id");

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Total Salary");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(40, 40, 40)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel9)
                .addGap(113, 113, 113)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Payroll", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // الحصول على ID الموظف من jTextField5
            int employeeId = Integer.parseInt(jTextField5.getText());

            // 1. استرجاع بيانات الموظف من قاعدة البيانات
            String query = "SELECT salary_or_hourly_rate, COALESCE(hours_worked, 1) AS hours_worked FROM Employee WHERE id = ?";

            // الاتصال بقاعدة البيانات
            String connectionString = DatabaseHelper.getInstance().getConnectionString();
            Connection connection = DriverManager.getConnection(connectionString);

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employeeId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // الحصول على البيانات
                double salaryOrHourlyRate = resultSet.getDouble("salary_or_hourly_rate");
                int hoursWorked = resultSet.getInt("hours_worked");

                // حساب الراتب
                double salary = salaryOrHourlyRate * hoursWorked;

                // عرض الراتب في jTextField6
                jTextField6.setText(String.valueOf(salary));
            } else {
                // إذا لم يتم العثور على الموظف
                JOptionPane.showMessageDialog(null, "Employee not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // إغلاق الاتصال
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (NumberFormatException e) {
            // معالجة الخطأ إذا كان الـ ID غير صحيح
            JOptionPane.showMessageDialog(null, "Invalid Employee ID format", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            // معالجة الأخطاء أثناء الاتصال بقاعدة البيانات
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // معالجة الأخطاء الأخرى
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // 1. الحصول على البيانات من حقول الإدخال
            String firstName = jTextField1.getText();
            String lastName = jTextField2.getText();
            double salaryOrHourlyRate;
            try {
                salaryOrHourlyRate = Double.parseDouble(jTextField3.getText());
            } catch (NumberFormatException ex) {
                // معالجة خطأ تحويل الراتب إلى رقم
                throw new Exception("Invalid salary format.");
            }

            int hoursWorked = 0; // القيمة الافتراضية لعدد ساعات العمل
            String employeeType = (String) jComboBox1.getSelectedItem();

            // التحقق إذا كان النوع جزئي أو بالساعة، وإذا كانت الخانة فارغة
            if (!employeeType.equalsIgnoreCase("Full Time Employee")) {
                String hoursText = jTextField4.getText();
                if (hoursText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Since the employee type is " + employeeType + ", hours worked cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // إيقاف تنفيذ الكود إذا كانت القيمة فارغة
                }
                try {
                    hoursWorked = Integer.parseInt(hoursText);
                } catch (NumberFormatException ex) {
                    // معالجة خطأ تحويل عدد ساعات العمل إلى رقم
                    throw new Exception("Invalid hours worked format.");
                }
            }

            String departmentName = (String) jComboBox2.getSelectedItem();

            // 2. إنشاء كائن Employee باستخدام Factory Pattern
            Employee employee = EmployeeFactory.createEmployee(employeeType, firstName, lastName, salaryOrHourlyRate, hoursWorked);

            // 3. الحصول على معرف القسم من قاعدة البيانات
            int departmentId = getDepartmentId(departmentName);

            // 4. حفظ بيانات الموظف في قاعدة البيانات
            String connectionString = DatabaseHelper.getInstance().getConnectionString();
            connection = DriverManager.getConnection(connectionString);

            String query = "INSERT INTO Employee (first_name, last_name, salary_or_hourly_rate, hours_worked, employee_type, department_id) VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setDouble(3, employee.getSalaryOrHourlyRate());

            // تعيين عدد ساعات العمل إذا كان الموظف جزئيًا أو بالساعة
            if (employee instanceof PartTimeEmployee || employee instanceof HourlyEmployee) {
                preparedStatement.setInt(4, hoursWorked);
            } else {
                preparedStatement.setNull(4, java.sql.Types.INTEGER); // تعيين القيمة NULL للموظف الدائم
            }

            preparedStatement.setString(5, employee.getType());
            preparedStatement.setInt(6, departmentId);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Employee added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // استدعاء دالة تحميل الموظفين من قاعدة البيانات وتحديث الجدول
            loadEmployeesInTable();

            // مسح الحقول تلقائيًا بعد النجاح
            jTextField1.setText(""); // مسح حقل الاسم الأول
            jTextField2.setText(""); // مسح حقل الاسم الأخير
            jTextField3.setText(""); // مسح حقل الراتب أو الأجر بالساعة
            jTextField4.setText(""); // مسح حقل عدد ساعات العمل
            jComboBox1.setSelectedIndex(0); // إعادة تعيين الـ JComboBox للاختيار الافتراضي
            jComboBox2.setSelectedIndex(0); // إعادة تعيين الـ JComboBox للاختيار الافتراضي

        } catch (SQLException e) {
            e.printStackTrace();  // يمكنك عرض رسالة خطأ هنا
            JOptionPane.showMessageDialog(null, "Error while saving the employee data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace(); // معالجة الأخطاء الأخرى وعرض رسالة مناسبة
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // في حال حدوث خطأ في غلق الاتصال أو الـ PreparedStatement
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
private Connection connection;

private void openConnection() throws SQLException {
    // فتح الاتصال فقط إذا لم يكن مفتوحًا بالفعل
    if (connection == null || connection.isClosed()) {
        connection = DriverManager.getConnection(DatabaseHelper.getInstance().getConnectionString());
    }
}

private void closeConnection() {
    // غلق الاتصال فقط إذا كان مفتوحًا
    if (connection != null) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    private void loadEmployeeTypes() {
        // إنشاء model لإضافة أنواع الموظفين
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        // إضافة أنواع الموظفين إلى الـ JComboBox
        model.addElement("Full Time Employee");
        model.addElement("Part Time Employee");
        model.addElement("Hourly Employee");

        jComboBox1.setModel(model);

        
    }
    
private void loadEmployeesInTable() {
    String[] columnNames = {"Id","First Name", "Last Name", "Salary Or Hourly Rate", "Employee Type", "Department"};
    DefaultTableModel model2 = new DefaultTableModel(columnNames, 0);

    try {
        openConnection();  // فتح الاتصال
        Statement statement = connection.createStatement();
        String query = "SELECT Employee.id, first_name, last_name, salary_or_hourly_rate, employee_type, department_name FROM Employee INNER JOIN Department ON Employee.department_id = Department.id";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            double salaryOrHourlyRate = resultSet.getDouble("salary_or_hourly_rate");
            String employeeType = resultSet.getString("employee_type");
            String departmentName = resultSet.getString("department_name");

            model2.addRow(new Object[]{id, firstName, lastName, salaryOrHourlyRate, employeeType, departmentName});
        }

        jTable1.setModel(model2);

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        closeConnection();  // غلق الاتصال بعد الانتهاء
    }
}
private void loadDepartmentsInTable() {
    // أسماء الأعمدة الخاصة بجدول الأقسام
    String[] columnNames = {"Id", "Department Name", "Description"};
    DefaultTableModel model2 = new DefaultTableModel(columnNames, 0);

    try {
        openConnection();  // فتح الاتصال
        Statement statement = connection.createStatement();
        // استعلام SQL لجلب بيانات الأقسام
        String query = "SELECT id, department_name, description FROM Department";
        ResultSet resultSet = statement.executeQuery(query);

        // تعبئة البيانات في النموذج
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String departmentName = resultSet.getString("department_name");
            String description = resultSet.getString("description");

            // إضافة الصف إلى النموذج
            model2.addRow(new Object[]{id, departmentName, description});
        }

        // تعيين النموذج إلى الجدول jTable2
        jTable2.setModel(model2);

    } catch (SQLException e) {
        // معالجة الأخطاء
        e.printStackTrace();
    } finally {
        closeConnection();  // غلق الاتصال بعد الانتهاء
    }
}


    private void loadDepartments() {
        try {
            // الحصول على connection string من الـ helper
            String connectionString = DatabaseHelper.getInstance().getConnectionString();
            System.out.println("Connection String: " + connectionString);

            // إنشاء الاتصال بقاعدة البيانات
            Connection connection = DriverManager.getConnection(connectionString);

            // استعلام لجلب أسماء الأقسام
            String query = "SELECT department_name FROM Department";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // إنشاء model لإضافة الأقسام
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

            // إضافة أسماء الأقسام إلى الـ JComboBox
            while (resultSet.next()) {
                String departmentName = resultSet.getString("department_name");
                model.addElement(departmentName);
            }

            // تعيين الـ model إلى الـ JComboBox
            jComboBox2.setModel(model);

            // تعيين الـ JComboBox لعدم وجود عنصر افتراضي
           // jComboBox2.setSelectedIndex(-1);

            // إغلاق الاتصال والـ Statement والـ ResultSet
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();  // يمكن عرض رسالة خطأ هنا
        }
    }
    
    
  private int getDepartmentId(String departmentName) throws SQLException {
    String connectionString = DatabaseHelper.getInstance().getConnectionString();
    Connection connection = DriverManager.getConnection(connectionString);

    String query = "SELECT id FROM Department WHERE department_name = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, departmentName);

    ResultSet resultSet = preparedStatement.executeQuery();

    int departmentId = -1; // قيمة افتراضية في حالة عدم العثور على القسم
    if (resultSet.next()) {
        departmentId = resultSet.getInt("id");
    } else {
        // يمكنك إضافة قسم جديد إذا لم يتم العثور عليه
        // أو عرض رسالة خطأ للمستخدم
        throw new SQLException("Department not found: " + departmentName);
    }

    resultSet.close();
    preparedStatement.close();
    connection.close();

    return departmentId;
}

// دالة لحفظ الموظف في قاعدة البيانات
private void saveEmployee(Employee employee, int departmentId) throws SQLException {
    String connectionString = DatabaseHelper.getInstance().getConnectionString();
    Connection connection = DriverManager.getConnection(connectionString);

    String query = "INSERT INTO Employee (first_name, last_name, salary_or_hourly_rate, hours_worked, employee_type, department_id) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, employee.getFirstName());
    preparedStatement.setString(2, employee.getLastName());
    preparedStatement.setDouble(3, employee.getSalaryOrHourlyRate());

    // تعيين عدد الساعات إذا كان الموظف بالساعة أو جزئي
    if (employee instanceof PartTimeEmployee || employee instanceof HourlyEmployee) {
        int hoursWorked = employee instanceof PartTimeEmployee ? ((PartTimeEmployee) employee).getHoursWorked() : ((HourlyEmployee) employee).getHoursWorked();
        preparedStatement.setInt(4, hoursWorked);
    } else {
        preparedStatement.setNull(4, java.sql.Types.INTEGER); // تعيين NULL للموظفين بدوام كامل
    }

    preparedStatement.setString(5, employee.getType());
    preparedStatement.setInt(6, departmentId);

    preparedStatement.executeUpdate();

    preparedStatement.close();
    connection.close();
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
            java.util.logging.Logger.getLogger(EmployeeManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManagementForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
