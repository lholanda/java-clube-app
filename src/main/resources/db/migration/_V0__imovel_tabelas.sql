CREATE TABLE imovel (
    id              BIGSERIAL NOT NULL,
    descricao       VARCHAR(200) NOT NULL,
    endereco        VARCHAR(200) NOT NULL,
    numero          VARCHAR(20) NOT NULL,
    bairro          TIMESTAMP NOT NULL,
    cep             VARCHAR(20) NOT NULL,
    cidade          VARCHAR(100) NOT NULL,
    estado          VARCHAR(50) NOT NULL,
    pais            VARCHAR(50) NOT NULL,  
    tipo            VARCHAR(50) NOT NULL,
    numero_quartos  INT NOT NULL,
    numero_banheiros INT NOT NULL,
    area            NUMERIC(7,2) NOT NULL,
    disponivel      BOOLEAN NOT NULL,
    proprietario_fk BIGINT NOT NULL,
    valor_aluguel   NUMERIC(7,2) NOT NULL,

    contrato_fk     BIGINT NOT NULL,
    created_at      TIMESTAMP NOT NULL,
    updated_at      TIMESTAMP
);

ALTER TABLE imovel ADD CONSTRAINT imovel_pk PRIMARY KEY (id);