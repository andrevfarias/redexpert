package org.underworldlabs.swing.celleditor.picker;

import com.github.lgooddatepicker.components.DatePicker;
import org.executequery.GUIUtilities;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DefaultDatePicker extends DatePicker {

    public DefaultDatePicker() {
        super();

        getComponentToggleCalendarButton().setMargin(new Insets(0, 0, 0, 0));
        getComponentToggleCalendarButton().setText("");
        getComponentToggleCalendarButton().setIcon(GUIUtilities.loadIcon("clndr_ico.svg", 16));
        getComponentDateTextField().setMargin(new Insets(0, 0, 0, 0));
        getComponentDateTextField().setColumns(10);
        getSettings().setGapBeforeButtonPixels(0);

        repaint();
    }
}
