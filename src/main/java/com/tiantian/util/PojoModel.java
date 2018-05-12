package com.tiantian.util;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 实体类模型，继承该类的实体类，有toString(),hashCode(),equals()等方法
 *
 * @author Mr.Li
 * tell:18900709087
 * create in 10:49 2018/5/12
 */
public class PojoModel {
    private static final long serialVersionUID = 1L;

    public int hashCode() {

        return HashCodeBuilder.reflectionHashCode(this);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
