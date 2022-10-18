create table tshirt (
	tshirt_uid UUID NOT NULL PRIMARY KEY,
	size VARCHAR(100) NOT NULL,
	color VARCHAR(50) NOT NULL
);
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), '2XL', 'Purple');
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), 'L', 'Pink');
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), 'L', 'Teal');
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), 'XL', 'Crimson');
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), 'XS', 'Turquoise');
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), 'XS', 'Aquamarine');
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), 'L', 'Maroon');
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), 'L', 'Red');
insert into tshirt (tshirt_uid, size, color) values (uuid_generate_v4(), 'XS', 'Yellow');


create table client (
    client_uid UUID NOT NULL PRIMARY KEY,
    firstName VARCHAR(50) NOT NULL,
    lastName VARCHAR(50) NOT NULL,
    street VARCHAR(50) NOT NULL,
    houseNumber Number(19) NOT NULL,
    zipCode Number(19) NOT NULL,
    city VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    agreement Timestamp,
    tshirtSize VARCHAR(5) NOT NULL,
    UNIQUE(email, firstName, lastName)

);



insert into client (client_uid, first_name, last_name, myaddress, email) values (uuid_generate_v4(), 'Rudi', 'Smirnov', 'Berlin, unter den Linden', 
'roman.horielov@sva.de');
insert into client (client_uid, first_name, last_name, myaddress, email) values (uuid_generate_v4(), 'Roman', 'Horielov', 'Wiesbaden, Idsteiner Str 6', 
'romanhorielov@gmail.de');
insert into client (client_uid, first_name, last_name, myaddress, email) values (uuid_generate_v4(), 'Karina', 'Pikul', 'Wiesbaden, Felsenstrasse, 6', 
'karina.Pikul@sva.de');
insert into client (client_uid, first_name, last_name, myaddress, email) values (uuid_generate_v4(), 'Marharyta', 'Slyvynska', 'Idstein, unter dem Idstein', 
'marharyta.slyvynska@sva.de');

SELECT * FROM client JOIN tshirt ON client.tshirt_id = tshirt.id;

SELECT client.first_name, tshirt.size 
FROM client
JOIN tshirt ON client.tshirt_id = tshirt_id;


UPDATE client SET tshirt_uid =

SELECT * FROM client JOIN tshirt ON client.tshirt_uid = tshirt.tshirt_uid;

SELECT * FROM client JOIN tshirt USING  (tshirt_uid);