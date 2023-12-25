public class SecondTask {

    public <T1, T2> boolean compareArrays(T1[] arr1, T2[] arr2) {
        if(arr1.length != arr2.length) {
             return false;
        }

        int i = 0;
        while(i < arr1.length) {
            if(!arr1[i].getClass().getSimpleName().equals(arr2[i].getClass().getSimpleName())) {
                return false;
            }
            i++;
        }
        return true;
    }
}
