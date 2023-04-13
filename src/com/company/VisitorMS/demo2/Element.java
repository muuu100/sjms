package com.company.VisitorMS.demo2;

import com.company.VisitorMS.demo2.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
