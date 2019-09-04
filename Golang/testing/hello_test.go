package main

import "testing"

func TestHello(t *testing.T) {
	if sayHello() != "hello" {
		t.Error("Expected Hello")
	}
}
