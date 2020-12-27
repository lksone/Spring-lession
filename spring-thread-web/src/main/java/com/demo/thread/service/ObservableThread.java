package com.demo.thread.service;


/**
 * 監測Thread的生命周期
 *
 * @pram <T>
 */
public class ObservableThread<T> extends Thread implements Observable {

    private final Task<T> task;

    private final TaskLifecycle<T> taskLifecycle;

    private Observable.Cycle cycle;

    public ObservableThread(Task<T> task) {
        this(task, new TaskLifecycle.EmptyLifecycle<>());
    }

    public ObservableThread(Task<T> task, TaskLifecycle<T> taskLifecycle) {
        super();
        if (task == null) {
            throw new IllegalArgumentException("The task is required");
        }
        this.task = task;
        this.taskLifecycle = taskLifecycle;
    }

    private void update(Cycle cycle, T result, Exception e) {
        this.cycle = cycle;
        if (taskLifecycle == null) {
            return;
        }
        try {
            switch (cycle) {
                case STARTED:
                    this.taskLifecycle.onstart(currentThread());
                    break;
                case DONE:
                    this.taskLifecycle.onFinish(currentThread(), result);
                    break;
                case RUNNING:
                    this.taskLifecycle.onRunning(currentThread());
                    break;
                case ERROR:
                    this.taskLifecycle.onError(currentThread());
                    break;
            }
        } catch (Exception exception) {
            if (cycle == Cycle.ERROR) {
                throw exception;
            }
        }
    }

    @Override
    public void run() {
        try {
            this.update(Cycle.STARTED, null, null);
            this.update(Cycle.RUNNING, null, null);
            T call = this.task.call();
            this.update(Cycle.DONE, call, null);
        } catch (Exception e) {
            this.update(Cycle.ERROR, null, e);
        }
    }


    @Override
    public Cycle getCycle() {
        return this.cycle;
    }
}
