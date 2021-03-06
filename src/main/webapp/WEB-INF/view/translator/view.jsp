<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="bootstrap" tagdir="/WEB-INF/tags"%>

<bootstrap:container>
	<!-- contents body -->
	<form:form commandName="translator" cssClass="form-horizontal" method="post">
		<fieldset>
			<legend>저자 수정</legend>
			<div class="control-group">
				<label class="control-label" for="name">이름</label>
				<div class="controls">
					${translator.name}
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="email">EMail</label>
				<div class="controls">
					${translator.email}
				</div>
			</div>

			<div align="center">
				<a class="btn btn-primary" href="list">번역자 목록</a>
			</div>
		</fieldset>
	</form:form>
	<!-- contents body end -->
</bootstrap:container>