/* drop procedure if exists P1;
delimiter $
create procedure P1(in par int, OUT par1 int, inout par2 int)
begin
set par1=par*15;
set @c=20;
SELECT @c*10D into par2;
end $
delimiter ;
*/

/*
drop procedure if exists P1;
delimiter $
create procedure P1(in id1 int, name1 varchar(20), job1 varchar(20))
BEGIN
	INSERT into Table1(id,name,job) values(id1,name1,job1);
	UPDATE table1 set name="Amol" where job="COO"; 
	SELECT * from table1;
end $
delimiter ;
*/

/*
drop procedure if exists display;
delimiter $
CREATE procedure display(in message varchar(200))
BEGIN
	select message as "Message Box";
end $
delimiter ;

drop procedure if exists P1;
delimiter $
create procedure P1(in name1 varchar(20))
BEGIN
	DECLARE flag bool DEFAULT FALSE;
	SELECT TRUE into flag from table1 where name=name1;
	if flag then 
		DELETE from table1 where name=name1;
		call display("Valid Username");
		
	else 
		call display("Invalid Username");
	end if;
end $
delimiter ;
*/

