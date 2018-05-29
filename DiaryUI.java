package com.diary.view;
import javax.swing.*;

public class DiaryUI extends JFrame {
    JLabel lblDate, lblTitle, lblContent, lblDisplay;
    JButton btnAddDiary;
    JTextField txtDate, txTitle, txtContent;
    JList<String> allTitle;
    JPanel pnlDiary;
    public DiaryUI(){
        super("My diary");
        init();
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void init(){
        lblContent = new JLabel ("Description");
        lblDate = new JLabel("Date");
        lblTitle = new JLabel("Title");
        lblDisplay = new JLabel("All Diaries");
        pnlDiary = new JPanel();
        btnAddDiary = new JButton("Add");


        txtContent = new JTextField(50);
        txtDate = new JTextField(50);
        txTitle = new JTextField(40);
        allTitle = new JList<>();

        pnlDiary.add(lblDate);
        pnlDiary.add(txtDate);
        pnlDiary.add(lblTitle);
        pnlDiary.add(txTitle);
        pnlDiary.add(lblContent);
        pnlDiary.add(txtContent);
        pnlDiary.add(btnAddDiary);
        pnlDiary.add(lblDisplay);
        add(pnlDiary);
    }
}
