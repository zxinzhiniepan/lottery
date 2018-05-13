package com.tiantian.service.impl;

import com.tiantian.mapper.AwardnumberMapper;
import com.tiantian.pojo.Awardnumber;
import com.tiantian.service.AwardnumberService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 张家坤
 * @since 18-5-12 18:40
 */
public class AwardnumberServiceImpl implements AwardnumberService {
    @Autowired
    private AwardnumberMapper awardnumberMapper;

    @Override
    public Awardnumber findAwardById(Long aId) {
        System.out.println("test");
        Awardnumber awardnumber = awardnumberMapper.selectByPrimaryKey(aId);
        return awardnumber;
    }
}
