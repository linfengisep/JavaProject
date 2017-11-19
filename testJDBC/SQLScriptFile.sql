---UserName:root@localhost
---ProductName:MySQL
CREATE DATABASE sakila
CREATE TABLE actor( actor_id TEXT NOT NULL
first_name TEXT NOT NULL
last_name TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE address( address_id TEXT NOT NULL
address TEXT NOT NULL
address2 TEXT NOT NULL
district TEXT NOT NULL
city_id TEXT NOT NULL
postal_code TEXT NOT NULL
phone TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE category( category_id TEXT NOT NULL
name TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE city( city_id TEXT NOT NULL
city TEXT NOT NULL
country_id TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE country( country_id TEXT NOT NULL
country TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE customer( customer_id TEXT NOT NULL
store_id TEXT NOT NULL
first_name TEXT NOT NULL
last_name TEXT NOT NULL
email TEXT NOT NULL
address_id TEXT NOT NULL
active TEXT NOT NULL
create_date TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE film( film_id TEXT NOT NULL
title TEXT NOT NULL
description TEXT NOT NULL
release_year TEXT NOT NULL
language_id TEXT NOT NULL
original_language_id TEXT NOT NULL
rental_duration TEXT NOT NULL
rental_rate TEXT NOT NULL
length TEXT NOT NULL
replacement_cost TEXT NOT NULL
rating TEXT NOT NULL
special_features TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE film_actor( actor_id TEXT NOT NULL
film_id TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE film_category( film_id TEXT NOT NULL
category_id TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE film_text( film_id TEXT NOT NULL
title TEXT NOT NULL
description TEXT NOT NULL
);
CREATE TABLE inventory( inventory_id TEXT NOT NULL
film_id TEXT NOT NULL
store_id TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE language( language_id TEXT NOT NULL
name TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE payment( payment_id TEXT NOT NULL
customer_id TEXT NOT NULL
staff_id TEXT NOT NULL
rental_id TEXT NOT NULL
amount TEXT NOT NULL
payment_date TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE rental( rental_id TEXT NOT NULL
rental_date TEXT NOT NULL
inventory_id TEXT NOT NULL
customer_id TEXT NOT NULL
return_date TEXT NOT NULL
staff_id TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE staff( staff_id TEXT NOT NULL
first_name TEXT NOT NULL
last_name TEXT NOT NULL
address_id TEXT NOT NULL
picture TEXT NOT NULL
email TEXT NOT NULL
store_id TEXT NOT NULL
active TEXT NOT NULL
username TEXT NOT NULL
password TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE store( store_id TEXT NOT NULL
manager_staff_id TEXT NOT NULL
address_id TEXT NOT NULL
last_update TEXT NOT NULL
);
CREATE TABLE actor_info( actor_id TEXT NOT NULL
first_name TEXT NOT NULL
last_name TEXT NOT NULL
film_info TEXT NOT NULL
);
CREATE TABLE customer_list( ID TEXT NOT NULL
name TEXT NOT NULL
address TEXT NOT NULL
zip code TEXT NOT NULL
phone TEXT NOT NULL
city TEXT NOT NULL
country TEXT NOT NULL
notes TEXT NOT NULL
SID TEXT NOT NULL
);
CREATE TABLE film_list( FID TEXT NOT NULL
title TEXT NOT NULL
description TEXT NOT NULL
category TEXT NOT NULL
price TEXT NOT NULL
length TEXT NOT NULL
rating TEXT NOT NULL
actors TEXT NOT NULL
);
CREATE TABLE nicer_but_slower_film_list( FID TEXT NOT NULL
title TEXT NOT NULL
description TEXT NOT NULL
category TEXT NOT NULL
price TEXT NOT NULL
length TEXT NOT NULL
rating TEXT NOT NULL
actors TEXT NOT NULL
);
CREATE TABLE sales_by_film_category( category TEXT NOT NULL
total_sales TEXT NOT NULL
);
CREATE TABLE sales_by_store( store TEXT NOT NULL
manager TEXT NOT NULL
total_sales TEXT NOT NULL
);
CREATE TABLE staff_list( ID TEXT NOT NULL
name TEXT NOT NULL
address TEXT NOT NULL
zip code TEXT NOT NULL
phone TEXT NOT NULL
city TEXT NOT NULL
country TEXT NOT NULL
SID TEXT NOT NULL
);
