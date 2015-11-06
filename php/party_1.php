<?php

	echo "app is starting...\n";

	header("Content-Type:application/json");
// ******* empfangen von http request *******

	if(!empty($_GET['data'])){
		$d=$_GET['data'];
	
		if (empty($_GET['data'])){
			//deliver_response(400, "error", NULL);
		}
		else{
			echo $d;
			//deliver_response(200, "all right", $data);
		}
	}
	
// ******* antwort als json formatieren ********
	function deliver_response($status, $status_message, $msg)
	{
		header("HTTP/1.1 $status $status_message");
		
		$response['status']=$status;
		$response['status_message']=$status_message;
		$response['msg']=$msg;
		
		$json_response=json_encode($response);
		
		echo $json_response;
	}



// ****** Zugriff auf Datenbank ******
$mysqli = new mysqli("localhost", "root", "", "gluecksrad_party_1");

if($mysqli-> connect_error){
    echo "not able to connect to database" . mysqli_connect_error();
    exit();
}

echo "\nconnected";

?>