-- MyBatis
DROP SCHEMA IF EXISTS myBatis;

-- MyBatis
CREATE SCHEMA myBatis;

-- 학생
CREATE TABLE myBatis.Student (
	stud_id INTEGER     NOT NULL COMMENT '학번', -- 학번
	name    VARCHAR(50) NOT NULL COMMENT '성명', -- 성명
	email   VARCHAR(50) NOT NULL COMMENT '메일', -- 메일
	dob     DATE        NULL     COMMENT '입학일자' -- 입학일자
)
COMMENT '학생';

-- 학생
ALTER TABLE myBatis.Student
	ADD CONSTRAINT PK_Student -- 학생 기본키
		PRIMARY KEY (
			stud_id -- 학번
		);

ALTER TABLE myBatis.Student
	MODIFY COLUMN stud_id INTEGER NOT NULL AUTO_INCREMENT COMMENT '학번';