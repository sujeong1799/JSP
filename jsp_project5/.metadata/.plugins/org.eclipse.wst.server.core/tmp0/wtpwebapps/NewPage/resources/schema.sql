use mysql;

create user 'javauser'@'localhost' identified by 'mysql';
grant all privileges on newjeansdb.* to 'javauser'@'localhost' with grant option;
flush privileges;

-- 2023-05-30

create table member(
mId varchar(100) not null,
mPassword varchar(100) not null,
mPhone varchar(50) not null,
mBirth int,
reg_date datetime default now(),
last_login datetime,
Primary key(mId));

create table board(
bNum int not null auto_increment,
bTitle varchar(100) not null,
bWriter varchar(100) not null,
bContent text not null,
bCount int default 0,
reg_date datetime default now(),
Primary key(bNum));

create table comment(
cNum int not null auto_increment,
bNum int default 0,
cContent varchar(500) not null,
cWriter varchar(100) not null default "버니즈",
reg_date datetime default now(),
Primary key(cNum));