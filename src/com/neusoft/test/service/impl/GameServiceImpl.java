package com.neusoft.test.service.impl;

import com.neusoft.test.bean.Game;
import com.neusoft.test.mapper.GameMapper;
import com.neusoft.test.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xhbg on 2018/9/6.
 */
@Service("gameService")
public class GameServiceImpl implements IGameService {

    @Autowired
    private GameMapper gameMapper;


    @Override
    public Game selectOne(Game game) {
        return gameMapper.selectOne(game);
    }

    @Override
    public List<Game> selectAll(Game game) {
        return gameMapper.selectAll(game);
    }

    @Override
    public Integer insert(Game game) {
        return gameMapper.insert(game);
    }

    @Override
    public Integer update(Game game) {
        return gameMapper.update(game);
    }

    @Override
    public Integer deleteByPK(Game game) {
        return gameMapper.deleteByPK(game);
    }
}
