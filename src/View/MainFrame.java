/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * license Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.util.ArrayList;
import javax.swing.Icon;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jiconfont.swing.IconFontSwing;
import jiconfont.icons.font_awesome.FontAwesome;

import Controller.UserController;
import Model.Database;
import Model.UserModel;
import javax.swing.JPanel;

/**
 *
 * @author Muhammad Rayhan Faridh
 */
public class MainFrame extends javax.swing.JFrame {

    private final UserModel userModel;
    private final UserController userController;
    private String user;
    private String activePanel;

    /**
     * Creates new form MainFrame
     *
     * @param userModel
     */
    public MainFrame(UserModel userModel) {
        initComponents();
        IconFontSwing.register(FontAwesome.getIconFont());

        this.userModel = userModel;
        this.userController = new UserController();
        this.user = (!userModel.getUsername().equals("")) ? userModel.getUsername() : userModel.getNim();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle maxWindowBounds
                = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();

        int taskbarHeight = screenSize.height - maxWindowBounds.height;

        setTitle("Sistem Informasi Keanggotaan Komnet");
        setSize(screenSize.width, screenSize.height - taskbarHeight);
        setLocationRelativeTo(null);
        setResizable(false);

        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbarPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        profileWrapper = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        profileIconLabel = new javax.swing.JLabel();
        sidebarPanel = new javax.swing.JPanel();
        sidebarScrollPane = new javax.swing.JScrollPane();
        sidebarContentPanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        mainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        navbarPanel.setBackground(new java.awt.Color(242, 220, 148));
        navbarPanel.setPreferredSize(new java.awt.Dimension(878, 75));

        logoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("UKM KOMNET");

        profileWrapper.setBackground(new java.awt.Color(242, 220, 148));
        profileWrapper.setToolTipText("Klik untuk membuka detail profile");
        profileWrapper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userLabel.setToolTipText("Klik untuk membuka detail profile");

        profileIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileIconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout profileWrapperLayout = new javax.swing.GroupLayout(profileWrapper);
        profileWrapper.setLayout(profileWrapperLayout);
        profileWrapperLayout.setHorizontalGroup(
            profileWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileWrapperLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        profileWrapperLayout.setVerticalGroup(
            profileWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout navbarPanelLayout = new javax.swing.GroupLayout(navbarPanel);
        navbarPanel.setLayout(navbarPanelLayout);
        navbarPanelLayout.setHorizontalGroup(
            navbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                .addComponent(profileWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navbarPanelLayout.setVerticalGroup(
            navbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(profileWrapper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(navbarPanel, java.awt.BorderLayout.PAGE_START);

        sidebarPanel.setPreferredSize(new java.awt.Dimension(250, 434));

        sidebarScrollPane.setBorder(null);

        sidebarContentPanel.setBackground(new java.awt.Color(255, 249, 205));
        sidebarContentPanel.setLayout(new javax.swing.BoxLayout(sidebarContentPanel, javax.swing.BoxLayout.Y_AXIS));
        sidebarScrollPane.setViewportView(sidebarContentPanel);

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarScrollPane)
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarScrollPane)
        );

        getContentPane().add(sidebarPanel, java.awt.BorderLayout.LINE_START);

        contentPanel.setBackground(new java.awt.Color(255, 252, 230));

        mainContent.setBackground(new java.awt.Color(255, 252, 230));
        mainContent.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainContent, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(892, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        mainContent.add(new BgContent());
        mainContent.repaint();
        mainContent.revalidate();
    }// GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and
         * feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Database.getInstance().isLogin()) {
                    new LoginFrame().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainContent;
    private javax.swing.JPanel navbarPanel;
    private javax.swing.JLabel profileIconLabel;
    private javax.swing.JPanel profileWrapper;
    private javax.swing.JPanel sidebarContentPanel;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JScrollPane sidebarScrollPane;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        Icon homeIcon = IconFontSwing.buildIcon(FontAwesome.HOME, 20);
        Icon usersIcon = IconFontSwing.buildIcon(FontAwesome.USERS, 20);
        Icon userIcon = IconFontSwing.buildIcon(FontAwesome.USER, 20);
        Icon userPlusIcon = IconFontSwing.buildIcon(FontAwesome.USER_PLUS, 20);
        Icon userCircleIcon = IconFontSwing.buildIcon(FontAwesome.USER_CIRCLE, 20);
        Icon logoutIcon = IconFontSwing.buildIcon(FontAwesome.SIGN_OUT, 20);

        MenuItem homeItem = new MenuItem(homeIcon, false, null, "Beranda", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainContent.removeAll();
                mainContent.add(new HomePanel());
                mainContent.repaint();
                mainContent.revalidate();
            }
        });
        MenuItem addUserItem = new MenuItem(userPlusIcon, false, null, "Tambah Anggota", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainContent.removeAll();
                mainContent.add(new AddMemberPanel());
                mainContent.repaint();
                mainContent.revalidate();
            }
        });

        // Sub Menu Users
        MenuItem bph = new MenuItem(null, true, userIcon, "BPH", setActionSubMenuUsers("bph"));
        MenuItem pengembangan = new MenuItem(null, true, userIcon, "Pengembangan", setActionSubMenuUsers("pengembangan"));
        MenuItem pelatihan = new MenuItem(null, true, userIcon, "Pelatihan", setActionSubMenuUsers("pelatihan"));
        MenuItem hpd = new MenuItem(null, true, userIcon, "HPD", setActionSubMenuUsers("hpd"));
        MenuItem umum = new MenuItem(null, true, userIcon, "Umum", setActionSubMenuUsers("umum"));
        MenuItem keseluruhan = new MenuItem(null, true, userIcon, "Keseluruhan", setActionSubMenuUsers("keseluruhan"));
        MenuItem[] usersSubMenu = new MenuItem[]{bph, pengembangan, pelatihan, hpd, umum, keseluruhan};

        MenuItem usersItem = new MenuItem(usersIcon, false, null, "Anggota", null, usersSubMenu);
        MenuItem logoutItem = new MenuItem(logoutIcon, false, null, "Logout", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userController.logout()) {
                    dispose();
                }
            }
        });

        MenuItem[] menus = new MenuItem[]{homeItem, addUserItem, usersItem, logoutItem};
        addMenu(menus);

        // Set
        setUserLabel();
        setProfileIconLabel(userCircleIcon);
    }

    private void addMenu(MenuItem... menu) {
        for (MenuItem m : menu) {
            sidebarContentPanel.add(m);
            ArrayList<MenuItem> subMenu = m.getSubMenu();
            for (MenuItem sm : subMenu) {
                sidebarContentPanel.add(sm);
            }
        }
        sidebarContentPanel.revalidate();
    }

    private void setUserLabel() {
        userLabel.setText(user.toUpperCase());
    }

    private void setProfileIconLabel(Icon icon) {
        profileIconLabel.setIcon(icon);
    }

    private ActionListener setActionSubMenuUsers(String activePanel) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TableMemberPanel panel = new TableMemberPanel(userModel, activePanel);

                mainContent.removeAll();
                mainContent.add(panel);
                mainContent.repaint();
                mainContent.revalidate();
            }
        };
    }
}