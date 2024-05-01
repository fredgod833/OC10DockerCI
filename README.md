# BobApp

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=lephenix47_Lahouiti_Younes_P10_20042024&metric=coverage)](https://sonarcloud.io/summary/new_code?id=lephenix47_Lahouiti_Younes_P10_20042024)

Clone project:

> git clone https://github.com/OpenClassrooms-Student-Center/Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD

## Front-end 

Go inside folder the front folder:

> cd front

Install dependencies:

> npm install

Launch Front-end:

> npm run start;

### Docker

Build the container:

> docker build -t bobapp-front .  

Start the container:

> docker run -p 8080:8080 --name bobapp-front -d bobapp-front

## Back-end

Go inside folder the back folder:

> cd back

Install dependencies:

> mvn clean install

Launch Back-end:

>  mvn spring-boot:run

Launch the tests:

> mvn clean install

### Docker

Build the container:

> docker build -t bobapp-back .  

Start the container:

> docker run -p 8080:8080 --name bobapp-back -d bobapp-back 