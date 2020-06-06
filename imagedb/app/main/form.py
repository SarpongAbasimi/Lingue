from flask_wtf import FlaskForm
from wtforms import Form, StringField, SubmitField
from wtforms.validators import DataRequired, Length

class TaskForm(FlaskForm):
  name = StringField('task', [ 
    DataRequired(),
    Length(min=2)
    ])
  submit = SubmitField('Submit task')
