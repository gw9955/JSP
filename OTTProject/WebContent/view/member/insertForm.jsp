<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 회원 등록</title>
</head>
<body>
   <form action="insert.do" method="post" enctype="multipart/form-data">
      <table>
      <tr> 
         <td>I D :</td>
         <td><input type="texT" name= "memId" value=""></td>
      </tr>
      
      <tr> 
         <td>P W :</td>
         <td><input type="texT" name= "memName" value=""></td>
      </tr>
      
      <tr> 
         <td>이 름 :</td>
         <td><input type="texT" name= "memTel" value=""></td>
      </tr>
      
      <tr> 
         <td>국 적 :</td>
         <td><textarea rows="3" cols="20" name= "memAddr"></textarea></td>
      </tr>

      <tr> 
         <td>첨부파일1 :</td>
         <td><input type="file" name="atchFile"></td>
      </tr>
               
      </table>
      <input type="submit" value="회원등록">
   </form>
</body>
</html>