/*Write a stored function to find out given number is Armstrong number or not */
drop FUNCTION IF EXISTS arm_no;
delimiter $
CREATE FUNCTION arm_no(num int) RETURNs varchar(5)
deterministic
BEGIN
	DECLARE l int;
	DECLARE rem int;
	DECLARE temp int DEFAULT 0;
	DECLARE num1 int;
	set num1 := num;
	SET l := LENGTH(num);
	label:LOOP
	set rem := mod(num,10);
	set temp := temp + power(rem,l);
	set num := num div 10;
	if num = 0 THEN
		leave label;
	end IF;
	end LOOP label;
	
	if temp = num1 then
		return "Yes";
	ELSE
		RETURN "No";
	end if;
end $
delimiter ;




