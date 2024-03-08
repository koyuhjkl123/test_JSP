CREATE TABLE board(
num number(5) PRIMARY KEY,
pass varchar2(30),
name varchar2(30),
email varchar2(30),
title varchar2(50),
content varchar2(1000),
readcount number(4) DEFAULT 0,
writedate DATE DEFAULT SYSDATE
);

insert into board values(board_seq.nextval, '1234', '김자바', 'hong@abc.com',
'게시글1번입니다.', '게시글1번 홍길동이 남김', 0, default);

insert into board values(board_seq.nextval, '1234', '홍자바', 'hong@abc.com',
'게시글2번입니다.', '게시글1번 홍길동이 남김', 0, default);

select * from BOARD;
commit
delete BOARD where num = 2;