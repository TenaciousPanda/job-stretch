CREATE TABLE `business` (
  `businessName` varchar(60) NOT NULL,
  `industry` varchar(45) DEFAULT NULL,
  `founded` date DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  `summary` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`businessName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `businessLocations` (
  `locationID` int(9) NOT NULL AUTO_INCREMENT,
  `businessName` varchar(60) DEFAULT NULL,
  `city` varchar(60) DEFAULT NULL,
  `street` varchar(60) DEFAULT NULL,
  `state` varchar(2) DEFAULT NULL,
  `zip` int(9) DEFAULT NULL,
  `lat` float(9,6) DEFAULT '0.000000',
  `lon` float(9,6) DEFAULT '0.000000',
  PRIMARY KEY (`locationID`)
) ENGINE=InnoDB AUTO_INCREMENT=433 DEFAULT CHARSET=latin1;

CREATE TABLE `connections` (
  `userID` int(8) NOT NULL,
  `userConnection` int(8) NOT NULL,
  PRIMARY KEY (`userID`,`userConnection`),
  KEY `connections_ibfk_2` (`userConnection`),
  CONSTRAINT `connections_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `userTable` (`userID`),
  CONSTRAINT `connections_ibfk_2` FOREIGN KEY (`userConnection`) REFERENCES `userTable` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `employment` (
  `userID` int(8) NOT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `jobTitle` varchar(50) DEFAULT NULL,
  `businessInfoID` int(9) DEFAULT NULL,
  PRIMARY KEY (`userID`),
  KEY `locationIDfk_idx` (`businessInfoID`),
  CONSTRAINT `locationIDfk` FOREIGN KEY (`businessInfoID`) REFERENCES `businessLocations` (`locationID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `userIDfk` FOREIGN KEY (`userID`) REFERENCES `userTable` (`userID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `userTable` (
  `userID` int(8) NOT NULL AUTO_INCREMENT,
  `userName` varchar(40) DEFAULT NULL,
  `pword` varchar(32) NOT NULL DEFAULT '',
  `fname` varchar(35) NOT NULL,
  `lname` varchar(35) NOT NULL,
  `summary` varchar(2000) DEFAULT NULL,
  `employed` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `username` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=10000683 DEFAULT CHARSET=latin1;