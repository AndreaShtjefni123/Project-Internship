CREATE TABLE orders_items(
OrderID INT NOT NULL,
BookID INT NOT NULL,
Quantity INT NOT NULL,

   PRIMARY KEY (OrderID, BookID),
  FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
  FOREIGN KEY (BookID) REFERENCES Book(BookID)
);
 INSERT INTO orders_items(OrderID,BookID,Quantity) VALUES
 (243,543,1),
 (562,124,1),
 (268,101,2),
 (92,355,1),
 (382,739,1),
 (565,9,3);

 SELECT * FROM orders_items;