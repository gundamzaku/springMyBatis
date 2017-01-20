drop table if exists spittle;
drop table if exists spitter;
drop table if exists user_t;
/*
create table spitter (
  id identity,
  username varchar(25) not null,
  password varchar(25) not null,
  fullName varchar(100) not null,
  email varchar(50) not null,
  updateByEmail boolean not null
);

create table spittle (
  id integer identity primary key,
  spitter integer not null,
  message varchar(2000) not null,
  postedTime datetime not null,
  foreign key (spitter) references spitter(id)
);
*/
CREATE TABLE user_t (
  user_id integer identity primary key,
  user_name varchar(40) not null
);

/*  age integer not null*/
/*password varchar(255) not null,*/
/*Data for the table `user_t` */

insert  into `user_t`(`user_id`,`user_name`) values (1,'≤‚ ‘');