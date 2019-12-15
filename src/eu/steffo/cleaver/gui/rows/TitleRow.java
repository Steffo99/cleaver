package eu.steffo.cleaver.gui.rows;

import eu.steffo.cleaver.gui.rows.Row;

import javax.swing.*;

public class TitleRow extends Row {
    protected final JLabel titleLabel;

    public TitleRow(String str) {
        super();

        this.add(Box.createHorizontalStrut(8));

        titleLabel = new JLabel(str);
        this.add(titleLabel);

        this.add(Box.createHorizontalStrut(8));
    }
}