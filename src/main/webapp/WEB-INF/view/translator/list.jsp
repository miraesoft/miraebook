<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bootstrap" tagdir="/WEB-INF/tags" %>

<bootstrap:container>
	<!-- contents body -->
	
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>이름</th>
					<th>EMail</th>
					<th> </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="tran" varStatus="tranStatus">
				<tr>
					<td>${tranStatus.count}</td>
					<td>${tran.name}</td>
					<td>${tran.email}</td>
					<td>
						<a class="btn btn-primary" href="update?no=${tran.no}">수정</a>
						<a class="btn btn-danger" href="delete?no=${tran.no}">삭제</a>
					</td>
				</tr>
				</c:forEach>							
			</tbody>
		</table>
		<hr>
		<div align="center">
			<a class="btn btn-primary" href="write">번역자 등록</a>
		</div>
		
		<div class="pagination pagination-centered">
			<ul>
				<li><a href="#">&laquo;</a>
				<li><a href="#">1</a>
				<li><a href="#">2</a>
				<li><a href="#">3</a>
				<li><a href="#">4</a>
				<li><a href="#">5</a>
				<li><a href="#">6</a>
				<li><a href="#">7</a>
				<li><a href="#">&raquo;</a>
				
			</ul>
		</div>	
	<!-- contents body end -->
</bootstrap:container>