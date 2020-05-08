from lib.do import Todo
import pytest

inst = Todo()

def test_add_todo():
  todo_instance = Todo()
  todo_instance.add_todo('sing a song')
  assert len(todo_instance.container) == 1

# @pytest.mark.skipif(Todo.name() == "testing", reason="Just testing how skip if works")
def test_if_true():
  """ It tests that something is true"""
  assert(True == True)


class Test_Todos():

  @pytest.mark.skip()
  def test_first_todo(self):
    """ class to do """
    todo_instance = Todo()
    todo_instance.add_todo('write a song')
    assert len(todo_instance.container) == 1

  @pytest.mark.parametrize(
    'number_1, number_2, number_3, expect_value', 
    [
      (1, 2, 3, 6),
      (4, 5, 6, 15),
      (2, 2, 2, 6),
      (100, 50, 30, 180)
    ]
    )  
  def test_adding_three_numbers(self, number_1, number_2, number_3, expect_value):
    """ Add"""
    todo_instance = Todo()
    assert todo_instance.add_three_numbers(
      number_1, 
      number_2, 
      number_3) == expect_value
