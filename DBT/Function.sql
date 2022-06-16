/* drop FUNCTION if EXISTS f1;
delimiter $
create function f1() returns varchar(20)
deterministic 
BEGIN
	DECLARE h varchar(20);
	select "Hello World" into h;
	return(h);
end $
delimiter ;
*/

/*
drop FUNCTION if EXISTS add1;
delimiter $
create function add1(x int, y int) returns INT
deterministic
BEGIN
	RETURN (x+y);
end $
delimiter ;
*/


/*
drop PROCEDURE if EXISTS f2;
delimiter $
create procedure f2() 
BEGIN
	declare x int default 1;
	loop_label:LOOP
	select x;
	set x:=x+1;
	if x>5 then 
		leave loop_label;
	end if;
	end loop loop_label;
	
end $
delimiter ;
/*

/* create ddl table, alter table, DDL not allowed in function */
/* dml allowed */
/* DML :  Data manipulation Lang - Select Insert Update 
	DDL : Data Definition Lang - Create Alter Drop
	TCL : Transaction Control Lang - Commit ROllback Savepoint
	DCL : Data Control Lang - Grant and REVOKE
*/
/*	
drop TRIGGER if exists t1;
delimiter $
create TRIGGER t1 before insert on dept for each row 
BEGIN
	declare x int;
	select count(*) into x from dept;
	if x>4 then 
	signal sqlstate '42000' set message='error';
	end if;

end $
delimiter ;
*/

/*
drop trigger if exists tr5;
delimiter $

create trigger tr5 before INSERT on dept for each row
begin
	if new.deptno > 80 then
		signal sqlstate '42000' SET message_text= "Invalaid DEPTNO...!";
	end if;
end $

delimiter ;
*/

/*
drop trigger if exists tr1;
delimiter $

create trigger tr1 before INSERT on dept for each row
begin
	insert into log(logData) values ('Record inserted in DEPT table!');
end $

delimiter ;
*/

/*
drop procedure if exists pro10;
delimiter $
create procedure pro10()
begin
	declare _deptno int;
	declare _dname varchar(20);
	declare _loc varchar(20);
	declare _pwd varchar(20);
	declare _startedon varchar(20);
	declare _amount int;
	
	declare c1 cursor for select * from dept;
	
	declare exit handler for 1329 call display('No more records to fetch from the cursor!');
	
	open c1;
	lbl:loop
		fetch c1 into _deptno, _dname, _loc, _pwd, _startedon, _amount;
		
		if  _deptno <=30 then
			insert into d values ( _deptno, _dname, _loc, _pwd, _startedon, _amount);
		end if;
	end loop lbl;
	close c1;
	
end $
delimiter ;
*/

drop function if exists f3;
delimiter $
create function f3() returns int
deterministic
begin
	declare x int;
	declare cnt int;
	SET x := 0; 
	SET cnt := 0; 
	
	select count(*) into cnt from dept;
	
	if cnt = 0 then
		return(1);
	else
		SELECT max(deptno) + 1 into x from dept;
		return(x);
	end if;
end $
delimiter ;

	






