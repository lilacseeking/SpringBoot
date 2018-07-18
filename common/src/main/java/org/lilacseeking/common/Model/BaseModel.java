package org.lilacseeking.common.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
public class BaseModel {

    /**
     * 基本字段表设计
     * design By lvming on 2018.7.2
     * 此类为所有类的父类，uuid和Id构成联合主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="uuid",unique = true,nullable = true,length = 32)
    private String uuid;
    @Column(name="gmt_create")
    private Date gmt_create;
    @Column(name="gmt_delete")
    private Date gmt_delete;
    @Column(name="gmt_modified")
    private Date gmt_modified;
    @Column(name="gmt_update")
    private Date gmt_update;
    @Column(name="creater")
    private Integer creater;
    @Column(name="modifier")
    private Integer modifier;
    @Column(name="deleter")
    private Integer deleter;
}
