CREATE TABLE T_BOOK
(
    ID            BIGINT       NOT NULL,
    DESCRIPTION   VARCHAR(2000),
    ILLUSTRATIONS BOOLEAN,
    ISBN          VARCHAR(255),
    NB_OF_PAGES   INTEGER      NOT NULL,
    PRICE         FLOAT,
    BOOK_TITLE    VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
)
