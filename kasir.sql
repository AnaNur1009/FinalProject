-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Jun 2020 pada 06.36
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `bayar`
--

CREATE TABLE `bayar` (
  `Kode_Pesanan` int(30) NOT NULL,
  `Total` int(30) NOT NULL,
  `DP` int(30) NOT NULL,
  `Sisa` int(30) NOT NULL,
  `Sistem` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `bayar`
--

INSERT INTO `bayar` (`Kode_Pesanan`, `Total`, `DP`, `Sisa`, `Sistem`) VALUES
(123, 75000, 15000, 60000, 'Transfer'),
(125, 20000, 4000, 16000, 'Tunai'),
(126, 160000, 32000, 128000, 'Tunai');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `Kode_Pesanan` varchar(30) NOT NULL,
  `Tgl_Pemesanan` varchar(30) NOT NULL,
  `Nama_Pemesan` varchar(30) NOT NULL,
  `Alamat` text NOT NULL,
  `Jenis_Kue` varchar(30) NOT NULL,
  `Nama_Kue` varchar(30) NOT NULL,
  `Harga_Kue` varchar(50) NOT NULL,
  `Total_Harga` int(50) NOT NULL,
  `Uang_Muka` int(50) NOT NULL,
  `Jumlah` varchar(30) NOT NULL,
  `Kategori` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`Kode_Pesanan`, `Tgl_Pemesanan`, `Nama_Pemesan`, `Alamat`, `Jenis_Kue`, `Nama_Kue`, `Harga_Kue`, `Total_Harga`, `Uang_Muka`, `Jumlah`, `Kategori`) VALUES
('125', '8 Mei 2020', 'Ana ', 'Semboro', 'Basah', 'Brownis', '2000', 20000, 4000, '10', 'Biji'),
('126', '19 Mei 2020', 'Santi', 'Jember', 'Kering', 'ChocoChips', '16000', 160000, 32000, '10', 'Toples'),
('127', '5 Mei 2020', 'Siti', 'Jember', 'Kering', 'ChocoChips', '16000', 160000, 32000, '10', 'Toples');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(3) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `level` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `level`) VALUES
(1, 'admin', '123', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `bayar`
--
ALTER TABLE `bayar`
  ADD PRIMARY KEY (`Kode_Pesanan`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`Kode_Pesanan`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
