CREATE TABLE t_conta(
	nr_conta number(2) primary key not null,
	vl_saldo number(5,2) not null
);

CREATE SEQUENCE SQ_T_CONTA BY 1 START WITH 1 NOCYCLE ORDER;
