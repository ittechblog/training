drop table if exists PAY_SHOP_AUDIT;

/*==============================================================*/
/* Table: PAY_SHOP_AUDIT                                        */
/*==============================================================*/
create table PAY_SHOP_AUDIT
(
   ID                   bigint(20) not null AUTO_INCREMENT,
   USER_ID              varchar(100),
   STATUS               varchar(50) comment '状态',
   REMARKS              varchar(500) comment '备注',
   CREATED_AT           datetime comment '创建时间',
   CREATED_BY           varchar(50) comment '创建人',
   UPDATED_AT           datetime comment '编辑时间',
   UPDATED_BY           varchar(50) comment '编辑人',
   PRIMARY KEY (ID)
);