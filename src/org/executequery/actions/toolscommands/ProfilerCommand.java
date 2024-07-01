package org.executequery.actions.toolscommands;

import org.executequery.GUIUtilities;
import org.executequery.actions.OpenFrameCommand;
import org.executequery.gui.browser.profiler.ProfilerPanel;
import org.underworldlabs.swing.actions.BaseCommand;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ProfilerCommand extends OpenFrameCommand
        implements BaseCommand {

    @Override
    public void execute(ActionEvent e) {

        String title = ProfilerPanel.TITLE;
        if (!isConnected() || isCentralPaneOpen(title))
            return;

        GUIUtilities.addCentralPane(
                title,
                (Icon) null,
                new ProfilerPanel(),
                null,
                true
        );
    }

}