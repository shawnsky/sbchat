<html>
<head>
    <title>Home</title>
    <link href="/webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">
    <h3>欢迎你，${user.nickname}</h3>

    <#--client panel-->
    <div class="row">
        <div class="col-md-3">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">会话</h3>
                </div>
                <div class="panel-body">
                    <ul class="list-group">
                        <#if friends?size=0>
                            no friends
                        </#if>
                        <#list friends as friend>
                            <li class="list-group-item">${friend.nickname}</li>
                        </#list>
                    </ul>
                    <#--bottom nav-->
                    <div class="row">
                        <div class="col-md-4" style="background-color: antiquewhite;">
                            solo
                        </div>
                        <div class="col-md-4" style="background-color: aliceblue;">
                            duo
                        </div>
                        <div class="col-md-4" style="background-color: aqua;">
                            settings
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <#--<div class="col-md-9">-->

            <#--<div class="panel panel-default">-->
                <#--<div class="panel-heading">xxx聊天</div>-->
                <#--<div class="panel-body">-->
                    <#--null-->
                <#--</div>-->
            <#--</div>-->
        <#--</div>-->
    </div>




</div>



<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
</body>
</html>