use financedb;

drop table if exists income;
drop table if exists expense;
drop table if exists asset;
drop table if exists liability;
drop table if exists category;
drop table if exists user;

create table user (
	id int not null AUTO_INCREMENT,
    username varchar(30),
    primary key (id)
);

create table category (
	id int not null AUTO_INCREMENT,
    user_id int not null,
    description varchar(30),
    primary key (id),
    foreign key (user_id) references user(id)
);

create table income (
	id int not null AUTO_INCREMENT,
    user_id int not null,
    category_id int,
    description varchar(30),
    amount decimal(11,2),
    primary key (id),
    foreign key (user_id) references user(id),
    foreign key (category_id) references category(id)
);

create table expense (
	id int not null AUTO_INCREMENT,
    user_id int not null,
    category_id int,
    description varchar(30),
    amount decimal(11,2),
    primary key (id),
    foreign key (user_id) references user(id),
    foreign key (category_id) references category(id)
);

create table asset (
	id int not null AUTO_INCREMENT,
    user_id int not null,
    category_id int,
    description varchar(30),
    amount_spent decimal(11,2),
    current_value decimal(11,2),
    primary key (id),
    foreign key (user_id) references user(id),
    foreign key (category_id) references category(id)
);

create table liability (
	id int not null AUTO_INCREMENT,
    user_id int not null,
    category_id int,
    description varchar(30),
    amount_owed decimal(11,2),
    primary key (id),
    foreign key (user_id) references user(id),
    foreign key (category_id) references category(id)
);