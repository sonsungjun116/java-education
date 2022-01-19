
select * from tab;		-- 테이블 목록
select * from seq;		-- 시퀀스 목록
select * from customer;

-- 예1.
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장 해야된다는 의미
create table customer( 
			   no number(4)  primary key, 
		       name varchar2(20),
		       email varchar2(20),
		       tel varchar2(20)  );
		       
alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);

create sequence customer_no_seq
	start with 1
	increment by 1;
