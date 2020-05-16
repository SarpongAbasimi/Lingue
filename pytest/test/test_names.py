import pytest
from lib.name import Names

class Test_Names():

  def test_add_name(self, name):
    name.add_name('Ben')
    name.add_name('SugarMan')
    assert(len(name.name_container) == 3)
  
  def test_add_name_again(self, name, temp_directory):
    create_file_in_dir_name = temp_directory.join('text.txt')
    create_file_in_dir_name.write('Is this working?')
    assert(len(name.name_container) == 1)
    assert create_file_in_dir_name.read() == 'Is this working?'

  def test_remove_name(self, name, capsys):
    name.add_name('c')
    name.remove_name('c')
    out, err = capsys.readouterr()
    print('-----------------')
    print(out)
    print('-----------------')
    assert 'c has been removed from the list' in out

