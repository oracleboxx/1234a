<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
    <!-- Bootstrap CSS -->

    <!-- Custom CSS -->
    <style>
        .product-card {
            border: 1px solid #ddd;
            padding: 10px;
            margin: 10px;
        }
        .product-image {
            max-width: 100%;
            height: auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Product List</h1>
        <div class="row">
            <c:forEach items="${products}" var="product">
                <div class="col-xl-3 col-lg-4 col-md-6 col-6">
                    <div class="product-card">
                        <img src="${pageContext.request.contextPath}${product.imageUrl}" class="product-image" alt="Product Image">
                        <h4>${product.name}</h4>
                        <p>Price: $${product.price}</p>
                        <!-- Add more product information here -->
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>