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
					<th></th>
					<th></th>
					<th> </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${paging.list}" var="publisher" varStatus="publisherStatus">
				<tr>
					<td>${publisherStatus.count}</td>
					<td>${publisher.name}</td>
					<td></td>
					<td></td>
					<td>
						<a class="btn btn-primary" href="update?id=${publisher.id}">수정</a>
						<a class="btn btn-danger" href="delete?id=${publisher.id}">삭제</a>
					</td>
				</tr>
				</c:forEach>							
			</tbody>
		</table>
		<hr>
		<div align="center">
			<a class="btn btn-primary" href="write">출판사 등록</a>
		</div>
		<bootstrap:paging/>
			
	<!-- contents body end -->
</bootstrap:container>