const express = require('express'),
path = require('path'),
process = require('process');


const app = express();

app.use('/', require('./routes/index'));
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, './views'))

const PORT = process.env.PORT || 3000

app.listen(PORT, ()=>{
  process.stdout.write(`Listening for request on Port ${PORT}`)
});

module.exports = app