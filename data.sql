insert into country (code, name) values
('KR', 'South Korea'),
('JP','Japan'),
('CA', 'Canada'),
('CH', 'China'),
('SW', 'Sweden'),
('US', 'United States'),
('IT', 'Italy')
;

select * from country;

insert into brand (id, name, country) values
(1, 'SAMSUNG', 'KR'),
(2, 'ACER', 'KR'),
(3, 'AMOI', 'CH'),
(4, 'HTC', 'KR'),
(5, 'APPLE', 'US'),
(6, 'HP', 'US'),
(7, 'LG', 'KR'),
(8, 'SONY', 'JP'),
(9, 'MOTOROLA', 'US')
;

select * from brand;


insert into opsys (id, description, company, openSource) values
(1, 'Google Android OS', 'Google LLC', 1),
(2, 'Apple iOS', 'Apple Inc', 1),
(3, 'Tizen', 'Samsung' , 1),
(4, 'BlackBerry OS', 'BlackBerry Limited', 1)
;

insert into smartphone (id, name, ram, cpu, displayDpi, displaySize, displayResolution, size, weight, notes, brand, opSys) values
(1,'Galaxy XCover FieldP', '4 GB', 'Exynos 9 Octa 9810', 576, '5.1', '1440 x 2560 pixel', '158.5 x 80.7 x 14.2 mm', 256, '', 1, 2),
(2,'Iphone 11 Pro Max', '4GB', 'A13 Bionic', 456, '6.5', '1242 x 2688 pixel', '158 x 77.8 x 8.1 mm', 226, '', 5, 2 ),
(3,'LG V50S ThinQ', '8 GB', '855 Qualcomm SDM855', 403, '6.4', '1080 x 2340 pixel','159.3 x 75.8 x 8.4 mm', 192, '', 7, 2)
;

