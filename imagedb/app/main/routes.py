from flask import Blueprint, render_template, redirect, url_for, request
from app.main.form import TaskForm
from app import db
from app.model import Task

main = Blueprint('main', __name__, template_folder='templates')

@main.route('/', methods=['GET'])
def index():
  list_of_todos = Task.query.order_by(Task.id).all()
  return render_template('index.html', list_of_todos=list_of_todos)

@main.route('/new', methods=['GET'])
def new():
  form = TaskForm()
  return render_template('new.html', form=form)

@main.route('/show/<int:id>', methods=['GET'])
def show(id):
  todo = Task.query.filter_by(id=id).first()
  return render_template('show.html', todo=todo)

@main.route('/create', methods=['POST'])
def create():
  form = TaskForm()
  if request.method == 'POST' and form.validate_on_submit():
    todo = Task(todo=form.name.data)
    db.session.add(todo)
    db.session.commit()
  return redirect(url_for('main.index'))
