<?php
class Car{
    public $id;
    public $license;
    public $driver;
    public $passegenger;

    public function __constrct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function getDataCar(){
        $car = "License: $this>license, Driver: $this->driver, Passenger: $this->passenger";
        return $car;
    }
}
?>