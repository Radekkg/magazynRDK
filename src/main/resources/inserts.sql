DROP DATABASE IF EXISTS magazynRDK;
CREATE DATABASE magazynRDK;

INSERT INTO quantity_types (id, name)
VALUES (1, 'szt'),
       (2, 'litry'),
       (3, 'kilogramy');

INSERT INTO warehouse (id, name)
VALUES (1, 'Kobyla Gora'),
       (2, 'Odolanow');

INSERT INTO racks (id, number, level, place, name)
VALUES (1, 1, 1, 1, 111),
       (2, 1, 1, 2, 112),
       (3, 1, 1, 3, 113),
       (4, 1, 1, 4, 114),
       (5, 1, 1, 5, 115),
       (6, 1, 2, 1, 121),
       (7, 1, 2, 2, 122),
       (8, 1, 2, 3, 123),
       (9, 1, 2, 4, 124),
       (10, 1, 2, 5, 125),
       (11, 1, 3, 1, 131),
       (12, 1, 3, 2, 132),
       (13, 1, 3, 3, 133),
       (14, 1, 3, 4, 134)
;
INSERT INTO categories (id, name)
VALUES (1, 'narzedzia'),
       (2, 'wkrety'),
       (3, 'elektronika'),
       (4, 'zasilacze');

INSERT INTO items (id, name, quantity, id_quantity_type, id_category, id_rack, id_warehouse)
VALUES (1, 'mlotek', 3, 1, 1, 1, 1),
       (2, 'siekiera', 2, 1, 1, 2, 2),
       (3, 'pila', 1, 1, 1, 1, 2),
       (4, 'szlifierka', 4, 1, 3, 2, 1);

