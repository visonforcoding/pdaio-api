package org.llcd.cn.pdaioapi.entity;

import javax.persistence.*;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "bug", comment = "缺陷表")
public class Bug extends BaseEntity {

    @Column(columnDefinition = "bigint(20) NOT NULL default 0 comment '所属产品'")
    private Long productId;

    @Column(columnDefinition = "bigint(20) NOT NULL default 0 comment '所属平台'")
    private Long branchId;

    @Column(columnDefinition = "bigint(20) NOT NULL default 0 comment '所属模块'")
    private Long moduleId;

    @Column(columnDefinition = "bigint(20) NOT NULL default 0 comment '所属迭代'")
    private Long projectId;

    @Column(columnDefinition = "bigint(20) NOT NULL default 0 comment '相关任务'")
    private Long taskId;

    @Column(name = "title")
    private String title;

    private String bugType;

    @Column(name = "found")
    private String found;

    @Column(name = "steps")
    private String steps;

    @Column(name = "status")
    private String status;


    @Column(name = "confirmed", columnDefinition = "tinyint(4) NOT NULL default 0 comment '是否确认'")
    private Byte confirmed;

    @Column(name = "mailto")
    private String mailto;

    @Column(name = "openedBy", columnDefinition = "varchar(25) NOT NULL default '' comment '被谁打开'")
    private String openedBy;

    @Column(name = "openedDate", columnDefinition = "datetime  NULL  comment '打开时间'")
    private java.util.Date openedDate;


    @Column(name = "assignedTo", columnDefinition = "varchar(25) NOT NULL default '' comment '指派给'")
    private String assignedTo;

    @Column(name = "assignedDate", columnDefinition = "datetime  NULL  comment '指派时间'")
    private java.util.Date assignedDate;

    @Column(name = "resolvedBy",columnDefinition = "varchar(25) NOT NULL default '' comment '由谁解决'")
    private String resolvedBy;

    @Column(name = "resolution",columnDefinition = "varchar(25) NOT NULL default '' comment '解决方案'")
    private String resolution;

    @Column(name = "resolvedBuild")
    private String resolvedBuild;

    @Column(name = "resolvedDate",columnDefinition = "datetime  NULL  comment '解决时间'")
    private java.util.Date resolvedDate;

    @Column(name = "closedBy",columnDefinition = "varchar(25) NOT NULL default '' comment '由谁关闭'")
    private String closedBy;

    @Column(name = "closedDate",columnDefinition = "varchar(25) NOT NULL default '' comment '关闭时间'")
    private java.util.Date closedDate;

    @Column(name = "result")
    private int result;

    @Column(name = "repo")
    private int repo;

    @Column(name = "entry")
    private String entry;

    @Column(name = "repoType")
    private String repoType;

    @Column(name = "testtask")
    private Long testtask;

    @Column(name = "lastEditedBy")
    private String lastEditedBy;

    @Column(name = "deleted")
    private String deleted;

}
