class Names(object):

  def __init__(self):
    self.name_container = []

  def add_name(self, name_to_add):
    self.name_container.append(name_to_add)
    self.print_added_name(name_to_add)
  
  def remove_name(self, name_to_remove):
    self.name_container.remove(name_to_remove)
    self.print_removed_name(name_to_remove)
  
  def print_added_name(self, added_name):
    print(f'{added_name} has been added to the list of names')

  def print_removed_name(self, removed_name):
    print(f'{removed_name} has been removed from the list')

  def print_list_of_name(self):
    for names in self.name_container:
      print(names)
