/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/10/27  23:03
 *文件名称                     :Client0907.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
import com.fc.Schooltext.text09.ep07.Run;
import com.fc.Schooltext.text09.ep07.XMLUtil;
public class Client0907 {
    public static void main(String[] args) {
        Run ru;
        ru=(Run) XMLUtil.getBean();
        ru.run();
        ru.display();
    }
}
