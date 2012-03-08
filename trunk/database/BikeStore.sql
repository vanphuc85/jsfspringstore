/* Table structure */

CREATE TABLE "role" (
 role_id SERIAL NOT NULL,
 name VARCHAR(32),  
 CONSTRAINT role_pk PRIMARY KEY (role_id)
);

CREATE TABLE "account" (
 account_id SERIAL NOT NULL,
 role_id INTEGER NOT NULL,
 login VARCHAR(32),
 password VARCHAR(32),
 CONSTRAINT account_pk PRIMARY KEY (account_id),
 CONSTRAINT role_id_fk FOREIGN KEY (role_id) REFERENCES role(role_id)
);

CREATE TABLE "bike_category" (
 bike_category_id SERIAL NOT NULL,
 name VARCHAR(32),  
 CONSTRAINT bike_category_pk PRIMARY KEY (bike_category_id)
);

CREATE TABLE "bike" (
 bike_id SERIAL NOT NULL,
 bike_category_id INTEGER NOT NULL,
 name VARCHAR(32),
 description TEXT,
 price numeric(10,2),
 discount_price numeric(10,2),    
 CONSTRAINT bike_pk PRIMARY KEY (bike_id),
 CONSTRAINT bike_category_fk FOREIGN KEY (bike_category_id) REFERENCES bike_category(bike_category_id)
);

/* Sample data */

INSERT INTO role (name) values ('ROLE_ADMIN'); -- id 1
INSERT INTO role (name) values ('ROLE_REGISTERED'); -- id 2

INSERT INTO account (role_id, login, password) values (1, 'admin', 'admin'); -- ROLE_ADMIN
INSERT INTO account (role_id, login, password) values (2, 'user', 'user'); -- ROLE_REGISTERED

INSERT INTO bike_category (name) values ('Mountain'); -- id 1
INSERT INTO bike_category (name) values ('Trekking'); -- id 2
INSERT INTO bike_category (name) values ('Cross'); -- id 3

INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (1, 'Kellys Mobster', 'Kellys Mobster, lorem ipsut...', 6500, null); -- Mountain
INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (1, 'Scott Scale', 'Scott Scale, lorem ipsut...', 18900, null); -- Mountain
INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (1, 'Author Magnum', 'Author Magnum, lorem ipsut...', 17200, 15500); -- Mountain

INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (2, 'Giant Accend', 'Giant Accend, lorem ipsut...', 5000, 4600); -- Trekking
INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (2, 'Merida Freeway', 'Merida Freeway, lorem ipsut...', 2400, 2100); -- Trekking
INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (2, 'Mbike Massive', 'Mbike Massive, lorem ipsut...', 1900, null); -- Trekking

INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (3, 'Giant Roam XR 1', 'Giant Roam XR 1, lorem ipsut...', 3900, null); -- Cross
INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (3, 'Cannondale Quick Cx', 'Cannondale Quick Cx, lorem ipsut...', 4999, null); -- Cross
INSERT INTO bike (bike_category_id, name, description, price, discount_price) values (3, 'Cube Cross', 'Cube Cross, lorem ipsut...', 4500, 4200); -- Cross
