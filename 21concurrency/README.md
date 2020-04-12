# concurrency

- `new Thread().start`    // override run
- `new Thread(new Runnable()).start`
- `Executor.exec(new Runnable())`
- `Future f = Executor.submit(new Callable())`
- `Executor.exec(new Runnable(new BlockingQueue<>()))`

## 同步