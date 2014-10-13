/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author Mosulola
 */
public class Quiz {
    
    /*
    5. อธิบายคุณสมบัติพิเศษของ String class ใน Java ว่ามีความแตกต่างจาก class อื่นๆ อย่างไรบ้าง และทำไมถึงเป็นเช่นนั้น
    เช่น สามารถ + String ได้

-เนื่องจากใน Java String ถือว่าเป็น class ซึ่งสามารถสร้าง objectได้
-String เป็น immutable
- Built-in string feature – Strings are enclosed in quotation marks Ex. String a = “Hello”;
- String manipulation = automatically convert number to String
Ex. “Hello” + “World”
“Hello” + 5
- Class Object has .toString() defined

6. อธิบายแนวคิดการเขียนโปรแกรม แบบวัตถุเทียบกันแนวคิดการเขียนโปรแกรมแบบโครงสร้าง
= Structure Programming เป็นการเขียนโปรแกรมในรูปแบบเดิมๆ มีจุดประสงค์หลักในการพัฒนาขึ้นเพื่อให้คอมพิวเตอร์สามารถประมวลผลและวิเคราะห์ข้อมูล แก้ปัญหาบางอย่างแทนมนุษย์ โดยจะแบ่งแยกปัญาใหญ่ๆออกเป็นส่วนย่อยๆ แล้วค่อยแก้ไขไปทีละส่วนตะกว่าจะได้ผลลัพธ์ที่ต้องการ
- OOP concept เป็นแนวการคิดที่จะแยกปัญหาหรือแยกระบบงานออกเป็นส่วนย่อย เพื่อลดความซับซ้อนให้น้อยลง ส่วนย่อยหรือโปรแกรมย่อยเรียกว่า “class” ซึ่งภายในclassจะสร้างตัวแทนขึ้นมาทำงานแทนตัวเอง เรียกว่า “object” ซึ่ง object นี้เองจะมีหน้าที่เก็บข้อมูลต่างๆ รวมกันเอาไว้ให้เป็นวัตถุชิ้นเดียวกัน เพื่อให้ง่ายต่อการเรียกใช้งาน ง่ายต่อการแก้ไข และง่ายต่อการนำกลับมาใช้ใหม่ของระบบในอนาคต


7. อธิบาย กระบวนการ พัฒนาภาษา JAVA จาก source code -> byte code -> JVM -> constructor -> garbage collector
- Source code จะเป็นโปรแกรมที่เขียนโดยใช้คำสั่งภาษาJava แล้วบันทึกโดยใช้เป็น .java
- สร้างโปรแกรม source code โดยการพิมพ์คำสั่งต่างๆตามหลักการเขียนโปรแกรมด้วยภาษาjava หลังจากเขียนโปรแกรมเสร็จเรียบร้อยแล้ว ต้องทำการยันทึกข้อมูลเป็นไฟล์ที่มีชื่อเดียวกันกับclassของjavaและใช้นามสกุลของไฟล์เป็น java
- Byte code คือการใช้compiler javac แปลคำสั่งต่างๆใน source code และจะถูกเก็บไว้ใน byte code ที่มีนามสกุลเป็น .class และ byte code คือ รหัสคำสั่งภาษาเครื่องของ java virtual machine (JVM)
- JVM คือโปรแกรมที่ใช้อ่านคำสั่ง Java byte code หรือโปรแกรมที่จำลองเครื่องคอมพิวเตอร์ที่มีภาษาเครื่องเป็น java byte code
- constructor คือ method ประเภทหนึ่งที่ถูกให้ทำหน้าที่พิเศษอย่างหนึ่ง คือกำหนดค่าเริ่มต้นของตัวแปรfield ของ objectที่สร้างขึ้นใหม่ โดยทั่วไปทุกclassจะต้องมี constructor แต่ถ้าclassเราสร้างนั้นไม่มีconstructorไว้เลย compilerจะทำการสร้าง constructorขึ้นเอง เรียกว่า default constructor
- garbage collector คือระบบจัดการหน่วยความจำเพื่อเก็บขยะ หรือคอยตรวจดูว่า objectใดไม่มี ref.ชี้อยู่ จะทำการเคลียร์ object นั้น และคืน memoryให้กับระบบ
Archiraya Bejraputra
กระบวณการทำงาน
-	เราเขียนโปรแกรมของภาษา Java เราจะได้ Source Code ซึ่งเป็นไฟล์ที่มีนามสกุลเป็น .java จากนั้นเรานำ Source Code ไปcompileให้กลายเป็นเป็น Java Byte Code (จะเก็บอยู่ในไฟล์ .class)
-	เวลาที่ทำงานจริงในคอมพิวเตอร์ หรืออุปกรณ์ใดๆ ก็ตาม Java Byte Code จะถูกcompileอีกครั้งให้เป็นภาษาเครื่องเฉพาะคอมพิวเตอร์ หรืออุปกรณ์นั้นๆ เข้าใจ การcompileครั้งนี้จะใช้ Java Virtual Machine (JVM) คอมไพล์ และรัน
    */
}
