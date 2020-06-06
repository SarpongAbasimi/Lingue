from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from app.config import configs

db = SQLAlchemy()

def create_app(app_config='development'):

  app = Flask(__name__)
  app.config.from_object(configs[app_config])

  db.init_app(app)

  from app.main.routes import main
  
  app.register_blueprint(main)

  return app