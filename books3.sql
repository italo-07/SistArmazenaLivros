CREATE TABLE livro (
    id serial NOT NULL,
    titulo character varying NOT NULL,
    editora character varying NOT NULL,
    autor character varying NOT NULL,
    categoria character varying NOT NULL,
    ano numeric NOT NULL,
    edicao character varying NOT NULL,
    paginas numeric NOT NULL,
    codBarras character varying NOT NULL,
    isbn character varying NOT NULL,
    idioma character varying NOT NULL,
    estoque character varying NOT NULL
);


ALTER TABLE livro OWNER TO postgres;

CREATE TABLE categoria (
    id serial NOT NULL,
    categoria character varying NOT NULL,
    descricao character varying NOT NULL
);


ALTER TABLE categoria OWNER TO postgres;

CREATE TABLE usuario (
    id serial NOT NULL,
    login character varying NOT NULL,
    senha character varying NOT NULL
);


ALTER TABLE usuario OWNER TO postgres;

INSERT INTO livro VALUES (1, 'HP1', 'Sextante', 'JK', 'Fantasia', 2000, '1º', 220, '56548', '1100', 'en', '3');
INSERT INTO livro VALUES (2, 'HP2', 'Rocco', 'JK', 'Fantasia', 2001, '2º', 240, '56698', '11001', 'pt', '5');
INSERT INTO livro VALUES (3, 'HP3', 'UK', 'JK', 'Fantasia', 2002, '3º', 260, '565487', '11002', 'jp', '9');
INSERT INTO livro VALUES (4, 'HP4', 'Outra', 'JK', 'Fantasia', 2003, '4º', 280, '565489', '11003', 'en', '10');

INSERT INTO categoria VALUES (1, 'Terror', 'Livros Assustadores');
INSERT INTO categoria VALUES (2, 'Romance', 'Livros de Amor');
INSERT INTO categoria VALUES (3, 'Acao', 'Livros de Acao');
INSERT INTO categoria VALUES (4, 'Guerra', 'Livros de Guerra');
INSERT INTO categoria VALUES (5, 'Fantasia', 'Livros de Fantasia');

INSERT INTO usuario VALUES (1, 'admin', 'admin');

ALTER TABLE ONLY livro
    ADD CONSTRAINT livro_pkey PRIMARY KEY (id);

ALTER TABLE ONLY categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id);

ALTER TABLE ONLY usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id);
