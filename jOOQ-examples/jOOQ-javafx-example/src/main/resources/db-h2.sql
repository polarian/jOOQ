DROP SCHEMA IF EXISTS world CASCADE;

CREATE SCHEMA world;

CREATE TABLE world.countries (
  code CHAR(2) NOT NULL,
  "YEAR" INT NOT NULL,
  gdp_per_capita DECIMAL(10, 2) NOT NULL,
  govt_debt DECIMAL(10, 2) NOT NULL,

  CONSTRAINT pk_countries PRIMARY KEY (code, "YEAR")
);

INSERT INTO world.countries
VALUES ('CA', 2009, 40764, 51.3),
       ('CA', 2010, 47465, 51.4),
       ('CA', 2011, 51791, 52.5),
       ('CA', 2012, 52409, 53.5),
       ('DE', 2009, 40270, 47.6),
       ('DE', 2010, 40408, 55.5),
       ('DE', 2011, 44355, 55.1),
       ('DE', 2012, 42598, 56.9),
       ('FR', 2009, 40488, 85.0),
       ('FR', 2010, 39448, 89.2),
       ('FR', 2011, 42578, 93.2),
       ('FR', 2012, 39759,103.8),
       ('GB', 2009, 35455,121.3),
       ('GB', 2010, 36573, 85.2),
       ('GB', 2011, 38927, 99.6),
       ('GB', 2012, 38649,103.2),
       ('IT', 2009, 35724,121.3),
       ('IT', 2010, 34673,119.9),
       ('IT', 2011, 36988,113.0),
       ('IT', 2012, 33814,131.1),
       ('JP', 2009, 39473,166.8),
       ('JP', 2010, 43118,174.8),
       ('JP', 2011, 46204,189.5),
       ('JP', 2012, 46548,196.5),
       ('RU', 2009,  8616,  8.7),
       ('RU', 2010, 10710,  9.1),
       ('RU', 2011, 13324,  9.3),
       ('RU', 2012, 14091,  9.4),
       ('US', 2009, 46999, 76.3),
       ('US', 2010, 48358, 85.6),
       ('US', 2011, 49855, 90.1),
       ('US', 2012, 51755, 93.8);