from wtforms import Form, StringField, SubmitField
from wtforms.validators import DataRequired, Length

class TaskForm(Form):
  task = StringField('task', [ 
    DataRequired(),
    Length(min=2)
    ])
  submit = SubmitField('Submit task')
