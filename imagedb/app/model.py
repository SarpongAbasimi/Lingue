from app import db


class Task(db.Model):
  id = db.Column(db.Integer, primary_key=True)
  todo = db.Column(db.Text, nullable = False)

  def __repr__(self):
    return f'TodoTask {self.todo}'