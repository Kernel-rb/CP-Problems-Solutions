int numberOfEmployeesWhoMetTarget(int* hours, int hoursSize, int target) {
    int emp = 0;
    int i;
    for (i = 0; i < hoursSize; i++) {
        if (hours[i] >= target) {
            emp ++;
        }
    }
    return emp;
}
