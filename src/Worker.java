public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallBack;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallBack) {
        this.callback = callback;
        this.errorCallBack = errorCallBack;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i <= 67) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallBack.onError("Error: Task " + i + " is not done");
            }
        }
    }

}
