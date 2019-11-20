# inserimento dati in country
insert into country (code, name) values
	('KR', 'South Korea'),
	('JP','Japan'),
	('CA', 'Canada'),
	('CH', 'China'),
	('SW', 'Sweden'),
	('US', 'United States'),
	('IT', 'Italy');
    
# inserimento dati in brand
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
    (10, 'XIAOMI', 'CH');

# inserimento dati in opSys
insert into opSys (description, company, openSource) values
	('Android', 'Google', 1),
    ('', 'Apple', 0),
    ('HarmonyOS', 'Huawei', 0),
    ('Blackberry OS', 'Blackberry', 0);

# inserimento dati in smartphone
insert into smartphone (name, ram, cpu, displayPpi, displaySize, displayResolution, size, weight, notes, brand, opSys) values
	('Xiaomi Redmi Note 5 Pro', '4 GB', 'Snapdragon 636', 403, '5.99', '1080 x 2160', '158.6 x 75.4 x 8.1 mm', 181, '', 10, 1),
    ('Apple iPhone 11', '4 GB', 'Apple A13 Bionic', 326, '6.1', '828 x 1792', '150.9 x 75.7 x 8.3 mm', 194, '', 5, 2),
    ('Realme 5S', '4 GB', 'Snapdragon 665', 269, '6.5', '720 x 1600', '164.4 x 75.6 x 9.3 mm', 198, '', null, 1);
    