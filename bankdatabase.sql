drop database digitalbank;

create database digitalbank;

use digitalbank;

create table users(
    id integer auto_increment primary key,
    userName varchar(100) unique not null,
    password varchar(100) not null,
    role varchar(100) not null
);

create table roles(
    id integer auto_increment primary key,
    rolename varchar(100) unique not null
);

create table users_roles(
	id integer auto_increment primary key,
    user_id int not null,
    role_id int not null,
    foreign key (user_id) references users(id),
    foreign key (role_id) references roles(id)
);

create table accounttype(
    id integer auto_increment primary key,
    accounttype varchar(20) not null
);

create table customers(
    id integer auto_increment primary key,
    firstname varchar(100) not null,
    lastname varchar(100),
    email varchar(50),
    mobile varchar(50)
);

create table accounts(
    id integer auto_increment primary key,
    accountno varchar(100) unique not null,
    accounttype integer not null,
    amount float not null,
    foreign key (accounttype) references accounttype(id)	
);

create table customers_accounts(
	id integer auto_increment primary key,
    customer_id int not null,
    account_id int not null,
    foreign key (customer_id) references customers(id),
    foreign key (account_id) references accounts(id)	
);

create table addresses(
	id integer auto_increment primary key,
    street varchar(100) not null,
    city varchar(100) not null,
    province varchar(100) not null,
    country varchar(100) not null
);

create table customers_addresses(
	id integer auto_increment primary key,
    customer_id int not null unique,
    address_id int not null,
    foreign key (customer_id) references customers(id),
    foreign key (address_id) references addresses(id)
);

create table users_customers(
	id integer auto_increment primary key,
    user_id int not null,
    customer_id int not null,
    foreign key (user_id) references users(id),
    foreign key (customer_id) references customers(id)
);

create table transactions(
	id integer auto_increment primary key,
    fromaccountno varchar(10) not null,
    toaccountno varchar(10) not null,
    foreign key (fromaccountno) references accounts(accountno),
    foreign key (toaccountno) references accounts(accountno)
);











