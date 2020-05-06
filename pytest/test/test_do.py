from lib.do import Todo
import pytest

def test_add_todo():
  todo_instance = Todo()
  todo_instance.add_todo('sing a song')
  assert len(todo_instance.container) == 1

def test_if_true():
  print('-------sadfd-------------')
  a = 'something'
  assert(True == False)