-- Gerado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   em:        2020-07-31 10:34:28 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g

CREATE TABLE t_sip_departamento (
    cd_depto  NUMBER(2) NOT NULL,
    nm_depto  VARCHAR2(30) NOT NULL,
    sg_depto  CHAR(3)
);

ALTER TABLE t_sip_departamento ADD CONSTRAINT pk_sip_departamento PRIMARY KEY ( cd_depto );

ALTER TABLE t_sip_departamento ADD CONSTRAINT un_sip_depto_nome UNIQUE ( nm_depto );

CREATE TABLE t_sip_funcionario (
    nr_matricula    NUMBER(5) NOT NULL,
    cd_depto        NUMBER(2) NOT NULL,
    nm_funcionario  VARCHAR2(60) NOT NULL,
    dt_nascimento   DATE NOT NULL,
    dt_admissao     DATE NOT NULL,
    vl_salario      NUMBER(7, 2) NOT NULL
);

ALTER TABLE t_sip_funcionario ADD CONSTRAINT pk_sip_funcionario PRIMARY KEY ( nr_matricula );

ALTER TABLE t_sip_funcionario
    ADD CONSTRAINT fk_sip_func_depto FOREIGN KEY ( cd_depto )
        REFERENCES t_sip_departamento ( cd_depto );



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             2
-- CREATE INDEX                             0
-- ALTER TABLE                              4
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
