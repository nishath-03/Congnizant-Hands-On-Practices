-- SQL script to create and populate the country table in ormlearn schema

-- Create ormlearn schema if not exists
CREATE SCHEMA IF NOT EXISTS ormlearn;

-- Create country table with code (PK) and name columns
CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

-- Insert sample country records
INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');
