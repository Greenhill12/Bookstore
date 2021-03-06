-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 08, 2018 at 11:10 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.1.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_latvian_ci NOT NULL,
  `author` varchar(100) COLLATE utf8_latvian_ci NOT NULL,
  `year` int(4) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_latvian_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `name`, `author`, `year`, `timestamp`) VALUES
(1, 'Wuthering Heights', 'Emily Brontë', 1847, '2018-10-07 21:13:15'),
(2, 'The Da Vinci Code', 'Dan Brown', 2003, '2018-10-07 21:13:55'),
(3, 'The Hunger Games', 'Suzanne Collins', 2008, '2018-10-07 21:19:55'),
(5, 'To Kill a Mockingbird', 'Harper Lee', 1960, '2018-10-07 21:20:36'),
(6, 'Pride and Prejudice', 'Jane Austen', 1813, '2018-10-07 21:20:58'),
(8, 'The Book Thief', 'Markus Zusak', 2005, '2018-10-07 21:21:46'),
(9, 'The Chronicles of Narnia', 'C.S. Lewis', 1956, '2018-10-07 21:22:09'),
(10, 'Animal Farm', 'George Orwell', 1945, '2018-10-07 11:16:17'),
(11, 'Gone with the Wind', 'Margaret Mitchell', 1936, '2018-10-07 21:22:21'),
(12, 'The Fault in Our Stars', 'J.R.R. Tolkien', 1955, '2018-10-07 11:15:50'),
(14, 'Memoirs of a Geisha', 'Arthur Golden', 1997, '2018-10-07 21:29:24'),
(15, 'The Picture of Dorian Gray', 'Oscar Wilde', 1890, '2018-10-07 21:33:35'),
(17, 'Harry Potter and the Order of the Phoenix', 'J.K. Rowling', 2003, '2018-10-08 20:16:05');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(100) COLLATE utf8_latvian_ci NOT NULL,
  `password` varchar(128) COLLATE utf8_latvian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_latvian_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'admin', 'adminpass');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
