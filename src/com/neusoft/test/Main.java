package com.neusoft.test;

import com.neusoft.test.bean.Game;
import com.neusoft.test.service.IGameService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xhbg on 2018/9/5.
 */
@Controller
public class Main {

    @Autowired
    private IGameService gameService;

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        //解析配置文件获取一个容器对象
        //获取容器中的某一个bean对象（返回的是一个Object对象,需要强制类型转换）
        //IGameService gameService = (IGameService) bf.getBean("gameService");
        //传建一个实体类对象实例
        Game game = new Game();

        game.setId(1);
        //调取集体的SQL
        game = gameService.selectOne(game);

        System.out.println(game.getName());
        return "你好 ssm" + game.getName();

    }
}
