use lottery;

drop table if exists user;
create table if not exists User(
    `uId` bigint auto_increment comment '用户ID',
    `uName` varchar(16) not null comment "用户名",
    `uRealName` varchar(16) comment "真实姓名",
    `uPassword` varchar(16) not null comment "用户登陆密码",
    `uPhone` varchar(11) comment "手机号码",
    `uWechat` varchar(20) comment "微信号",
    `uAlipay` varchar(20) comment "支付宝",
    `uLeaderId` bigint comment "带领人的ID",
    `uTime` datetime not null default current_timestamp comment "创建时间",
    `balance` decimal(12,2) not null default 0 comment "帐号余额",
    primary key(`uId`)
)comment = "用户表";

drop table if exists `Transation`;
create table if not exists `Transation`(
    `tId` bigint not null auto_increment comment "交易的ID",
    `uId` bigint not null comment "交易的用户", 
    `tClass` bigint not null comment "交易类型",
    `tAccount` bigint not null comment "转入账号",               
    `money` decimal(12,2) not null comment "交易发生的金额",
    `dTime` datetime not null default current_timestamp comment "处理时间",
    `cTime` datetime default current_timestamp comment "申请时间",
    `tSuccess` tinyint not null default 0 comment "处理是否成功 0：未处理  1：已处理",
    `mId` bigint not null comment "交易处理人的ID",
    primary key(`tId`)
)comment = "交易表";

drop table if exists `TransactionClass`;
create table if not exists `TransactionClass`(
    `tcId` bigint not null auto_increment comment "交易类型ID",
    `tcName` varchar(16) not null comment "交易类型名",
    primary key(`tcId`)
)comment = "交易类型表";

drop table if exists `Manager`;
create table if not exists `Manager`(
    `mId` bigint not null auto_increment comment "管理员ID",
    `uId` bigint not null comment "用户ID",
    `recharge` tinyint not null default 0 comment "0：未处理  1：已处理    充值权限",
    `modifiedPwd` tinyint not null default 0 comment "0：未处理  1：已处理    修改密码",
    `subordinate` tinyint not null default 0 comment "0：未处理  1：已处理    查看下线",
    `bill` tinyint not null default 0 comment "0：未处理  1：已处理    查看流水",
    `transactionLog` tinyint not null default 0 comment "0：未处理  1：已处理    查看交易记录",
    `addTime` datetime default current_timestamp  comment "添加管理员的时间",
    primary key(`mId`)
)comment = "管理员表";

drop table if exists `Game`;
create table if not exists `Game`(
    `gId` bigint not null auto_increment comment "游戏ID",
    `gName` varchar(20) not null comment "游戏名",
    `gIntroduce` text comment "游戏介绍",
    primary key(`gId`)
)comment = "游戏表";

drop table if exists `PlayLaw`;
create table if not exists `PlayLaw`(
    `pId` bigint not null auto_increment comment "玩法ID",
    `gId` bigint not null comment "游戏ID",
    `gName` varchar(20) not null comment "玩法名",
    `pIntroduce` text comment "玩法介绍",
    primary key(`pId`)
)comment = "玩法表";

drop table if exists `Odds`;
create table if not exists `Odds`(
    `oId` bigint not null auto_increment comment "赔率ID",
    `pId` bigint not null comment "玩法ID",
    `oNumber` int comment "key值",
    `oRate` decimal(12,2) comment "pei赔率",
    primary key(`oId`)
)comment = "赔率表";

drop table if exists `AwardNumber`;
create table if not exists `AwardNumber`(
    `anId` bigint not null auto_increment comment "开奖号码ID",
    `anNo` bigint not null comment "开奖期号",
    `gId` bigint not null comment "游戏ID",
    `anTime` datetime default current_timestamp comment "开奖时间",
    `gNumber1` int comment "第一个中奖号码",
    `gNumber2` int comment "第二个中奖号码",
    `gNumber3` int comment "第三个中奖号码",
    `gNumber4` int comment "第四个中奖号码",
    `gNumber5` int comment "第五个中奖号码",
    `gNumber6` int comment "第六个中奖号码",
    primary key(`anId`)
)comment = "开奖号码表";

drop table if exists `BetOn`;
create table if not exists `BetOn`(
    `boId` bigint auto_increment comment "下注ID",
    `uId` bigint not null comment "用户Id",
    `anId` bigint not null comment "开奖号码ID",
    `boTime` datetime default current_timestamp comment "购买时间",
    primary key(`boId`)
)comment = "下注表";

drop table if exists `BetOnNumber`;
create table if not exists `BetOnNumber`(
    `bonId` bigint not null auto_increment comment "下注号码ID",
    `boId` bigint not null comment "下注ID",
    `bonKey` int not null comment "下注的号码",
    `bonMoney` decimal(12,2) comment "购买金钱",
    `bonTime` datetime default current_timestamp comment "购买时间",
    `rate` decimal(12,2) comment "赔率",
    primary key(`bonId`)
)comment = "下注号码表";

drop table if exists `Message`;
create table if not exists `Message`(
    `mId` bigint auto_increment comment "信息ID",
    `mName` varchar(16) comment "中奖用户名",
    `mMoney` decimal(12,2) comment "中奖的金额",
    `anid` bigint comment "开奖的Id",
    primary key(`mId`)
)comment = "信息表";
