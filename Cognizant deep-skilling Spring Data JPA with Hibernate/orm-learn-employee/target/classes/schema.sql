DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS skill;
DROP TABLE IF EXISTS employee_skill;

CREATE TABLE department (
    dp_id INT PRIMARY KEY,
    dp_name VARCHAR(50)
);

CREATE TABLE employee (
    em_id INT PRIMARY KEY,
    em_name VARCHAR(50),
    em_salary DOUBLE,
    em_permanent BOOLEAN,
    em_dp_id INT,
    FOREIGN KEY (em_dp_id) REFERENCES department(dp_id)
);

CREATE TABLE skill (
    sk_id INT PRIMARY KEY,
    sk_name VARCHAR(50)
);

CREATE TABLE employee_skill (
    es_em_id INT,
    es_sk_id INT,
    PRIMARY KEY (es_em_id, es_sk_id),
    FOREIGN KEY (es_em_id) REFERENCES employee(em_id),
    FOREIGN KEY (es_sk_id) REFERENCES skill(sk_id)
);