/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  21:10
 *文件名称                     :VideoClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text06.ep05.Actor;
import com.fc.Schooltext.text06.ep05.ActorBuilder;
import com.fc.Schooltext.text06.ep05.ActorController;
import com.fc.Schooltext.text06.ep05.XMLUtil;

public class Client0605 {
    public static void main(String[] args) {
        ActorBuilder ab;
        ab=(ActorBuilder) XMLUtil.getBean();

        ActorController ac=new ActorController();
        Actor actor;
        actor=ac.construct(ab);

        System.out.println(actor.getType());
        System.out.println(actor.getBar());
        System.out.println(actor.getList());
        System.out.println(actor.getMenu());
        System.out.println(actor.getStrip());
        System.out.println(actor.getWindow());
    }
}

   