<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="bootstrap" tagdir="/WEB-INF/tags"%>

<bootstrap:container>
	<!-- contents body -->
	<form:form commandName="publisher" cssClass="form-horizontal" action="update" method="post">
		<form:hidden path="id" id="id"/>
		<fieldset>
			<legend>저자 수정</legend>
			<div class="control-group">
				<label class="control-label" for="name">이름</label>
				<div class="controls">
					<form:input path="name" id="name" cssClass="input-xlarge"/>
				</div>
			</div>
			<div class="form-actions">
				<button type="submit" class="btn btn-primary">확인</button>
				<button class="btn">취소</button>
			</div>
		</fieldset>
	</form:form>
	<!-- contents body end -->
</bootstrap:container>