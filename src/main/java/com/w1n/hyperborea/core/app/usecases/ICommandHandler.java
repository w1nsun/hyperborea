package com.w1n.hyperborea.core.app.usecases;

public interface ICommandHandler<TCommand extends ICommand, TResult> {
    TResult execute(TCommand command);
}
