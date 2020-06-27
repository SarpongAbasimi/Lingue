import os
from flask import Flask, render_template, request, redirect, url_for, flash
from werkzeug.utils import secure_filename

app = Flask(__name__)
app.secret_key = b'_5#y2L"F4Q8z\n\xec]/'

BASEPATH= os.path.abspath(os.environ.get('HOME'))
ALLOWED_EXTENSIONS = {'txt', 'pdf', 'png', 'jpg', 'jpeg', 'gif'}

def allowed_files(filename):
  return '.' in filename and filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS

@app.route('/', methods=['GET', 'POST'])
def index():
  if request.method == 'POST':
    if 'file' not in request.files:
      flash('No file part')
      return redirect(request.url)
    
    file = request.files.get('file')

    if file.filename == '':
      flash('No file was selected')
      return redirect(request.url)

    if file and allowed_files(file.filename):
      filename = secure_filename(file.filename)
      file.save(os.path.join(BASEPATH, 'Desktop/UploadTo', filename))
      flash("File uploades successfully")
      return redirect(url_for('download'))
  return render_template('index.html')

@app.route('/download', methods=['GET', 'POST'])
def download():
  return "download"

if __name__ == '__main__':
  app.run(debug=True)