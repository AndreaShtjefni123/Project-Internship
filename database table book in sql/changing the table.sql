ALTER TABLE BOOK
ALTER COLUMN booktitle TYPE VARCHAR(150);
ALTER TABLE BOOK
ALTER COLUMN bookid TYPE INT USING bookid::INT;


SELECT * FROM BOOK;