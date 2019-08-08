const express = require('express'),
path = require('path'),
bodyParser = require('body-parser'),
mongoose = require('mongoose'),
whichENV = require('./config/environment')
process = require('process');

require('dotenv').config()

const app = express();

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, './views'))
app.use(bodyParser.urlencoded({ extended: false}));
app.use('/', require('./routes/index'));

// Database connection

mongoose.connect(whichENV.whichDB(), {useNewUrlParser: true}).catch(connectionError =>{
  console.log(connectionError);
});

let dbConnection = mongoose.connection;

dbConnection.on('error', (err)=> {
  process.stdout.write(`db connection error: ${err}`)
});

console.log(app)

dbConnection.once('open', ()=>{
console.log('db has been successfully connected')
});

const PORT = process.env.PORT || 3000

app.listen(PORT, ()=>{
  process.stdout.write(`Listening for request on Port ${PORT}\n`)
});

module.exports = app