DROP TABLE t_psd_quarto CASCADE CONSTRAINTS;
DROP SEQUENCE SQ_T_PSD_QUARTO;
DROP SEQUENCE SQ_T_PSD_RESERVA;
DROP TABLE t_psd_reserva CASCADE CONSTRAINTS;

CREATE TABLE t_psd_quarto (
    nr_quarto       NUMBER(2) NOT NULL,
    nr_max_pessoas  NUMBER(1) NOT NULL,
    vl_diaria       NUMBER(6, 2) NOT NULL
);
CREATE SEQUENCE SQ_T_PSD_QUARTO INCREMENT BY 2 START WITH 2 NOCYCLE ORDER;
ALTER TABLE t_psd_quarto ADD CONSTRAINT t_psd_quarto_pk PRIMARY KEY ( nr_quarto );

CREATE TABLE t_psd_reserva (
    id_reserva  NUMBER(8) NOT NULL,
    nr_quarto   NUMBER(2) NOT NULL,
    dt_entrada  DATE NOT NULL,
    dt_saida    DATE NOT NULL,
    nr_pessoas  NUMBER(1) NOT NULL
);
CREATE SEQUENCE SQ_T_PSD_RESERVA INCREMENT BY 1 START WITH 1 NOCYCLE ORDER;
ALTER TABLE t_psd_reserva ADD CONSTRAINT t_psd_reserva_pk PRIMARY KEY ( id_reserva );

ALTER TABLE t_psd_reserva
    ADD CONSTRAINT fk_reserva_quarto FOREIGN KEY ( nr_quarto )
        REFERENCES t_psd_quarto ( nr_quarto );

INSERT INTO T_PSD_QUARTO (nr_quarto, nr_max_pessoas, vl_diaria) VALUES (SQ_T_PSD_QUARTO.NEXTVAL, 2, 350.50);
INSERT INTO T_PSD_RESERVA (id_reserva, nr_quarto, dt_entrada, dt_saida, nr_pessoas) VALUES (SQ_T_PSD_RESERVA.NEXTVAL, 2, TO_DATE('02/09/2020', 'dd/mm/yyyy'), TO_DATE('03/09/2020', 'dd/mm/yyyy'), 2);
SELECT * FROM T_PSD_QUARTO;
SELECT * FROM T_PSD_RESERVA;
