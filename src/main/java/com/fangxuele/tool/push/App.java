package com.fangxuele.tool.push;

import com.fangxuele.tool.push.ui.Init;
import com.fangxuele.tool.push.ui.form.LoadingForm;
import com.fangxuele.tool.push.ui.form.MainWindow;
import com.fangxuele.tool.push.ui.frame.MainFrame;

import javax.swing.*;

/**
 * <pre>
 * Main Enter!
 * </pre>
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2019/4/20.
 */
public class App {
    public static MainFrame mainFrame;

    public static void main(String[] args) {
        Init.initTheme();
        mainFrame = new MainFrame();
        mainFrame.init();
        mainFrame.add(new LoadingForm().getLoadingPanel());
        mainFrame.pack();
        mainFrame.setVisible(true);

        SwingUtilities.invokeLater(() -> {
            mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            Init.initGlobalFont();
            Init.initAllTab();
            Init.initOthers();
            mainFrame.setContentPane(MainWindow.mainWindow.mainPanel);
            mainFrame.addListeners();
        });
    }
}
