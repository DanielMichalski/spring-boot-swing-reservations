package com.danielmichalski.reservations.business.ui.forms.roomstatus.view.modal;

import java.awt.BorderLayout;
import javax.annotation.PostConstruct;
import javax.swing.JDialog;
import javax.swing.WindowConstants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
import com.danielmichalski.reservations.business.util.constant.ConstMessagesEN;

@Component
@AllArgsConstructor
@Getter
public class AddRoomStatusFrame extends JDialog {

    private final RoomStatusFormPanel formPanel;
    private final RoomStatusFormBtnPanel formBtnPanel;

    @PostConstruct
    private void prepareFrame() {
        setFrameUp();
        initComponents();
        pack();
    }

    private void setFrameUp() {
        setTitle(ConstMessagesEN.DialogTitles.ROOM_STATUS_MODAL);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setModal(true);
    }

    private void initComponents() {
        add(formPanel, BorderLayout.CENTER);
        add(formBtnPanel, BorderLayout.SOUTH);
    }

}
