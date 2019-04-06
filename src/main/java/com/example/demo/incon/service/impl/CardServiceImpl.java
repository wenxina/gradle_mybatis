package com.example.demo.incon.service.impl;

import com.example.demo.incon.entity.Card;
import com.example.demo.incon.mapper.CardDao;
import com.example.demo.incon.service.CardService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-06
 */
@Service
public class CardServiceImpl extends ServiceImpl<CardDao, Card> implements CardService {

}
