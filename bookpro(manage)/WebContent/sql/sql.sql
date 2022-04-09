select * from tab;
select * from sale;
select * from book;
select * from manage;
select * from member;

insert into sale values(sale_seq.nextval,sysdate,2,'test',5300,12000,'테스트책11');
insert into manage values(manage_seq.nextval,'test','실버',10000);
insert into member values('test1','1234','손성준1','qqeerr123','naver.com','010','4112','8871','21083','인천 계양구 용종동','bronze','1000');

create sequence  manage_seq
        start with 1
        increment by 1	