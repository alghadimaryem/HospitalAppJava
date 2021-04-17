-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 21 juin 2020 à 22:59
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+01:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `hospital`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `Username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `admin`
--

INSERT INTO `admin` (`Username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Structure de la table `appointement`
--

DROP TABLE IF EXISTS `appointement`;
CREATE TABLE IF NOT EXISTS `appointement` (
  `doctor` varchar(30) NOT NULL,
  `patient` varchar(30) NOT NULL,
  `disease` varchar(30) NOT NULL,
  `date` varchar(22) NOT NULL,
  `gender` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `appointement`
--

INSERT INTO `appointement` (`doctor`, `patient`, `disease`, `date`, `gender`) VALUES
('a', 'b', 'c', '0000-00-00', 'e'),
('1', '1', '1', '2020-06-21', '1'),
('1', '1', '1', '2020-06-21', '1'),
('1', '1', '1', '202O-06-21', '1'),
('1', '1', '1', '2020-06-21', '1'),
('mohammed', '1', '1', '2020-06-21', '1'),
('null', 'mohammed', '1', '202O-06-21', '1'),
('null', 'mohammed', '1', '2020-06-21', '1'),
('mohammed', 'mohammed', 'toothack', '2020-06-21', '1'),
('mohammed', 'mohammed', 'toothack', '2020-06-21', '22'),
('mohammed', 'mohammed', 'toothack', '2020-06-21', 'male'),
('mohammed', 'mohammed', 'toothack', '2020-06-21', 'male'),
('mohammed', 'mohammed', 'toothack', '2020-06-21', 'male'),
('mohammed', 'mohammed', 'toothack', '2020-06-21', 'male'),
('mohammed', 'mohammed', 'toothack', '2020-06-21', 'male'),
('mohammed', 'mohammed', 'toothack', '2020-06-21', 'male'),
('null', 'mohammed', 'toothack', '2020-06-21', 'male'),
('null', 'mohammed', 'toothack', '2020-06-21', 'male'),
('null', 'mohammed', 'toothack', '2020-06-21', 'male');

-- --------------------------------------------------------

--
-- Structure de la table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE IF NOT EXISTS `doctor` (
  `count` int(20) NOT NULL,
  `date` date DEFAULT NULL,
  `id` varchar(20) DEFAULT NULL,
  `name` varchar(11) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(11) DEFAULT NULL,
  `adress` varchar(11) DEFAULT NULL,
  `phone number` int(11) NOT NULL,
  `status` varchar(20) DEFAULT NULL,
  `diseas` varchar(20) NOT NULL,
  `room number` int(11) NOT NULL,
  `Username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `doctor`
--

INSERT INTO `doctor` (`count`, `date`, `id`, `name`, `age`, `gender`, `adress`, `phone number`, `status`, `diseas`, `room number`, `Username`, `password`) VALUES
(1, '2020-06-09', '765', 'saliha', 54, 'female', 'HGH', 6554433, 'married', 'kiné', 65, 'saliha', 'saliha'),
(1, '2020-06-09', '33', 'mourad', 23, 'male', 'HGG', 6775544, 'married', 'diabet', 34, 'mourad', 'mourad');

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `count` int(10) NOT NULL,
  `date` date DEFAULT NULL,
  `id` varchar(10) NOT NULL,
  `name` varchar(10) NOT NULL,
  `age` int(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `adress` varchar(10) NOT NULL,
  `phone number` int(10) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `diseas` varchar(10) DEFAULT NULL,
  `room number` int(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `patient`
--

INSERT INTO `patient` (`count`, `date`, `id`, `name`, `age`, `gender`, `adress`, `phone number`, `status`, `diseas`, `room number`) VALUES
(1, '2020-05-09', '6454', 'houda', 30, 'male', 'H65', 6543245, 'married', 'diabet', 162),
(1, '2020-05-09', '6454', 'hajar', 30, 'male', 'H65', 6543245, 'married', 'diabet', 162),
(1, '2020-06-07', '657', 'bilal', 65, 'male', 'HY RIADI', 6554433, 'married', 'diabet', 112),
(5, '2020-05-09', '6454', 'mohammed', 30, 'male', 'H65', 6543245, 'married', 'diabet', 162),
(1, '2020-05-09', '200', 'jalal', 40, 'male', 'HY ZOHOR', 6554433, 'married', 'diabet', 112),
(1, '2020-05-09', '300', 'aicha', 87, 'male', 'HY ZOHOR', 6554433, 'married', 'diabet', 112),
(1, '2020-05-09', '700', 'fatima', 22, 'female', 'HY RIADI', 6554433, 'married', 'diabet', 112),
(1, '2020-06-04', '75', 'salma', 87, 'female', 'HY ZOUHOUr', 6554433, 'married', 'diabet', 112),
(1, '2020-06-09', '65', 'salah', 25, 'male', 'HJJ', 6554433, 'married', 'diabet', 112);

-- --------------------------------------------------------

--
-- Structure de la table `receptionist`
--

DROP TABLE IF EXISTS `receptionist`;
CREATE TABLE IF NOT EXISTS `receptionist` (
  `count` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `id` varchar(20) DEFAULT NULL,
  `name` varchar(11) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `adress` varchar(20) DEFAULT NULL,
  `phone number` int(11) NOT NULL,
  `status` varchar(20) DEFAULT NULL,
  `diseas` varchar(20) DEFAULT NULL,
  `room number` int(11) NOT NULL,
  `Username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `receptionist`
--

INSERT INTO `receptionist` (`count`, `date`, `id`, `name`, `age`, `gender`, `adress`, `phone number`, `status`, `diseas`, `room number`, `Username`, `password`) VALUES
('1', '2020-06-07', '76', 'jawad', 54, 'male', 'HGFG', 6554488, 'married', 'kine', 122, 'jawad', 'jawad');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
