<?php


   class DbConnect{

       private  $con;

       function __construct(){


       }

       function connect()
       {
         include_once dirname(__FILE__).'/Constansts.php';

         $this->con = new mysqli(DB_HOST,DB_USERNAME,DB_PASSWORD,DB_NAME);

         if (mysqli_connect_errono()) {
           # code...
           echo "Failed to connect to Database".mysqli_connect_error();
         }

         return $this->con;
       }


   }
