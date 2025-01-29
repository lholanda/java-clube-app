CREATE TABLE jogador (
    id              BIGSERIAL NOT NULL,
    nome            VARCHAR(200) NOT NULL,
    rg              VARCHAR(20) NOT NULL,
    cpf             VARCHAR(20) NOT NULL,
    data_nascimento TIMESTAMP NOT NULL,
    nacionalidade   VARCHAR(100) NOT NULL,
    posicao         VARCHAR(50) NOT NULL,
    peso            NUMERIC(7,2) NOT NULL,
    altura          NUMERIC(7,2) NOT NULL,

    created_at      TIMESTAMP NOT NULL,
    updated_at      TIMESTAMP
);

ALTER TABLE jogador ADD CONSTRAINT jogador_pk PRIMARY KEY (id);