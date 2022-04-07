select * from tab;
select * from sale;
select * from member;
select * from book;
alter table sale add book_name varchar(50);

insert into member values('test','1234','손성준','qqeerr123','naver.com',
				'010','4112','8871','21083','인천 계양구 용종동','실버',10000);


create sequence sale_seq
start with 1
increment by 1
nocache