package com.company.Command;

//具体命令
class ConcreteCommandA implements Command {
    private ReceiverA receiver;
    ConcreteCommandA() {
        receiver = new ReceiverA();
    }
    public void execute() {
        receiver.action();
    }
}