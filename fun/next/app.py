from flask import (Flask, render_template)
import requests

app = Flask(__name__)



@app.route('/', methods=['GET'])
def index():
  def book():
    list_of_books = ['book1', 'book2', 'book3']
    for books in list_of_books:
      yield f'{books} + books'
  return render_template('index.html', books=book)

@app.route('/request')
def make_request():
  get_request = requests.get('https://jsonplaceholder.typicode.com/posts/1/comments')
  if (get_request.status_code == 200):
    req_json = get_request.json()
    return render_template('req.html', json=req_json)
  else:
    return render_template('Sorry something went wrong')


if __name__ =='__main__':
   app.run(debug=True)
