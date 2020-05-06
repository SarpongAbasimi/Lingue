class Todo(object):
  def __init__(self):
    self.container = []

  def add_todo(self, todo_element):
    return self.container.append(todo_element)
  
  def list_todo(self):
    for elements in self.container:
      print(elements)