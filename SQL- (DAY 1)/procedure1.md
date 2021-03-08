USE `roshan`;
DROP procedure IF EXISTS `new_procedure`;

DELIMITER $$
USE `roshan`$$
CREATE PROCEDURE `new_procedure` ()
BEGIN
select * from productions;
END$$

DELIMITER ;

