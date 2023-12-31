package com.cydeo.InventoryManagementSystm.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class BaseEntityListener extends AuditingEntityListener {

    @PrePersist
    public void onPrePersist(BaseEntity baseEntity){


        baseEntity.insertDateTime= LocalDateTime.now();
        baseEntity.lastUpdateDateTime=LocalDateTime.now();
        baseEntity.insertUserId=4L;
        baseEntity.lastUpdateUserId=4L;

    }
    @PreUpdate
public void onPreUpdate(BaseEntity baseEntity){
    baseEntity.lastUpdateDateTime=LocalDateTime.now();
    baseEntity.lastUpdateUserId=4L;
    baseEntity.insertUserId=4L;
    }
}
