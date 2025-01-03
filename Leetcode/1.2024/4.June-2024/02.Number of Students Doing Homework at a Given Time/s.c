int busyStudent(int* startTime, int startTimeSize, int* endTime, int endTimeSize, int queryTime) {
     int counter = 0;
    for(int i = 0; i < startTimeSize; i++){
        if(startTime[i] <= queryTime && endTime[i] >= queryTime){
            counter++;
        }
    }
    return counter
}