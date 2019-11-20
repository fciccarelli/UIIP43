
insert into country (code, name) values
                    ('KR', 'South Korea'),
					('JP','Japan'),
					('CA', 'Canada'),
					('CH', 'China'),
					('US', 'United States'),
					('IT', 'Italy');
    
    
insert into brand ( name, country) values         
					('SAMSUNG','KR'),
					('ACER','KR'),
					('AMOI','CH'),
					('HTC','KR'),
					('APPLE','US');
                    
                    
insert into opsys ( description, company, openSource) values      
					('usa come sistemo operativo IOS','Apple',0),
					('usa come sistemo operativo Symbian','Nokia Corporation',0),
					('usa come sistemo operativo Android','Samsung Group',1),
					('usa come sistemo operativo Android','Google ',1),
                    ('usa come sistemo operativo BlackberryOs','Rim',0);
					       
                                               
insert into smartphone ( name, ram, cpu, displayPpi, displaySize, displayResolution, size, weight, notes,brand, opsys) values
					('Apple iPhone 7 7','2GB','256 GB', '326','4,7','4608x2592','138.3 x 67.1 x 7.1 mm','138','Apple iPhone 7 è 
                    un smartphone iOS di buon livello, fortemente votato all imaging, in grado di soddisfare anche l utente più esigente.','5','1'),  
                    ('Samsung Galaxy S10','8','ARM Mali-G76 MP12', '550','6.1','1440 x 3040','149.9 x 70.4 x 7.8 mm','157',' Samsung Galaxy S10 è 
                    uno smartphone Android con caratteristiche all avanguardia che lo rendono una scelta eccellente per ogni tipo di utilizzo,
                    rappresentando uno dei migliori dispositivi mobili mai realizza  ','1','3');
                     