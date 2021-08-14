/*
 Navicat Premium Data Transfer

 Source Server         : project
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : User

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 14/08/2021 09:24:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Orders
-- ----------------------------
DROP TABLE IF EXISTS `Orders`;
CREATE TABLE `Orders` (
  `orderId` int unsigned NOT NULL AUTO_INCREMENT,
  `clientId` bigint unsigned NOT NULL,
  `startAddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'Postcode',
  `endAddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sPostcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ePostcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cargoType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cargoInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `driverId` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` varchar(10) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  UNIQUE KEY `id` (`orderId`),
  KEY `clientId` (`clientId`),
  CONSTRAINT `clientId` FOREIGN KEY (`clientId`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Orders
-- ----------------------------
BEGIN;
INSERT INTO `Orders` VALUES (1, 1, 'harbour court, Flat 56, Anchor Road,bristol', 'london', 'BS15TP', 'B3', 'bristol', 'furniture', 'lallall', '001', 'FETCHED', '2021-07-07', '8:00', NULL);
INSERT INTO `Orders` VALUES (2, 1, 'bristol', 'london', 'BS15TP', 'B3', 'bristol', 'furniture', 'lallall', '14', 'PAID', '2021-07-07', '8:00', NULL);
INSERT INTO `Orders` VALUES (3, 132424, 'bristol', 'london', 'bs15tp', 'bs51tp', 'bath', 'instrument', 'a nice piano', '14', 'FETCHED', '2021-09-21', '16:00', NULL);
INSERT INTO `Orders` VALUES (4, 132424, 'bath', 'cardiff', 'bs15tp', 'bs51tp', 'bath', 'instrument', 'a beautiful guitar', '14', 'FETCHED', '2022-05-22', '10:00', 's12312312312');
INSERT INTO `Orders` VALUES (6, 1111, 'bristol', 'london', 'BS15TP', 'B3', 'bristol', 'furniture', 'lallall', '14', 'TRANSPORTED', '2021-07-07', '8:00', NULL);
INSERT INTO `Orders` VALUES (7, 1111, 'bristol', 'london', 'BS15TP', 'B3', 'bristol', 'furniture', 'lallall', '14', 'TRANSPORTED', '2021-07-07', '8:00', NULL);
INSERT INTO `Orders` VALUES (8, 1111, 'bristol', 'london', 'BS15TP', 'B3', 'bristol', 'furniture', 'lallall', '14', 'TRANSPORTED', '2021-07-07', '8:00', NULL);
INSERT INTO `Orders` VALUES (9, 132424, 'bath', 'cardiff', 'bs15tp', 'bs51tp', 'bath', 'instrument', 'a beautiful guitar', '14', 'FETCHED', '2022-05-22', '10:00', 's12312312312');
INSERT INTO `Orders` VALUES (10, 132424, 'bath', 'cardiff', 'bs15tp', 'bs51tp', 'bath', 'instrument', 'a beautiful guitar', '6', 'FETCHED', '2022-05-22', '10:00', 's12312312312');
INSERT INTO `Orders` VALUES (11, 132424, 'bath', 'cardiff', 'bs15tp', 'bs51tp', 'bath', 'instrument', 'a beautiful guitar', '14', 'FETCHED', '2022-05-22', '10:00', 's12312312312');
INSERT INTO `Orders` VALUES (12, 132424, 'bathhhhh', 'cardiff', 'bs15tp', 'bs51tp', 'bath', 'instrument', 'a beautiful guitar', '14', 'FETCHED', '2022-05-22', '10:00', 's12312312312');
INSERT INTO `Orders` VALUES (13, 132424, 'asdfadsf', 'asdf', 'asdfa', 'asdf', 'Bristol', 'asdf', 'fhg', '14', 'FETCHED', '2021-07-22', 'sdf', NULL);
INSERT INTO `Orders` VALUES (14, 132424, 'henan', 'beijing', '432900', '123456', 'Bristol', 'goods', 'hi', '14', 'FETCHED', '2021-07-13', '12:00', NULL);
INSERT INTO `Orders` VALUES (15, 132424, 'bristol, harbour court', 'bath', 'BS1 5TP', 'BS1 5TP', 'Bristol', 'Money', 'a lot of money', '5', 'FETCHED', '2021-07-21', '12:00', NULL);
INSERT INTO `Orders` VALUES (16, 132424, 'bristol, harbour court', 'bath', 'BS1 5TP', 'BS1 5TP', 'Bristol', 'Money', 'a lot of money', NULL, 'PUBLISHED', '2021-07-21', '12:00', '2779734563');
INSERT INTO `Orders` VALUES (17, 132424, 'bristol, harbour court', 'bath', 'BS1 5TP', 'BS1 5TP', 'Bristol', 'Money', 'a lot of money', NULL, 'PUBLISHED', '2021-07-21', '12:00', NULL);
INSERT INTO `Orders` VALUES (18, 132424, 'bristol, harbour court', 'bath', 'BS1 5TP', 'BS1 5TP', 'Bristol', 'Money', 'a lot of money', '5', 'FETCHED', '2021-07-21', '12:00', NULL);
INSERT INTO `Orders` VALUES (19, 132424, 'harbour court', 'cabot circus', 'BS1 5TP', 'BS1 5TP', 'Bristol', 'instruments', 'not much to say', NULL, 'PUBLISHED', '2021-07-21', '12:00', NULL);
INSERT INTO `Orders` VALUES (20, 132424, 'harbour court', 'cabot circus', 'BS1 5TP', 'BS1 5TP', 'Bristol', 'instruments', 'not much to say', NULL, 'PUBLISHED', '2021-07-21', '12:00', NULL);
INSERT INTO `Orders` VALUES (21, 132424, 'harbour court', 'cabot circus', 'BS1 5TP', 'BS1 5TP', 'Bristol', 'instruments', 'not much to say', NULL, 'PUBLISHED', '2021-07-21', '12:00', NULL);
INSERT INTO `Orders` VALUES (22, 1, 'harbour court', 'cabot circus', 'BS1 5TP', 'BS1 5TP', 'Bristol', 'instruments', 'not much to say', '5', 'FETCHED', '2021-07-21', '12:00', NULL);
INSERT INTO `Orders` VALUES (23, 132424, 'harbour court', 'bath', 'BS1 5TP', '12345', 'Bristol', 'Grocery', 'nothing', '5', 'TRANSPORTED', '2021-07-28', '12:00', NULL);
INSERT INTO `Orders` VALUES (24, 132424, 'harbour court', 'bath', 'BS1 5TP', '12345', 'Bristol', 'Grocery', 'nothing', NULL, 'PUBLISHED', '2021-07-28', '12:00', NULL);
INSERT INTO `Orders` VALUES (25, 132424, 'deans court', 'cabot', 'BS1 5TP', 'bs2er', 'Bristol', 'Piano', 'nothing', '6', 'TRANSPORTED', '2021-07-05', '13:00', NULL);
INSERT INTO `Orders` VALUES (26, 132424, 'bristol', 'bath..', 'BS1 5TP', '123', 'Bristol', 'Grocery', 'nothing', '6', 'TRANSPORTED', '2021-07-13', '13:00', NULL);
INSERT INTO `Orders` VALUES (27, 1, '1', '3', '2', '4', 'Bath', '1', '', '14', 'TRANSPORTED', '2021-09-01', '', NULL);
INSERT INTO `Orders` VALUES (28, 1, 'London Heathrow', 'Badminton', '123ED', 'asf', 'Bristol', 'Others', 'Money', '15', 'COMPLETED', '2021-08-03', '', NULL);
INSERT INTO `Orders` VALUES (29, 1, '1', '3', '2', '4', 'Bristol', 'goods', 'money', NULL, 'PUBLISHED', '2021-08-24', '12', NULL);
INSERT INTO `Orders` VALUES (30, 1111, 'bristol', 'london', 'BS15TP', 'B3', 'bristol', 'furniture', 'lallall', NULL, NULL, '2021-07-07', '8:00', NULL);
INSERT INTO `Orders` VALUES (31, 1111, 'bristol', 'london', 'BS15TP', 'B3', 'bristol', 'furniture', 'lallall', NULL, NULL, '2021-07-07', '8:00', NULL);
INSERT INTO `Orders` VALUES (32, 1, 'Bristol', 'Bath', 'BS15TP', 'BA4ED', 'Bristol', 'instrument', 'a beautiful guitar', NULL, NULL, '2022-05-22', '12:00', '4775874568');
COMMIT;

-- ----------------------------
-- Table structure for Payment
-- ----------------------------
DROP TABLE IF EXISTS `Payment`;
CREATE TABLE `Payment` (
  `userId` bigint unsigned NOT NULL,
  `recipient` varchar(255) NOT NULL,
  `sortcode` varchar(6) DEFAULT NULL,
  `accountnumber` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  CONSTRAINT `userId` FOREIGN KEY (`userId`) REFERENCES `Users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Payment
-- ----------------------------
BEGIN;
INSERT INTO `Payment` VALUES (1, 'penghe zhang', '204030', '12345678');
INSERT INTO `Payment` VALUES (5, 'san zhang', '123456', '23568945');
INSERT INTO `Payment` VALUES (1111, 'Penghe Zhang', '123656', '09876543');
COMMIT;

-- ----------------------------
-- Table structure for Quotes
-- ----------------------------
DROP TABLE IF EXISTS `Quotes`;
CREATE TABLE `Quotes` (
  `quoteId` int unsigned NOT NULL AUTO_INCREMENT,
  `orderId` int NOT NULL,
  `driverId` int NOT NULL,
  `quote` int NOT NULL COMMENT 'driver''s quote',
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`quoteId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Quotes
-- ----------------------------
BEGIN;
INSERT INTO `Quotes` VALUES (1, 1, 5, 100, '2021-07-21 16:58:11');
INSERT INTO `Quotes` VALUES (2, 13, 52, 1003, '2021-07-21 16:58:11');
INSERT INTO `Quotes` VALUES (3, 13, 52, 1003, '2021-07-21 16:36:39');
INSERT INTO `Quotes` VALUES (4, 13, 152, 1004, '2021-07-21 16:41:25');
INSERT INTO `Quotes` VALUES (5, 13, 155, 1006, '2021-07-21 16:41:30');
INSERT INTO `Quotes` VALUES (6, 13, 155, 1006, '2021-07-21 16:41:44');
INSERT INTO `Quotes` VALUES (7, 15, 155, 1006, '2021-07-21 16:58:20');
INSERT INTO `Quotes` VALUES (8, 15, 155, 1006, '2021-07-21 16:58:22');
INSERT INTO `Quotes` VALUES (9, 16, 1111, 9, '2021-08-03 21:02:32');
INSERT INTO `Quotes` VALUES (10, 16, 6, 123, '2021-08-04 10:34:54');
INSERT INTO `Quotes` VALUES (11, 16, 6, 14, '2021-08-04 10:37:31');
INSERT INTO `Quotes` VALUES (12, 16, 6, 123, '2021-08-04 10:49:39');
INSERT INTO `Quotes` VALUES (13, 16, 8, 123, '2021-08-05 11:22:05');
INSERT INTO `Quotes` VALUES (14, 16, 8, 123, '2021-08-05 11:22:06');
COMMIT;

-- ----------------------------
-- Table structure for Review
-- ----------------------------
DROP TABLE IF EXISTS `Review`;
CREATE TABLE `Review` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `clientId` bigint unsigned NOT NULL,
  `driverId` bigint unsigned NOT NULL,
  `star` int NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `orderId` int unsigned NOT NULL,
  `date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `client` (`clientId`),
  KEY `driver` (`driverId`),
  KEY `order` (`orderId`),
  CONSTRAINT `client` FOREIGN KEY (`clientId`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `driver` FOREIGN KEY (`driverId`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order` FOREIGN KEY (`orderId`) REFERENCES `Orders` (`orderId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Review
-- ----------------------------
BEGIN;
INSERT INTO `Review` VALUES (1, 1, 10, 5, 'A nice driver', 6, '2021-06-03 14:30:59');
INSERT INTO `Review` VALUES (2, 2, 8, 5, 'A decent driver', 7, '2021-07-02 14:30:59');
INSERT INTO `Review` VALUES (4, 1, 8, 4, 'not bad', 7, '2021-08-02 00:00:00');
INSERT INTO `Review` VALUES (5, 1, 8, 5, 'not bad', 8, '2021-08-03 14:30:59');
INSERT INTO `Review` VALUES (11, 1111, 8, 3, 'not bad', 9, '2021-07-04 14:30:59');
INSERT INTO `Review` VALUES (12, 1, 14, 2, 'a little bad', 27, '2021-08-01 14:30:59');
INSERT INTO `Review` VALUES (15, 2, 8, 3, 'a little bad', 25, '2021-08-04 14:30:59');
COMMIT;

-- ----------------------------
-- Table structure for Users
-- ----------------------------
DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=132437 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Users
-- ----------------------------
BEGIN;
INSERT INTO `Users` VALUES (1, 'root', 'jon@foxmail.com', '17691160586', 'root', 'CLIENT');
INSERT INTO `Users` VALUES (2, 'jon', 'jon', NULL, 'pwd', 'CLIENT');
INSERT INTO `Users` VALUES (5, 'dd', '136@qq.com', '1234', 'root', 'DRIVER');
INSERT INTO `Users` VALUES (6, 'vv', '126@qq.com', '1234', 'root', 'DRIVER');
INSERT INTO `Users` VALUES (8, 'jon111', 'abc@foxmail.com', 'asdfadf', '125125', 'DRIVER');
INSERT INTO `Users` VALUES (9, 'penghe zhang', 'jon_1999@foxmail.com', '+447529972788', '123456', 'CLIENT');
INSERT INTO `Users` VALUES (10, 'zhang', 'a@qq.com', '07529972788', '12345', 'DRIVER');
INSERT INTO `Users` VALUES (14, 'he', '135@qq.com', '1234', 'root', 'DRIVER');
INSERT INTO `Users` VALUES (1111, 'peng', '124@qq.com', NULL, 'root', 'CLIENT');
INSERT INTO `Users` VALUES (132424, 'zon', '123@qq.com', '+447529972788', 'root', 'DRIVER');
INSERT INTO `Users` VALUES (132434, 'penghe zhang', 'jon_2999@foxmail.com', '+447529972788', 'sdf', 'CLIENT');
INSERT INTO `Users` VALUES (132435, 'penghe zhang', 'jon_3999@foxmail.com', '+447529972788', '2344', 'CLIENT');
INSERT INTO `Users` VALUES (132436, 'penghe zhang', 'jon_9999@foxmail.com', '+447529972788', '1234', 'DRIVER');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
