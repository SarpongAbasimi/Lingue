import os
from dotenv import load_dotenv

base_dir = os.path.abspath(os.path.dirname(__file__))
load_dotenv(os.path.join(base_dir, '.env'))

class Config(object):
  TESTING = False
  DEBUG = False
  SECRET_KEY= os.getenv('SECRET_KEY')

class Develoment(Config):
  DEBUG=True
  SQLALCHEMY_DATABASE_URI = os.getenv('DEVELOPMENT_DB_URI') or 'sqlite:///database/dev.db'
  SECRET_KEY= os.getenv('SECRET_KEY')

class Testing(Config):
  pass 


configs = {
  'development': Develoment,
  'production': Testing
}