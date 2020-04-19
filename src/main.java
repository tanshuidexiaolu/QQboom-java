/**
 * @author 贪睡的小芦
 * 使用Java实现类似QQ炸弹的刷屏功能的程序
 * @version 1.0
 * 实现刷出特殊字符串
 * */
import java.awt.*;
//Robot类可以实现基本的键盘模拟
//键盘事件监听
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

public class main {
    public static void main(String[] args) throws AWTException{
        //要刷屏的字符串
        String txt = "我要吃张明诚";
        //创建Robot对象
        Robot robot = new Robot();
        //延迟3秒(3000毫秒)用来打开应用
        robot.delay(3000);
        //把txt中的内容写入剪切板
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable Txt = new StringSelection(txt);
        clip.setContents(Txt,null);
        //先实现一下粘贴剪贴板的内容
        //循环10次
        for (int i = 0; i < 60; i++) {
            //模拟按下CTRL键
            robot.keyPress(KeyEvent.VK_CONTROL);
            //模拟按下V键
            robot.keyPress(KeyEvent.VK_V);
            //模拟抬起CTRL键
            robot.keyRelease(KeyEvent.VK_CONTROL);
            //由于电脑速度运行太快，这里停200毫秒在按回车
            robot.delay(100);
            //模拟按下回车键
            robot.keyPress(KeyEvent.VK_ENTER);
        }
    }
}
