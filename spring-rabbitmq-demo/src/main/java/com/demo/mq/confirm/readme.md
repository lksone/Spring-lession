#消息的可靠性 消息确认confirm机制

<h3>问题：</h3>
我们添加消息到队列中，怎么保证消息成功的添加到了队列？<p/>
如何保证，消息发送出去，一定会被消费者正常消费？<p/>
消费者正常消费了，生产者或者队列 如何知道消费者已经成功的消费了消息？<p/>

rabbitMq为我们提供了两种解决方案：
<br/>
<p>
    1. 通过AMQP事务机制实现，这也是AMQP协议层面提供的解决方案；<br/>
    2. 通过将channel设置成confirm模式来实现；
</p>