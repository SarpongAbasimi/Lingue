const express = require('express'),
path = require('path'),
bodyParser = require('body-parser'),
process = require('process');

require('dotenv').config()

const app = express();

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, './views'))
app.use(bodyParser.urlencoded({ extended: false}));
app.use('/', require('./routes/index'));

const PORT = process.env.PORT || 3000

app.listen(PORT, ()=>{
  process.stdout.write(`Listening for request on Port ${PORT}`)
});

module.exports = app