CREATE TABLE FIELD
(
  id         BIGSERIAL PRIMARY KEY,
  name       VARCHAR(255) NOT NULL
);
CREATE UNIQUE INDEX FIELD_ID_UINDEX
  ON FIELD (id);
