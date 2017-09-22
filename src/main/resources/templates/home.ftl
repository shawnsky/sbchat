<html>
<head>
    <title>Home</title>
    <script src="/js/jquery-3.2.1.min.js"></script>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container" style="margin-top: 32px;">
    <h3>welcome, ${user.nickname}</h3>
    <a href="/logout">logout</a>
    <hr/>

    <h5>friends list</h5>
    <ul>
        <#list friends as friend><li>${friend.nickname}</li></#list>
    </ul>


</div>



</body>
</html>