package com.danielmichalski.reservations.business.ui.forms.paymentmethod.view;

import java.awt.BorderLayout;
import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
import com.danielmichalski.reservations.business.util.constant.ConstMessagesEN;

@Component
@AllArgsConstructor
@Getter
public class PaymentMethodTableFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 300;

    private final PaymentMethodTablePanel tablePanel;
    private final PaymentMethodTableBtnPanel tableBtnPanel;

    @PostConstruct
    private void prepareFrame() {
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setTitle(ConstMessagesEN.Labels.PAYMENT_METHODS);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {
        add(tablePanel, BorderLayout.CENTER);
        add(tableBtnPanel, BorderLayout.SOUTH);
    }
}
