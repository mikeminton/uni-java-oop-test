CREATE DATABASE IF NOT EXISTS work;

USE work;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,  -- Sets `id` as an integer and auto-incrementing
    name VARCHAR(100),
    department VARCHAR(100),
    position VARCHAR(100),
    salary DECIMAL(10, 2)
);

-- Inserting data without specifying the `id`
INSERT INTO employees (name, department, position, salary) VALUES
('John Johns', 'Education', 'Teacher', 50000),
('Sarah Smith', 'Administration', 'Principal', 75000);
