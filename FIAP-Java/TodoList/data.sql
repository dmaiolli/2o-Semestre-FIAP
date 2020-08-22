DROP SEQUENCE SQ_TAREFA;
DROP TABLE TB_TAREFA;

CREATE TABLE TB_TAREFA (
	ID NUMBER NOT NULL PRIMARY KEY,
	DESCRICAO VARCHAR2(100) NOT NULL,
	DATA_LIMITE DATE NOT NULL,
	FEITA NUMBER(1) DEFAULT 0
);

CREATE SEQUENCE SQ_TAREFA INCREMENT BY 1 START WITH 1 NOCYCLE ORDER;

INSERT INTO TB_TAREFA(ID, DESCRICAO, DATA_LIMITE) VALUES (SQ_TAREFA.NEXTVAL, 'Fazer compras', 
	TO_DATE('21/08/2020', 'dd/mm/yyyy'));
INSERT INTO TB_TAREFA(ID, DESCRICAO, DATA_LIMITE) VALUES (SQ_TAREFA.NEXTVAL, 'Passear com o cachorro', 
	TO_DATE('21/08/2020', 'dd/mm/yyyy'));
INSERT INTO TB_TAREFA(ID, DESCRICAO, DATA_LIMITE) VALUES (SQ_TAREFA.NEXTVAL, 'Fazer cooper', 
	TO_DATE('21/08/2020', 'dd/mm/yyyy'));
INSERT INTO TB_TAREFA(ID, DESCRICAO, DATA_LIMITE) VALUES (SQ_TAREFA.NEXTVAL, 'Estudar Java e Oracle', 
	TO_DATE('21/08/2020', 'dd/mm/yyyy'));
	
SELECT * FROM TB_TAREFA;




