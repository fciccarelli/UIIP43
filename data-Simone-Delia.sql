insert into country (code, name) values
('KR','South Korea'),
('JP','Japan'),
('CA','Canada'),
('CH','China'),
('SW','Sweden'),
('US','United States'),
('IT','Italy'),
('SP','Spagna'),
('FR','Francia');

insert into opsys (description, company, openSource) values
('the so of this company is iOS','Apple',1),
('the so of this company is Android','Google',0),
('the so of this company is Windows 10 Mobile','Microsoft',0),
('the so of this company is BlackBerry OS','RIM',0),
('the so of this company is Openmoko','Openmoko Inc.',0),
('the so of this company is Tizen','MeeGo, LiMo Foundation',0),
('the so of this company is Ubuntu Touch','Canonical',0);

insert into brand (name, country) values
('SAMSUNG', 'KR'),
('ACER', 'KR'),
('AMOI', 'CH'),
('HTC', 'KR'),
('APPLE', 'US'),
('HP', 'US'),
('LG', 'KR'),
('SONY', 'JP'),
('MOTOROLA', 'US');

insert into smartphone (name,ram,cpu,displayPpi,displaySize,displayResolution,size,weight,notes,brand,opSys) values
('LG Q60 Dual SIM ','3GB','CPU 64-bit Octa-Core','269','6,26','HD+','161.3 x 77 x 8.7 mm','172','LG Q60 è un smartphone Android completo, che non ha molto da invidare ai dispositivi più avanzati.',7,2),
('galaxy s10','8 GB','ARM Mali-G76 MP12','550','6.1','3040x1440 pixel','149.9 x 70.4 x 7.8 mm','157','Samsung Galaxy S10 è uno smartphone Android con caratteristiche uniche',1,2),
('iphone 6s','2 GB','PowerVR GT7600','326','4,7 pollici','4608x2592 pixel','138.3 x 67.1 x 7.1 mm','143','Apple iPhone 6s è un smartphone iOS di buon livello, fortemente votato alla imaging, in grado di soddisfare anche lo utente più esigente. ',5,1),
('Htc U12+ ','6 GB','Adreno 630','537','6 pollici','2880x1440 pixel','156.6 x 73.9 x 8.7 mm','188','HTC U12 Plus è uno degli smartphone Android più avanzati e completi che ci siano in circolazione.',4,2),
('Motorola Razr','6GB','373','616','6.2 pollici','2142x876 pixel','172 x 72 x 6.9 mm','205','Motorola Razr 2019 è uno smartphone Android avanzato e completo sotto tutti i punti di vista con alcune eccellenze.',9,2);