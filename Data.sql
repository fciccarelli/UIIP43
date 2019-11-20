insert into country (code, name) values
('KR', 'South Korea'),
('JP','Japan'),
('CA', 'Canada'),
('CH', 'China'),
('SW', 'Sweden'),
('US', 'United States'),
('IT', 'Italy'),
('ES', 'Spagna'),
('FR', 'Francia'),
('GB', 'Gran Bretagna'),
('TP', 'Taipei');


insert into opsys (description, company, openSource) values
('Operative system iOs', 'Apple', 1),
('Operative system Android', 'Google', 1),
('Operative system Windows 10 Mobile', 'Microsoft', 1),
('Operative system BlackBerry OS', 'RIM', 1), 
('Operative system Openmoko', 'Openmoko Inc.', 1),
('Operative system Ubuntu Touch', 'Canonical', 1);

insert into brand (name, country) values
('SAMSUNG', 'KR'),
('ACER', 'KR'),
('AMOI', 'CH'),
('HTC', 'KR'),
('APPLE', 'US'),
('HP', 'US'),
('LG', 'KR'),
('SONY', 'JP'),
('MOTOROLA', 'US'),
('HUAWEI', 'CH'),
('XIAOMI', 'CH');

insert into smartphone (name, ram, cpu, displayPpi, displaySize, displayResolution, size, weight, notes, brand, opSys) values
('Readme Note 7', '3 GB', '4x 2.2 GHz Kyro 260 + 4x 1.84 GHz Kyro 260', '409', '6.3 inches', '1080 x 2340 pixel', '6.3 inches', '186', 'Ottimo rapporto qualità-prezzo', '11', 2), 
('P9 Lite', '3 GB', 'Quad-core 2.0 GHz Cortex-A53 + Quad-core 1.7 GHz Cortex-A53', '423', '5.2 inches', '1080 x 1920 pixel', '5.2 inches', '147', 'Basso costo', '10', 2);