CREATE TABLE T_WEDO_POC2(
 ID NUMBER(1),
 NM VARCHAR2(20)
);

INSERT INTO T_WEDO_POC2 (ID, NM) VALUES (1, 'POC Microsoft Azure');
COMMIT;

SELECT * FROM T_WEDO_POC2;

CREATE TABLE T_WEDO_POC3(
    ID NUMBER(1),
    NM VARCHAR(40),
    NR_CPF NUMBER(19)
);

INSERT INTO T_WEDO_POC3 (ID, NM, NR_CPF) VALUES (1, 'TESTE 3', 1522548663);
COMMIT;

INSERT INTO T_WEDO_POC3 (ID, NM, NR_CPF) VALUES (2, 'TESTE 4', 1522548663);
COMMIT;

SELECT * FROM T_WEDO_POC3;