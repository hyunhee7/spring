CREATE TABLE client_account
(id VARCHAR2(20) PRIMARY KEY,
balance NUMBER CONSTRAINT CHECK(balance >= 0) DEFAULT 10000, 
bonusPoint NUMBER DEFAULT 0);

CREATE TABLE delivery
( num NUMBER PRIMARY KEY,
  name VARCHAR2(20),
  addr VARCHAR2(30)
);

CREATE SEQUENCE delivery_seq;