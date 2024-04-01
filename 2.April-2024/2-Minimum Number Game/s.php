try {
    $conn = mysqli_connect(/* connection parameters */);
    if ($conn) {
        echo "Connection successful!";
    } else {
        echo "Connection failed!";
    }
} catch (Exception $e) {
    echo "Error: " . $e->getMessage();
}
