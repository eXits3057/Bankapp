# Bankapp
Project Final OOP 
โหลดไฟล์ Bankapp มา
ทดลองใช้ตัวโปรแกรมให้สร้างไฟล์ใน phpmyadmin ก่อน สร้าง database ชื่อว่า bankdb 
แล้วสร้าง Table ตามคำสั่งนี้ด้า่นล่างนี้

CREATE TABLE accounts (
  account_number VARCHAR(20) PRIMARY KEY,
  name VARCHAR(50),
  balance DOUBLE
);

จากนั้นให้เข้า โฟลเดอร์ dist แล้วกดเลือกไฟล์ Bankapp.jar ก็จะทำสามารถใช้งานได้
ไฟล์ Class JAVA ต่างๆจะอยู่ในโฟลเดอร์ src/bankapp/ จะมีไฟล์รวม ที่มีนามสกุล.java
