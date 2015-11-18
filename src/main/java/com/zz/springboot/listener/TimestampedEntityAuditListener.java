package com.zz.springboot.listener;

import com.zz.springboot.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@Configurable
public class TimestampedEntityAuditListener {

    @PrePersist
    public void touchForCreate(BaseEntity target) {
        Date now = new Date();
        target.setCreateTime(now);
        target.setUpdateTime(now);
    }

    @PreUpdate
    public void touchForUpdate(BaseEntity target) {
        target.setUpdateTime(new Date());
    }
}
