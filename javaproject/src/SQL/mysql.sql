show databases;		-- 데이터베이스 목록
show tables;		-- 테이블 목록

--예1.
drop table customer; --테이블 삭제

create table customer( 
			   no int(4) auto_increment  primary key, 
		       name varchar(20),
		       email varchar(20),
		       tel varchar(20),
		       address varchar(50),
		       reg_date timestamp );

		    
--예2. 게시판
drop table board;		-- 테이블 삭제
show tables;			-- 테이블 목록 확인
select * from board;
		       
create table board(
	no int auto_increment primary key,
	writer varchar(20) not null,
    passwd varchar(20) not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	reg_date timestamp );
	
insert into board(writer,passwd,subject,content,reg_date)
	values('안화수','1234','게시판제목','게시판내용',sysdate());
	
	
-- 1.전체 데이터를 검색
	select * from board;
	
-- 2.전체 데이터를 내림차순 정렬(최근글 순으로 정렬)
-- 		오름차순(asc)		내림차순(desc)
----------------------------
--	숫자: 1,2,3..			10,9,8...
-- 	문자:	 사전순 정렬(a,b,c)	사전역순 정렬(z,y,x...)
	
select * from board order by no desc;	

-- 3. 최근글 5개 검색
--		limit 추출할 인덱스번호, 추출할 데이터 갯수
select * from board order by no desc limit 0,5;

--.4  3~5번째 데이터 추출
select * from board order by no desc limit 2,3;
select * from board order by no desc limit 0,5;
