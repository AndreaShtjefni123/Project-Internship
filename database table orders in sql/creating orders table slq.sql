CREATE TABLE Orders (
  OrderID INT NOT NULL,
  OrderDate TIMESTAMP NOT NULL,
  UsersID INT NOT NULL,
  EmpID INT,
  PRIMARY KEY (OrderID),
  
  FOREIGN KEY (UsersID) REFERENCES Users(UsersID),
  FOREIGN KEY (EmpID) REFERENCES Employees(EmpID)
);
