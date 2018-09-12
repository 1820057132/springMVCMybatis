package com.neusoft.test.service;

import com.neusoft.test.bean.Game;

import java.util.List;

/**
 * Created by xhbg on 2018/9/6.
 */
public interface IGameService {


    Game selectOne(Game game);

    List<Game> selectAll(Game game);

    Integer insert(Game game);

    Integer update(Game game);

    Integer deleteByPK(Game game);

}
