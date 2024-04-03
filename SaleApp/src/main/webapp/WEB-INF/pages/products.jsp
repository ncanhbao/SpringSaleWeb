<%-- 
    Document   : products
    Created on : Apr 3, 2024, 3:11:15 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1 class="text-center text-info mt-1">QUẢN LÝ SẢN PHẨM</h1>

<form:form method="post" modelAttribute="product" enctype="multipart/form-data">
    <div>
        <form:input class="form-control" id="name" placeholder="Tên sản phẩm" path="" />
        <label for="name">Tên sản phẩm</label>
    </div>
    <div>
        <form:input class="form-control" id="price" placeholder="Giá sản phẩm" path="" />
        <label for="price">Giá sản phẩm</label>
    </div>
    <div>
        <form:input type="file" class="form-control" id="image" />
        <label for="image">Ảnh sản phẩm</label>
    </div>
</form:form>
