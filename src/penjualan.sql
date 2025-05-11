-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2025 at 10:13 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan`
--

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id` varchar(6) NOT NULL,
  `nm_pelanggan` varchar(35) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `telepon` varchar(20) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id`, `nm_pelanggan`, `jenis`, `telepon`, `alamat`) VALUES
('001', 'Martin Aron', 'Pria', '081289898989', 'Dirumahahhaha'),
('002', 'Ahmad Yoga', 'Pria', '08128989898', 'Disini'),
('003', 'Naafira', 'Wanita', '081280808080', 'Dimana'),
('004', 'Amelia P', 'Wanita', '081283838383', 'Disitu'),
('005', 'Zidane R', 'Pria', '0812981302933', 'Digidaw'),
('006', 'Najwan', 'Pria', '091820938102', 'diJual'),
('007', 'Yogi', 'Pria', '091823908123', 'DiJembatan'),
('008', 'Rifky', 'Pria', '08192830131', 'DiHutan');

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `kd_brg` varchar(10) NOT NULL,
  `nm_brg` varchar(50) NOT NULL,
  `jenis_brg` varchar(10) NOT NULL,
  `hargaJual` int(11) NOT NULL,
  `HargaBeli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`kd_brg`, `nm_brg`, `jenis_brg`, `hargaJual`, `HargaBeli`) VALUES
('001', 'Aqua', 'Minuman', 2000, 3000),
('002', 'Sprite', 'Minuman', 2000, 4000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_kasir`
--

CREATE TABLE `tb_kasir` (
  `id_kasir` varchar(10) NOT NULL,
  `nm_kasir` varchar(20) NOT NULL,
  `jns_kelamin` varchar(10) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `agama` text NOT NULL,
  `alamat` text NOT NULL,
  `kata_sandi` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_kasir`
--

INSERT INTO `tb_kasir` (`id_kasir`, `nm_kasir`, `jns_kelamin`, `no_telepon`, `agama`, `alamat`, `kata_sandi`) VALUES
('001', 'Martin', 'Pria', '01928309123', 'Kristen', 'Dirumah', '123'),
('002', 'Sandy', 'Pria', '312356576878', 'Islam', 'DIsini', '123465t'),
('003', 'Kayla', 'Wanita', '234576544', 'Hindu', 'DI Bojong GEde', '3245yf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`kd_brg`);

--
-- Indexes for table `tb_kasir`
--
ALTER TABLE `tb_kasir`
  ADD PRIMARY KEY (`id_kasir`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
