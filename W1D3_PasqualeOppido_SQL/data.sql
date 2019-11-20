# inserimento in tabella country
insert into country (code, name) values
	('KR', 'South Korea'),
	('JP','Japan'),
	('CA', 'Canada'),
	('CH', 'China'),
	('SW', 'Sweden'),
	('US', 'United States'),
	('IT', 'Italy'),
    ('BR', 'Brasile');
    
# inserimento in tabella brand
insert into brand (id, name, country) values
	(1, 'SAMSUNG', 'KR'),
	(2, 'ACER', 'KR'),
	(3, 'AMOI', 'CH'),
	(4, 'HTC', 'KR'),
	(5, 'APPLE', 'US'),
	(6, 'HP', 'US'),
	(7, 'LG', 'KR'),
	(8, 'SONY', 'JP'),
	(9, 'MOTOROLA', 'US'),
    (10, 'XIAOMI', 'CH'),
    (11, 'HUAWEI', 'CH');
    
# inserimento in tabella opSys
insert into opSys(id, description, company, openSource) values
	(1, 'Google provides operating system Android','Google LLC', 1),
    (2, 'Apple provides operating system iOS','Apple Inc', 0),
    (3, 'BlackBerry provides operating system blackCerry OS','BlackBerry', 0),
    (4, 'Nokia provides operating system symbian OS', 'Nokia', 0),
    (5, 'Huawei provides operating system Harmony Os','Huawei', 0);
    
# inserimento in tabella smartphone
insert into smartphone(name, ram, cpu, displayPpi, displaySize, displayResolution, size, weigth, notes, brand, opSys) values
	('iPhone 11 Pro Max', '4GB', 'Apple A13 Bionic', 456, '6.5', '1242 X 2688 pixel', '158 x 77.8 x 8.1 mm', 226, '', 5, 2),
    ('iPhone X', '3GB', 'Apple A11 Bionic', 458, '5.8', '1125 X 2436 pixel', '143.6 x 70.9 x 7.7 mm', 174, '', 5, 2),
    ('Huawei Mate 30 Pro 5G', '8GB', 'Huawei HiSilicon Kirin 990', 409, '6.53', '1176 X 2400 pixel', '158.1 x 73.1 x 8.8 mm', 198, '', 11, 1),
    ('Huawei Mate 30 Lite', '6GB', 'Huawei HiSilicon Kirin 710', 415, '6.21', '1080 X 2340 pixel', '155.2 x 73.4 x 7.95 mm', 160, '', 11, 1),
    ('Xiaomi Mi Note 10 Pro', '8GB', 'Snapdragon 730G Qualcomm', 398, '6.47', '1080 X 2340 pixel', '157.8 x 74.2 x 9.67 mm', 208, '', 10, 1),
    ('Xiaomi Mi Mix Alpha', '12GB', 'Snapdragon 855 Plus Qualcomm', 388, '7.92', '12032 X 9024 pixel', '154.38 x 72.3 x 10.4 mm', 241, '', 10, 1),
    ('Motorola Moto G8 Plus', '4GB', 'Snapdragon 665 Qualcomm', 400, '6.3', '8000 X 6000 pixel', '158.4 x 75.8 x 9.1 mm', 188, '', 9, 1);
    