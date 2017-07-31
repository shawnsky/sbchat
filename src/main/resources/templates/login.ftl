<html>
<head>
    <title>login</title>


    <script src="/webjars/jquery/jquery.min.js"></script>


    <script type="text/javascript">
        $().ready(function () {
            $('#btn').click(function () {
                var $form = $('#loginForm');
                $.ajax({
                    url: $form.attr("action"),
                    type: "post",
                    dataType: "json",
                    data: $form.serialize(),
                    cache: "false",
                    success: function (data) {
                        if (data.status=="0"){
                            window.location.href = "/index.html";
                        } else {
                            $('#error').text(data.msg);
                        }
                    }
                });
                return false;
            })
        });
    </script>

</head>
<body>

<form id="loginForm" action="/loginSubmit" method="post">
    <label>name</label><input type="text" name="username" placeholder="input your name here">
    <br><label>password</label><input type="password" name="password" placeholder="your password">
    <input id="btn" type="button" value="ok">
</form>

<h5 id="error"></h5>



</body>

</html>