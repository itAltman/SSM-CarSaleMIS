/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018-04-22 11:01:15                          */
/*==============================================================*/


drop table if exists AdminLog;

drop table if exists CarBrand;

drop table if exists CarOrder;

drop table if exists CarSeries;

drop table if exists car;

drop table if exists company;

drop table if exists customer;

drop table if exists employee;

drop table if exists financing;

drop table if exists position;

drop table if exists repertory;

drop table if exists sale;

/*==============================================================*/
/* Table: AdminLog                                              */
/*==============================================================*/
create table AdminLog
(
   logId                int not null comment '日志编号',
   empId                int comment '员工编号',
   companyId            int comment '公司编号',
   logContent           varchar(50) not null comment '操作内容',
   logTime              timestamp not null comment '操作时间',
   primary key (logId)
);

alter table AdminLog comment '日志表';

/*==============================================================*/
/* Table: CarBrand                                              */
/*==============================================================*/
create table CarBrand
(
   brandId              int not null auto_increment comment '品牌编号',
   brandName            varchar(32) not null comment '品牌名称',
   brandNum             varchar(2) not null comment '品牌序号',
   primary key (brandId)
);

alter table CarBrand comment '汽车品牌表';

/*==============================================================*/
/* Table: CarOrder                                              */
/*==============================================================*/
create table CarOrder
(
   orderId              int not null comment '订单编号',
   carId                int comment '汽车编号',
   companyId            int comment '公司编号',
   orderNum             int comment '车辆数量',
   orderType            varchar(1) comment '订单状态（1：未审核、2：已审核）',
   primary key (orderId)
);

alter table CarOrder comment '订单表';

/*==============================================================*/
/* Table: CarSeries                                             */
/*==============================================================*/
create table CarSeries
(
   seriesId             int not null auto_increment comment '车系编号',
   brandId              int not null comment '品牌编号',
   seriesName           varchar(32) not null comment '车系名称',
   primary key (seriesId)
);

alter table CarSeries comment '汽车车系表';

/*==============================================================*/
/* Table: car                                                   */
/*==============================================================*/
create table car
(
   carId                int not null auto_increment comment '汽车编号',
   seriesId             int not null comment '车系编号',
   carName              varchar(32) not null comment '汽车名称',
   carPrice             numeric(8,2) not null comment '汽车价格',
   carTime              date not null comment '出厂日期',
   primary key (carId)
);

alter table car comment '汽车表';

/*==============================================================*/
/* Table: company                                               */
/*==============================================================*/
create table company
(
   companyId            int not null auto_increment comment '公司编号',
   companyName          varchar(40) not null comment '公司编号',
   primary key (companyId)
);

alter table company comment '公司表';

/*==============================================================*/
/* Table: customer                                              */
/*==============================================================*/
create table customer
(
   customerId           int not null auto_increment comment '客户编号',
   companyId            int not null comment '公司编号',
   customerName         varchar(10) not null comment '客户姓名',
   customerPhone        varchar(11) not null comment '客户电话',
   customerSex          varchar(2) not null comment '客户性别',
   customerType         varchar(1) not null comment '客户类型（1：个人、2：公司）',
   customerBirthday     date comment '客户生日',
   customerCreateTime   timestamp not null comment '创建时间',
   primary key (customerId)
);

alter table customer comment '客户表';

/*==============================================================*/
/* Table: employee                                              */
/*==============================================================*/
create table employee
(
   empId                int not null auto_increment comment '员工编号',
   positionId           int not null comment '职务编号',
   companyId            int not null comment '公司编号',
   empName              varchar(10) not null comment '员工姓名',
   empPhone             varchar(11) not null comment '登录手机',
   empPassword          varchar(50) not null comment '登录密码',
   empSalery            numeric(5,2) not null comment '员工工资',
   primary key (empId)
);

alter table employee comment '员工表';

