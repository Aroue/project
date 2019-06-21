DROP TABLE IF EXISTS `project_user`;
CREATE TABLE `project_user`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `login_name`      varchar(20)  NOT NULL COMMENT '登录名.',
    `user_name`       varchar(20)  NOT NULL COMMENT '用户名.',
    `password`        varchar(32)  NOT NULL COMMENT '密码',
    `status`          int(11)      NOT NULL COMMENT '权限状态（1管理员，2用户）',
    `created_at`      timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`      timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户表';



DROP TABLE IF EXISTS `project_dept`;
CREATE TABLE `project_dept`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `name`            varchar(50)  NOT NULL COMMENT '部门名.',
    `remark`          varchar(300) NOT NULL COMMENT '详细信息.',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='部门表';

DROP TABLE IF EXISTS `project_job`;
CREATE TABLE `project_job`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `name`            varchar(50)  NOT NULL COMMENT '职位名.',
    `remark`          varchar(300) NOT NULL COMMENT '详细信息.',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='职位表';

DROP TABLE IF EXISTS `project_employee`;
CREATE TABLE `project_employee`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `dept_id`         int(11)      NOT NULL COMMENT '部门主键' ,
    `job_id`          int(11)      NOT NULL COMMENT '职位主键' ,
    `name`            varchar(20)  NOT NULL COMMENT '名字.',
    `card_id`         varchar(18)  NOT NULL COMMENT '身份证号码.',
    `address`         varchar(50)  COMMENT '住址.',
    `post_code`       varchar(50)  COMMENT '邮编.',
    `tel`             varchar(16)  COMMENT '电话.',
    `phone`           varchar(11)  COMMENT '手机.',
    `qq_num`          varchar(10)  COMMENT 'QQ号码.',
    `email`           varchar(50)  COMMENT '邮箱.',
    `sex`             int(11)      COMMENT '性别.',
    `parity`          varchar(10)  COMMENT '政治面貌.',
    `birthday`        datetime     COMMENT '出生日期.',
    `race`            varchar(100) COMMENT '民族.',
    `education`       varchar(10)  COMMENT '学历.',
    `speciality`      varchar(20)  COMMENT '专业.',
    `hobby`           varchar(100) COMMENT '特长.',
    `remark`          varchar(500) COMMENT '备注.',
    `created_at`      timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`      timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='员工表';



DROP TABLE IF EXISTS `project_notice`;
CREATE TABLE `project_notice`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `user_id`         int(11)      NOT NULL COMMENT '公告人' ,
    `title`           varchar(50)  NOT NULL COMMENT '公告名称' ,
    `content`         varchar(50)  NOT NULL COMMENT '公告内容' ,
    `created_at`      timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`      timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='员工表';


