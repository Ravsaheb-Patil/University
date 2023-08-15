<!DOCTYPE html>
<html>
<head>
  <title>Student Information Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
    }

    h2 {
      color: #333333;
    }

    form  {
      max-width: 400px;
      margin: 0 auto;
      background-color: #ffffff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    label {
      display: block;
      margin-bottom: 5px;
    }

    input[type="text"],
    textarea {
      width: 100%;
      padding: 8px;
      border: 1px solid #cccccc;
      border-radius: 3px;
      box-sizing: border-box;
      margin-bottom: 10px;
    }

    input[type="submit"] {
      background-color: #4caf50;
      color: #ffffff;
      padding: 10px 20px;
      border: none;
      border-radius: 3px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <h2>Student Information</h2>

  <form action="/SaveStudent">
    <label for="sid">Student ID:</label>
    <input type="text" id="sid" name="sid" required>

    <label for="sname">First Name:</label>
    <input type="text" id="sname" name="sname" required>

    <label for="slastname">Last Name:</label>
    <input type="text" id="slastname" name="slastname" required>

    <label for="address">Address:</label>
    <textarea id="address" name="address" required></textarea>

    <input type="submit" value="Submit">
  </form>
</body>
</html>
