# SSM-Test
Just a simple test for SSM,maybe i'll delete it later.

#create TABLE on Oracle
CREATE TABLE T_EMP(	
  "ID" NUMBER(8,0) PRIMARY KEY, 
	"ENAME" VARCHAR2(10 BYTE), 
	"SALARY" NUMBER(8,2), 
	"AGE" NUMBER(3,0)
)
#create SEQUENCE on Oracle
CREATE SEQUENCE t_emp_seq START WITH 1 INCREMENT BY 1
