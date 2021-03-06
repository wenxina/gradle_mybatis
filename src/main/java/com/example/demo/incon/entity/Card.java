package com.example.demo.incon.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-06
 */
@Data
@Accessors(chain = true)
public class Card extends Model<Card> {

    private static final long serialVersionUID = 1L;

    /**
     * 卡主键
     */
    @TableId(value = "cardId", type = IdType.AUTO)
    private Integer cardId;

    /**
     * 卡姓名
     */
    private String cardName;

    /**
     * 卡年龄
     */
    private String cardAge;

    /**
     * 卡爱好
     */
    private String cardHobby;


    @Override
    protected Serializable pkVal() {
        return this.cardId;
    }

}
