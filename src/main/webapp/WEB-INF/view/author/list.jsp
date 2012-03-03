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
					<th>Homepage</th>
					<th> </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${authorList}" var="author" varStatus="authorStatus">
				<tr>
					<td>${authorStatus.count}</td>
					<td>${author.name}</td>
					<td>${author.email}</td>
					<td>${author.homepage}</td>
					<td>
						<a class="btn btn-primary" href="update?no=${author.no}">수정</a>
						<a class="btn btn-danger" href="delete?no=${author.no}">삭제</a>
					</td>
				</tr>
				</c:forEach>							
			</tbody>
		</table>
		
		<div align="right">
			<a class="btn btn-primary" href="write">저자 등록</a>
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