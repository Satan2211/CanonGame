-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2014 at 07:38 PM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gamedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `gameanswers`
--

CREATE TABLE IF NOT EXISTS `gameanswers` (
  `options` varchar(30) NOT NULL,
  `optionScore` int(1) NOT NULL,
  `question_id` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gameanswers`
--

INSERT INTO `gameanswers` (`options`, `optionScore`, `question_id`) VALUES
('Rootkits', 0, 0),
('Rootkits', 0, 1),
('Spammer Programs', 1, 1),
('Auto-Rooter', 0, 1),
('Downloaders', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `gamecategory`
--

CREATE TABLE IF NOT EXISTS `gamecategory` (
  `category_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(20) NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `gamecategory`
--

INSERT INTO `gamecategory` (`category_id`, `category_name`) VALUES
(1, 'IT Security');

-- --------------------------------------------------------

--
-- Table structure for table `gamequestions`
--

CREATE TABLE IF NOT EXISTS `gamequestions` (
  `question_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `category_id` varchar(20) NOT NULL,
  `question` varchar(300) NOT NULL,
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `gamequestions`
--

INSERT INTO `gamequestions` (`question_id`, `category_id`, `question`) VALUES
(1, '1', '__________ are used to send large volumes of unwanted e-mail');

-- --------------------------------------------------------

--
-- Table structure for table `gameresults`
--

CREATE TABLE IF NOT EXISTS `gameresults` (
  `game_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(5) NOT NULL,
  `score` int(4) DEFAULT NULL,
  PRIMARY KEY (`game_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `gameuser`
--

CREATE TABLE IF NOT EXISTS `gameuser` (
  `user_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `gameuser`
--
ALTER TABLE `gameuser`
  ADD CONSTRAINT `gameuser_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `gameresults` (`game_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