/*==============================================================*/
/* Table: financing                                             */
/*==============================================================*/
create table financing
(
   financingId          int not null auto_increment comment '财务编号',
   saleId               int comment '销售编号',
   repertoryId          int comment '库存编号',
   companyId            int comment '公司编号',
   financingMoney       numeric(10,2) comment '涉及金额',
   financingType        varchar(1) comment '财务状态（1：收入，2：支出）',
   primary key (financingId)
);

alter table financing comment '财务表';

/*==============================================================*/
/* Table: position                                              */
/*==============================================================*/
create table position
(
   positionId           int not null auto_increment comment '职务编号',
   positionName         varchar(20) not null comment '职务名称（经理、操作员、销售员）',
   positionLevel        varchar(1) not null comment '职务等级（1：经理、2：操作员、3：销售员）',
   primary key (positionId)
);

alter table position comment '职务表';

/*==============================================================*/
/* Table: repertory                                             */
/*==============================================================*/
create table repertory
(
   repertoryId          int not null auto_increment comment '库存编号',
   carId                int not null comment '汽车编号',
   companyId            int not null comment '公司编号',
   purchasePrice        numeric(8,2) not null comment '含税价格',
   inTime               date not null comment '入库时间',
   repertoryNum         int not null comment '库存数量',
   primary key (repertoryId)
);

alter table repertory comment '库存表';

/*==============================================================*/
/* Table: sale                                                  */
/*==============================================================*/
create table sale
(
   saleId               int not null auto_increment comment '销售编号',
   customerId           int not null comment '客户编号',
   carId                int not null comment '汽车编号',
   empId                int not null comment '员工编号',
   companyId            int comment '公司编号',
   saleCurPrice         numeric(8,2) not null comment '销售价格',
   saleNum              int not null comment '销售数量',
   saleType             varchar(1) not null comment '销售状态（1、未付款，2、已付款）',
   primary key (saleId)
);

alter table sale comment '销售表';

alter table AdminLog add constraint FK_companyId_log foreign key (companyId)
      references company (companyId) on delete restrict on update restrict;

alter table AdminLog add constraint FK_empId_log foreign key (empId)
      references employee (empId) on delete restrict on update restrict;

alter table CarOrder add constraint FK_carId_order foreign key (carId)
      references car (carId) on delete restrict on update restrict;

alter table CarOrder add constraint FK_companyId_order foreign key (companyId)
      references company (companyId) on delete restrict on update restrict;

alter table CarSeries add constraint FK_brandId foreign key (brandId)
      references CarBrand (brandId) on delete restrict on update restrict;

alter table car add constraint FK_seriesId foreign key (seriesId)
      references CarSeries (seriesId) on delete restrict on update restrict;

alter table customer add constraint FK_companyId_cus foreign key (companyId)
      references company (companyId) on delete restrict on update restrict;

alter table employee add constraint FK_companyId_emp foreign key (companyId)
      references company (companyId) on delete restrict on update restrict;

alter table employee add constraint FK_positionId foreign key (positionId)
      references position (positionId) on delete restrict on update restrict;

alter table financing add constraint FK_companyId_financing foreign key (companyId)
      references company (companyId) on delete restrict on update restrict;

alter table financing add constraint FK_repertoryId foreign key (repertoryId)
      references repertory (repertoryId) on delete restrict on update restrict;

alter table financing add constraint FK_saleId foreign key (saleId)
      references sale (saleId) on delete restrict on update restrict;

alter table repertory add constraint FK_carId_repertory foreign key (carId)
      references car (carId) on delete restrict on update restrict;

alter table repertory add constraint FK_companyId_repertory foreign key (companyId)
      references company (companyId) on delete restrict on update restrict;

alter table sale add constraint FK_carId_sale foreign key (carId)
      references car (carId) on delete restrict on update restrict;

alter table sale add constraint FK_companyId_sale foreign key (companyId)
      references company (companyId) on delete restrict on update restrict;

alter table sale add constraint FK_customerId foreign key (customerId)
      references customer (customerId) on delete restrict on update restrict;

alter table sale add constraint FK_empId_sale foreign key (empId)
      references employee (empId) on delete restrict on update restrict;

