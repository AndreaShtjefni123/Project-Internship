CREATE TABLE Ratings (
  RatingID INT NOT NULL,
  UsersID INT,
  BookID INT NOT NULL,
  Score INT NOT NULL CHECK (Score BETWEEN 1 AND 5),
  Comment TEXT,
  RatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

  PRIMARY KEY (RatingID),
  FOREIGN KEY (UsersID) REFERENCES Users(UsersID),
  FOREIGN KEY (BookID) REFERENCES Book(BookID)
);


INSERT INTO Ratings(RatingID,UsersID,BookID,Score,Comment,RatedAt) VALUES
(134,1987,111,4,'It was enjoyable!','2025-05-10 13:11'),
(239,1057,0,2,'The characters were boring','2025-06-07 17:17'),
(097,1547,9,4,'Super cute concept','2025-06-04 21:23'),
(467,1522,543,5,'I loved the enemies!!','2025-06-11 12:00'),
(125,925,355,4,'the steampunk aesthetic was to die for!','2024-10-13 15:45'),
(045,2503,739,3,NULL,'2024-09-10 11:00'),
(556,1308,889,3,NULL,'2025-04-04 18:33');

SELECT * FROM Ratings;


