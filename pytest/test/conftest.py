import pytest
from lib.name import Names

@pytest.fixture()
def name():
  """ create an instance of names"""
  name = Names()
  name.add_name('chris')

  yield name 

  name.remove_name('chris')

@pytest.fixture()
def temp_directory(tmpdir):
  dir_name = tmpdir.mkdir('a_dir')

  yield dir_name
