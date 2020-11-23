-- 创建issue数据库
CREATE DATABASE issue;

USE issue;

-- 创建user表
CREATE TABLE user( 
userId int(30) primary key auto_increment,
name varchar(30),
email varchar(30),
uCreateTime date DEFAULT NULL,
identity varchar(15),
status varchar(10),
password varchar(30)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 创建issue表
CREATE TABLE issue( 
issueId int(30) primary key auto_increment,
title varchar(80),
founder varchar(30),
iCreateTime date DEFAULT NULL,
reviser varchar(30),
issueStatus varchar(10),
planTime date DEFAULT NULL,
actualTime date DEFAULT NULL,
userId1 int(30),
userId2 int(30),
type varchar(30),
grade varchar(6),
version varchar(30),
step varchar(2000),
plan varchar(2000)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 设置主键初始值
alter TABLE user auto_increment =1001;
alter TABLE issue auto_increment =202001;

-- 输入测试数据
insert into user(userId,name,email,uCreatetime,identity,status,password) value(1000,'admin','admin','2011-11-11','经理','激活','admin123');
insert into user(name,email,uCreatetime,identity,status,password) value('test','test','2012-12-12','普通职员','激活','test');

insert into issue(title,founder,iCreateTime,reviser,issueStatus,planTime,actualTime,userId1,userId2,type,grade,version,step,plan)
     value('admin','admin','2011-11-11','test','待解决','2011-11-12','2011-11-12',1000,1001,'后端','一般','1.0','123','321');
insert into issue(title,founder,iCreateTime,reviser,issueStatus,planTime,actualTime,userId1,userId2,type,grade,version,step,plan) 
     value('test','test','2012-12-12','admin','待解决','2012-12-13','2012-12-13',1001,1000,'前端','一般','2.0','456','654');

-- 查询表
SELECT * FROM user;

SELECT * FROM issue;

-- 删除信息
-- DELETE FROM user WHERE userId = 1001;

-- 条件查询
SELECT issueId, title, founder, iCreateTime, reviser, issueStatus, planTime, actualTime
     FROM issue
     WHERE issueId=202002  and issueStatus='待解决'  and founder='test' and reviser='admin' and 
        planTime<='2013-12-12' and planTime>='2012-12-11';
        
-- -----------        
SELECT userId1, COUNT(1) a
	FROM issue 
    WHERE userId1=1000
    GROUP BY userId1;
    
SELECT userId2, COUNT(1) b
	FROM issue 
    WHERE userId1=1000
    GROUP BY userId2;
    
SELECT userId2, COUNT(1) c
	FROM issue 
    WHERE userId1=1000 AND issueStatus='待解决'
    GROUP BY userId2;
    
-- SELECT userId2, COUNT(1) d
-- 	FROM issue 
--     WHERE userId1=1000 AND issueStatus='待解决'
--     GROUP BY userId2;
-- ------------
    