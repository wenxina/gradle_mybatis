package com.example.demo.incon.web;


import com.example.demo.incon.entity.Card;
import com.example.demo.incon.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-06
 */
@RestController
@RequestMapping("/incon/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping(value = "test")
    public Card test(){
        Card card= cardService.selectById(1);
        return card;
    }

    @GetMapping(value = "test1")
    public List<Card> test1(){
        return cardService.selectList(null);
    }
}
