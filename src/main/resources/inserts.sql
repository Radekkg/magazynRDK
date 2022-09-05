CREATE DATABASE magazynRDK;

INSERT INTO quantity_types (id, name)
VALUES  (1,'szt'),
        (2,'litry'),
        (3,'kilogramy');

INSERT INTO warehouse (id, name)
VALUES  (1,'Kobyla Gora'),
        (2,'Odolanow');

INSERT INTO items (id, name, quantity,id_quantity_type,id_warehouse)
VALUES  (1,'mlotek',3,1,1),
        (2,'siekiera',2,1,2),
        (3,'pila',1,1,2),
        (4,'szlifierka',4,1,1);

