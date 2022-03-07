package com.zixy.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2022-03-06 14:58:39
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment implements Serializable {
    private static final long serialVersionUID = 964449649464026971L;
    /**
     * id
     */
    private Long id;

    private String serial;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}