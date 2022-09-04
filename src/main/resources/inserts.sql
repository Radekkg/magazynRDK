CREATE DATABASE magazynRDK;

INSERT INTO items (id, name, quantity)
VALUES  (1,'mlotek',3),
        (2,'siekiera',2),
        (3,'pila',1),
        (4,'szlifierka',4);

INSERT INTO quantity_types (id, name)
VALUES  (1,'szt'),
        (2,'litry'),
        (3,'kilogramy');

INSERT INTO warehouse (id, name)
VALUES  (1,'Kobyla Gora'),
        (2,'Odolanow');