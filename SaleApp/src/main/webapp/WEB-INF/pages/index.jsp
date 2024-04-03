<%-- 
    Document   : index
    Created on : Mar 27, 2024, 1:32:18 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class="text-center text-info mt-1">QUẢN TRỊ SẢN PHẨM</h1>
<div>
    <a class="btn btn-info" href="<c:url value="products"/>">Thêm sản phẩm</a>
</div>
<table class="table table-striped mt-1">
    <tr>
        <th></th>
        <th>ID</th>
        <th>Tên</th>
        <th>Giá</th>
        <th></th>
    </tr>
    <c:forEach items="${products}" var="c">
        <tr>
            <td><img class="card-img-top" src="${c.image}" alt="Card image" style="width:300px;"></td>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${String.format("%,d",c.price)} VNĐ</td>
            <td>
                <button class="btn btn-info">Cập nhật</button>
                <button class="btn btn-danger">Xóa</button>
            </td>
        </tr>
    </c:forEach>
</table>
