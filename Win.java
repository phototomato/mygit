import javax.swing.*;
import java.awt.*;
public class Win extends JFrame {
    JTextField text[]=new JTextField[3];
    Police police;
    JButton button;
    public Win(){
        setLayout(new FlowLayout());
        Font font=new Font("宋体",Font.BOLD,36);
        police=new Police();
        police.setView(this);//将当前窗口传递给police组合的窗口
        for(int i=0;i<3;i++)
        {
            text[i]=new JTextField(20);
            text[i].addKeyListener(police);
            text[i].addFocusListener(police);//监视焦点事件
            add(text[i]);
            text[i].setFont(font);
        }
        button=new JButton("确定");
        button.addFocusListener(police);
        button.setFont(font);
        add(button);
        setVisible(true);
        text[0].requestFocusInWindow();//让text[0]首先有焦点让不用敲击键盘就可以输入值
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }