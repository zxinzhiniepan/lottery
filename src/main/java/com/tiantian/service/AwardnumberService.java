package com.tiantian.service;

import com.tiantian.mapper.AwardnumberMapper;
import com.tiantian.pojo.Awardnumber;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 张家坤
 * @since 18-5-12 18:40
 */
public interface AwardnumberService {
    public abstract Awardnumber findAwardById(Long aId);
}
