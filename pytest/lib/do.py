class Todo(object):
  def __init__(self):
    self.container = []

  def add_todo(self, todo_element):
    return self.container.append(todo_element)
  
  def list_todo(self):
    for elements in self.container:
      print(elements)

  @staticmethod
  def name():
    return "testing"

  def add_three_numbers(self, number_1, number_2, number_3):
    return number_1 + number_2 + number_3

