<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
     
     
    <script type="text/javascript">

        function photo() {
            var base64 = thisCall('cameraPlayer').callPhoto();
            alert(base64);
        }

        function thisCall(movieName) {
            if (navigator.appName.indexOf("Microsoft") != -1) {
                return window[movieName];
            } else {
                return document[movieName];
            }
        }

    </script>

</head>
<body style="text-align: center">
<div>
    <input type="button" value="上传"><input type="button" value="拍照" onclick="photo()">
</div>


<div style="text-align: center">
    <object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
            id="cameraPlayer" width="1300" height="600"
            codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab">
        <param name="movie" value="/static/html/swf/cameraPlayer.swf" />
        <param name="quality" value="high" />
        <param name="bgcolor" value="#869ca7" />
        <param name="menu" value="false" />
        <param name="allowScriptAccess" value="sameDomain" />
        <embed src="/static/html/swf/cameraPlayer.swf" quality="high" bgcolor="#869ca7"
               width="1300" height="600" name="cameraPlayer" align="middle"
               play="true" loop="false" quality="high" allowScriptAccess="sameDomain"
               type="application/x-shockwave-flash"
               pluginspage="http://www.macromedia.com/go/getflashplayer">
        </embed>
    </object>
</div>

</body>
</html>