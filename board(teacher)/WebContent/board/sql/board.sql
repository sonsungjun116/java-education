-- 일반 게시판
select * from tab;
select * from seq;
select * from board1;

create table board1( 
	num number primary key,
	writer varchar2(20) not null,
	email varchar2(30),
	subject varchar2(50) not null,
	passwd varchar2(20) not null, 
	reg_date timestamp not null,
	readcount number default 0,
	content varchar2(2000) not null,
	ip varchar2(20) not null );

create sequence board1_seq
start with 1
increment by 1
nocache;

-- 데이터 입력
insert into board1 values(board1_seq.nextval,'홍길동','test@naver.com',
'게시판 연습','1234',sysdate,0,'게시판 내용','211.183.1.1');

select count(*) from board1;

