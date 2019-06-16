DROP TABLE IF EXISTS `project_article`;
CREATE TABLE `project_article`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `user_id`         int(11)      NOT NULL COMMENT '发布人ID.',
    `title`           varchar(255) NOT NULL COMMENT '文章标题.',
    `content`         text COMMENT '文章内容.',
    `created_at`      datetime              DEFAULT NULL,
    `updated_at`      timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='文章表';


DROP TABLE IF EXISTS `project_user`;
CREATE TABLE `project_user`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `name`            varchar(20) NOT NULL COMMENT '名字.',
    `phone`           varchar(11) COMMENT '电话号码.',
    `password`        varchar(20) COMMENT '密码',
    `created_at`      datetime              DEFAULT NULL,
    `updated_at`      timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户表';

