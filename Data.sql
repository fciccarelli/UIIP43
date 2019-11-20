
insert into Country (code, name) values
('KR', 'South Korea'),
('JP','Japan'),
('CA', 'Canada'),
('CH', 'China'),
('SW', 'Sweden'),
('US', 'United States'),
('IT', 'Italy');

insert into Brand (id, name, country) values
(1, 'SAMSUNG', 'KR'),
(2, 'ACER', 'KR'),
(3, 'AMOI', 'CH'),
(4, 'HTC', 'KR'),
(5, 'APPLE', 'US'),
(6, 'HP', 'US'),
(7, 'LG', 'KR'),
(8, 'SONY', 'JP'),
(9, 'MOTOROLA', 'US'),
(10, 'BBK', 'CH');



insert into OpSys (id, description, company,openSource) values
(1, 'sistema operativo Android ','Google',0 ),
(2, 'sistema operativo IOS','Apple', 1),
(3, 'sistema opeartivo Harmony','Huawei',1 );



truncate table Smartphone;
insert into Smartphone (id, name, ram,cpu,displayPpi,displaySize,displayResolution,size,weight,notes,brand,opSys) values
(1, 'Iphone 11pro', '4 GB','Apple A13 Bionic',463,'5.8','1125 x 2436 pixel','144 x 71.4 x 8.1 mm',188,' Iphone 11pro è uno smartphone iOS con caratteristiche all avanguardia che lo rendono una scelta eccellente per ogni tipo di utilizzo',5,2),
(2, 'OnePlus 7', '6 GB','Snapdragon 855 Qualcomm SDM855',402,'6.41','1080 x 2340 pixel','157.7 x 74.8 x 8.2 mm',182,'OnePlus 7 è indubbiamente uno degli smartphone Android più avanzati e completi disponibili sul mercato, grazie alla ricca dotazione e all elevata multimedialità',10,1),
(3, 'LG K50s', '3 GB','Helio P22 MediaTek MT6762',259,'6.5','720 x 1520 pixel','165.8 x 77.5 x 8.2 mm',220,'LG K50s è un smartphone Android completo, che non ha molto da invidare ai dispositivi più avanzati',7,1)

