from flask import Blueprint, render_template
from app.main.form import TaskForm

main = Blueprint('main', __name__, template_folder='templates')

@main.route('/', methods=['GET'])
def index():
  return render_template('index.html')

@main.route('/new', methods=['GET'])
def new():
  form = TaskForm
  return render_template('new.html', form=form)

def create():
  pass 
