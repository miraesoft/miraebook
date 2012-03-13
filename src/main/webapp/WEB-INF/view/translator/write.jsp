<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="bootstrap" tagdir="/WEB-INF/tags"%>

<bootstrap:container>
	<!-- contents body -->	
	<form id="frm" class="form-horizontal" action="write" method="post">
		<fieldset>
			<legend>번역자 등록</legend>
			<div class="control-group">
				<label class="control-label" for="name">이름</label>
				<div class="controls">
					<input name="name" id="name" type="text" class="input-xlarge">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="email">EMail</label>
				<div class="controls">
					<input name="email" id="email" type="email" class="input-xlarge">
				</div>
			</div>
			<div class="form-actions">
				<button type="submit" class="btn btn-primary">확인</button>
				<button class="btn">취소</button>
			</div>
		</fieldset>
	</form> 
	<!-- contents body end -->
</bootstrap:container>