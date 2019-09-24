from flask import Flask

app = Flask(__name__)

@app.route('/', methods=['GET'])
def index() -> "Returns string to the web":
  return("Hello it is working")

if __name__ == "__main__":
    app.run(debug=True)