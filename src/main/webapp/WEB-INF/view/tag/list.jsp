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
					<th>책제목</th>
					<th>저자 / 역자</th>
					<th>위치</th>
					<th>Tag</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>CSS 비밀 메뉴얼</td>
					<td>데이빗 소여 맥팔랜드 / 김지원</td>
					<td>조형규</td>
					<td>css, html</td>
				</tr>
				<tr>
					<td>2</td>
					<td>처음부터 다시 배우는 HTML5 / CSS3</td>
					<td>양용석 / -</td>
					<td>조형규</td>
					<td>css, css3, html5</td>
				</tr>
				<tr>
					<td>3</td>
					<td>토비의 스프링 3</td>
					<td>이일민 / -</td>
					<td>A, 3</td>
					<td>java, spring, framework, toby</td>
				</tr>								
			</tbody>
		</table>
		
		<div align="right">
			<a class="btn btn-primary" href="./book-registration.html">책 등록</a>
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