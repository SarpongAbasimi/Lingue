FROM python:3.6
WORKDIR /lib
ENV FLASK_APP app.py
COPY ./ ./
RUN pip install -r requirements.txt
CMD python app.py