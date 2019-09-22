from flask import Flask

print("I am the app and I have just been called")
print('*****************************************')
app = Flask(__name__)

@app.route('/', methods=['GET'])
def index():
  return("Hello Docker")

if __name__ == "__main__":
  app.run(debug=True, host='0.0.0.0')