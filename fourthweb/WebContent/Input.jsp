<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
  <h2>input from database</h2>
  <form role="form" method="post" action="test" >
    <div class="form-group">
      <label for="id">id:</label>
      <input type="text" class="form-control" id="id" name="id" placeholder="Enter id">
    </div>
    <div class="form-group">
      <label for="posttime">posttime:</label>
      <input type="posttime" class="form-control" id="posttime" name="posttime" placeholder="Enter posttime">
    </div>
     <div class="form-group">
      <label for="postcontent">postcontent:</label>
      <input type="postcontent" class="form-control" id="postcontent" name="postcontent" placeholder="Enter postcontent">
    </div>
    
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body>
</html>
